import java.util.Scanner;

public class GetSum_while {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0, value = 0;
		
		while(value != -1) {	//value가 -1이 아니면 덧셈을 반복한다
			sum = sum + value;
			System.out.print("정수를 입력하시오: ");
			value = sc.nextInt();
		}
		System.out.println("정수의 합은 " + sum + "입니다.");
	}

}
