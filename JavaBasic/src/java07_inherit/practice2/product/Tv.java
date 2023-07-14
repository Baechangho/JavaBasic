package java07_inherit.practice2.product;

public class Tv extends Product {
	private String model;
	private int price;
	
	public Tv(String model, int price) {
		super(model,price);
	}
	@Override
	public void out() {
		System.out.println("TV");
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


//class Tv
//---------------
//- model : String
//- price : int
//---------------
//<<constructor>>
//+ Tv(String, int)
//
//<< method >>
//+ out() : void {override}
//  --> "TV" 라고 출력
//
//<<getter>>
//+ getModel() : String
//+ getPrice() : int
//
//<<setter>>
//+ setModel(String) : void
//+ setPrice(int) : void




//class Tv extends Product
//---------------
//---------------
//<<constructor>>
//+ Tv(String, int)
//
//<< method >>
//+ out() : void {override}
//  --> "TV" 라고 출력