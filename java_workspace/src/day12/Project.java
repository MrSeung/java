package day12;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv=new TV();
		tv.turnOn();
		tv.channelUp();
		tv.channelDown();
		tv.volDown();
		tv.print();
		
	}

}
interface remocon{
	void turnOn();
	void turnOff();
	void channelUp();
	void channelDown();
	void volUp();
	void volDown();
}

class TV implements remocon {
	int ch=0;
	int vol=0;
	boolean b=false;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV가 켜졌습니다.");
		b=true;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV가 꺼졌습니다.");
		b=false;
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		if(b) {
			ch++;
			if(ch>10)
				ch=0;
		}
		else
			System.out.println("TV를 켜주세요");
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		if(b) {
			ch--;
			if(ch<0)
				ch=10;
		}
		else
			System.out.println("TV를 켜주세요");
	}

	@Override
	public void volUp() {
		// TODO Auto-generated method stub
		if(b) {
			vol++;
			if(vol>=20) {
				System.out.println("20이 최대볼륨입니다.");
				vol=20;
		}
		}
		else
			System.out.println("TV를 켜주세요");
	}

	@Override
	public void volDown() {
		// TODO Auto-generated method stub
		if(b) {
			vol--;
			if(vol<=0) {
				System.out.println("음소거");
				vol=0;
		}
		}
		else
			System.out.println("TV를 켜주세요");
	}
	public void print() {
		System.out.println("채널 "+ch+" 볼륨 "+vol);
	}
	
}