package Chapter02;

import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("반지름을 입력하세요>>");
		int radius = scanner.nextInt();
//		double pi = 3.14;
//		double circleArea = pi*radius*radius;
//		System.out.println("원의 면적은 "+circleArea+"입니다.");
//		scanner.close();
		System.out.println("원의 면적은 " + (3.14*radius*radius) + "입니다.");
	}

}
