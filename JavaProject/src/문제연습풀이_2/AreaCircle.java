package 문제연습풀이_2;

import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("반지름을 입력하세요>>");
		int radius = scanner.nextInt();
		double area = radius * radius * 3.14;
		System.out.println("원의 면적은 "+area+"입니다.");
	}

}
