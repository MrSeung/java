package day11;

public class Vip extends Customer{
	public Vip(int customerId,String customerName) {
		customerGrade="VIP";
		bonusRatio=0.05;
		this.customerId=customerId;
		this.customerName=customerName;
	}
	public int calcPrice(int price) {
		bonusPoint+=(int)(price*bonusRatio);
		price=(int)(price*0.9)
				;
		return price;
	}
	public void customerInfo() {
		System.out.printf("%s님의 등급은 %s이며, 보너스포인트는 %d 입니다.(담당자:%s)\n",customerName,customerGrade,bonusPoint,"이순신");
	}
}
