package guitars;

public class drums extends instrument{
private int toolSet;
	public drums(int price, String company,int toolSet) {
		super(price, company);
		this.setToolSet(toolSet);	
		}
	public int getToolSet() {
		return toolSet;
	}
	public void setToolSet(int toolSet) {
		this.toolSet = toolSet;
	}

	public int getCode() {
		return code;
	}
	@Override
	public String toString() {
		return "drums [toolSet=" + toolSet + ", price=" + price + ", company=" + company + ", code=" + code + "]";
	}
	
	
	
}
