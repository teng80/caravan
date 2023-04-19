import java.util.Scanner;

public class TengExample09 {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("오렌지의 개수를 입력하시오:");
		int i=sc.nextInt();
		int result1=i/10;
		int result2=i%10;
		
		System.out.println(result1 +"박스가 필요하고 "+result2+"개가 남습니다");
	}
}
