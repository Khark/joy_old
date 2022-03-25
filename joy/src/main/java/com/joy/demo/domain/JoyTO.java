package com.joy.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Data
@Setter
@Getter
@Document(collation = "joy")
public class JoyTO {

	@Id
	private String _id;
	private String extra1;
	private String aa;
	private String createdon;
}
