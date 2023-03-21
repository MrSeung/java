package day15;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaleManager sm = new SaleManager();
		Scanner scan=new Scanner(System.in);
		int num=0;
		do {
			sm.printMenu();
			num = scan.nextInt();

			switch (num) {
			case 1:
				sm.add();
				break;
			case 2:
				sm.mList();
				break;
			case 3:
				//sm.modify();
				break;
			case 4:
				//sm.deletMenu();
				break;
			case 5:
				//sm.order();
				break;
			case 6:
				//sm.orderList();
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
