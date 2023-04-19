package Practice;

public class RandomNumber2 {

	public static void main(String[] args) {
		
		while (true) {
			int rNumber = (int)((Math.random()*10)+1);
			System.out.println(rNumber);
			
			if (rNumber==7) {
				break;
			}
		}
}
}