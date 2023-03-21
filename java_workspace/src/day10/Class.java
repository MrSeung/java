/*class Car{
	private String color;
	private boolean door,airback,power;
	public boolean isAirback() {
		return airback;
	}
	public void setAirback(boolean airback) {
		this.airback = airback;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power=power;
	}
	public void setDoor(boolean door) {
		this.door = door;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public boolean isDoor() {
		return door;
	}
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", door=" + door + ", airback=" + airback + ", power=" + power + "]";
	}
	public Car() {
		color="Red";
		door=false;
		airback=false;
		power=true;
	}
	public Car(String color) {
		this.color=color;
	}
	public Car(String color, boolean door) {
		this.color=color;
		this.door=door;
	}
	public Car(String color, boolean door,boolean airback) {
		this.color=color;
		this.door=door;
		this.airback=airback;
	}
	public Car(String color, boolean door,boolean airback,boolean power) {
		this.color=color;
		this.door=door;
		this.airback=airback;
		this.power=power;
	}
	
	
	public void print() {
		System.out.println("색깔 : "+color);
		System.out.println(airback?"airback IN":"airback OUT");
		System.out.println(door?"door OPEN":"door CLOSE");
		System.out.println(power?"power IN":"power OUT");
	}
	public void powerOn() {
		power=true;
		System.out.println("전원이 켜졌습니다.");
		
	}
	public void powerOff() {
		power=false;
		System.out.println("전원이 꺼졌습니다.");
	}
}*/
package day10;

class EzenStudent{
	private final static String location="Ezen";
	private String name,classs,phone;
	
	public EzenStudent() {
		classs="자바 웹 개발";
		name="홍길동";
		phone="01012341234";
	}
	public EzenStudent(String location,String classs, String name, String phone) {

		this.classs=classs;
		this.name=name;
		this.phone=phone;
	}

	public String getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClasss() {
		return classs;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	@Override
	public String toString() {
		return "EzenStudent [location=" + location + ", name=" + name + ", classs=" + classs + ", phone=" + phone + "]";
	}
	
	public void print() {
		System.out.println("지점 : "+location);
		System.out.println("반 : "+classs);
		System.out.println("이름 : "+name);
		System.out.println("전화번호 : "+phone);
	}
	
}

public class Class {

	public static void main(String[] args) {
		
		EzenStudent ez=new EzenStudent();
		ez.print();
		EzenStudent ez1=new EzenStudent("강남","c언어","길동홍","01098765432");
		System.out.println(ez1.toString());

	}

}

