package net.musecom.kdtcom.service;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {
  
   //Ȯ���� ���, ����ũ������
   private String[] allowedExt;  
   private long maxSize;
   
   //������ ������
   private String absolutePath;

   @Autowired
   private ServletContext servletContext;
   
   public String[] getAllowedExt() {
      return allowedExt;
   }

   public void setAllowedExt(String[] allowedExt) {
      this.allowedExt = allowedExt;
   }

   public long getMaxSize() {
      return maxSize;
   }

   public void setMaxSize(long maxSize) {
      this.maxSize = maxSize;
   }

   public String getAbsolutePath() {
      return absolutePath;
   }

   public void setAbsolutePath(String absolutePath) {
      this.absolutePath = absolutePath;
   }

   //���� ���ε� ó�� 
   public String uploadFile(MultipartFile file) throws IOException {
      if(file == null || file.isEmpty()) {
         throw new IllegalArgumentException("������ �����ϴ�.");
      }
      //���� ũ�� üũ
      if(maxSize > 0 && file.getSize() > maxSize) {
         throw new IllegalArgumentException("������ ������ ������� Ů�ϴ�.");
      }
      
      //Ȯ���� üũ
      if(allowedExt != null && allowedExt.length > 0 ) {
         String fileExt = getFileExt(file.getOriginalFilename());
         boolean isOkFileExt = false;
         
         for(String ext : allowedExt) {
            if(fileExt.equals(ext)) {
               isOkFileExt = true;
               break;
            }
         }
         
         if(!isOkFileExt) {
            throw new IllegalArgumentException("������ �ʴ� Ȯ�����Դϴ�.");
          }      
      }
      
      //���������� + �����̸� (�����̸��� ����)
      String realPath = servletContext.getRealPath("/res/upload/") + absolutePath +"/";
      String orFilename = file.getOriginalFilename();
      String filename = System.currentTimeMillis() + "_" + orFilename;
      File dest = new File(realPath, filename);
      
      //���� ����
      file.transferTo(dest);
      
      //����� ���� �̸� 
      return filename;
   }
   
   //���� Ȯ���� �������� �Լ�
   private String getFileExt(String filename) {
      if(filename == null || filename.isEmpty()) {
         return "";
      }
      int dotIndex = filename.lastIndexOf(".");
      return (dotIndex != -1 && dotIndex < filename.length() -1) ? 
            filename.substring(dotIndex + 1) : "";
   }
   
   
}