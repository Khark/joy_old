package com.joy.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joy.demo.domain.JoyTO;
import com.joy.demo.domain.JoyVO;
import com.joy.demo.svc.BoardSvc;

@Controller
@RequestMapping("/joy/*")
public class JoyController {

	@Autowired
	BoardSvc boardsvc;
	
	@GetMapping("main")
	 public String main(Model model){
		
		return "joy/main";
    }


	@GetMapping("writeForm")
	public String writeForm(@ModelAttribute("JoyTO") @Validated JoyTO joyto, Model model) {

		return "joy/writeForm";
	}
	
	@PostMapping("writeForm")
	public String writeFormPOST(@ModelAttribute("JoyTO") @Validated JoyTO joyto, Model model) {
		String result="";

		if(boardsvc.insertEvent(joyto).equals("")) {
			
		}else {
			
		}
		return result;
	}
	
	@GetMapping("viewForm")
	public String viewForm( Model model , JoyVO joyvo  ) {
		
		return "joy/viewForm";
	}
	
	@GetMapping("listForm")
	public String listForm(@ModelAttribute("JoyTO") @Validated JoyTO joyto, Model model) {
		
		return "joy/listForm";
	}

	
	@PostMapping("listForm")
	public String listFormPost(@ModelAttribute("JoyTO") @Validated JoyTO joyto, Model model) {
		
		return "joy/listForm";
	}

	
}
