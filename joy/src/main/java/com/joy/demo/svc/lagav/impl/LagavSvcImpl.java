package com.joy.demo.svc.lagav.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.joy.demo.domain.lagav.LagavTO;
import com.joy.demo.domain.lagav.LagavVO;
import com.joy.demo.svc.lagav.LagavSvc;

@Service
public class LagavSvcImpl implements LagavSvc {
	@Autowired
	private MongoTemplate template;

	@Override
	public String insert(LagavTO to) {
		// TODO Auto-generated method stub
	
		List<LagavTO> lagav = new ArrayList<LagavTO>();

		Query query = new Query();
		query.limit(1);
		
		template.findOne(query, LagavTO.class);
		for(int i = 0 ; i < to.getOrder() ; i ++ ) {
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

			LagavTO to2 = new LagavTO();
			to2.setCreatedon(now.format(formatter));
			lagav.add(to2);
		}

		template.insertAll(lagav);
		return null;
	}

	@Override
	public LagavVO select(LagavTO to) {
		// TODO Auto-generated method stub
		return null;
	}

}
