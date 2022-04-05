package com.prathamesh.util;


import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {

	@Autowired
	private JavaMailSender javaMailSender;
	
	public boolean send(String to, String subject, String text) throws MessagingException{
		
			MimeMessage message=javaMailSender.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(message);
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(text);
			javaMailSender.send(message);
		return true;
	}
}
