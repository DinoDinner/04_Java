package com.multi.ex04.access_modifier;

public class TestAccessModifier {
	
	public static void main(String[] args) {
		// AccessModifier와 같은 패키지에서 멤버변수 접근 테스트!
		AccessModifier test = new AccessModifier();
		test.publicValue = 1;		// public OK
		test.protectedValue = 2;	// protected OK
		test.defaultValue = 3;		// default OK
//		test.privateValue = 4;		// Error!! private로 외부에서 절대 접근 불가!
		// The field AccessModifier.privateValue is not visible : 접근 불가능한 상태!
		// privateValue cannot be resolved or is not a field : 선언하지 않아서 해석 불가 상태!
	}
}
