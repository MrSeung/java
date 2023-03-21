package day15;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordManager {
	private ArrayList<Word> wList=new ArrayList<>();
	Scanner scan=new Scanner(System.in);
	
	public WordManager() {
		wList.add(new Word("dog","강아지"));
		wList.add(new Word("cat","고양이"));
		wList.add(new Word("apple","사과"));
		wList.add(new Word("book","책"));
	}
	
	public void mPrint() {
		System.out.println("--------------Menu--------------");
		System.out.println("1.단어추가 | 2.단어출력 | 3.단어검색");
		System.out.println("4.단어수정 | 5.단어삭제 | 6.파일출력 | 7.종료");
		System.out.println("--------------------------------");
		System.out.print("[메뉴] >> ");
	}
	
	
	public void add() {
		
		System.out.print("[추가] 단어>> ");
		String word=scan.next();
		System.out.print("[추가] 뜻>> ");
		String mean=scan.next();
		
		wList.add(new Word(word,mean));
	}
	
	public void print() {
		Collections.sort(wList);
		for(Word w:wList) {
			System.out.println(w);
		}
	}
	
	public void search() {
		System.out.print("[검색] 단어>> ");
		String word=scan.next();
		boolean flag=true;
		
		for(Word w:wList) {
			if(w.getWord().equals(word)) {
				System.out.println(w);
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("존재하지않는 단어입니다.");
			return;
		}
		
	}
	
	public void modify() {
		System.out.print("[수정] 단어>> ");
		String word=scan.next();
		boolean flag=true;
		
		for(Word w:wList) {
			if(w.getWord().equals(word)) {
				System.out.print("[수정] 뜻>> ");
				String mean=scan.next();
				w.setMean(mean);
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("존재하지않는 단어입니다.");
			return;
		}
	}
	
	public void delete() {
		System.out.print("[삭제] 단어>> ");
		String word=scan.next();
		boolean flag=true;
		
		for(int i=0;i<wList.size();i++) {
			if(wList.get(i).getWord().equals(word)) {
				wList.remove(i);
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("존재하지않는 단어입니다.");
			return;
		}
	}
	
	public void filePrint() throws IOException {
		PrintWriter pw=new PrintWriter("word.txt");
		Collections.sort(wList);
		for(Word w:wList) {
			pw.println(w);
		}
		if(pw!=null) {
			pw.close(); //if문으로 수정해보기.			
		}
	}
}
