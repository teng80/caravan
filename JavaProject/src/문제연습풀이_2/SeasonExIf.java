package 문제연습풀이_2;

import java.util.Scanner;

public class SeasonExIf {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int month = scanner.nextInt();
		
		if (month<=5) {
			System.out.println("봄");
		} else if (month<=8) {
			System.out.println("여름");
		} else if (month<=11) {
			System.out.println("가을");
		} else if (month==12||month==1||month==2) {
			System.out.println("겨울");
		} else {
			System.out.println("잘못입력");
		}

	}

}
