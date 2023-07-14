package java04_control.loop;

public class For_06 {
	public static void main(String[] args) {
		//구구단 2단을 출력하기
		
		//반복하면서 수행할 작업(코드) : i값의 출력, i+2값의 출력
		
		int j;
		for (int i = 0; i < 9; i++) {
			j = i+1;
			System.out.println("2 x "+ j + " = " + j*2);
			
		}
	}
}