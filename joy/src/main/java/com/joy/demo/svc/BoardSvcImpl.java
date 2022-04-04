package com.joy.demo.svc;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joy.demo.advice.RestException;
import com.joy.demo.domain.mongo.joy.JoyTO;

@Service
public class BoardSvcImpl implements BoardSvc {
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public JoyTO getEvent(String _id) {
		// TODO Auto-generated method stub
		JoyTO joy = mongoTemplate.findById(_id, JoyTO.class );
		return Optional.ofNullable(joy).orElseThrow(() -> new RestException(HttpStatus.NOT_FOUND, "Not found event"));
	}


	public List<JoyTO> getEventList(String extra) {
		//Query query = new Query().addCriteria(Criteria.where("title").is(extra));
	
		Query query = new Query().addCriteria(Criteria.where("extra").is(extra));
		return mongoTemplate.find(query, JoyTO.class);
	}
//	@ConfigurationProperties("datasource-oracle")
	@Transactional
	public String insertEvent(JoyTO joy) { 
		String result = "ProcessSucess";
		try {
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			joy.setCreatedon(now.format(formatter));
			mongoTemplate.insert(joy);
		}catch (Exception e) {
			result="ProcessFail";
			e.printStackTrace();
			// TODO: handle exception
		}
		return result;
	}
}
