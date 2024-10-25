package net.musecom.kdtcom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MainController {
	
	@Autowired
	private
	
	
}
	@GetMapping("/")
	public String main() {
		return "kdtcom.index";
	}
	
@GetMapping("/register")
public String register() {
	return "kdt.register";

}

@PostMapping("/register")
public String formRegister() {
		@RequestParm("userid") String userid,
		@RequestParm("userpass") String userpass,
		@RequestParm("username") String username,
		@RequestParm("useremail") String useremail,
		@RequestParm("usertel") String usertel,
		@RequestParm("zipcode") int zipcode,
		@RequestParm("address") String address,
		@RequestParm("detail_address") String detail_address,
		@RequestParm("extra_address") String extra_address,
		@RequestParm("userprofile") String userprofile,
		@RequestParm(value="userimg", required="false") MultipartFile userimg,
		Model model){

		//아이피 주소 얻기
		clientIpAddress.setClientIpAddress(request);
		String userip = clientIpAddress.getClientIpAddress();
		
		//비밀번호 암호화
		String userpass = passwordEncoder.encode(noopUserpass);
		
	try {
		//업로드 처리
		if(userimg != null && !userimg.isEmpty()) {
			fileUpload.setAbsoultePath()
			String[] exts = {"jpg","gif","png"};
			
			
		}
	}
		
		
		
		
	}
			
			
			
}
		
		
		
		
		
		
		
		
		
		
		
