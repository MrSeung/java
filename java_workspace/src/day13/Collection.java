package day13;

import java.util.*;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ArrayList<String> str = new ArrayList<>();
		 * 
		 * str.add("하이"); str.add("하이"); str.add("하이");
		 * 
		 * System.out.println(str); System.out.println(str.size());
		 * 
		 * List<Integer> num = new ArrayList<>(); for (int i = 1; i < 11; i++) {
		 * num.add(i); }
		 * 
		 * Integer a = 5;
		 * 
		 * num.remove(1); num.remove(a); num.set(0, 5); System.out.println(num);
		 * 
		 * Collections.sort(num);
		 * 
		 * System.out.println(num); num.sort(new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) { // o1-o2:오름차순
		 * o2-o1:내림차순 return o2 - o1; } }); System.out.println(num);
		 */

		List<String> list = new ArrayList<>();
		//ArrayList<E> list1 = new ArrayList<E>();
		list.add("출근");
		list.add("퇴근");
		list.add("꿈나라");
		
		//Object a=10;
		// Collections.sort(list);
		// list.sort(new Test());

		System.out.println(list);
		list.get(0);
		list.remove(0);

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

class Test implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1); // 내림차순
	}

}

class A<E>{
	ArrayList<E> list1 = new ArrayList<E>();
}