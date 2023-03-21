package day17;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* PrintWriter : 개체의 형식화된 표현을 텍스트 출력 스트림으로 출력 */
		//println, print, printf
		
		PrintWriter pw=new PrintWriter(System.out);
		String str="Hello";
		pw.print(str);
		pw.println();
		pw.println(str);
		pw.printf("%.6f",Math.PI);
		
		pw.flush();  // 버퍼 내부에 잔류하고 있는 바이트를 비워라. 버퍼를 비움.
		pw.close();
		
		
		PrintWriter pw1=new PrintWriter(new FileWriter("test2.txt",true));
		for(int i=1;i<10;i++) {
			String data=i+"test";
			pw1.println(data);
		}
		pw1.append("Hello");
		pw1.close();
		
	}

}
