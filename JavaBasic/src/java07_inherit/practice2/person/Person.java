//package java07_inherit.practice2.person;
//
//import java07_inherit.practice2.product.Computer;
//import java07_inherit.practice2.product.Product;
//import java07_inherit.practice2.product.Tv;
//
//public class Person {
//	private String name;
//	private int money;
//	Product prod = new Product(name, money);
//	
//	public Person(String name, int money) {
//		this.name = name;
//		this.money = money;
//	}
//	public void buy(prod) {
//		name = getName();
//		money = getMoney();
//		prod.
//		setMoney(money-price);
//		////물건가격만큼 money를 차감한다
//		//
//		////진행상황을 출력한다
//		//
//		//ex)
//		//Alice님이 500원을 지불하고 i5 구매함
//		//[잔액] 0원
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getMoney() {
//		return money;
//	}
//
//	public void setMoney(int money) {
//		this.money = money;
//	}
//	
//}
//
//
//
////class Person
////---------------
////- name : String
////- money : int
////- prod : Product
////---------------
////<<constructor>>
////+ Person(String, int)
////  -> name, money
////
////<<method>>
////+ buy(Product) : void
////
//////전달인자로 받은 Product를
//////멤버필드에 저장하고
////
//////물건가격만큼 money를 차감한다
////
//////진행상황을 출력한다
////
////ex)
////Alice님이 500원을 지불하고 i5 구매함
////[잔액] 0원
////
////
////<<getter>>
////+ getName() : String
////+ getMoney() : int
////<<setter>>
////+ setName(String) : void
////+ setMoney(int) : void