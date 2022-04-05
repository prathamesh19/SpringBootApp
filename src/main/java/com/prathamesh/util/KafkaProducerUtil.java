package com.prathamesh.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducerUtil {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	private String topic = "student";
	
	List<String> listOfMessages = new ArrayList<String>();
	
	public String sendMessage(String message) {
		
		kafkaTemplate.send(topic,message);
		
		return "Message From Student Producer : "+message;
	}
	
}
