package com.tenco.controller.DTO;

public class LoginDTO {
	
	private String email;
	private String password;
	private String hobby;
	
	public LoginDTO() {

	}
	
	public LoginDTO(String email, String password, String hobby) {
		this.email = email;
		this.password = password;
		this.hobby = hobby;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "LoginDTO [email=" + email + ", password=" + password + ", hobby=" + hobby + "]";
	}
	
}
