package Chapter05;

import java.util.Iterator;
import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
//		
//		// 거스름 돈 단위 
//		int[] unit = {50000, 10000, 1000, 100, 10, 1};
//		int[] exchangeMoney = new int[unit.length];
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("금액을 입력하시오>>");
//		int input = scanner.nextInt();
//		
//		for (int i = 0; i < unit.length; i++) {
//			
//			exchangeMoney[i] = input/unit[i];
//			input -= unit[i]*exchangeMoney[i];
//			System.out.println(unit[i] + "원 짜리 : " + exchangeMoney[i] + "개" );
//		}
		
//		강사님 답
		int[] unit = {50000, 10000, 1000, 500,  100, 50, 10, 1};
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
//			65123/50000=몫은 1 and 나머지는 15123
//			15123/10000=몫은 1 and 나머지는 5123
//			5123/1000=몫은 5 and 나머지는 123
//			123/500=몫은 0 and 나머지는 123(건너띔:0이니깐)
//			123/100=몫은 1 and 나머지는 23
//			23/50=몫은 0 and 나머지는 23(건너띔:0이니깐)
//			23/10=몫은 2 and 나머지는 3
//			3/1=몫은 3 and 나머지는 0
			int res = money/unit[i];
			if (res>0) {
				System.out.println(unit[i]+"원 짜리 : "+res+"개");
//				15123=>5123=>123=>23=>3=>0
				money = money%unit[i];
			}
		}
	}
}
