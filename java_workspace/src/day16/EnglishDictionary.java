package day16;

import java.util.*;

public class EnglishDictionary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Word w = new Word();
		int n;
		do {
			w.menu();
			System.out.print("[메뉴]>> ");
			n = scan.nextInt();

			switch (n) {
			case 1:
				w.makeWord();
				break;
			case 2:
				w.print();
				break;
			case 3:
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		} while (n != 3);
	}
}

class Word {
	private Map<String, ArrayList<String>> words = new TreeMap<>();
	int meanSize;

	public void makeWord() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("[단어]>> ");
			String w = scan.next();

			for (String s : words.keySet()) {
				if (w.equals(s)) {
					System.out.println("이미 존재하는 단어입니다.");
					return;
				}
			}
			ArrayList<String> means = new ArrayList<>();
			while (true) {
				System.out.print("[뜻]>> ");
				String m = scan.next();
				means.add(m);
				
				System.out.printf("[%s 뜻] 추가:y | 종료:n >> ",w);
				char c = scan.next().charAt(0);
				if (c == 'n') {					
					words.put(w, means);
					break;
				}
			}
			
			System.out.print("[단어] 추가:y | 종료:n>> ");
			char c = scan.next().charAt(0);
			if (c == 'n')
				break;

		}
	}

	public void menu() {
		System.out.println("--------Menu--------");
		System.out.println("1.단어추가 | 2.단어출력 | 3.종료");
		System.out.println("--------------------");
	}

	public void print() {
		int cnt = 1;
		for (String s : words.keySet()) {
			System.out.print(cnt + ".단어:" + s + " 뜻:");
			for (int i = 0; i < words.get(s).size(); i++) {
				System.out.print(words.get(s).get(i) + " ");
			}
			System.out.println();
			cnt++;
		}
	}

}