
public class TengExample17 {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			System.out.println(i+"층에 도착");
			
			for(int j=1; j<=5; j++) {
				System.out.println(i+"층의 "+j+"호실에 도착");		
				}
			
			System.out.println("다음층으로");
			if(i == 3) {
				System.out.println("옥상도착");
			}
		}

	}

}
