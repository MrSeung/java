package day10;

class Animal{
	private String name;
	private String category;
	
	public Animal() {}
	public Animal(String name, String category) {
		this.name=name;
		this.category=category;
	}
	public void how1() {
		System.out.println("=="+name+" 울음소리==");
	}
	public void info() {
		System.out.println("이름:"+name);
		System.out.println("분류:"+category);
	}
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
	
}
class Dog extends Animal{
	public Dog() {
		setName("강아지");
		setCategory("개과");
	}

	@Override
	public void how1() {
		// TODO Auto-generated method stub
		super.how1();
		System.out.println("멍멍!");
	}
	
}
class Cat extends Animal{
	public Cat(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}

	@Override
	public void how1() {
		// TODO Auto-generated method stub
		super.how1();
		System.out.println("야옹~");
	}
	
}
class Tiger extends Animal{
	public Tiger() {
		setName("호랑이");
		setCategory("고양이과");
	}

	@Override
	public void how1() {
		// TODO Auto-generated method stub
		super.how1();
		System.out.println("어흥!");
	}
	
}
public class Extend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t=new Tiger();
		t.info();
		t.how1();
	}

}
