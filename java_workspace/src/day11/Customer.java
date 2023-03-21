package day11;

public class Customer {
	protected String customerName,customerGrade;
	protected int customerId;
	int bonusPoint;
	double bonusRatio;

	public Customer() {}
	public Customer(int customerId,String customerName) {
		customerGrade="Silver";
		bonusRatio=0.01;
		this.customerId=customerId;
		this.customerName=customerName;
	}
	
	public int calcPrice(int price) {
		bonusPoint+=(int)(price*bonusRatio);
		return price;
	}
	
	public void customerInfo() {
		System.out.printf("%s님의 등급은 %s이며, 보너스포인트는 %d 입니다.\n",customerName,customerGrade,bonusPoint);
	}
	
}
