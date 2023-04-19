package 문제연습풀이_2;

public class DoWhileTest {
	public static void main(String[] args) {
		
		int i=0, sum=0;
		do {
			sum+=i;
			i+=2;
		} while (i<100);
		System.out.println(sum);
	}
}



