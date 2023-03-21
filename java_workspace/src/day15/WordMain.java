package day15;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		WordManager wm = new WordManager();

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
				wm.filePrint();
				System.out.println("파일에 저장되었습니다.");
				break;
			case 7:
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		} while (num != 7);
		scan.close();
	}

}
