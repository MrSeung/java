package day16;

import java.util.Arrays;

public class StreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  */
		int[] arr= {5,6,1,3,5,1,5,8,8,9,6,5,44,3,20};
		Arrays.stream(arr).sorted().filter(n->(n%2==0)).distinct().forEach(System.out::println);
		
		//짝수배열 
		int res[]=Arrays.stream(arr).sorted().filter(n->(n%2==0)).distinct().toArray();
		for(int tmp:res) {
			System.out.print(tmp+" ");
		}
	}

}
