package day10;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] p=new Product[10];
		int cnt=0;
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("상품을 등록해주세요.");

			while(true) {
				System.out.print("상품 이름:");
				String name=scan.next();
				System.out.print("가격:");
				int price=scan.nextInt();
				Product tmp=new Product();
				tmp.insertProduct(name, price);
				p[cnt]=tmp;
				cnt++;
				if(cnt==p.length) {
					System.out.println("저장공간이 부족합니다.");
					break;
				}
				System.out.print("상품을 계속 등록하시겠습니까?");
				System.out.print("(계속:아무키 / 종료:n)");
				char c=scan.next().charAt(0);
				if(c=='n')
					break;
			}
			for(int i=0;i<cnt;i++) {
				System.out.println(p[i]);			
				sum+=p[i].getPrice();
			}
			System.out.println("총 가격 : "+sum);			
	}
}
