import java.util.Scanner;

public class Averager_while {

	public static void main(String[] args) {
		
		int total = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("점수를 입력하시오: ");
			int grade = sc.nextInt();
			if(grade < 0)	break;	//음수를 입력하면 종료
			total += grade;
			count++;
		}
		System.out.println("평균은 " + total / count);
	}

}
