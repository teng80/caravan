package Chapter02;

import java.util.Scanner;

public class Won2Dollar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("원화를 입력하세요(단위 원)>>");
//		double w = sc.nextDouble();
//		double result = w/1100; 
//		System.out.println(w+"원은 $"+result+"입니다.");
		
		//환율 고정할때 상수 사용(관습적으로 대문자)
		final double RATE=1100.0;
		System.out.print("원화를 입력하세요(단위 원)>>");
		int won = sc.nextInt();
		//double, int 계산결과를 double 로 받음
		double dollar = won/RATE;
		System.out.println(won+"원은 $"+dollar+"입니다.");
		sc.close();

	}


}
