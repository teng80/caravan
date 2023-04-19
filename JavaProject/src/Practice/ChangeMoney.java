package Practice;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		
		int won=0;
		int res=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		won = scanner.nextInt();
		
		res = won/50000;
		if (res > 0) {
			System.out.println("오만원권 "+res+"매");
		}
		won = won%50000;
		res = won/10000;
		if (res > 0) {
			System.out.println("만원권 "+res+"매");
		}
		won = won%10000;
		res = won/1000;
		if (res > 0) {
			System.out.println("천원권 "+res+"매");
		}
		won = won%1000;
		res = won/100;
		if (res > 0) {
			System.out.println("백원 "+res+"개");
		}
		won = won%100;
		res = won/50;
		if (res > 0) {
			System.out.println("오십원 "+res+"개");
		}
		won = won%50;
		res = won/10;
		if (res > 0) {
			System.out.println("십원"+res+"개");
		}
		won = won%10;
		res = won/1;
		if (res > 0) {
			System.out.println("일원 "+res+"매");
		}
	}

}
