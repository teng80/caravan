package Chapter03;

/*
 * 4년 전체 평점(평균학점)의 평균 구하기
 * 2차원 배열 이용해서 원소로 초기화
 * 1행 1열부터 4행 2열까지
 * length 필드 이용(행/열의 크기)
 * */
public class Ex3_10 {	
	public static void main(String[] args) {
		double sum = 0;
		double score[][] = {{3.3, 3.4}	//만점 기준은 4.5(1행1열, 2열), 1학년 1학기/2학기
						   ,{3.5, 3.6}	//2행1열, 2열, 2학년 1학기/2학기
						   ,{3.7, 4.0}	//3행1열, 2열, 3학년 1학기/2학기
						   ,{4.1, 4.2}	//4행1열, 2열, 4학년 1학기/2학기
		};	//2차원 배열(4행 2열)
		
		for (int i = 0; i < score.length; i++) { //score.length : 4(행의 크기)
//			score[0].length ~ 	score[3].length
			for (int j = 0; j < score[i].length; j++) {	//score[i].length : 2(열의 크기)
//				3.3~4.2점수를 합계에 누적
				sum += score[i][j]; //배열 인덱스(0,0~3,1)까지의 배열 원소를 sum에 누적
			}
		}
//		반복이 끝나면 4년 전체(8학기)의 총평점의 합계가 누적됨
//		sum/8=평균 해도되지만 length 필드를 사용
		int n = score.length;	//4(행의 크기)
		int m = score[0].length;	//2(열 크기)
		
		System.out.println("4년 전체 평점 평균은 "+sum/(n*m));
	}
}
