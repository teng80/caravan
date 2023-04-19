package question;

public class Won2dollar {
	
	private int won;
		
	public String process() {
		String result="";
		double RATE=1200.0;
		double dollor = (double)won/RATE;
		result = Double.toString(dollor);
		return result;
	}
	
	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}
	
}
