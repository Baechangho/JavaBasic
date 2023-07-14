package java04_control.selection;

public class RunMenu {
	
	public void printHello() {
		System.out.println("Hello World");
	}
	
	public void printName() {
		System.out.println("배창호");
	}
	
	public void printGender() {
		System.out.println("남");
	}

	public void printBye() {
		System.out.println("종료");
	}
	
	public void printMenu() {
		System.out.println("================================");
		System.out.println("\tM  e  n  u					");
		System.out.println("================================");
		System.out.println("\t1. Hello World 출력			");
		System.out.println("\t2. 이름 출력					");
		System.out.println("\t3. 성별 출력					");
		System.out.println("\t4. 종료						");
		System.out.println("================================");
		System.out.println();
		System.out.print("\t>> ");
	}
	
	public void printErr() {
		System.out.println("잘못 입력하였습니다");
	}
	
}
