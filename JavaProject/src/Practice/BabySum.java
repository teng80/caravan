package Practice;

public class BabySum {

	public static void main(String[] args) {
		
		int baby[][] = new int [120][5];
		int sum = 0;
		
		for (int i = 0; i < baby.length; i++) {
			
			for (int j = 0; j < baby[i].length; j++) {
				baby[i][j] = (i+1)*100+j+1;
				sum += baby[i][j];
			}
		}
		System.out.println("10년간 5개의 나라의 총 신생아 수는 "+sum);

	}

}
