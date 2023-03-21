package day10;

public class EzenComputer {
	/*기본정보 - 이름, 생년월일, 나이, 전화번호
	 * 학원정보 - 학원이름 = ezen, 지점
	 * 수강정보 - 수강과목, 기간
	 * 한명이 여러 과목 수강가능
	 * 과목, 기간 => 배열 5개
	 * 
	 * 기본정보 출력
	 * 학원정보 출력
	 * 수강정보 출력
	 * 수강정보 추가하는 기능
	 * */
	private final static String aName="Ezen";
	private String name,birth,age,phone;
	private String location;
	private String[] classs=new String[5];
	private int[] day=new int[5];
	public int cnt=0;
	public int count=0;
	
	public EzenComputer(String location,String name, String birth, String age, String phone) {
		this.name=name;
		this.birth=birth;
		this.age=age;
		this.phone=phone;
		this.location=location;
	}
	public EzenComputer(String name, String phone,String location) {
		this.name=name;
		this.phone=phone;
		this.location=location;
	}
	public void input(String classs, int day) {
		this.classs[cnt]=classs;
		this.day[cnt]=day;
		cnt++;
		if(cnt==4)
			System.out.println("장바구니 FULL");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBarth() {
		return birth;
	}
	public void setBarth(String barth) {
		this.birth = birth;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String[] getClasss() {
		return classs;
	}
	public int[] getDay() {
		return day;
	}
	
	public void printA() {
		System.out.println("이름:"+name+" 생년월일:"+birth+" 나이:"+age+" 전화번호:"+phone);
		System.out.println("학원:"+aName+" 지점:"+location);
		for(int i=0;i<cnt;i++)
		System.out.println("수강과목:"+classs[i]+" 기간:"+day[i]);
	}
}
