package day17;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//같은 파일명에는 덮어씌워지는 것이 기본.
		FileWriter fw=new FileWriter("test.txt");
		
		for(int i=1;i<=10;i++) {
			// \r : 다음 줄 맨 앞으로 이동.
			String data=i+".test \r\n";  // \r\n : 줄바꿈.
			fw.write(data);
		}
		fw.close();
		
		//파일을 추가모드로 열어라("파일명", true) / 같은 파일명에 이어서 작성하겠다. 
		FileWriter fw1=new FileWriter("test.txt",true);
		for(int i=1;i<10;i++) {
			String data=i+".test";
			fw1.write(data);
		}
		fw1.close();
	}

}
