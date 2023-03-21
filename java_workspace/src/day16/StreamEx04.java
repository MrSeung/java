package day16;

import java.util.*;

public class StreamEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Trip> t=new ArrayList<>();
		t.add(new Trip("이순신",40,0));
		t.add(new Trip("신사임당",35,0));
		t.add(new Trip("허준",10,0));
		
		t.stream().filter(n->n.getAge()>=15).forEach(n->n.setPrice(100));
		t.stream().filter(n->n.getAge()<15).forEach(n->n.setPrice(50));
		
		t.stream().forEach(n->{System.out.println("이름:"+n.getName()+" 나이:"+n.getAge()+" 비용:"+n.getPrice());});
		System.out.println("총 여행비용:"+t.stream().mapToInt(n->n.getPrice()).sum());
		
		t.stream().filter(a->a.getAge()>=20).map(n->n.getName()).sorted().forEach(System.out::println);
	}

}
