package day09;

public class Class {

	public static void main(String[] args) {
		
		calc(10,20,"=");
		calc(10,"-",20);
		calc("*",10,20);
		
	}
	public static void calc(int a,int b,String s) {

		int result=0;
		switch(s) {
		case "+" : 
			result=a+b;
			System.out.println(result);
			break;
		case "-" :
			result=a-b;
			System.out.println(result);
			break;
		case "*" :
			result=a*b;
			System.out.println(result);
			break;
		case "/" :
			result=a/b;
			System.out.println(result);
			break;
		case "%" :
			result=a%b;
			System.out.println(result);
			break;
			default:
				System.out.println("잘못입력하셨습니다.");
		}
	}
	public static void calc(int a,String s,int b) {

		int result=0;
		switch(s) {
		case "+" :
			result=a+b;
			System.out.println(result);
			break;
		case "-" :
			result=a-b;
			System.out.println(result);
			break;
		case "*" :
			result=a*b;
			System.out.println(result);
			break;
		case "/" :
			result=a/b;
			System.out.println(result);
			break;
		case "%" :
			result=a%b;
			System.out.println(result);
			break;
			default:
				System.out.println("잘못입력하셨습니다.");
		}
	}
	public static void calc(String s,int a,int b) {

		int result=0;
		switch(s) {
		case "+" :
			result=a+b;
			System.out.println(result);
			break;
		case "-" :
			result=a-b;
			System.out.println(result);
			break;
		case "*" :
			result=a*b;
			System.out.println(result);
			break;
		case "/" :
			result=a/b;
			System.out.println(result);
			break;
		case "%" :
			result=a%b;
			System.out.println(result);
			break;
			default:
				System.out.println("잘못입력하셨습니다.");
		}
	}

}
