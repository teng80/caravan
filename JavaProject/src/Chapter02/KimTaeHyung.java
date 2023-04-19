package Chapter02;

import java.util.Scanner;

public class KimTaeHyung {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("원뿔 밑의 원의 반지름을 입력하세요: ");
//		int radius = scanner.nextInt();
//		
//		System.out.print("원뿔의 높이를 입력하세요: ");
//		int height = scanner.nextInt();
//		
//		double volume = radius * radius * Math.PI * height / 3;
//		
//		System.out.println("원뿔의 밑의 원의 반지름: " + radius);
//		System.out.println("원뿔의 높이: " + height);
//		System.out.println("원뿔의 부피: " + volume);
//		
//		scanner.close();
		//강사님 답
		double radius;
		double height;
		double volume;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원뿔 밑의 원의 반지름을 입력하세요: ");
		radius = scanner.nextInt();
		
		System.out.print("원뿔의 높이를 입력하세요: ");
		height = scanner.nextInt();
		
		volume = 1.0/3.0*Math.PI*radius*radius*height;
		
		System.out.println("원뿔의 밑의 원의 반지름: " + radius);
		System.out.println("원뿔의 높이: " + height);
		System.out.println("원뿔의 부피: " + volume);
	}

}




