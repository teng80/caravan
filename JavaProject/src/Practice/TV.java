package Practice;

public class TV {
	String maker;
	int year;
	int size;
	
	public TV(String maker, int year, int size) {
		this.maker = maker;
		this.year = year;
		this.size = size;
	}
	public void show() {
		System.out.println(this.maker+"에서 만든 "+this.year+"년형 "+this.size+"인치 TV");
	}

	public static void main(String[] args) {
		TV myTV = new TV("LG",2017,32);
		myTV.show();

	}

}
