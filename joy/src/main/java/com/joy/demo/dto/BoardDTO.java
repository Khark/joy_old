package com.joy.demo.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BoardDTO {
	List<BoardDTO> list = new ArrayList<BoardDTO>();
	private int id ;
	private String username;
	private String password;
	
	
}
