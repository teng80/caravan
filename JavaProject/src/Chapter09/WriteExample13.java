package Chapter09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample13 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:/output.txt"); 
		char[] data = "홍길동2".toCharArray();
		
//		writer. write(data);
		writer. write(data, 1, 2);//길동:"홍길동2"에서 인덱스1번에서 2자를 읽어서 파일로 저장
		writer.close();
	}
}
