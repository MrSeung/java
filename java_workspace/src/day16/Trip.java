package day16;

public class Trip {
	private String name;
	private int age,price;
	
	public Trip() {}
	public Trip(String name, int age, int price) {
		this.age=age;
		this.name=name;
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
