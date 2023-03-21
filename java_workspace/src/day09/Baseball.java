package day09;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]com=new int[3];
		int[]user=new int[3];
		
		int min=1,max=9;
		int s=0, b=0;
		
		randomArray(com,min,max);
		
		System.out.println("--야구게임--");
		System.out.println("--시작--");
		
		Scanner scan=new Scanner(System.in);
		
		while(s!=3) {
			System.out.println("1~9까지 숫자 3개 입력하시오 : ");
			for(int i=0;i<user.length;i++)
				user[i]=scan.nextInt();
			
			s=strike(com,user);
			b=ball(com,user);
			
			//if()
		}
		
		
		
		
	}
	public static int random(int n1, int n2) {
		if(n1>n2) {
			int tmp=n1;
			n1=n2;
			n2=n1;
		}
		return (int)(Math.random()*(n2-n1+1))+n1;
	}
	public static boolean isContain(int[]arr,int num) {
		for(int i=0;i<arr.length;i++)
			if(arr[i]==num)
				return true;
		return false;
	}
	public static boolean randomArray(int[]arr,int min, int max) {
		if(arr==null)
			return false;
		if((max-min+1)<arr.length)
			return false;
		int i=0;
		while(i<arr.length) {
			int r=random(min,max);
			if(!isContain(arr,r)) {
				arr[i]=r;
				i++;
			}
		}
		return true;
	}
	public static void printArray(int[]arr) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	//strike개수 체크
	public static int strike(int[]com, int[]user) {
		int cnt=0;
		for(int i=0;i<com.length;i++)
			if(com[i]==user[i])
				cnt++;
		return cnt;
	}
	//ball개수 체크
	public static int ball(int[]com, int[]user) {
		int cnt=0;
		for(int i=0;i<com.length;i++)
			if(isContain(user,com[i]))
				cnt++;
				
		return cnt-strike(com,user);
	}

}
