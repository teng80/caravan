package Practice;

import java.util.Scanner;

public class Won2Dollor {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원) >>");
		int won = sc.nextInt();
		float a = exchanger(won);
		System.out.print(won+"원은 $"+a +"입니다.");
		
		
	}
		public static float exchanger(float num) {
			return num = num/1100;
	}
		
	}
	


