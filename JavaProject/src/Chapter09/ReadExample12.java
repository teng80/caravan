package Chapter09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample12 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("D:\\test.txt");//upcasting
		int readData;
		char[] cbuf = new char[2];
		String data = "";
		
		while (true) {
//			readData = reader.read();//한개의 문자 단위로 읽는다.ex>호미
			readData = reader.read(cbuf);//한개의 문자 단위로 읽는다.ex>삽
			if (readData == -1) {
				break;
			}
//			System.out.print((char)readData);//유니코드를 문자로 변환해서 출력
			//2개의 문자로 0번째 인덱스부터 readData만큼 읽는다.
			data += new String(cbuf, 0, readData);
		}
		System.out.println(data);
		reader.close();
	}

}
