package 문제연습풀이_2;

import java.util.Scanner;

public class ExMaxMin {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int min = 0;
		int max = 0;
		
		if (a>b&&a>c) {
			max=a;
		} else if (b>a&&b>c) {
			max=b;
		} else {
			max=c;
		}
		if (a<b&&a<c) {
			min=a;
		} else if (b<a&&b<c) {
			min=b;
		} else {
			min=c;
		}
		System.out.println("최대값은 "+max);
		System.out.println("최소값은 "+min);
	}

}
