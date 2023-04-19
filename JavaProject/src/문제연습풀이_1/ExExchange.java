package 문제연습풀이_1;

import java.util.Scanner;

public class ExExchange {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		double won = scanner.nextDouble();
		double usd = won/1200;
		double eur = won/1500;
		System.out.println(won+"원은 $"+usd+"입니다.");
		System.out.println(won+"원은 E"+eur+"입니다.");
		
	}
}
