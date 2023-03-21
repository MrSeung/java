package day11;

public class Gold extends Customer{

	public Gold(int customerId,String customerName) {
		//super(customerId, customerName );
		customerGrade="Gold";
		bonusRatio=0.02;
		this.customerId=customerId;
		this.customerName=customerName;
	}
	public int calcPrice(int price) {
		bonusPoint+=(int)(price*bonusRatio);
		price=(int)(price*0.9);
		return price;
	}
}
