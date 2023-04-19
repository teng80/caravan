package Practice;

import java.util.Scanner;

public class ExExchange {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("원화를 입력하세요(단위 원)>>");
	int won = sc.nextInt();
//	final double DRATE = 1200;
//	final double ERATE = 1500;
//	double doller = won/DRATE;
//	double eur = won/ERATE;
//	System.out.println(won+"원 은 $"+doller+"입니다");
//	System.out.println(won+"원 은 E"+eur+"입니다");
	
//	double d = dex(won);
//	double e = eex(won);
	
	System.out.println(won+"원 은 $"+dex(won)+"입니다");
	System.out.println(won+"원 은 E"+eex(won)+"입니다");
	
	
}	public static double dex(double dor) {
		return dor/1200;}
 	public static double eex(double you) {
 		return you/1500;}	
}

