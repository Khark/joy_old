package com.joy.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Document(collation = "joy")
@Getter
@Setter
public class JoyVO {

	@Id
	private String _id;
	
	private String dummy;
	
}
