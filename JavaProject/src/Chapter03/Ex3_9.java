package Chapter03;

/*
 * 구구단을 배열로 생성
 * 값을 넣어본다 ex>2*7=14, 9*4=36
 * */
public class Ex3_9 {

	public static void main(String[] args) {
//		2차원 배열 선언(1차원은 열로 구성, 1차원이 2개이상 가지고 행으로 구성)
//		1*1=1 ~ 9*9=8
//		int[][] gugudan;
		//		2차원 배열 선언, 생성(9행 9열)
//		int[][] gugudan = new int[9][9]; //인덱스0~8까지
		int[][] gugudan = new int[10][10]; //인덱스0~9까지
		
//		gugudan.length : 9행
//		1~9까지(<10)
//		for (int i = 1; i < gugudan.length+1; i++) {
		for (int i = 1; i <= 9; i++) { //행 기준
			for (int j = 1; j <= 9; j++) {	//열 기준
//				행렬에 1*1 ~ 9*9까지 값을 2차원 배열원소로 저장
//				gugudan[i-1][j-1] = i*j; //i:행/ j:열(gugudan[i][j])
//				0~8까지를 1~9까지로 저장
				gugudan[i][j] = i*j; //i:행/ j:열(gugudan[i][j])
			}
		}
//		반복이 끝나면 1*1 ~ 9*9까지 값들이 저장됨
//		 ex>2*7=14, 9*4=36
//		System.out.println("2 x 7 = "+gugudan[2][7]); //3*8=24
		System.out.println("2 x 7 = "+gugudan[2][7]);
		System.out.println("2 x 7 = "+gugudan[9][4]);
	}

}
