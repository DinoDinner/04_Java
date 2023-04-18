package com.multi.practice3.run.Run;

import com.multi.practice3.model.vo.Employee;
import com.multi.practice3.model.vo.Employee2_Singleton;

public class Run {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpNo(100);
		e.setEmpName("홍길동");
		e.setDept("영업부");
		
		System.out.println(e);
		
		// 객체를 만들지 않고 가져오는 방법
		// Singleton 패턴 = java에서 유일하게 객체를 존재시키는 방법
		Employee2_Singleton e2 = Employee2_Singleton.getInstance();
		e2.setEmpName("홍길동");
		System.out.println(e2);
	}
}

