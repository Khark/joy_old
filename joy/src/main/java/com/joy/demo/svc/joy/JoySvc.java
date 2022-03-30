package com.joy.demo.svc.joy;

import java.util.List;

import com.joy.demo.domain.JoyTO;
import com.joy.demo.domain.JoyVO;

public interface JoySvc {

	List<JoyVO> selectJoyList(JoyTO to);
}
