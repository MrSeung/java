package studentmanager;

import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgramManager pm = new ProgramManager();
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println("--menu--");
			System.out.println("1.학생등록 | 2.학생확인 | 3.학생검색");
			System.out.println("4.수강신청 | 5.수강철회 | 6.종료");
			System.out.print("메뉴선택 >> ");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				pm.insertStudent(scan);
				break;
			case 2:
				pm.printStudent();
				break;
			case 3:
				pm.searchStudent(scan);
				break;
			case 4:
				pm.registerSubject(scan);
				break;
			case 5:
				pm.deleteSubject(scan);
				break;
			case 6:
				break;
				default:
					System.out.println("잘못된 메뉴입니다.");
			}

		} while (menu != 6);
		scan.close();
	}

}
