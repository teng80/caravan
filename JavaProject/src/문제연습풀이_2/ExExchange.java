package 문제연습풀이_2;

import java.util.Scanner;

public class ExExchange {

	public static void main(String[] args) {
		
		double dollar = 1200;
		double eur = 1500;
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		int won = scanner.nextInt();
		double sum1 = won/dollar;
		System.out.println(won+"원은 $"+sum1+"입니다");
		double sum2 = won/eur;
		System.out.println(won+"원은 E"+sum2+"입니다");
		

	}

}
