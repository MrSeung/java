package product;

public class Product {
	private String menu;
	private int price,num,sum;
	
	public Product() {}
	
	public Product(String menu, int price) {
		this.menu=menu;
		this.price=price;
	}
	public Product(String menu,int num, int sum) {
		this.menu=menu;
		this.num=num;
		this.sum=sum;
	}
	
	//getter setter
	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
}
