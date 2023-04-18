import java.util.Scanner;

public class CastingPractice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		String str = sc.nextLine();
		System.out.println(str + " unicode : " + (int)str.charAt(0));
	}
}
