package com.example.backend_project.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class main_controller {
	
	@GetMapping("/")
	public String index() {
		
		return "redirect:/question/list";
	}

}
