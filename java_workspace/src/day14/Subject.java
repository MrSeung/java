package day14;

import java.util.*;

public class Subject {
	static Scanner scan=new Scanner(System.in);
	static HashMap<String,Integer>map=new HashMap<>();
	public static void main(String[] args) {
		menu();
		a:while(true) {
			System.out.println("메뉴 번호를 입력하시오.");
			System.out.print(">>");
			int num=scan.nextInt();
			switch(num) {
			case 0:break a;
			case 1:input();break;
			case 2:searchAll();break;
			case 3:search();break;
			case 4:modify();break;
			case 5:delete();break;
			default:
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
		}
		System.out.println("종료합니다.");
	}
	
	public static void menu() {
		System.out.println("---MENU---");
		System.out.println("0.종료");
		System.out.println("1.성적추가");
		System.out.println("2.성적조회(전체)");
		System.out.println("3.성적조회(과목)");
		System.out.println("4.성적수정");
		System.out.println("5.성적삭제");
	}
	public static void input() {
		System.out.println("과목을 입력하시오.");
		System.out.print(">>");
		String grade=scan.next();
		System.out.println("점수를 입력하시오.");
		System.out.print(">>");
		int score=scan.nextInt();
		if(score<0||score>100)
			return;
		if(map.get(grade)==null)
			map.put(grade,score);			
		else
			System.out.println(grade+"는 이미 존재합니다.");
	}
	public static void searchAll() {
		int sum=0;
		int avg=0;
		for(String str:map.keySet()) {
			System.out.println("과목:"+str+" 점수:"+map.get(str));
			sum+=map.get(str);
		}
		avg=sum/map.size();
		System.out.println("총 합계:"+sum+" 평균:"+avg);
	}
	public static void search() {
		System.out.println("조회할 과목을 입력하시오.");
		System.out.print(">>");
		String grade=scan.next();
		for(String str:map.keySet()) {
			if(str.equals(grade))
				System.out.println("과목:"+str+" 점수:"+map.get(str));
			else
				System.out.println("없는 과목입니다.");
		}
	}
	public static void modify() {
		System.out.println("수정하고 싶은 과목을 입력하시오.");
		System.out.print(">>");
		String grade=scan.next();
		System.out.println("수정하고 싶은 점수를 입력하시오.");
		System.out.print(">>");
		int score=scan.nextInt();
		
		map.replace(grade, score);
		System.out.println("수정되었습니다.");
	}
	public static void delete() {
		System.out.println("삭제하고 싶은 과목을 입력하시오.");
		System.out.print(">>");
		String grade=scan.next();
		
		map.remove(grade);
		System.out.println("삭제되었습니다.");
	}
}
