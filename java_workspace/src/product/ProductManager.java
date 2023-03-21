package product;

import java.util.*;

public class ProductManager {
	private ArrayList<Product> oList=new ArrayList<>();
	private ArrayList<Product> mList=new ArrayList<>();
	Scanner scan=new Scanner(System.in);
	
	public ProductManager() {
		mList.add(new Product("햄버거",7500));
		mList.add(new Product("피자",20000));
		mList.add(new Product("감자튀김",5500));
		mList.add(new Product("콜라",2500));
		mList.add(new Product("치즈스틱",1500));
	}
	
	
	public void insertMenu() {
		System.out.println("[추가]메뉴 이름> ");
		String menu=scan.next();
		System.out.println("[추가]메뉴 가격> ");
		int price=scan.nextInt();
		mList.add(new Product(menu,price));
	}
	
	public void printMenu() {
		System.out.println("----MENU LIST----");
		int cnt=0;
		for(Product p:mList) {
			System.out.println(p.getMenu()+" : "+p.getPrice());
			cnt++;
		}
		if(cnt==0) {
			System.out.println("없음.");
		}
		
	}
	public void order() {
		System.out.println("[주문]메뉴 이름> ");
		String menu=scan.next();
		int index=-1;
		
		for(int i=0;i<mList.size();i++) {
			if(mList.get(i).getMenu().equals(menu)) {
				index=i;
			}	
		}
		if(index==-1) {
			System.out.println("잘못된 메뉴입니다.");
			return;
		}
		
		System.out.println("[주문]메뉴 수량> ");
		int num=scan.nextInt();
		
		int sum=mList.get(index).getPrice()*num;
		oList.add(new Product(menu,num,sum));
	}
	public void orderList() {
		System.out.println("----ORDER LIST----");
		int cnt=0;
		int sum=0;
		for(Product p:oList) {
			System.out.println(p.getMenu()+" "+p.getNum()+"개");
			cnt++;
			sum+=p.getSum();
		}
		if(cnt==0) {
			System.out.println("없음.");
		}
		if(cnt==oList.size()) {
			System.out.println("총액 : "+sum);
		}
		
	}
	
	public void modify() {
		int cnt=-1;
		System.out.print("수정할 메뉴명> ");
		String menu=scan.next();
		for(Product p:mList) {
			if(p.getMenu().equals(menu)) {
				cnt++;
			}
		}
		if(cnt==-1) {
			System.out.println("존재하지않는 메뉴입니다.");
			return;
		}		
		System.out.print("수정할 가격> ");
		int price=scan.nextInt();
		mList.get(cnt).setPrice(price);
	}
	
	public void deletMenu(){
		int cnt=-1;
		System.out.print("삭제할 메뉴명> ");
		String menu=scan.next();
		for(Product p:mList) {
			if(p.getMenu().equals(menu)) {
				cnt++;
			}
		}
		if(cnt==-1) {
			System.out.println("존재하지않는 메뉴입니다.");
			return;
		}
		mList.remove(cnt);
	}
	
}
