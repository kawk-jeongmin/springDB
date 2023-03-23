package com.inhatc.cs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CSController {
	
	@RequestMapping("doA")
	public void doA() {
		System.out.println("DoA call");
	}
	
	@RequestMapping("doB")
	public void doB() {
		System.out.println("DoB call");
		
		int sum= 0;
		for(int i=0; i<=10; i++) {
			sum +=i;
		}
		System.out.println("Sum" + sum);
	}

}
