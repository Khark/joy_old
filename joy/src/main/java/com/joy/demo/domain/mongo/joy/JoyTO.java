package com.joy.demo.domain.mongo.joy;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Data
@Setter
@Getter
@TypeAlias("joy")
@Document(collection = "joy")
public class JoyTO {

	@Id
	private String _id;

	private String extra1;
	private String aa;
	private String createdon;
	
	private String name;
	private String memo;
	
}
