import java.util.Scanner;

public class TengExample19 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하시오:");
//		int score = sc.nextInt();
		
//		 if(score>=80) {
//		      if(score>=90) {
//		           System.out.println("90점 이상입니다.");
//		           System.out.println("축하합니다. ");
//		        }
//		         else {System.out.println("80점 이상입니다.");  
//		           System.out.println("통과하였습니다.");
//		         }
//		     }
//		     else System.out.println("80점 미만 재 도전하세요");
		
		
		
		
		
		System.out.print("나이를 입력하시오:");
		int age = sc.nextInt();
		
//		if(조건식1) { 
//			  실행문1;     // 조건식1이 true일 경우 실행
//			} 
//			else if(조건식2) {   
//			  실행문2;    // 조건식 1이 false이고 조건식2가 true일 경우 실행
//			} else{       
//			  실행문3;    // 조건식 1과 2가 true일 경우 실행
//			}
				
		if(age>=20) {
			System.out.println("성인입니다.");
		} else if(age>=17) {
			System.out.println("고등학교를 다닙니다.");
		} else if(age>=14) {
			System.out.println("중학교를 다닙니다.");
		} else if(age>=8) {
			System.out.println("초등학교를 다닙니다.");
		
		} else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		
		
		}
}


