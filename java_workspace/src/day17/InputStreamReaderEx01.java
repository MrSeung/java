package day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamReaderEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[]b=new byte[1024];
		FileInputStream fis=new FileInputStream("out.txt");
		fis.read(b);
		//String data= new String(b);
		System.out.println(new String(b));  // 반복문이 없는데 모든 내용이 어떻게 출력되는걸까?? 
										  	// -> 
		fis.close();
	}

}
