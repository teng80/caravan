package Chapter03;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
//		int won=0;
//		int res=0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("금액을 입력하시오>>");
//		won = scanner.nextInt();
//		
//		res = won/50000;
//		if (res > 0) {
//			System.out.println("오만원권 "+res+"매");
//		}
//		won = won%50000;
//		res = won/10000;
//		if (res > 0) {
//			System.out.println("만원권 "+res+"매");
//		}
//		won = won%10000;
//		res = won/1000;
//		if (res > 0) {
//			System.out.println("천원권 "+res+"매");
//		}
//		won = won%1000;
//		res = won/100;
//		if (res > 0) {
//			System.out.println("백원 "+res+"개");
//		}
//		won = won%100;
//		res = won/50;
//		if (res > 0) {
//			System.out.println("오십원 "+res+"개");
//		}
//		won = won%50;
//		res = won/10;
//		if (res > 0) {
//			System.out.println("십원 "+res+"개");
//		}
//		won = won%10;
//		res = won/1;
//		if (res > 0) {
//			System.out.println("일원 "+res+"개");
//		}
		
		//강사님 답
		final int 오만원 = 50000;
		final int 만원 = 10000;
		final int 천원 = 1000;
		final int 오백원 = 500;
		final int 백원 = 100;
		final int 오십원 = 50;
		final int 십원 = 10;
		final int 일원 = 1;
		int res, money;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		money = scanner.nextInt();
		
		res = money/오만원;
		if (res > 0) {
			System.out.println("오만원권 "+res+"매");
		}
		money = money%오만원;
		res = money/만원;
		if (res > 0) {
			System.out.println("만원권 "+res+"매");
		}
		money = money%만원;
		res = money/천원;
		if (res > 0) {
			System.out.println("천원권 "+res+"매");
		}
		money = money%천원;
		res = money/백원;
		if (res > 0) {
			System.out.println("백원 "+res+"개");
		}
		money = money%백원;
		res = money/오십원;
		if (res > 0) {
			System.out.println("오십원 "+res+"개");
		}
		money = money%오십원;
		res = money/십원;
		if (res > 0) {
			System.out.println("십원 "+res+"개");
		}
		money = money%십원;
		res = money/일원;
		if (res > 0) {
			System.out.println("일원 "+res+"개");
		}
		scanner.close();
	}

}



