package 문제연습풀이;

import java.util.Scanner;

public class Won2Dollar {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		int won = scanner.nextInt();
		double rate = won/1100;
		System.out.println(won+"원은 $"+rate+"입니다");
	}
}
