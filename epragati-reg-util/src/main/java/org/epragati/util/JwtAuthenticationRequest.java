package org.epragati.util;

import java.io.Serializable;

public class JwtAuthenticationRequest implements Serializable {

	private static final long serialVersionUID = 5278278380839781289L;

	private String username;
	private String password;
	private String capchaId;
	private String capchaEncodedImg;
	private String capchaValue;
	private Boolean isUidsStatus;

	public JwtAuthenticationRequest() {
		super();
	}

	public JwtAuthenticationRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public String getCapchaId() {
		return capchaId;
	}

	public void setCapchaId(String capchaID) {
		this.capchaId = capchaID;
	}

	public String getCapchaEncodedImg() {
		return capchaEncodedImg;
	}

	public void setCapchaEncodedImg(String capchaEncodedImg) {
		this.capchaEncodedImg = capchaEncodedImg;
	}

	public String getCapchaValue() {
		return capchaValue;
	}

	public void setCapchaValue(String capchaValue) {
		this.capchaValue = capchaValue;
	}

	public Boolean getIsUidsStatus() {
		return isUidsStatus;
	}

	public void setIsUidsStatus(Boolean isUidsStatus) {
		this.isUidsStatus = isUidsStatus;
	}
	
	
	
	
	
}
