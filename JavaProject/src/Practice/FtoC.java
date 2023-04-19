package Practice;

import java.util.Scanner;

public class FtoC {
	public static void main(String[] args) {
		
		System.out.println("=====================");
		System.out.println("1. 화씨 → 섭씨");
		System.out.println("2. 섭씨 → 화씨");
		System.out.println("=====================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("번호를 선택하세요 : ");
		int num = sc.nextInt();
		
	/*	
		if (num == 1) {
			System.out.println("화씨온도를 입력하시오: ");
			double f = sc.nextDouble();
			double c_temp =(5.0/9.0)*(f-32);
			System.out.println("섭씨온도는 : "+c_temp);
		} else if(num ==2){			
			System.out.println("섭씨온도를 입력하시오: ");
			double c = sc.nextDouble();
			double f_temp =  c*1.8+32;
			System.out.println("화씨온도는 :" +f_temp);
		}else {
			System.out.println("잘 못 입력 하셨습니다");
		}
	*/
		

	}
}
