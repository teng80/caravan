package question;

public class Rectangle {
	
	private int x;
	private int y;
	
	public String process() {
		String result="";
		if((x>=100 && y>=100) && (x<=200 && y<=200)){
			result = "는 사각형 안에 있습니다.";

		} else {
			result = "는 사각형 안에 없습니다.";
		}
		return result;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
