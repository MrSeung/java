package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	Scanner scan=new Scanner(System.in);
	private ArrayList<Sale<String,Integer>> product=new ArrayList<>();
	private ArrayList<Sale<String,Integer>> order=new ArrayList<>();
	
	
	
	public void add() {
		System.out.println("제품명: ");
		String menu=scan.next();
		System.out.println("가격: ");
		int price = scan.nextInt();
		Sale s=new Sale(menu,price);
		product.add(s);
	}
	
	public void mList() {
		System.out.println("-----MENU-----");
		for(int i=0;i<product.size();i++) {
			System.out.println(product.get(i));
		}
		System.out.println("--------------");
	}
	public void printMenu() {
		System.out.println("---------------");
		System.out.println("1.제품추가 | 2.제품리스트 출력 | 3.제품가격 수정");
		System.out.println("4.제품삭제 | 5.제품주문 | 6.주문내역 | 7.종료");
		System.out.println("---------------");
		System.out.print("메뉴선택>> ");
	}
	
	public void order() {
		System.out.println("주문 메뉴 : ");
		String menu=scan.next();
		boolean flag=true;
		
		for(int i=0;i<product.size();i++) {
			if(product.get(i).equals(menu)) {
				flag=false;
			}
		}
	}
}
