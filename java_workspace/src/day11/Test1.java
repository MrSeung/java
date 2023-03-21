package day11;



import java.util.Scanner;



public class Test1 {



	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] fileName = new String[5];
		System.out.println("파일명 5개를 입력해주세요.");

		for(int i=0; i<fileName.length; i++) {
			fileName[i]=scan.next();
		}

//		String[] fileName = {"java.txt","String.jpg","method.png",

//				 "String.pdf","java.pdf"};

//		String search = fileName[2].substring(fileName[2].indexOf(".")+1);

//		System.out.println(search);

		String[] img = {"jpg", "png", "gif", "jpeg"};
		System.out.println("==이미지 파일 검색==");

		for(String tmpfile : fileName) {
			String search = tmpfile.substring(tmpfile.indexOf(".")+1);
			if(isContains(img, search)) {
				System.out.println(tmpfile);
			}
		}
	}

	//isContains(String arr[], String search)

	//기능 : 배열에서 찾는 문자열이 있는지 체크 있으면 true

	public static boolean isContains(String arr[], String search) {
		//배열이 없는 경우
		if(arr==null || arr.length==0) {
			return false;
		}
		//검색어가 없는 경우
		if(search == null) {
			return false;
		}
		for(String tmp : arr) {
			if(tmp.equals(search)) {
				return true;
			}
		}
		return false;
	}	
}