package day11;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*객체지향프로그램의 4가지 특징
		 * 추상화(Abstraction) - 핵심적인 코드만 보여줌
		 * 인터페이스와 구현을 분리한다.
		 * 불필요한 부분은 숨긴다.
		 * 
		 * 캡슐화(encapsulation) - 데이터 보호(정보은닉)
		 * 멤버변수(필드)와 메서드를 하나로 묶는 것
		 * 멤버변수(필드)는 숨기고 메서드로 접근 ->getter/setter
		 * 은닉화:외부에서 데이터를 직접 접근하는 것을 방지
		 * 
		 * 상속(inheritance) - 코드 재사용
		 * 클래스를 상속받아 수정하여 사용하게 되면 중복 코드를 줄일 수 있다.
		 * 
		 * 다형성(polymorphism) - 객체 변경 용이
		 * */
		Animal1 hA=new Human();
		Animal1 tA=new Tiger();
		Animal1 eA=new Eagle();
		Animal1[] list=new Animal1[3];
		
		list[0]=hA;
		list[1]=tA;
		list[2]=eA;
		
		downCasting(list);
		
		//
		
	}
	static public void moveAnimal(Animal1 a) {
		a.move();
	}
	static public void downCasting(Animal1[] list) {
		for(Animal1 tmp : list) {
			//객체명 instanceof 클래스명
			if(tmp instanceof Human) {
				Human human=(Human)tmp;
				human.read();
			}
			else if(tmp instanceof Tiger) {
				Tiger tiger=(Tiger)tmp;
				tiger.smoke();
			}
			else {
				Eagle eagle=(Eagle)tmp;
				eagle.call();
			}
		}
	}
}
class Animal1{
	public void move() {
		System.out.println("동물들이 움직입니다.");
	}
}

class Human extends Animal1{
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
	public void read() {
		System.out.println("사람이 공부를 합니다.");
	}
}

class Tiger extends Animal1{
	public void move() {
		System.out.println("호랑이가 움직입니다.");
	}
	public void smoke() {
		System.out.println("호랑이가 담배를 핍니다.");
	}
}
class Eagle extends Animal1{
	public void move() {
		System.out.println("독수리가 움직입니다.");
	}
	public void call() {
		System.out.println("독수리가 오형제를 불렀습니다.");
	}
}