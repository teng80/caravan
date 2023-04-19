package question;

public class Asterisk {
	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
//	public String process() {
//		String result="";
//		for (int i = num; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				result +="*";
//			}
//			result +="<br>"; // out.print( result ) = out.print("<br>")
//		}
//		return result;
//	}
	//ok
	
	//강사님 답
	public String process(int num) {
		StringBuffer strBuf = new StringBuffer();
		for (int i = num; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				strBuf.append('*');
			}
			strBuf.append("<br>");
		}
		return strBuf.toString();
	}
}