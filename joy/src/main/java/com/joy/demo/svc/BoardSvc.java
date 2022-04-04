package com.joy.demo.svc;

import java.util.List;

import com.joy.demo.domain.mongo.joy.JoyTO;

public interface BoardSvc {

	public JoyTO getEvent(String _id) ;
	public List<JoyTO> getEventList(String extra) ;
	public String insertEvent(JoyTO joy) ;
}
