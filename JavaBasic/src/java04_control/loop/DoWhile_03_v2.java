package java04_control.loop;

import java.util.Scanner;

public class DoWhile_03_v2 {

	public static void main(String[] args) {

		//숫자를 입력하고 그 값들의 총합을 구하고 최종값을 출력하는 프로그램
		
		// -> 숫자 0을 입력하면 종료
		
		// ->while 구문 활용
//		Scanner sc = new Scanner(System.in);
//		int num;
//		int sum = 0;
//		do{
//			System.out.print("숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			sum += num;
//		}while(num != 0);
//		System.out.println("총합 : "+sum);
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			sum += num;
			if (num == 0) {
				break;		//반복문 중단
			}
		}
		System.out.println("총합 : "+sum);
	}
}
