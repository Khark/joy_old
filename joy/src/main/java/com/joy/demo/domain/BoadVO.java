package com.joy.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Document(collection = "joy")
@Data
@Getter
@Setter
public class BoadVO {

	@Id
	private String id;
	
	private String username;
	
	private String userid;
	
	private String email;
}
