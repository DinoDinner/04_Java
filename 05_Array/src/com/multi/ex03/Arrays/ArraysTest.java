package com.multi.ex03.Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysTest {
	public static void main(String[] args) {
		int[] array = new int[10];
//		Random r = new Random(System.currentTimeMillis());
		Random r = new Random();
		
		// (랜덤한 수로)난수로 초기화 하는 방법
		for(int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(10); // 0 ~ 9
		}
		
		// 출력하는 방법
		System.out.println(Arrays.toString(array));
		
		// 값을 찾는 방법1 - 직접 구현
		int value = 5;
		int index = -1;
		for(int i = 0; i < array.length; i++ ) {
			if(array[i] == value) {
				index = i;
				System.out.println("탐색 완료!");
				break;
			}
		}
		if(index >= 0) {
			System.out.println("탐색 완료! : " + index);
		}else {
			System.out.println("찾지 못하였습니다.");
		}

		// 값을 정렬하는 방법
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		// 값을 찾는 방법2 - binarySearch() // 정렬되지 않으면 안된다!
		int index2 = Arrays.binarySearch(array, value); // 값을 찾으면 index를 반환하고, 없으면 -1을 줌
		System.out.println(index2);
		if(index2 >= 0) {
			System.out.println("탐색 완료! : " + index2);
		}else {
			System.out.println("찾지 못하였습니다.");
		}
	}
}








