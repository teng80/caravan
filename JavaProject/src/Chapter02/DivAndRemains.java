package Chapter02;

import java.util.Scanner;

public class DivAndRemains {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");

		int n=scanner.nextInt();
		
//		10의 자리 : 나누기 10을 해서 몫
		int ten = n/10;
//		1의 자리 : 나누기 10을 해서 나머지
		int one = n%10;
		
		if (ten == one) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
			
		} else {
			System.out.println("Yes! 10의 자리와 1의 자리가 다릅니다.");
		}
		scanner.close();
		
//		if ((a == 11)||(a == 22)||(a == 33)||(a == 44)||(a == 55)||
//				(a == 66)||(a == 77)||(a == 88)||(a == 99)){
//			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
//		} else {
//			System.out.println("Yes! 10의 자리와 1의 자리가 다릅니다.");
//		}
	
		

	}

}
