package day11;

import java.util.Scanner;

public class Test {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fileName=new String[5];
		System.out.println("5개의 파일을 입력해주세요");
		outPrint(input(fileName));
	}
	
	public static String[] input(String[] fileName) {
		for(int i=0;i<fileName.length;i++) {
			System.out.print(">>");
			fileName[i]=scan.next();
		}
		return fileName;
	}
	
	public static void outPrint(String[] fileName) {
		String[] str= {".jpg",".png",".gif",".jpeg"};
		int cnt=0;
		for(int i=0;i<str.length;i++) 
			for(int j=0;j<fileName.length;j++) 
				if(fileName[j].contains(str[i])) {
					System.out.println(fileName[j]);
					cnt++;
				}
		if(cnt==0)
			System.out.println("이미지 파일이 없습니다.");
	}
}
