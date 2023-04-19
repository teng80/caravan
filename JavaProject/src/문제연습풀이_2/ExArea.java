package 문제연습풀이_2;

import java.util.Scanner;

public class ExArea {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		
		if (c==0) {
			System.out.println("삼각형의 넓이는 "+(a*b)/2);
		} else {
			System.out.println("사다리꼴의 넓이는 "+(a+b)*c/2);
			
		}
		

	}

}
