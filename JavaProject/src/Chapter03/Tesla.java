package Chapter03;

import java.util.Scanner;

public class Tesla {

	public static void main(String[] args) {
		
//		int rate = 0;
//		int t = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("매수 수량을 입력하시오>>");
//		t = scanner.nextInt();
//		int n = t * 520;
//				
//		int result1 = n/100;
//		System.out.println("100달러짜리 "+result1+"매");
//		int result2 = (n%100)/10; 
//		System.out.println("10달러짜리 "+result2+"매");

		//강사님 답
		int tesla = 520;
		int num; //수량
		int money; //tesla * num
		int res; //계산된 결과값
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("매수 수량을 입력하시오>>");
		num = scanner.nextInt();
		money = tesla * num;
		
//		money를 가지고 100달러, 10달러 계산
		res = money/100;
		
//		100달러 짜리가 1매 이상일때
		if (res > 0) {
			System.out.println("100달러짜리 "+res+"매");
		}
//		10달러 짜리가 계산
		money = money%100;	//나머지 돈을 다시 셋팅
		res = money/10;
		if (res > 0) {
			System.out.println("10달러짜리 "+res+"매");
		}
		scanner.close();
	}
}

