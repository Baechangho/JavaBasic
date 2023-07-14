package java06_class.variable;

public class ClassVariable_01 {

	//멤버 필드
	private int num;
	
	//이렇게 해봤자 공간이 안만들어진다 ->new할때 생성예약
	private String name = "Alice";
	
	public ClassVariable_01() {
		num = 999;//이렇게 넣는것, 위에 alice넣는것 둘다 동일 코드
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
