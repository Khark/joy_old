package com.joy.demo.domain.mongo.lagav;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Unwrapped.Empty;

import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import com.mongodb.annotations.NotThreadSafe;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Document(collection = "lagav")
public class LagavTO {

	@Id
	private String _id;
	private String createdon;
	
	//@NotEmpty
	private String createyear;
	
	private String serialno;
	private String location;
	private String location_num;
	
	//@NotEmpty
	private String label;
	//@NotEmpty
	private String order;
}
