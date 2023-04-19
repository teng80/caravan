package Practice;

import java.util.Scanner;

public class MutipleOfThree {

	public static void main(String[] args) {
		
		int n[] = new int[10];
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("양의 정수 10개를 입력하시오>>");
		
		for (int i = 0; i < n.length; i++) {
			n[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < n.length; i++) {
			if (n[i]%3==0) {
			
				System.out.print(n[i]);
			}
		}

	}

}
