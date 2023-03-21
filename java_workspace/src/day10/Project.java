package day10;
class Product{
	private String pName;
	private int price;
	
	public Product() {
		pName="";
		price=0;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void insertProduct(String pName, int price) {
		this.pName=pName;
		this.price=price;
	}

	@Override
	public String toString() {
		return "상품LIST [상품=" + pName + ", 가격=" + price + "]";
	}
	
}

public class Project {
	
}
