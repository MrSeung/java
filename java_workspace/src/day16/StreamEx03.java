package day16;

import java.util.ArrayList;

public class StreamEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student("홍길동",50));
		list.add(new Student("홍길순",70));
		list.add(new Student("홍순자",60));
		list.add(new Student("홍금자",80));
		
		list.stream().forEach(n->{
				String name = n.getName();
				int score = n.getScore();
				System.out.println(name+":"+score);
						}
				
				);
		
		int sum=list.stream().mapToInt(n->n.getScore()).sum();
		long num=list.stream().count();
		
		System.out.println("총원:"+num+" 합:"+sum);
		
		list.stream().filter(a->a.getScore()>=70).forEach(n-> {String name=n.getName();int score =n.getScore();
		System.out.println(name+":"+score);});
	}

}
