package com.joy.demo.domain.lagav;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Document(collection = "lagav")
public class LagavVO {
	@Id
	private String _id;
	private String createdon;
	private String createyear;
	
	private String serialno;
	private String location;
	private String location_num;
}
