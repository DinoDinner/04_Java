import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
	public static Scanner sc = new Scanner(System.in);
	public void practice1() {
		int[] array = new int[10];
		
		// 배열 사용시 아래꼴로 응용하길 권장!! array.length 하드 코딩 금지!!!
		for(int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		System.out.println(Arrays.toString(array));
	}
	
	public void practice2() {
		int[] array = new int[10];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = array.length - i; 
		}
		System.out.println(Arrays.toString(array));
	}
	
	public void practice3() {
		System.out.print("양의 정수: ");
		int num = Integer.parseInt(sc.nextLine());
		
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = i + 1;
		}
		Arrays.toString(array);
	}
	
	public void practice4() {
		String[] array = { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(array[1]);
	}
	
	public void practice5() {
//		문자열 : application
//		문자 : i
//		application에 i가 존재하는 위치(인덱스) : 4 8 
//		i 개수 : 2
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char charValue = sc.nextLine().charAt(0);
		
		// str.length() : 문자열의 길이 받아오는 함수
		char[] array = new char[str.length()];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = str.charAt(i);
		}
//		System.out.println(Arrays.toString(array));
		System.out.print(str + "에 " + charValue + "가 존재하는 위치(인덱스) : ");
		
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == charValue) {
				System.out.print(i + " ");
				count++;
			}
		}
		
		System.out.println("\n" + charValue + " 개수 : " + count);
	}
	
	public void practice6() {
//		정수 : 5
//		배열 0번째 인덱스에 넣을 값 : 4
//		배열 1번째 인덱스에 넣을 값 : -4
//		배열 2번째 인덱스에 넣을 값 : 3
//		배열 3번째 인덱스에 넣을 값 : -3
//		배열 4번째 인덱스에 넣을 값 : 2
//		4 -4 3 -3 2 
//		총 합 : 2
		
		System.out.println("정수 : ");
		int inputNum = Integer.parseInt(sc.nextLine());
		int[] array = new int[inputNum];
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.println("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int inputValue = Integer.parseInt(sc.nextLine());
			array[i] = inputValue;
			sum += inputValue;
		}

		System.out.println("총합 : " + sum);
		System.out.println(Arrays.toString(array));
	}
	
	public void practice7() {
		int[] array = new int[10];
//		System.out.println(System.currentTimeMillis());
		Random r = new Random(System.currentTimeMillis()); // 완벽한 난수 생성법
		
		for(int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(1, 10); 
//			array[i] = r.nextInt(10) + 1;
		}
		System.out.println(Arrays.toString(array));
	}
	
	public void practice8() {
		int[] array = new int[10];
		Random r = new Random(System.currentTimeMillis()); // 완벽한 난수 생성법
		
		for(int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(1, 10); 
		}
		
		// 최대, 최소값 구하기
		int max = Integer.MIN_VALUE; // int가 가질수 있는 가장 작은 값의 상수
		int min = Integer.MAX_VALUE; // int가 가질수 있는 가장 큰 값의 상수
		for(int i = 0; i < array.length; i++ ) {
			if(min > array[i]) {
				min = array[i];
			}
			if(max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	
	
	//	다른 풀이, 권장하진 않음!
	public void practice8_2() {
		int[] array = new int[10];
		Random r = new Random(System.currentTimeMillis()); // 완벽한 난수 생성법
		
		for(int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(10) + 1; 
		}
		
		int[] array2 = array.clone(); // 배열을 복사하는 코드
		Arrays.sort(array2); // 정렬시킨다.
		
		System.out.println(Arrays.toString(array));
//		System.out.println(Arrays.toString(array2));
		System.out.println("최대값 : " + array2[array2.length - 1]); // 최대 인덱스 가져오는 법
		System.out.println("최소값 : " + array2[0]);
	}
	
	public void practice9() {
		int[] array = new int[10];
		Random r = new Random(System.currentTimeMillis()); // 완벽한 난수 생성법
		
		for(int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(10) + 1;
			System.out.println(Arrays.toString(array));
			System.out.println("pick! = " + array[i]);
			for(int j = 0; j < i; j++) {
				System.out.println("array[i] : " + array[i] + ", array[j] : " + array[j]);
				if(array[i] == array[j]) {
					i--;
					break;
				}
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(array));
	}
	
	public void practice9_2() {
		int[] array = new int[10];
		Random r = new Random(System.currentTimeMillis()); // 완벽한 난수 생성법
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		
		// shuffle 로직 = 섞는 방법!
		for(int  i = 0; i < array.length * 3; i++ ) {
			int rNum1 = r.nextInt(array.length); // index 범위로 i가 뽑힘;
			int rNum2 = r.nextInt(array.length); // index 범위로 i가 뽑힘;
			int temp = array[rNum1];
			array[rNum1] = array[rNum2];
			array[rNum2] = temp;
		}
		
		System.out.println(Arrays.toString(array));
	}
	
	// 최적화 버전
	public void practice10() {
	int[] array = new int[6];
	Random r = new Random(); 
	for(int i = 0; i < array.length; i++) {
		array[i] = r.nextInt(45) + 1;
		for(int j = 0; j < i; j++) {
			if(array[i] == array[j]) {
				i--;
				break;
			}
		}
	}
		
//		정렬은 sort 사용하면 더 쉽다.
//		Arrays.sort(array);
		
		// 정렬 방법 - 버블정렬
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++)
				if (array[i] > array[j]) {
					int temp = 0;
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
		}
		System.out.println(Arrays.toString(array));
	}
	
	// 성능적 최적화! - 병선님 버전
	public void practice10_2() {
		int[] arr = new int[6];
		boolean[] hasNum = new boolean[46];
		hasNum[0] = true;
		Random r = new Random();
		
		for (int i = 0; i < arr.length;) {
			int rNum = r.nextInt(45) + 1;
			if (hasNum[rNum] != true) {
				arr[i] = rNum;
				hasNum[rNum] = true;
				i++;				
			}
		}
		
		Arrays.sort(arr);
		for(int i = 0 ; i< arr.length;i++) {
			System.out.print("" + arr[i] + " ");
		}
	}
	
	// 코드 최적화 -> 나중에 배울 컬랙션으로 짜는 방법, 성능 메모리 모드 최악인 방법이나, 코드짜기는 쉽다!
	public void practice10_3() {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 45; i++) {
			list.add(i + 1);
		}
		Collections.shuffle(list);
		list = list.subList(0, 6);
		Collections.sort(list);
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		ArrayPractice ap = new ArrayPractice();
//		ap.practice1();
//		ap.practice2();
//		ap.practice3();
//		ap.practice4();
//		ap.practice5();
//		ap.practice6();
//		ap.practice7();
//		ap.practice8();
//		ap.practice8_2();
//		ap.practice9();
//		ap.practice9_2();
//		ap.practice10_2();
		ap.practice10();
	}
	
}
