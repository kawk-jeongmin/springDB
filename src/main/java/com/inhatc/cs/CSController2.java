package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CSController2 {
	
	@RequestMapping("doC")
	public String doC(@ModelAttribute("message") String message) {
		System.out.print("doC call");
		
		return "csResult";
	}

}
