package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inhatc.domain.MemberVO;
import com.inhatc.domain.ProductVO;

@Controller
public class CSController3 {
	
	@RequestMapping("doD")
	public String doB(Model model) {
		
		ProductVO product = new ProductVO("product1", 1000);
		System.out.println("doD call");
		
		model.addAttribute(product);
		
		return "productDetail";
		
	}
	
	@RequestMapping("doE")
	public String doE(Model model) {
		
		MemberVO member = new MemberVO("jeongmin", "곽정민");
		System.out.println("doE call");
		
		model.addAttribute(member);
		
		return "memberDetail";
	}

}
