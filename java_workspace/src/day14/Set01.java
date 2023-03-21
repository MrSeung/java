package day14;
import java.util.*;
public class Set01 {
	static TreeSet<Integer> ts=new TreeSet<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set01 s=new Set01();
		int[]score= {80,88,78,5,44,87,96};
		for(int i=0;i<score.length;i++)
			s.input(score[i]);
		s.print();
		System.out.println("----------");
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println("----------");
		System.out.println(ts.tailSet(80)); //80보다 큰객체
		System.out.println(ts.headSet(80)); //80보다 작은 객체
		
		System.out.println(ts.subSet(70, 90)); //70~89 사이에 해당되는 숫자 출력
		
		NavigableSet<Integer> desSet=ts.descendingSet();
	}
	public void input(int n) {
		ts.add(n);
	}
	public void print() {
		Iterator<Integer> it =ts.iterator();
		while(it.hasNext()) {
			int num=it.next();
			System.out.println(num);
			}
	}
}
