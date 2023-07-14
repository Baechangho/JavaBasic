package java04_control.loop;

public class For_10 {
	public static void main(String[] args) {
		
		//quiz 2~9단 구구단 출력
		
//		for (int i = 2; i <=9; i++) {
//			System.out.println("-----" + i + "단-----");
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " x " + j + " = " + i*j);
//			}
//		}
		
		//1. 바깥쪽 for문
		//2~9단 반복
		
		//dan, 2~9, x8
		
		//2. 안쪽 for문
		//각 단수에 맞는 구구단 반복
		
		//i, 1~9, x9
		
		for(int dan = 2; dan <= 9; dan++) {
			
			for(int i = 1; i <= 9; i++) {
				
				System.out.println(dan + " x " + i + " = " + (dan*i));
				
			}
			
			System.out.println("-------------------");
			
		}
		
	}
}