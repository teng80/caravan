package Practice;

import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		
		int n[] = new int[10];
		int min = Integer.MAX_VALUE;
		int max = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("양수 10개를 입력하세요.");
		
		for (int i = 0; i < n.length; i++) {
			n[i] = scanner.nextInt();
			
			if (n[i]>max) {
				max = n[i];
			}
			if (n[i]<min) {
				min = n[i];
			}
		}
		System.out.println("가장 작은 수는 "+min+"이고, 가장 큰수는"+max+"이고, 최소값+최대값은 "+(min+max)+"입니다.");
	}

}
