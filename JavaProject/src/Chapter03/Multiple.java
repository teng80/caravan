package Chapter03;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		
//		int number = 0;
//		boolean multiple = false;
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("양의 정수를 입력하세요: ");
//		
//		number = scanner.nextInt();
//		if (number%3==0) {
//			System.out.println("3의 배수이다");
//			multiple = true;
//		} 
//		if (number%5==0) {
//			System.out.println("5의 배수이다");
//			multiple = true;
//		} 
//		if (number%8==0) {
//			System.out.println("8의 배수이다");
//			multiple = true;
//		} 
//		if (!multiple) {
//			System.out.println("어느 배수도 아니다");
//		}	
		//강사님 답
		int number;
		boolean multiple;
		multiple = false;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		number = scanner.nextInt();
		
//		3의 배수(아닌경우(5의 배수 or not(8의 배수 or not)))
//		if else if (if else(if else))
//		if else if 혹은 if else 가 만능은 아니다
//		if 문만 사용
		if (number % 3 == 0) {
			System.out.println("3의 배수이다");
			multiple = true;
		}
		if (number % 5 == 0) {
			System.out.println("5의 배수이다");
			multiple = true;
		}
		if (number % 8 == 0) {
			System.out.println("8의 배수이다");
			multiple = true;
		}
//		3,5,8배수의 조건이 하나도 아닐때
		if (multiple == false) {
			System.out.println("어느 배수도 아니다");
		}
	}
}
