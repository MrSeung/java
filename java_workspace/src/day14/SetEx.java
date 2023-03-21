package day14;

import java.util.*;

public class SetEx {
	TreeSet<Integer> set = new TreeSet<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetEx s = new SetEx();
		 while(s.set.size()<6){
			s.ranArray();
		}
		s.print();
		System.out.println(s.set.first());
		System.out.println(s.set.last());
		System.out.println(s.set.pollLast());
		System.out.println(s.set.pollFirst());
	}

	public void ranArray() {
		set.add(new Random().nextInt(45) + 1);
	}

	public void print() {
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			int num = it.next();
			System.out.println(num + " ");
		}
	}
}
