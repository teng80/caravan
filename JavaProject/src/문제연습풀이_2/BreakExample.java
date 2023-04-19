package 문제연습풀이_2;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		String str = "exit";
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다");
		
		while (true) {
			System.out.print(">>");
			String text = scanner.next();
			if (str.equals(text)) {
				break;
			} 
		}
		System.out.println("종료합니다...");
	}

}
