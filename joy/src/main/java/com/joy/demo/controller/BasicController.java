package com.joy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.AllArgsConstructor;


@Controller
@AllArgsConstructor
@RequestMapping("/")
public class BasicController {

	
	@RequestMapping("/")
	public String DeafultController() {
		
		
		return "say hi ";
	}
	
	
	public String list(Model model, @RequestParam(value="page", defaultValue = "1") Integer pageNum) {


		
        return "board/list";
    }
	
}
