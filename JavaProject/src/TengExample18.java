import java.util.Scanner;

public class TengExample18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오:");
		int a = sc.nextInt();
				
		switch(a/10) {
		case 10 :
			System.out.println("A급");
			break;
		case 9 :
			System.out.println("B급");
			break;
		case 8 :
			System.out.println("C급");
			break;
		case 7 :
			System.out.println("D급");
			break;
		case 6 :
			System.out.println("E급");
			break;
		default :
			System.out.println("F급");
			break;
		}
		

	}

}
