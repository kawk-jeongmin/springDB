package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inhatc.domain.ProductVO;

@Controller
public class CSController5 {
	
	@RequestMapping("doJson")
	public @ResponseBody ProductVO doJson(){
		
		ProductVO vo = new ProductVO("product2", 2000);
		System.out.println("doJason call");
		
		return vo;
	}

}
