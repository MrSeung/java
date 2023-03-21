package day11;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer[] cl=new Customer[5];
		Customer c=new Customer(1,"홍길동");
		Customer g=new Gold(2,"길동홍");
		Customer v=new Vip(3,"홍길순");
		
		//다운캐스팅
		
		
		cl[0]=c;
		cl[1]=g;
		cl[2]=v;
		c.calcPrice(100000);
		c.customerInfo();
		
		g.calcPrice(0);
		g.customerInfo();
		
		int cost=v.calcPrice(100000);
		v.customerInfo();
		System.out.println("지불할 금액:"+cost);
		
		
	}
}
