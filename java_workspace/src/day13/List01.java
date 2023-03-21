package day13;

import java.util.*;

public class List01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodManager fm = new FoodManager();    //FoodManager선언
		List<Integer> num = new ArrayList<>(); //메뉴 수량 저장 배열
		List<String> name = new ArrayList<>(); //메뉴 이름 저장 배열
		int sum = 0;  //총 금액
		fm.printMenu();  //메뉴판 출력

		Scanner scan = new Scanner(System.in);
		
		while (true) {

			System.out.println("[주문을 끝내시려면 0번을 눌러주세요]");
			System.out.println("메뉴를 선택해주세요");
			System.out.print(">>");
			int menu = scan.nextInt();

			if (menu == 0) //0입력 시 종료
				break;
			else if (menu > 5) {  //메뉴 외 번호 입력 시 재입력
				System.out.println("잘못입력하셨습니다.");
				continue;
			}

			name.add(fm.menu.get(menu - 1));  //name배열에 선택한 메뉴 이름 저장

			System.out.println("수량을 선택해주세요");
			System.out.print(">>");
			int count = scan.nextInt();

			num.add(count);  //num배열에 선택한 메뉴 수량 저장
			sum += fm.sale(menu, count);  //메뉴 값들 누적 합
			System.out.println("-------------");
			System.out.printf("주문하신 메뉴는 %s %d개 입니다.\n", fm.menu.get(menu - 1), count);
			System.out.printf("결제금액 : %d\n", fm.sale(menu, count));
			System.out.println("-------------");

		}
		for (int i = 0; i < name.size(); i++) {
			System.out.print(name.get(i) + " " + num.get(i) + "개, ");  //배열 내의 값들 출력.
		}
		System.out.println("총 결제금액 : " + sum);

	}

}

interface inter {
	void printMenu();
	int sale(int menu, int count);
}

class FoodManager implements inter {
	List<String> menu = new ArrayList<>();
	List<Integer> price = new ArrayList<>();

	public FoodManager() {
		menu.add("햄버거");
		menu.add("피자");
		menu.add("음료");
		menu.add("감자튀김");
		menu.add("치킨");

		price.add(7000);
		price.add(10000);
		price.add(3000);
		price.add(4000);
		price.add(17000);
	}

	@Override
	public void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("---Menu---");
		System.out.println("1.햄버거 7000원");
		System.out.println("2.피자 10000원");
		System.out.println("3.음료 3000원");
		System.out.println("4.감자튀김 4000원");
		System.out.println("5.치킨 17000원");
		System.out.println("----------");
	}

	@Override
	public int sale(int menu, int count) {
		int price = 0;
		int sum = 0;
		switch (menu) {    //금액 설정.
		case 1:
			price = this.price.get(menu - 1);
			break;
		case 2:
			price = this.price.get(menu - 1);
			break;
		case 3:
			price = this.price.get(menu - 1);
			break;
		case 4:
			price = this.price.get(menu - 1);
			break;
		case 5:
			price = this.price.get(menu - 1);
			break;
		}
		sum = price * count;
		return sum;

	}

}