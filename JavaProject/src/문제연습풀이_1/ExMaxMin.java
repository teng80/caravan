package 문제연습풀이_1;

import java.util.Scanner;

public class ExMaxMin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int max = 0;
		int min = 0;
		
//		최대값
		if (a>b&&a>c) {
			max=a;
		} else if (b>a&&b>c) {
			max=b;
		} else {
			max=c;
		}
//		최소값
		if (a<b&&a<c) {
			min=a;
		} else if (b<a&&b<c) {
			min=b;
		} else {
			min=c;
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
	}

}
