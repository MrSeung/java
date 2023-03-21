package day09;

class Card {
	private char shape;
	private int n;
	
	public Card() {
		this.shape='♥';
		this.n=1;
	}
	
	public void setShape(char shape) {
		switch(shape) {
		case '♥' :break;
		case '♠' :break;
		case '♣' :break;
		case '◆' :break;
		default:
			shape='♥';
		}
		this.shape=shape;
	}
	
	public char getShape() {
		return shape;
	}
	public void setN(int n) {
		if(n>13||n<0)
			this.n=1;
		else
			this.n=n;
	}
	public int getN() {
		return n;
	}
	
	public void print() {
		switch(n) {
		case 11 :
			System.out.print('J');
			break;
		case 12 :
			System.out.print('Q');
			break;
		case 13 :
			System.out.print('K');
			break;
			default :
				System.out.print(n);
		}
		System.out.print(shape+" ");
		
	}
		
	
}

public class Card_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
