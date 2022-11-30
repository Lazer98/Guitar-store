package guitars;

public class instrument {
	protected int price;
	protected String company;
	protected int code;
	static int count=1000;
	
	
	public instrument(int price, String company) {
		this.price = price;
		this.company = company;
		this.code = count;
		count++;
	} 
	
	
}
