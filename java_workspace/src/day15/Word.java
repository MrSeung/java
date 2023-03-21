package day15;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Word implements Comparable<Word> {
	private String word;
	private String mean;

	public Word() {
	}

	public Word(String word, String mean) {
		this.word = word;
		this.mean = mean;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	@Override
	public String toString() {
		return "[단어:" + word + ", 뜻:" + mean + "]";
	}

	@Override
	public int compareTo(Word o) {

		return this.word.compareTo(o.word);
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(mean, word);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Word other = (Word) obj;
//		if (word == null) {
//			if (other.word != null)
//				return false;			
//		}else if (!word.equals(other.word))
//			return false;
//		return true;
//	}

}
