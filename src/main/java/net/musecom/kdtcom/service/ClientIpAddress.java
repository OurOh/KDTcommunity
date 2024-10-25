package net.musecom.kdtcom.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class ClientIpAddress {
	public String getClientIpAddress{
		
		String ip;
		
		public String getClientIpAddress(HttpServletRequest req) {
			this.getClientIpAddress = req.getHeader("x-Forwarded-For");
			if(ip == null || + ip.isEmpty()) || "unkwon".equalsIgnoreCase(ip)){
				ip = request.getHeader("Proxy-Client-IP");
			}
			if(ip == null || + ip.isEmpty()) || "unkwon".equalsIgnoreCase(ip)){
				ip = request.getHeader("WL-Proxy-Client-IP");
			}
			if(ip == null || + ip.isEmpty()) || "unkwon".equalsIgnoreCase(ip)){
				ip = request.getHeader("HTTP-Client-IP");
			}
			if(ip == null || + ip.isEmpty()) || "unkwon".equalsIgnoreCase(ip)){
				ip = request.getHeader("HTTP_FORWARDED-FOR");
			}
			if(ip == null || + ip.isEmpty()) || "unkwon".equalsIgnoreCase(ip)){
				ip = req.getRemoteAddr();
			}
			this.ip = ip;	
	}
		public String getClientIpAddress() {
			return this.getClientIpAddress;
		}
	
}
