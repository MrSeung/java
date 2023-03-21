package day13;
import java.util.*;
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Word w=new Word();
		Subject s=new Subject();
	}

}

class Word{
	public Word() {
		Map<String,String> map=new HashMap<>();
		Scanner scan=new Scanner(System.in);
		System.out.println("5개 단어를 입력하시오");
		for(int i=0;i<5;i++) {
			System.out.print("영단어>>");
			String word=scan.next();
			System.out.print("뜻>>");
			String mean=scan.next();
			map.put(word, mean);			
		}
		System.out.println("----출력----");	
		System.out.println(map);
		System.out.println("-----------");
	} 
}

class Subject{
	public Subject() {
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
		System.out.println("-----------");
	}
}
