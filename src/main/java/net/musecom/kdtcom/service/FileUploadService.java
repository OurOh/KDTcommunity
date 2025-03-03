package net.musecom.kdtcom.service;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {
  
	//확장자 목록, 파일크기제한
	private String[] allowedExt;  
	private long maxSize;
	
	//파일의 저장경로
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

	//파일 업로드 처리 
	public String uploadFile(MultipartFile file) throws IOException {
		if(file == null || file.isEmpty()) {
			throw new IllegalArgumentException("파일이 없습니다.");
		}
		//파일 크기 체크
		if(maxSize > 0 && file.getSize() > maxSize) {
			throw new IllegalArgumentException("파일이 지정한 사이즈보다 큽니다.");
		}
		
		//확장자 체크
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
			   throw new IllegalArgumentException("허용되지 않는 확장자입니다.");
		    }		
		}
		
		//파일저장경로 + 파일이름 (파일이름을 변경)
		String realPath = servletContext.getRealPath("/res/upload/") + absolutePath +"/";
		String orFilename = file.getOriginalFilename();
		String filename = System.currentTimeMillis() + "_" + orFilename;
		File dest = new File(realPath, filename);
		
		//파일 저장
		file.transferTo(dest);
		
		//저장된 파일 이름 
		return filename;
	}
	
	//파일 확장자 가져오는 함수
	private String getFileExt(String filename) {
		if(filename == null || filename.isEmpty()) {
			return "";
		}
		int dotIndex = filename.lastIndexOf(".");
		return (dotIndex != -1 && dotIndex < filename.length() -1) ? 
				filename.substring(dotIndex + 1) : "";
	}
	
	
}
