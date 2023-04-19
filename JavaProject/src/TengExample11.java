import java.util.Scanner;

public class TengExample11 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("x:");
		int x=sc.nextInt();
		System.out.print("y:");
		int y=sc.nextInt();
	
		int result1=x+y;
		System.out.println("두 수의 합: "+result1);
		int result2=x-y;
		System.out.println("두 수의 차: "+result2);
		int result3=x*y;
		System.out.println("두 수의 곱: "+result3);
		double result4=(x+y)/2;
		System.out.println("두 수의 평균: "+result4);
		int result5=(x>y)?x:y;		//최대값 계산
		System.out.println("큰수: "+result5);
		int result6=(x<y)?x:y;		//최소값 계산
		System.out.println("작은수: "+result6);
	}
}
