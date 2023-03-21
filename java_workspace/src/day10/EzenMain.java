package day10;

public class EzenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EzenComputer ez=new EzenComputer("인천","홍길동","991212","15","010789456123");
		//ez=new EzenComputer("자바",6);
		ez.input("자바", 6);
		ez.input("C언어", 6);
		ez.input("C++", 6);
		ez.input("HTML", 6);
		ez.input("SPRING", 6);
		//ez.input("BOOT", 6);
		ez.printA();
		
		EzenComputer[] std=new EzenComputer[5];
		std[0]=new EzenComputer("홍길동","010-1234-1234","인천");
		std[1]=new EzenComputer("홍길순","010-1244-1234","이천");
		std[2]=new EzenComputer("홍누리","010-1444-1234","인천");
		std[3]=new EzenComputer("홍세리","010-1334-1234","서울");
		std[4]=new EzenComputer("홍길동","010-1334-1234","서촌");	
		String searchName= "홍길동";
		String searchBranch="인천";
		
		for(int i=0;i<std.length;i++) {
			if(std[i].getName().equals(searchName))
				std[i].printA();
		}
		for(int i=0;i<std.length;i++) {
			if(std[i].getLocation().equals(searchBranch))
				std[i].printA();
		}
	}

}
