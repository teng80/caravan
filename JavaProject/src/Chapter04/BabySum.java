package Chapter04;

public class BabySum {

	public static void main(String[] args) {
//		int baby[][] = new int[120][5];
//		int sum = 0;	
//
//		//행 기준(1~120개월), baby.length:120
//		for (int month = 0; month < baby.length; month++) {
//			//열 기준(5개의 나라), baby[month].length:5
//			for (int nation = 0; nation < baby[month].length; nation++) {
//				
//				baby[month][nation] = (month+1)*100+nation+1;
//				
//				sum += baby[month][nation];
//			}
//		}
//		System.out.println("10년간 5개 나라의 총 신생아수는 "+sum);
		//빙고
		
		//강사님 답
		int baby[][] = new int[120][5];
		int sum = 0;	
		//baby.length:120(month 120 반복)
		for (int month = 0; month < baby.length; month++) {
			//baby[month].length:5(country 5 반복)
			for (int country = 0; country < baby[month].length; country++) {
				//101~105, 201~205.....12001~12005
				//(0+1)*100+0+1=101, (0+1)*100+0+2=102...105
				//(1+1)*100+0+1=201, (1+1)*100+0+2=202...205
				baby[month][country] = (month+1)*100+country+1;
				sum += baby[month][country];
			}
		}
		System.out.println("10년간 5개 나라의 총 신생아수는 "+sum);
	}
}
