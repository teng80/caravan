package Practice;

import java.util.Scanner;

public class Averager {
	public static void main(String[] args) {
		//i의 평균을 구하기 위하여 i의 값을 다 담아줄 변수 total, 
		//i의 평균을 구하기 위해 i가 입력된 횟수 (= 즉 while 문이 반복한 횟수) 만큼을 카운트 해줄 변수 count
		int total =0, count =0; 
		Scanner sc = new Scanner(System.in);
		while(true) {
//			if 조건을 만족 시키기 전까지 반복 시켜줄 부분 
			System.out.println("점수를 입력하시오: ");
			int i = sc.nextInt();
			if (i <0) break; 
			total += i;
			count++; 
			// if break전까지 while이 반복된 횟수
			}// while 루프 안에 if 문이 들어가야 (중괄호 하나 안에 묶어 주어야 ) 의도대로 돌아감.
		System.out.println("평균은 :"+total/count);
		}
	}

