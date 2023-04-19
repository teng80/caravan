package Chapter02;

import java.util.Scanner;

public class ExExchange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double DOLLAR_RATE=1200.0;
		final double EURO_RATE=1500.0;
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		int won = sc.nextInt();
		
		double dollar = won/DOLLAR_RATE;
		System.out.println(won+"원은 $"+dollar+"입니다.");
		
		double eur = won/EURO_RATE;
		System.out.println(won+"원은 E"+eur+"입니다.");
		
		sc.close();
		
	}

}
