package 문제연습풀이;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		
		if (n3==0) {
			double triangle = (n1*n2)/2;
			System.out.println("삼각형의 넓이는 "+triangle);
		} else {
			double trapezoid = (n1+n2)*n3/2;
			System.out.println("사각형의 넓이는 "+trapezoid);
			
		}
	}
}
