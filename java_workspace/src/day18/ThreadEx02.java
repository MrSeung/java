package day18;

public class ThreadEx02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread2 mth = new MyThread2();
		Thread th1=new Thread(mth);
		th1.start();
		
		//thread 끝날 때 까지 뒤에 있는 동작은 중지.
		th1.join();
		
		Thread th2=new Thread(new MyThread2());
		th2.start();
		
		th2.join();
		
		System.out.println("main end");
	}

}

class MyThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
			System.out.println(i+" ");
	}
	
}