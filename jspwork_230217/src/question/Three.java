package question;

public class Three {
	
	private int num;
	
	public String process() {
		String result="";
		if (num%3 == 0) {
			result = "3의 배수입니다.";
		} else {
			result = "3의 배수가 아닙니다.";
		}
		return result;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
