package day09;

public class CardPack {
	/*카드 섞기
	 * 한장 선택
	 * 카드 초기화
	 * 출력 - card클래스에서 가져옴
	 * 생성자에서 52장의 카드를 생성
	 * 내가 만든 배열은 카드의 배열??
	 */
	private Card[] pack=new Card[52]; //카드 팩 배열
	private int cnt=0; // 카드가 남은 개수
	
	
	//카드 섞기 기능
	public void shuffle() {	 
		//int ran=(int)Math.random()*pack.length;
		for(int i=0;i<pack.length;i++) {
			int ran=(int)(Math.random()*pack.length);
			Card tmp=pack[i];
			pack[i]=pack[ran];
			pack[ran]=tmp;
		}
	}
	public Card pick() {
		if(cnt==0)
			return null;
		else
			cnt--;	
		
		return pack[cnt];
	}
	public void init() {
		cnt=52;
		
		//섞인거 정리
		/*char shape='♥';
		for(int i=1;i<=4;i++) {
			switch(i) {
			case 1 : shape='♥'; break;
			case 2 : shape='♠'; break;
			case 3 : shape='◆'; break;
			case 4 : shape='♣'; break;
			}
			for(int j=1;j<=13;j++) {
				Card c=new Card();
				c.setShape(shape);
				c.setN(j);
				pack[cnt]=c;
				cnt++;
			}
		}*/
	}
	
	public CardPack() {
		//♥ ♠ ◆ ♣
		char shape='♥';
		for(int i=1;i<=4;i++) {
			switch(i) {
			case 1 : shape='♥'; break;
			case 2 : shape='♠'; break;
			case 3 : shape='◆'; break;
			case 4 : shape='♣'; break;
			}
			for(int j=1;j<=13;j++) {
				Card c=new Card();
				c.setShape(shape);
				c.setN(j);
				pack[cnt]=c;
				cnt++;
			}
		}
	}
}
