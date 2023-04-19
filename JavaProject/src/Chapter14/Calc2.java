package Chapter14;

abstract class Calc2 {//추상클래스
	protected int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public abstract int calculate();//추상메소드. 서브클래스에서 적절히 구현
}
