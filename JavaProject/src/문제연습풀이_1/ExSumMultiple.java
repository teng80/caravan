package 문제연습풀이_1;

import java.util.Scanner;

public class ExSumMultiple {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("3자리수 정수 입력(100~999)>>");
		int n = scanner.nextInt();
				
		int hudred = n/100;
		int hudredRest = n%100;
		int ten = hudredRest/10;
		int one = hudredRest%10;
		
//		int sum1 = hudred+ten;
//		int sum2 = ten*one;
		
		System.out.println("100의 자리와 10의 자리의 합은 "+(hudred+ten));
		System.out.println("10의 자리와 1의 자리의 곱은 "+(ten*one));
	}
}
