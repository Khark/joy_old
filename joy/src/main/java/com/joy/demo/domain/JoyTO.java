package com.joy.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class JoyTO {

	@Id
	private String _id;
	
	private String extra1;
	
	
}
