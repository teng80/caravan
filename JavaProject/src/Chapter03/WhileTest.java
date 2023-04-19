package Chapter03;

public class WhileTest {
	public static void main(String[] args) {
//		
//		//변수 초기화
//		int i=0, sum=0;
//		
//		// 반복문 100번 (0~ 99)
//		while(i<100) {
//			if(i%2==0) sum+=i; // i가 2로 나눴을때 0이라면 (짝수라면)
//			i++;			   // 짝수일때 실행될 내용
//		
//		// 짝수 아닐땐 아무것도 실행하지않음.
//		// ...
//		}
//		// 반복문 탈출시
//		System.out.println(sum);
		
//		강사님 답
		int i=0, sum=0;
		while(i<100) {
//			sum=sum+i;
			sum+=i;
//			i=i+2;
			i+=2;
		}
		System.out.println(sum);
	}
}