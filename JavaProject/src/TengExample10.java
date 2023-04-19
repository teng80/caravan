import java.util.Scanner;

public class TengExample10 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("마일을 입력하시오:");
		double i=sc.nextDouble();
		double result=i*1.609;
		
		
		System.out.println(i +"마일은 "+result+"킬로미터입니다");
	}
	
}
