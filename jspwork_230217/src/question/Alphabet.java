package question;

public class Alphabet {
	
	char s;
	
	public char getS() {
		return s;
	}

	public void setS(char s) {
		this.s = s;
	}

	public String process() {
		
		String str = "";
	
		for (char i = 'a'; i <= s; i++) {
			str += i;
		}
		return str;
	}
}