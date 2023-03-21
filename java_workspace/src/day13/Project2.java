package day13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		int sum=0;
		int avg=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("과목과 점수를 입력하시오.");
		while (true) {
			System.out.println("종료는 0을 입력하시오.");
			System.out.print("과목>>");
			String classs = scan.next();
			if(classs.equals("0"))
				break;
			System.out.print("점수>>");
			int num = scan.nextInt();
			map.put(classs, num);
			
			sum+=num;
		}
		avg=sum/map.size();
		System.out.println("----출력----");
		System.out.println(map);
		System.out.println("합계:"+sum+" 평균:"+avg);
	}
}
