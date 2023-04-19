package Chapter09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("D:\\test.txt");//upcasting
		int readByte;
		byte[] readBytes = new byte[3];
		String data="";
		
//		//[2번째 방법]
//		while ((readByte = is.read()) != -1) {
//			System.out.print((char)readByte);
//		}
		
		//[1번째 방법]
		while (true) {
//			readByte = is.read();//1byte 단위로 읽는다.(정수로 받음):ex>호비
			readByte = is.read(readBytes);//3byte 단위로 읽는다.(정수로 받음):ex>삽
			if (readByte == -1) {
				break;
			}

//			System.out.print((char)readByte);
//			System.out.print(readByte);
			//readBytes 를 0인덱스에서 readByte 길이 만큼 읽는다.
			data += new String(readBytes, 0, readByte);
		}
		System.out.println(data);
		is.close();
	}
}
