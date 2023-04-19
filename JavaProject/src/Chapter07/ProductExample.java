package Chapter07;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		
		Tv tv = product1.getKind();//new Tv()
		//Chapter07.Tv@15db9742(패키지.클래스@해시코드)
		System.out.println(tv);
		
		String tvmodel = product1.getModel();//"스마트TV"
		System.out.println(tvmodel);
		
		Product<Car, String> product2 = new Product<>();	
		product2.setKind(new Car());
		product2.setModel("디젤");
		
		Car car = product2.getKind();//new Car()
		//Chapter07.Car@6d06d69c(패키지.클래스@해시코드)
		System.out.println(car);
		
		String carModel = product2.getModel();
		System.out.println(carModel); //디젤
		}
}