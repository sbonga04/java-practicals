package run;

public class car {
	private String name;
	private int price;
	private String type;
	
	car(String name,int price,String type){
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getType() {
		return type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setType(String type) {
		this.type = type;
	
	}
}


