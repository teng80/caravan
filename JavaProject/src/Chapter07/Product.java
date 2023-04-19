package Chapter07;

//T=Tv, M=String
public class Product<T, M> {
	//T=Tv, M=String
	//3.new Tv()
	private T kind;
	//3.String model = "스마트TV"
	private M model;
	//T=Tv가 메소드 리턴타입
	public T getKind() {
		return kind;
	}
	//T=Tv가 매개변수의 타입
	//1.Tv kind = new Tv()
	public void setKind(T kind) {
		this.kind = kind;//2.new Tv()
	}
	//M=String이 매개변수의 리턴타입
	public M getModel() {
		return model;
	}
	//M=String이 매개변수의 타입
	//1.String model = "스마트TV"
	public void setModel(M model) {
		this.model = model;//2.String model = "스마트TV"
	}
}