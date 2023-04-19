package 문제연습풀이_2;

import java.util.Scanner;

public class Won2Dollar {

	public static void main(String[] args) {
		
		int usd = 1100;
		int won = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		won = scanner.nextInt();
		double dollar = won/usd;
		System.out.println(won+"원은 "+"$"+dollar+"입니다");
				

	}

}
