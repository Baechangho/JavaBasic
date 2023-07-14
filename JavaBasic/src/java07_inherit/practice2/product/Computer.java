package java07_inherit.practice2.product;

public class Computer extends Product {

	private String model;
	private int price;
	
	public Computer(String model, int price) {
		super(model,price);
	}
	@Override
	public void out() {
		System.out.println("Computer");
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}


//class Computer
//---------------
//- model : String
//- price : int
//---------------
//<<constructor>>
//+ Computer(String, int)
//
//<< method >>
//+ out() : void {override}
//  --> "Computer" 라고 출력
//
//<<getter>>
//+ getModel() : String
//+ getPrice() : int
//
//<<setter>>
//+ setModel(String) : void
//+ setPrice(int) : void




//
//class Computer extends Product
//---------------
//---------------
//<<constructor>>
//+ Computer(String, int)
//
//<< method >>
//+ out() : void {override}
//  --> "Computer" 라고 출력