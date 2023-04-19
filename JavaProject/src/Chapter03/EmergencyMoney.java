package Chapter03;

import java.util.Scanner;

public class EmergencyMoney {

	public static void main(String[] args) {
		
//		int usd = 1200;
//		int family;
//		int money=0;
//		int res; 
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("가구수를 입력하시오>>");
//		family = scanner.nextInt();
//		
//		if (family==1) {
//			money = 400000;
//		} else if (family==2) {
//			money = 600000;
//		} else if (family==3) {
//			money = 800000;
//		} else if (family>=4) {
//			money = 1000000;
//		}
//		money /= usd; //money=money/usd(1200)
//		res = money/100;
//		System.out.println("100달러짜리 "+res+"매");
//		
//		res = (money%100)/10;
//		System.out.println("10달러짜리 "+res+"매");
		
		//강사님 답
//		상수로 100달라 원화 계산
		final int hundred = 120000;
		final int ten = 12000;
		int res, money, num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("가구수를 입력하시오>>");
		num = scanner.nextInt();
		
		if (num == 1) {
			money = 400000;
		} else if (num == 2) {
			money = 600000;
		} else if (num == 3) {
			money = 800000;
		} else {
			money = 1000000;
		}
		res = money/hundred;
		if (res > 0) {
			System.out.println("100달러짜리 "+res+"매");
		}
		money = money%hundred;
		res = money/ten;
		if (res > 0) {
			System.out.println("10달러짜리 "+res+"매");
		}
		scanner.close();
	}
}
