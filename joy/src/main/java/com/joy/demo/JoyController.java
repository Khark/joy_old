package com.joy.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JoyController {

	@GetMapping("main")
	 public String home(Model model){
        model.addAttribute("data","어서오세요!");
       System.out.println("###AAA");
        return "main";
    }


}
