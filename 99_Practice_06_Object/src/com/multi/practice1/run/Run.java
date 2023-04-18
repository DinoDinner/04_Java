package com.multi.practice1.run;

import com.multi.practice1.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		Product p = new Product();
		p.setpName("지슈라 마우스");
		p.setBrand("로지텍");
		p.setPrice(200000);
		
		System.out.println(p); // toString 생략하면 자동으로 toString을 호출한다!
	}
}
