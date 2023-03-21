package day18;

class Bank {
	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public synchronized void saveMoney(int save) {
		// synchronized : 어떤 객체가 saveMoney에 접근하면 다른 객체는 Bank에 접근하지 못하게 막음.
		
		int m=this.money;
		m=m+save;
		try{
		    Thread.sleep(1000);
		}catch(InterruptedException e){
		    e.printStackTrace();
		}
		setMoney(m);
	}

	public synchronized void minusMoney(int minus) {
		int m = this.money;
		m=m-minus;
		try{
		    Thread.sleep(1000);
		}catch(InterruptedException e){
		    e.printStackTrace();
		}
		setMoney(m);

	}
}

class Hong extends Thread {
	public void run() {
		System.out.println("입금시작!");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("3천원 입금 -> "+SyncMain.myBank.getMoney());
	}
}

class HongWife extends Thread {
	public void run() {
		System.out.println("출금시작!");
		SyncMain.myBank.minusMoney(1000);
		System.out.println("1천원 출금 -> "+SyncMain.myBank.getMoney());
	}
}

public class SyncMain {
	public static Bank myBank = new Bank();
	
	public static void main(String[]args) {
		Hong h=new Hong();
		h.start();
		
		HongWife hw=new HongWife();
		hw.start();
	}
}
