package area;

public class Season {
	
	private int month;
		
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String process() {
		String result = "";
		
		if (month == 12 || month == 1 || month == 2) { 
			result = "겨울";
		} else if(month >= 9 && month <= 11) {
			result = "가을";
		} else if(month >= 6 && month <= 8) {
			result = "여름";
		} else if(month >= 3 && month <= 5) {
			result = "봄";
		} else { 
			System.out.println("잘못입력");
		}
		return result;
	}
}
