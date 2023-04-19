import java.util.Scanner;

public class EvenOdd_if {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		int number = sc.nextInt();
		
		if(number % 2 == 0) {	//number를 2로 나누어서 0이면 짝수
			System.out.println("입력된 정수는 짝수입니다.");
		} else {
			System.out.println("입력된 정수는 홀수입니다.");
			
		}
		
		

	}

}
