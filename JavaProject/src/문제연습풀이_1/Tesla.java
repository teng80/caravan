package 문제연습풀이_1;

import java.util.Scanner;

public class Tesla {

	public static void main(String[] args) {
		int tesla = 520;
		int num; //수량
		int money; //tesla * num
		int res; //계산된 결과값
		Scanner scanner = new Scanner(System.in);
		System.out.print("매수 수량을 입력하시오>>");
		num = scanner.nextInt();
		money = tesla * num;

		res = money / 100;
		if (res > 0) {
			System.out.println("100달러짜리 "+res+"매");
		}
		
		res = (money % 100)/10;
		if (res > 0) {
			System.out.println("10달러짜리 "+res+"매");
		}
		
	}

}
