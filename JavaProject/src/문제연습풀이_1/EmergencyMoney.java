package 문제연습풀이_1;

import java.util.Scanner;

public class EmergencyMoney {

	public static void main(String[] args) {
		
		final int hundred = 120000;
		final int ten = 12000;
		int res, money=0, num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("가구수를 입력하시오>>");
		num = scanner.nextInt();
		
		if (num == 1) {
			money = 400000;
		} else if (num == 2) {
			money = 600000;
		} else if (num == 3) {
			money = 800000;
		} else if (num >= 4) {
			money = 1000000;
		} 
		res = money / hundred;
		if (res > 0) {
			System.out.println("100달러짜리 "+res+"매");
		}
		res = (money % hundred)/ten;
		if (res > 0) {
			System.out.println("10달러짜리 "+res+"매");
		}
	}

}
