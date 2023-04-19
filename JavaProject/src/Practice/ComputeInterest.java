package Practice;

import java.util.Scanner;

public class ComputeInterest {

	public static void main(String[] args) {
		int principal=0; //원금
		double rate=0; //연이율
		double balance=0; //원리금
		int years=0; //연도수
		Scanner scanner = new Scanner(System.in);
		System.out.print("원금을 입력하세요:");
		principal = scanner.nextInt();
		System.out.print("연이율을 입력하세요:");
		rate = scanner.nextDouble();
		System.out.println("연도수\t원리금");
		balance = principal;
		do {
			years = years + 1;
			balance = balance * (1.0 + rate / 100.0);
			System.out.println(years+"\t"+balance);
		} while (balance <= principal*2);
			System.out.println("필요한 연도수 = "+years);
	}

}
