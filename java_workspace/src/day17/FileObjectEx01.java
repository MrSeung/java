package day17;

import java.io.File;
import java.util.StringTokenizer;

public class FileObjectEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//D:\_java_workspace\java_workspace
		File f =new File("D:\\_java_workspace\\java_workspace\\out.txt");
		String fileName=f.getName();
		System.out.println(fileName);  //경로를 제외한 파일명만 출력
		System.out.println(f.getPath()); //경로+파일이름 출력
		System.out.println(f.getAbsolutePath()); //경로+파일이름 출력
		System.out.println(f.getParent()); //경로만 출력
		System.out.println(File.separator); //파일 구분자
		System.out.println(File.separatorChar);
		
		String fstr=f.toString();
		System.out.println(fstr);
		
		System.out.println("------------");
		
		String s=fstr.substring(0, fstr.indexOf(File.separator));
		System.out.println(s);
		String s1=fstr.substring(fstr.indexOf(File.separator)+1, fstr.lastIndexOf(File.separator));
		System.out.println(s1);
		String s2=fstr.substring(fstr.lastIndexOf(File.separator)+1);
		System.out.println(s2);
		
		String[]str=f.getName().split(File.separator+".");
		System.out.println("파일명:"+str[0]+" 확장자:"+str[1]);
		
		StringTokenizer stk=new StringTokenizer(f.getName(),".");
		while(stk.hasMoreElements()) {
			System.out.println(stk.nextElement());
		}
	}

}
