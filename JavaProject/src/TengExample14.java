import java.util.Scanner;

public class TengExample14 {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("물체의 무게를 입력하시오(킬로그램):");
		int whight=sc.nextInt();
		System.out.print("물체의 속도를 입력하시오(미터/초):");
		int speed=sc.nextInt();
		
		double result=0.5*whight*speed*speed;
		System.out.println("물체는 "+result+"(줄)의 에너지를 가지고 있다");
		
	
	}
	
}
