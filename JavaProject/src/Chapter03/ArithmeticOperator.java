package Chapter03;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("초를 입력하세요: ");
		int time=scanner.nextInt();
		
//		ex> 5000 = 5000/3600 = 1
		int hour=time/3600;	//시간		
		int min=(time/60)%60;	//분
		int sec=time%60;	//초		
		System.out.print(time+"초는 ");
		System.out.print(hour+"시간, ");
		System.out.print(min+"분, ");
		System.out.print(sec+"초입니다.");
		scanner.close();
	} 
}
