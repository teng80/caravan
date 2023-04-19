package Practice;

import java.util.Scanner;

public class Won2DollorNotMethod {
	public static void main(String[] args) {
		final double RATE = 1100.0; // 환율 고정할 때 상수 사용, 상수는 대문자
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원) >>");
		int won = sc.nextInt();
		double doller = won/RATE;//double, int 계산 결과를 double 로 받음
		System.out.println(won+"원은 $"+doller+"입니다.");
		sc.close();
		
		
	}}
	


