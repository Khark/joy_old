package com.joy.demo.svc.joy.impl;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;

import com.joy.demo.domain.mongo.joy.JoyTO;
import com.joy.demo.domain.mongo.joy.JoyVO;
import com.joy.demo.svc.joy.JoySvc;
@Service
public class JoySvcImpl implements JoySvc {
	@Autowired
	private MongoTemplate template;
	@Override
	public List<JoyVO> selectJoyList(JoyTO to) {
		// TODO Auto-generated method stub
		JoyVO joyvo = new JoyVO();
		List<JoyVO> list = new ArrayList<JoyVO>();
//		Query query = new Query().with(new Sort( Direction.DESC, "createdon" ));
		//  Query query = new Query().with(new Sort(Direction.DESC, "no"));

		System.out.println("안녕??");
		   Query query = new Query().addCriteria(Criteria.where( "_id" ).is( new ObjectId("62459b039d47c06db438dfc5")) );
		   Document doc = template.findOne(query, Document.class, "joy");  //데이터를 가져와서  
		   
		   
		   query = new Query();
		   List<Document> doc2 =  template.find(query, Document.class,"joy");
		   System.out.println("##"+doc);

		for(int i = 0 ; i < doc2.size(); i ++) {
			System.out.println("##"+doc2.get(i));
		}
		   
		return null;
	}

}
