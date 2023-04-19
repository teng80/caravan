package 문제연습풀이;

import java.util.Scanner;

public class ThreeSixNine {

	public static void main(String[] args) {
//		count : 3,6,9갯수
//		num : 입력받은 정수
//		a : 10의 자리
//		b : 1의 자리
		int count=0, num, a, b;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("10~99 사이의 정수를 입력하시오>> ");
		num = scanner.nextInt();
		a = num/10;
		b = num%10;
		
		if (a%3==0) {
			count++;
		} 
		if (a%3==0 && b!=0) {
			count++;
		} 
		if (count==2) {
			System.out.println("박수짝짝");
		} else if (count==1) {
			System.out.println("박수짝");
		} else
			System.out.println("박수없음");
		
	}

}
