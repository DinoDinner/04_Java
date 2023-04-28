package com.multi.ex01.fisrt_object;

// JAVA 언어 규칙중 하나
//  -> .java 파일의 이름은 public class와 일치해야 컴파일이 가능!

public class FirstObject {

	public static void main(String[] args) {
//	    Type   변수명    = 초기화값;
		int    num     = 10;
		Person person1 = new Person(); // 객체를 생성하는 키워드 = new!
		person1.name = "홍길동";
		person1.age = 27;
		person1.phoneNum = "010-1234-5678";
		person1.address = "서울시 강남구 역삼동";
//		person1.printInfo();
		
		System.out.println("이름 : " + person1.name);
		System.out.println("나이 : " + person1.age);
		System.out.println("전화번호 : " + person1.phoneNum);
		System.out.println("주소 : " + person1.address);
	}
}

// public class : .java파일과 이름이 일치하는 class이고, 파일당 하나만 존재 가능함!
// default class : public class가 아닌 일반 class를 의미하고, 외부에서 접근이 불가!

//public class Person{ // public class가 파일에 2개 이상 존재해서 에러 발생!
class Person{ // default class
	String name; // 8byte
	int age;	// 4byte
	String phoneNum; // 8byte
	String address;  // 8byte
	
	void printInfo() {
		System.out.println("name : " + name +", age : " + age);
	}
}

class 사람 {
	String 이름; // 이해성
	int 나이; // 3x
	String 휴대전화; // 010-3333-3333
	String 주소; // 서울시 강남구~~
}

class 고양이{
	String 이름; // 루시
	int 나이; // 7세
	String 울음소리;
	String 종; // 페르시안, 러시안블루
}




