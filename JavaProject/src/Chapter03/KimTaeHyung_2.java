package Chapter03;

public class KimTaeHyung_2 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 99; i++) { 
			int count=0;
			int ten = i/10;
			int one = i%10;
			
			if (ten%3==0 && ten!=0) {
				 count++;
			}
			if (one%3==0 && one%10!=0) {
				 count++;	
			}
			if (count == 1) {
				System.out.println(i+" 박수한번");			
			} else if (count == 2) {
				System.out.println(i+" 박수두번");
		 	}
		}
	}
}
