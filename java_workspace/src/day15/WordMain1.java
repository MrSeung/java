package day15;

import java.util.Scanner;

public class WordMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		WordManager1 wm = new WordManager1();
		int num=0;
		
		do {
			wm.mPrint();
			num = scan.nextInt();
			
			switch (num) {
			case 1:
				wm.add();
				break;
			case 2:
				wm.print();
				break;
			case 3:
				wm.search();
				break;
			case 4:
				wm.modify();
				break;
			case 5:
				wm.delete();
				break;
			case 6:
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		} while (num != 6);
		scan.close();
	}

}