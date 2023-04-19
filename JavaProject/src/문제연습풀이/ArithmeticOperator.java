package 문제연습풀이;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		int time = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		time = scanner.nextInt();
		
//		ex> 5000 = 5000/3600 = 1
		int hour = (time/60)/60;
		int minute = (time/60)%60;
		int sec = time%60;
		
		System.out.print(time+"초는 ");
		System.out.print(hour+"시간, ");
		System.out.print(minute+"분, ");
		System.out.print(sec+"초입니다.");
	}

}
