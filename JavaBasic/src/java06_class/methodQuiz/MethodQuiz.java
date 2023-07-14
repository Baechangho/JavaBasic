package java06_class.methodQuiz;

public class MethodQuiz {
	public void loop() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i + 1);
		}
	}
	
	public void printHello(int num) {
		for(int i = 0; i < num; i++) {
			System.out.println("Hello");
		}
	}
	
	public void printString(int num, String s) {
		for(int i = 0; i < num; i++) {
			System.out.println(s);
		}
	}
	
}
