package com.joy.demo.svc.lagav;

import com.joy.demo.domain.mongo.lagav.LagavTO;
import com.joy.demo.domain.mongo.lagav.LagavVO;

public interface LagavSvc {

	public String insert(LagavTO to);
	public LagavVO select(LagavTO to);
	
}
