package com.joy.demo.domain.mongo.joy;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Document(collection = "joy")
@Getter
@Setter
public class JoyVO {

	@Id
	private String _id;
	
	private String dummy;
	
}
