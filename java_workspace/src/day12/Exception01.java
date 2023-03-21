package day12;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Exception 예외처리
		 * 실행시 발생할 수 있는 예외를 처리하며 정상처리로 유지시키는 기능.
		 * try-catch-finally
		 * try:예외가 발생할 가능성이 있는 구문 작성
		 * catch:try구문에서 예외가 발생했을 때 예외처리
		 * finally:try구문외 반드시 실행되야하는 구문이 있을 경우 사용(없으면 사용X)
		 * */
		
		/*double res=0;
		int num=10;
		int num1=0;
		try {
			res=num/num1;
			System.out.println(res);
			
		}catch(Exception e) {
			System.out.println("0으로 나누었습니다.");
		}finally {
			System.out.println("꼭 처리되어야 하는 구문");
		}*/
		
		int num1=0;
		int num2=0;
		char c;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		System.out.print(">>");
		num1=scan.nextInt();
		System.out.print(">>");
		num2=scan.nextInt();
		System.out.println("연산자를 입력하세요.");
		System.out.print(">>");
		c=scan.next().charAt(0);
		
		try {
			System.out.println(calc(num1,num2,c));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("계산기 종료.");
	}
	//throw를 발생시키게 되면 예외를 메서드를 호출하는 객체에게 넘기는 현상이 발생됨.
	//
	
	public static int calc(int n1,int n2,char c) throws RuntimeException {
		int result=0;
		if((c=='/'||c=='%')&&n2==0)
			throw new RuntimeException("n2는 0이 될수 없습니다.");
		switch(c) {
		case '+':result=n1+n2;break;
		case '-':result=n1-n2;break;
		case '/':result=n1/n2;break;
		case '*':result=n1*n2;break;
		case '%':result=n1%n2;break;
		default:
			throw new RuntimeException(c+"는 잘못된 연산자입니다.");
		}
		return result;
		
	}

}
