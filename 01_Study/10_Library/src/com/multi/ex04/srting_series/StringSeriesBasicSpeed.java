package com.multi.ex04.srting_series;

public class StringSeriesBasicSpeed {
	public static void main(String[] args) {
		System.out.println("시작");
		
		long current = System.currentTimeMillis();
		
//		String temp = "";
//		for(int i = 0; i < 100000; i++) {
//			temp += i;
//		}
		
//		StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder(); // 빌더가 좀더 빠르다.
		for(int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		
		long finish = System.currentTimeMillis();
		System.out.println("종료");
		System.out.println(finish - current);
		// String : 7165 5212 7129 4254 5204 2103 9179
		// StringBuffer : 9 3 7 4 7 3 4
		// StringBuilder : 5 3 6 5 6 3
	}
}
