package Chapter02;

public class AssignmentIncDecOperator {
	public static void main(String[] args) {
		int a=3, b=3, c=3;
		
		a +=3; //a=a+3 << 이것을 쉽에 표기해둔것이 a +=3임
		b*=3; //b=b*3
		c%=2; // c=c%2 (계산한 몫은 1이고 나머지가 1임 // %<<퍼센트는 나머지를 결과값으로 출력함)
		System.out.println("a="+a+",b="+b+",c="+c);
		
		int d=3;
//		d를 먼저 a에 넘기고, 1을 증가
//		후위 연산자 : d를 넘기고 뒤에 d값을 증가함
		a=d++; 
		System.out.println("a="+a+",d="+d);

//		전위 연산자 : 먼저 1을 증가하고 a에 넘김
		a= ++d; 
		System.out.println("a="+a+",d="+d);
	
//		a=5,d=4
		a=d--; 
		System.out.println("a="+a+",d="+d);

//		전위 연산자 : 이하동일		
		a=--d; 
		System.out.println("a="+a+",d="+d);
	}
}
