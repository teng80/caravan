package 문제연습풀이_1;

import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("가로, 세로 길이를 입력하세요>>");
		int x, y=0;
		x = scanner.nextInt();
		y = scanner.nextInt();
		System.out.println("사각형의 면적은 "+(x*y)+"입니다.");
			
	}
}
