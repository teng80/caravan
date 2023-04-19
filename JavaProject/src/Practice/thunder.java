package Practice;

import java.util.Scanner;

public class thunder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시간 간격을 입력하시오 (단위: 초): ");
		int sec = sc.nextInt();
		int sum = sec*340;
		System.out.println("번개가 발생한 곳 까지의 거리 :"+sum+"m");
		
		
	}
}
