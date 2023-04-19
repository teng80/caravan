package Chapter14;

public class IPTV extends ColorTV{
	
//	private String IP;
//	
//	public IPTV(String IP, int size, int nColor) {
//		super(size, nColor);
//		this.IP=IP;
//	}
//
//	public void printProperty() {
//		System.out.print("나의 IPTV는 "+IP+" 주소의 ");
//		super.printProperty();
//	}
//
//	public static void main(String[] args) {
//		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
//		iptv.printProperty();
		//ok
		
		//강사님 답
	private String ipAddr;
	public IPTV(String ipAddr, int size, int nColor) {
		super(size, nColor);
		this.ipAddr=ipAddr;
	}
	
	public void printProperty() {
		System.out.print("나의 IPTV는 "+ipAddr+" 주소의 ");
		super.printProperty();
	}
		
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
