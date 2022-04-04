package com.joy.demo.controller.LagavController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joy.demo.domain.mongo.lagav.LagavTO;
import com.joy.demo.svc.lagav.LagavSvc;

@Controller
@RequestMapping("/lagav/*")
public class LagavController {

		@Autowired
		LagavSvc lagavSvc;
		
		@GetMapping("lagavWriteForm")
		public String writeForm(@ModelAttribute("LagavTO") @Validated LagavTO to
				,Model model
				) {
			
			System.out.println("## in here?");
			return "lagav/lagavWriteForm";
		}
	
		
		//lagav/writeLagvForm
		@PostMapping("lagavWriteForm")
		public String writeFormPost(@ModelAttribute("LagavTO") @Validated LagavTO to
				,BindingResult br
				) {
			String result = "";
			lagavSvc.insert(to);

			if(br.hasErrors()) {
				
				return "";
			}else{
				
			
			return "lagav/lagavWriteForm";
			}
			
		}
}


