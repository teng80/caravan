package Practice;

import java.util.Scanner;

public class ArrayAverager {
	public static void main(String[] args) {
//		학생3, 각 학생당 5번 테스트 점수 , 2차원 배열, 학생별 평균 점수 계산하기, 각 테스트의 평균 점수계산하기
//		Scanner sc = new Scanner(System.in); // 스캐너로 점수 입력해서 평균 구하는 것도 해보기
//		int scores = sc.nextInt();

		int scores;
		scores = (int)(Math.random()*100)+1;
		int total1 =0, total2 =0, total3 =0, total4=0, total5=0; //점수 총 합을 받아줄 변수 total 초기화
		int stuTotal1 = 0, stuTotal2 =0, stuTotal3 = 0;// 학생별 점수 총 합을 받아줄 변수 stuTotal 초기화
		
		int[][] stu = new int[3][5]; //배열의 크기 정의
//		int[][] stu = {{scores},{scores}}; 1번시도
			
//		int [][] stu = null; 2번 시도// >> Array contents can only be used in initializer 오류
//		stu= new int [][] {{scores},{scores}};
		
			for (int i = 0; i < stu[3].length; i++) {
			total1 += stu[i][0];
			total2 += stu[i][1];
			total3 += stu[i][2];
			total4 += stu[i][3];
			total5 += stu[i][4];
			double stuAvg1 = stuTotal1/i;
			double stuAvg2 = stuTotal2/i;
			double stuAvg3 = stuTotal3/i;
			
				for (int j = 0; j < stu[5].length; j++) { 
					scores = (int)(Math.random()*100)+1;
					stu[i][j] = scores;
					stuTotal1 += stu[0][j];
					stuTotal2 += stu[1][j];
					stuTotal3 += stu[2][j];
					double avg1 = total1/j; 
					double avg2 = total2/j; 
					double avg3 = total3/j; 
					double avg4 = total4/j; 
					double avg5 = total5/j; 
					
					System.out.println(avg1);
			}
				System.out.println(stuAvg1);
		}
		
	}
}
