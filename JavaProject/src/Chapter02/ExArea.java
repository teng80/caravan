package Chapter02;

import java.util.Scanner;

public class ExArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 를 입력하시오>>");

		int l1=scanner.nextInt();
		int l2=scanner.nextInt();
		int l3=scanner.nextInt();
		
//		마지막 숫자가 0이면 삼각형의 넓이	
		if (l3 == 0) {
			float triangle = (l1*l2)/2;
			System.out.println("삼각형의 넓이는 "+triangle);
			
//		마지막 숫자가 0이 아니면 사다리꼴의 넓이	
		} else {
			float trapezium = (l1+l2)*l3/2;
			System.out.println("사다리꼴의 넓이는 "+trapezium);
		}
		scanner.close();

	}

}
