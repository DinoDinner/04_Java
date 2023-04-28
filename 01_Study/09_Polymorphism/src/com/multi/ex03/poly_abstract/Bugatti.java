package com.multi.ex03.poly_abstract;

public class Bugatti extends Car{
	public Bugatti() {
		super(8000);
	}
	
	@Override
	public void oilling() {
		System.out.println("고급 휘발유를 주유중입니다.");
	}
	
	@Override
	public void move() {
		System.out.println("부오아엉오아아아오아아앙앙(최대한 시끄럽게)");
	}
	
	public void nickName() {
		System.out.println("명진님의 드림카");
	}
}
