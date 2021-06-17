package com.example.app.inquiry;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class InquiryForm {
	
	@Size(min = 1, max = 20, message = "Please input 20characters or less")
	private String name;
	
	@NotNull
	@Email(message = "Invalid E-mail format")
	private String email;
	
	@NotNull
	private String conents;
	
	public InquiryForm() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConents() {
		return conents;
	}
	public void setConents(String conents) {
		this.conents = conents;
	}

}
