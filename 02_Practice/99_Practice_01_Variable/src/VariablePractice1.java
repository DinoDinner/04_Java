import java.util.Scanner;

public class VariablePractice1 {
	/*
	 Class Name : VariablePractice1 - main

	이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
	
	ex.
	이름을 입력하세요 : 아무개
	성별을 입력하세요(남/여) : 남
	나이를 입력하세요 : 20
	키를 입력하세요(cm) : 180.5
	
	키 180.5cm인 20살 남자 아무개님 반갑습니다^^
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("성별을 입력하세요(남/여) : ");
		String gender = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("키를 입력하세요(cm) : ");
		double height = Double.parseDouble(sc.nextLine());
		
		System.out.println("키 "+height+"cm인 "+age+"살 "+gender+"자 "+name+"님 반갑습니다^^");
		System.out.printf("키 %.1fcm인 %d살 %s자 %s님 반갑습니다^^", height, age, gender, name);
		
	}

}
