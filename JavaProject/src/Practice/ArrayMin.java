package Practice;

import java.util.Scanner;

public class ArrayMin {

	public static void main(String[] args) {
		int n[]=new int[7];
		int min=Integer.MAX_VALUE;
		Scanner scanner = new Scanner(System.in);
		System.out.println("양수 7개를 입력하세요.");
		
		for (int i = 0; i < n.length; i++) {
			n[i] = scanner.nextInt();
			
			if (n[i]<min) {
				min = n[i];
				
			}
		}
		System.out.println("가장 작은 수는"+min+"입니다");
		

	}

}
