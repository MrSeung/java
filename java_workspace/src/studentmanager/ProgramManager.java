package studentmanager;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramManager implements Program {

	// 멤버변수 student class ,
	private ArrayList<Student> std=new ArrayList<>();
	private int stdCount;

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		for (Student s:std) {
			s.stdPrint();
			// printStudentOne(std[i]);
			System.out.println("-------------------");
		}
	}

	@Override
	public void insertStudent(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("--학생정보 입력--");
		System.out.print("이름> ");
		String name = scan.next();
		System.out.print("학번> ");
		String sNum = scan.next();
		System.out.print("주민번호> ");
		String rNum = scan.next();
		System.out.print("학부> ");
		String faculy = scan.next();
		System.out.print("학과> ");
		String major = scan.next();
		System.out.println("--------------");

		std.add(new Student(sNum, name, rNum, faculy, major)) ;
		stdCount++;

	}

	@Override
	public void searchStudent(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("검색할 학생을 입력하세요> ");
		String name = scan.next();
		boolean flag = true;

		for (Student s:std) {
			if (s.getStdName().equals(name)) {
				printStudentOne(s);
				flag=false;
				break;
			}
		}
		if (flag) {
			System.out.println("검색하신 학생은 존재하지않습니다.");
		}
	}

	@Override
	public void registerSubject(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("수강신청 할 학생 이름> ");
		String name = scan.next();
		boolean flag = true;
		int cnt=-1;

		for (Student s:std) {
			if (s.getStdName().equals(name)) {
				flag = false;
				cnt++;
				break;
			}
		}
		if (flag) {
			System.out.println("검색하신 학생은 존재하지않습니다.");
		}
		else {
			System.out.println("수강신청 과목명> ");
			String su=scan.next();
			Subject sub=new Subject(su);
			std.get(cnt).insertSubject(sub);	
		}
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("수강철회 할 학생 이름> ");
		String name = scan.next();
		boolean flag = true;
		int cnt=-1;

		for (Student s:std) {
			if (s.getStdName().equals(name)) {
				flag = false;
				cnt++;
				break;
			}
		}
		if (flag) {
			System.out.println("검색하신 학생은 존재하지않습니다.");
		}
		else {
			System.out.println("수강철회 할 과목명> ");
			String su=scan.next();
			std.get(cnt).deleteSubject(su);
		}
	}

	// 1명의 학생정보+수강정보를 같이 출력하고 싶을 때
	public void printStudentOne(Student s) {
		System.out.println("--학생정보--");
		s.stdPrint();
		System.out.println("--수강정보--");
		s.subPrint();
	}
}
