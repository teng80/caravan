package Chapter14;

public class ColorTV extends TV{
	
	private int nColor;//3)1024
	//1)32, 1024
	public ColorTV(int size, int nColor) {
		super(size);
		//2)1024
		this.nColor=nColor;
		}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+nColor+"컬러");
	}
	
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
}
