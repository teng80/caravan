import java.util.Scanner;

public class TengExample15 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반복횟수를 입력: ");
		int num = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i<num; i++) {
			System.out.print('#');
		}
		
	}
}
