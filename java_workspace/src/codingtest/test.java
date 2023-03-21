package codingtest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		ArrayList<String> arr = new ArrayList<>();

		StringBuffer ran = new StringBuffer();

		int cnt = 0;

		while (true) {
			String str = br.readLine();
			if (str == null)
				break;
			arr.add(str);
		}

		while (cnt < arr.size()) {
			ran.setLength(0);
			ran.append(arr.get((int) (Math.random() * arr.size())));
			int a = (int) (Math.random() * ran.length());
			char c = ran.charAt(a);
			ran.replace(a, a + 1, "_");
			cnt++;
			while (true) {
				System.out.println("문제 : " + ran);
				System.out.print(">> ");
				Scanner scan = new Scanner(System.in);
				char c1 = scan.next().charAt(0);

				if (c == c1) {
					ran.replace(a, a + 1, String.valueOf(c1));
					System.out.println(ran);
					System.out.println("정답입니다.");
					break;
				} else {
					System.out.println("틀렸습니다.");

				}
			}
		}

	}
}
