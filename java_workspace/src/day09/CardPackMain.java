package day09;

public class CardPackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c=new Card();
		
		CardPack cp=new CardPack();
		
		a : for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c=cp.pick();
				if(c!=null)
					c.print();
				else {
					System.out.println("카드가 없습니다.");
					break a;
				}
			}
		System.out.println();
		}
		a : for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c=cp.pick();
				if(c!=null)
					c.print();
				else {
					System.out.println("카드가 없습니다.");
					break a;
			}
			}
		System.out.println();
		}
		System.out.println("--------------------------");
		cp.init();
		cp.shuffle();
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c=cp.pick();
				c.print();
			}
		System.out.println();
		}
	}
}
