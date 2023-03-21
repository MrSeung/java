package product;

import java.util.*;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner scan = new Scanner(System.in);
		ProductManager pm = new ProductManager();

		do {
			System.out.println("---------------");
			System.out.println("1.제품추가 | 2.제품리스트 출력 | 3.제품가격 수정");
			System.out.println("4.제품삭제 | 5.제품주문 | 6.주문내역 | 7.종료");
			System.out.println("---------------");
			System.out.print("메뉴선택>> ");
			num = scan.nextInt();

			switch (num) {
			case 1:
				pm.insertMenu();
				break;
			case 2:
				pm.printMenu();
				break;
			case 3:
				pm.modify();
				break;
			case 4:
				pm.deletMenu();
				break;
			case 5:
				pm.order();
				break;
			case 6:
				pm.orderList();
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
