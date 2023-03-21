package day14;

import java.util.*;

public class MapEx {
	private HashMap<String, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		MapEx m = new MapEx();
		while (m.map.size() < 3) {
			System.out.println("상품명을 입력하시오.");
		System.out.print(">>");
		String name = scan.next();
		System.out.println("가격을 입력하시오.");
		System.out.print(">>");
		int price = scan.nextInt();
		m.input(name, price);
		}
		m.print();
	}

	public void input(String name, Integer price) {
		map.put(name, price);
	}

	public void print() {
		int sum = 0;
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String name = it.next();   //받아오기!!
			int price=map.get(name);
			sum += price;
			System.out.println("상품명:" + name + " 가격:" + price);
		}
		System.out.println("총 지불가격:" + sum);
	}
}
