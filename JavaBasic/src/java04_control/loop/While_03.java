package java04_control.loop;

public class While_03 {

	public static void main(String[] args) {
		
//		for(int dan = 2; dan <= 9; dan++) {
//			
//			for(int i = 1; i <= 9; i++) {
//				
//				System.out.println(dan + " x " + i + " = " + (dan*i));
//				
//			}
//			
//			System.out.println("-------------------");
//			
//		}
//		
		
		
		//while문을 이용한 구구단 출력
		// -> 2~9단 전부 출력
		int dan = 2;
		int i = 0;
		while(dan < 10) {
			System.out.print(dan + "x" + (i+1) + "=" + dan * (i+1) + "\t");
			i ++;
			if(i == 9) {
				i = 0;
				dan += 1;
				System.out.println();
			}	
		}
		
//		int dan = 2;
//		while(dan <= 9) {
//			int i = 1;
//			while(i <= 9) {
//				System.out.print(dan + "x" + (i+1) + "=" + dan * (i+1) + "\t");
//				
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
	}
}
