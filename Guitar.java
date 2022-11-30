package guitars;


public class Guitar extends instrument {

private String type;

public Guitar(int price, String company, String type) {
	super(price,company);
	this.type = type;	
}

@Override
public String toString() {
	return "Guitar:"+ code + "[price=" + price + ", company=" + company + ", type=" + type +  "]";
}





public String getType() {
	return type;
}
public void setType(String type) {
	this.type=type;
}

public int getCode() {
	return code;
}


}
