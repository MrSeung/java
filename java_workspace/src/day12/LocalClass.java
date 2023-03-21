package day12;

public class LocalClass {
	/*내부클래스
	 * 내부적으로 활용할 목적으로 만드는 클래스이기 때문에 private으로 선언하는 것을 권장
	 * 내부 클래스 생성시기: 외부클래스가 생성된 후 생성됨.(static은 다름)
	 * private이 아닌 내부 클래스는 다른 외부클래스에서 생성할 수 있음.
	 * */
	
	/*익명클래스 : 이름이 없는 클래스
	 * 인터페이스를 이용하여 객체를 만들 때 클래스 없이 바로 구현
	 * 익명클래스를 사용하는 이유
	 * 인터페이스의 기능이 적고, 해당 객체가 하나만 필요한 경우
	 * 메서드의 매개변수로 주로 사용.
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Outclass out=new Outclass();
		out.usingClass();
		
		Outclass.Inclass in=out. new Inclass();
		
		Outclass.InStaticClass.sTest();
		Outclass.InStaticClass sIn=new Outclass.InStaticClass();*/
		
		/*Outer out=new Outer();
		Runnable runner=out.getRunnable(10);
		runner.run();*/
		product(new Power() {
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("TV ON!");
			}
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("TV OFF!");
			}
		});
		
	}
	public static void product(Power p) {
		p.turnOff();
		p.turnOn();
	}

}
interface Power{
	void turnOn();
	void turnOff();
}
/*class Tv implements Power{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV ON!");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV OFF!");
	}
	
}*/

/*class Outer{
	int outNum=10;
	static int sNum=20;
	Runnable getRunnable(int i) {
		//매개변수와 지역변수는 값이 들어올때 final로 변경되서 들어옴.
		int num=10;
		class MyRunnable implements Runnable{
			int localNum=1000;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("매개변수 : "+i);
			System.out.println("메서드 안 매개변수 : "+num);
			System.out.println("메서드 안 매개변수 : "+localNum);
			System.out.println("메서드 안 매개변수 : "+localNum);
			System.out.println("메서드 안 매개변수 : "+localNum);
			
		}
		
	}
	return new MyRunnable();
	}
}*/

/*class Outclass{
	private int num;
	private static int sNum=20;
	private Inclass in;
	
	public Outclass() {
		in=new Inclass();
	}
	class Inclass{
		int inNum=100;
		void inClassprint() {
			System.out.println("OutClass Num="+num+"(외부클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum="+sNum+"(외부클래스의 static 변수)");
			System.out.println("InClass inNum="+inNum+"(내부클래스의 인스턴스 변수)");
		}
	}
	public void usingClass() {
		in.inClassprint();
	}
	static class InStaticClass{
		int inNum=1000;
		static int sInNum=2000;

		void inTest() {
			//System.out.println("OutClass Num="+num+"(외부클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum="+sNum+"(외부클래스의 static 변수)");
			System.out.println("InClass inNum="+inNum+"(내부클래스의 인스턴스 변수)");
		}
		static void sTest() {
			//System.out.println("OutClass Num="+num+"(외부클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum="+sNum+"(외부클래스의 static 변수)");
			//System.out.println("InClass inNum="+inNum+"(내부클래스의 인스턴스 변수)");
		}
	}	
}*/