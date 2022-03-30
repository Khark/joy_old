package com.joy.demo.svc.joy.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.joy.demo.domain.JoyTO;
import com.joy.demo.domain.JoyVO;
import com.joy.demo.svc.joy.JoySvc;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.query.Query;
public class JoySvcImpl implements JoySvc {
	@Autowired
	private MongoTemplate mt;
	@Override
	public List<JoyVO> selectJoyList(JoyTO to) {
		// TODO Auto-generated method stub
		JoyVO joyvo = new JoyVO();
		List<JoyVO> list = new ArrayList<JoyVO>();
//		Query query = new Query().with(new Sort( Direction.DESC, "createdon" ));
		  Query query = new Query().with(new Sort(Direction.DESC, "no"));

		list = mt.find(null, null);
		return null;
	}

}
