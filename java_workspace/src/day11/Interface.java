package day11;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*추상메서드
		 * abstract 리턴타입 메서드명(매개변수);
		 * 부모 클래스에서 상송 받았을 때 특정 메서드가 자식 클래스에 자주 오버라이딩 될 때 해당 메서드를 추상 메서드로 작성
		 * 상속 받은 클래스에서는 추상메서드가 있다면 반드시 구현해야됨.
		 * 
		 * 인터페이스
		 * 상수와 추상메서드만으로 구성
		 * 키워드 : interface
		 * 기능요약서
		 * 자체적으로는 사용할 수 없고, 인터페이스를 구현한 클래스로 활용
		 * 구현 : implements
		 * 인터페이스는 멤버변수가 없음. 항상 이 부분을 염두에 두고 메서드 정리를 해야 함.
		 * */
		/*A a=new A();
		a.turnOff();
		a.turnOn();
		a.ch=100;
		a.chUp();
		a.chDown();
		a.chDown();*/
		
		Cat c=new Cat();
		c.setName("고양이");
		c.setCategory("고양이과");
		c.printInfo();
		c.howl();
		
		Dog d=new Dog();
		d.setName("강아지");
		d.setCategory("개과");
		d.printInfo();
		d.howl();
		
	}
}

/*interface Power{
	 void turnOn();
	 void turnOff();
}
interface Remocon{
	abstract void chUp();
	abstract void chDown();
}
class A implements Power,Remocon{
	int ch=0;
	boolean power=true;

	@Override
	public void chUp() {
		// TODO Auto-generated method stub
		ch++;
		if(ch>100)
			ch=1;
		System.out.println(ch);
	}

	@Override
	public void chDown() {
		// TODO Auto-generated method stub
		ch--;
		if(ch<0)
			ch=100;
		System.out.println(ch);
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		power=true;
		System.out.println("전원이 켜졌습니다.");
	}

	@Override
	public void turnOff(){
		// TODO Auto-generated method stub
		power=false;
		System.out.println("전원이 꺼졌습니다.");
	}
	
}*/

abstract class Animal{
	private String name;
	private String category;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void printInfo() {
		System.out.println("----------");
		System.out.println("이름:"+name);
		System.out.println("분류:"+category);
	}
	abstract public void howl();
}

class Cat extends Animal{
	
	@Override
	public void howl() {
		// TODO Auto-generated method stub
		System.out.println("야옹~");
	}
	
}
class Dog extends Animal{

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		System.out.println("멍멍!");
	}
}