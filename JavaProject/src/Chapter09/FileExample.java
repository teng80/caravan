package Chapter09;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
//		File dir = new File("d:/test");//uri:url+파일경로+db경로+지도경로
		File dir = new File("d:/test/dir");//하위 디렉토리 포함
		File file1 = new File("d:/test/file1.txt");//파일
		File file2 = new File("d:/test/file2.txt");//파일
		File file3 = new File("d:/test/file3.txt");//파일
		
//		dir.mkdir();//디렉토리 만들기
		dir.mkdirs();//하위 디렉토리까지 같이 만들기
		file1.createNewFile();//파일 만들기
		file2.createNewFile();//파일 만들기
		file3.createNewFile();//파일 만들기
		
		File test = new File("d:/test");//디렉토리 정보를 가지고 test 객체 생성
		File[] contents = test.listFiles();//디렉토리 정보를 가지고 온다.(하위 디렉토리들+파일들)
		System.out.println("날짜                   시간                 형태        크기            이름");
		System.out.println("-------------------------------------------------");
		
		//년원일 오전/오후 시분
		SimpleDateFormat sdf=new SimpleDateFormat("yyy-MM-dd a hh:mm");
		for (int i = 0; i < contents.length; i++) {
//			1680054173750:1970년1월1일 기준으로 오늘까지의 milisec(1/1000초)로 계산된 값(long type)
//			System.out.print(contents[i].lastModified());//마지막 생성일자
//			System.out.print(new Date(contents[i].lastModified()));//마지막 생성일자
			System.out.print(sdf.format(new Date(contents[i].lastModified())));//마지막 생성일자
			
			if (contents[i].isDirectory()) {//디렉토리면
				System.out.print("\t<DIR>\t\t"+contents[i].getName());//디렉토리나 파일이름
			} else {//파일이면
				System.out.print("\t\t"+contents[i].length()+"\t"+contents[i].getName());//디렉토리나 파일이름
			}
			System.out.println();
		}
	}
}
