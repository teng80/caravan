package 문제연습풀이_2;

import java.util.Scanner;

public class ExSumMultiply {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("3자리수 정수 입력(100~999)>>");
		int n = scanner.nextInt();
		
//		100자리 수: 나누기 100의 몫
//		10자리 수: 나누기 100의 나머지를 10으로 나눈 몫 ((n%100)/10)
//		1자리 수: 나누기 100의 나머지를 10으로 나눈 나머지
		int hundred = n/100;
		int ten = (n%100)/10;
		int one = (n%100)%10;
		System.out.println("100의 자리와 10의 자리의 합은 "+(hundred+ten));
		System.out.println("10의 자리와 1의 자리의 곱은 "+(ten*one));

	}

}
