package com.joy.demo.svc.joy;

import java.util.List;

import com.joy.demo.domain.mongo.joy.JoyTO;
import com.joy.demo.domain.mongo.joy.JoyVO;

public interface JoySvc {

	List<JoyVO> selectJoyList(JoyTO to);
}
