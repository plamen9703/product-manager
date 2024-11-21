package store.inventory;
public class Product {
	private String name;
	private double price;
	private int amount;
	
	public Product() {
		this("chips", 2.5, 10);
	}
	public Product(String name, double price, int amount) {
		setName(name);
		setPrice(price);
		setAmount(amount);
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	public int getAmount() {
		return amount;
	}
	public void setName(String name) {
		if(name!=null && name.isEmpty()==false)
			this.name=name;
	}
	
	public void setPrice(double price) {
		if(price>0)
			this.price=price;
	}
	public void setAmount(int amount) {
		if(amount>0) {
			this.amount=amount;
		}
	}
}
