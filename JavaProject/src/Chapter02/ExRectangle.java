package Chapter02;

import java.util.Scanner;

public class ExRectangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가로, 세로 길이를 입력하세요>>");
		int h = scanner.nextInt();
		int w = scanner.nextInt();
			
//		int area = h*w; 
//		System.out.println("사각형의 면적은 "+area+"입니다.");
//		scanner.close();
		System.out.println("사각형의 면적은 "+(h*w)+"입니다.");
	}

}
