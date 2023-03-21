package day17;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("한글로 입력해주세요.(Enter)");
		int i;
		
		InputStreamReader isr=new InputStreamReader(System.in);
		try {
			while((i=isr.read())!='\n' ) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
