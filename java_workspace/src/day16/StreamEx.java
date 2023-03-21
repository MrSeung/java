package day16;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<>();
		arr.add("홍길동");
		arr.add("홍길순");
		arr.add("호오옹");
		arr.add("asdfsdf");
		arr.add("asddf");
		arr.add("afsdf");
		arr.add("asuuuuu");

		// Stream<String> str=arr.stream().sorted();
		// str.forEach(n->{System.out.print(n+" ");});

		// forEach 리턴있으면 {}를 써야됨.
		arr.stream().sorted().filter(b -> b.length() > 4).forEach(n -> {
			System.out.println(n);
		});

		arr.stream().forEach(n -> System.out.println(n + " " + n.length()));

		arr.stream().map(n -> n.length()).forEach(System.out::println);
	}

}
