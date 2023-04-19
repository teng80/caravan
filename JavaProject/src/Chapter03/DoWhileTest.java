package Chapter03;

public class DoWhileTest {

	public static void main(String[] args) {
		
//		int i=0, sum=0;
//		do {
//			sum+=i;  //sum=sum+i;
//			i+=2;	//i=i+2;
//		} while (i<100);
//		System.out.println(sum);
		
//		강사님 답
		int i=0, sum=0;
		do {
//			99까지 반복 => 99보다 크면 break
			if (i>99) {
				break;
			}
			sum += i;
			i += 2;
		} while (true);
		System.out.println(sum);
	}
}
