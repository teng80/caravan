package 문제연습풀이_2;

import java.util.Scanner;

public class DivAndRemains {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("2자리수 정수 입력(10~99)>>");
		int num = scanner.nextInt();
		
		int ten = num/10;
		int one = num%10;
		if (ten == one) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		} else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
			
		}

	}

}
