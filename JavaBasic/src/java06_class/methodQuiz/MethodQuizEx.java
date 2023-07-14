package java06_class.methodQuiz;

public class MethodQuizEx {
	public static void main(String[] args) {
		//1~100 출력 기능
		//전달인자만큼 Hello를 반복해서 출력하는 기능
		//전달인자 숫자만큼, 전달인자 문자열을 출력하는 기능
		MethodQuiz mq = new MethodQuiz();
		
		mq.loop();
		mq.printHello(3);
		mq.printString(2, "hi");
		
	}
}
