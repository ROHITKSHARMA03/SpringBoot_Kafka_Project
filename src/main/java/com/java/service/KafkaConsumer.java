package com.java.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	

private final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(topics = "testsh", groupId = "group_id")
	public void consume(String message){
	logger.info(String.format("$$ -> Consumed Message -> %s",message));
	}

}
