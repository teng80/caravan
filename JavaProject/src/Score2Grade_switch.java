import java.util.Scanner;

public class Score2Grade_switch {
	public static void main(String[] args) {
		
		char grade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적을 입력하시오: ");
		int score = sc.nextInt();
		int number = score / 10;	//정수 10으로 나누어서 소수점 이하를 없앤다 
		switch(number) {
			case 10:
			case 9:		grade = 'A';	break;
			case 8:		grade = 'B';	break;
			case 7:		grade = 'C';	break;
			case 6:		grade = 'D';	break;				
			default:	grade = 'F';	break;
		}
		System.out.println("학점: " + grade);
		
	}
}
