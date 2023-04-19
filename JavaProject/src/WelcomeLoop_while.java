
public class WelcomeLoop_while {

	public static void main(String[] args) {
		
		int i = 0;
		while(i < 3) {
			System.out.println("환영합니다!");
			i++;
		}
		System.out.println("반복이 종료되었습니다.");
		
		System.out.println("=======================");
		
		char a = 'A';
		while(a<='Z') {
			System.out.print(a++);
		}
		System.out.println();
		
		System.out.println("=======================");
		
		int num = 1;
		int sum = 0;
		
		while(num<=10) {
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합:" + sum);			
		
		System.out.println("=======================");
		
		int b = 0;
		while(true) {
			if(b == 10) {
				break;
			}
			b++;
			System.out.println(b);
		}
		System.out.println("=======================");
	}

}
