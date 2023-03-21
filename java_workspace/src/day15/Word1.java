package day15;

import java.util.*;

public class Word1 {
	private String word;
	private ArrayList<String>mean=new ArrayList<>();
	
	public Word1() {}
	public Word1(String word, String mean) {
		this.word=word;
		this.mean.add(mean);
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}

	public ArrayList<String> getMean() {
		return mean;
	}
	public void setMean(ArrayList<String> mean) {
		this.mean = mean;
	}
	@Override
	public String toString() {
		return "[단어:" + word + ", 뜻" + mean + "]";
	}
	
}
