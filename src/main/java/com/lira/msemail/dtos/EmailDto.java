package com.lira.msemail.dtos;

import java.io.Serializable;
import java.util.Objects;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class EmailDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@NotBlank
	private String ownerRef;
	@NotBlank
	@Email
	private String emailFrom;
	@NotBlank
	@Email
	private String emailTo;
	@NotBlank
	private String subject;
	@NotBlank
	private String text;
	
	
	public EmailDto() {}


	public EmailDto(@NotBlank String ownerRef, @NotBlank @Email String emailFrom, @NotBlank @Email String emailTo,
			@NotBlank String subject, @NotBlank String text) {
		super();
		this.ownerRef = ownerRef;
		this.emailFrom = emailFrom;
		this.emailTo = emailTo;
		this.subject = subject;
		this.text = text;
	}


	public String getOwnerRef() {
		return ownerRef;
	}


	public void setOwnerRef(String ownerRef) {
		this.ownerRef = ownerRef;
	}


	public String getEmailFrom() {
		return emailFrom;
	}


	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}


	public String getEmailTo() {
		return emailTo;
	}


	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	@Override
	public int hashCode() {
		return Objects.hash(ownerRef);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmailDto other = (EmailDto) obj;
		return Objects.equals(ownerRef, other.ownerRef);
	}
	
	
	
}
