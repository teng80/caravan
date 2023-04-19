package 문제연습풀이_2;

import java.util.Scanner;

public class ExRectangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("가로, 세로 길이를 입력하세요>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int sum = a * b;
		System.out.println("사각형의 면적은 "+sum+"입니다.");
		

	}

}
