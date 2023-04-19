package Chapter06;

class Point3{
	private int x, y; //a=>(2, 3), b=>(2, 3), c=>(3, 4) 
	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {//Object obj=new Point3(2, 3) 업캐스팅
		Point3 p = (Point3) obj; //다운캐스팅
		//x,y=2,3 p.x=2, p.y=3
		//x,y=2,3 p.x=3, p.y=4
		if (x==p.x && y==p.y) {
			return true;
		} else {
			return false;
		}
	} 
}
public class EqualsEx {
	public static void main(String[] args) {
		Point3 a = new Point3(2, 3);
		Point3 b = new Point3(2, 3);
		Point3 c = new Point3(3, 4);
		
		if (a == b) {
			System.out.println("a == b");
		} else {
			System.out.println("a != b");
		}
		
		if (a.equals(b)) {
			System.out.println("a is equals to b");
		} else {
			System.out.println("a is not equals to c");
		}
		
		if (a.equals(c)) {
			System.out.println("a is equals to b");
		} else {
			System.out.println("a is not equals to c");
		}
	}
}
