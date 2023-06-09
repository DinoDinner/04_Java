package com.multi.ex01.conditional;

import java.util.Scanner;

public class IfStatement4 {
	// 강사의 if문 스타일
	// 1. 예외를 먼저 if + return문으로 필터링을한다.
	// 2. 정상적인 상황을 아래에 타이핑하여 코드를 구성한다. (0 level로)
	// 이 스타일의 장점 : 코드의 복잡도가 줄어든다! (간결해진다!)
	public static void main(String[] args) {
		// 로그인 기능
		// ID를 입력 받고 3글자 미만이면 "ID가 짧습니다." -> 실패
		// PW를 입력 받고 8글자 미만이면 실패, PW에 ID가 포함 되어 있으면 실패.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID를 입력해주세요.");
		String id = sc.nextLine();
		
		if(id.length() < 3) {
			System.out.println("ID가 짧습니다.");
			return; // main(메소드)를 종료하는 키워드
		}
		
		System.out.println("PW를 입력해주세요.");
		String pw = sc.nextLine();

		if(pw.length() < 8 || pw.contains(id) == true) {
			System.out.println("PW가 짧거나 PW에 아이디가 포함되어 있습니다!");
			return;
		}
		
		// 로그인 성공 상태 = 정상적인 상태
		System.out.println("로그인이 성공하였습니다.");
	}
}
