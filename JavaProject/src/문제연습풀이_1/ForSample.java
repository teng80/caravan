package 문제연습풀이_1;

public class ForSample {

	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			sum=sum+i;
			if (i<10) {
				System.out.print("+");
			} else {
				System.out.print("="+sum);
				
			}
		}

	}

}
