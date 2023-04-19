
public class Lotto_for_for_if {

	public static void main(String[] args) {
		int lotto[] = new int[6];	//기본값0으로 채워진 6크기의 배열생성
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 6; j++) {
				lotto[j] =  (int)(Math.random()*45)+1;	//1~45사이의 정수가 발생
				for(int k = 0; k < j; k++) {
					if(lotto[k] == lotto[j]) {
						j--;
						break;
					}
				}
			}
		for(int j = 0; j < 6; j++) {
			System.out.print(lotto[j] + ",");
		}
		System.out.println();
		}
	}
}
