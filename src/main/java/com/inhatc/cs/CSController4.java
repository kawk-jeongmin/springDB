package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CSController4 {
	
	@RequestMapping("doF")
	public String doF(RedirectAttributes rttr) {
		System.out.println("doF call");
		System.out.println("AndRedirect to /doG");
		
		rttr.addFlashAttribute("message", "redirect message");
		return "redirect:/doG";
		
	}
	
	@RequestMapping("doG")
	public void doG(String message) {
		System.out.println("doG call");
	}

}
