package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.service.KafkaSender;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
	
	@Autowired
	KafkaSender kafkaSender;
	
	@RequestMapping("/producer/{message}")
	public String producer(@PathVariable String message) {
		kafkaSender.sendMessage(message);
		return "Kafka message sent to Kafka Topic testsh";
	}

}
