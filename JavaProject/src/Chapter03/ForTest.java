package Chapter03;

public class ForTest {

	public static void main(String[] args) {

		int sum=0;
//		0~99까지 짝수만 (i+=2)
		for (int i = 0; i < 100; i+=2) {
			sum += i;
		}
		System.out.println(sum);
	}
}
