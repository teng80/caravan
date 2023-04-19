import java.util.Scanner;

public class TengExample13 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("받은 돈:");
		int x=sc.nextInt();
		System.out.print("상품 가격:");
		int y=sc.nextInt();
			
//		int result1=y/10;
//		System.out.println("부가세: "+result1);
//		int result2=x-y;
//		System.out.println("잔돈: "+result2);
		
		System.out.println("부가세: "+ y / 10);  //바로 계산해도 됨
		System.out.println("잔돈: "+ (x - y));
	}
}
