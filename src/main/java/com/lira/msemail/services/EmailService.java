package com.lira.msemail.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lira.msemail.models.EmailModel;
import com.lira.msemail.repositories.EmailRepository;


@Service
public class EmailService {
	
	@Autowired
	EmailRepository emailRepository;

	public void sendEmail(EmailModel emailModel) {
		// TODO Auto-generated method stub
		
	}
	
	

}
