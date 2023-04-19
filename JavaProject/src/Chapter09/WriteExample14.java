package Chapter09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample14 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:/output.txt"); 
//		char[] data = "홍길동2".toCharArray();
		String data = "안녕 자바 프로그램";
		
		writer. write(data, 3, 2);//자바:인덱스3번에서 2자를 읽어서 파일로 저장
		writer.close();
	}
}
