package java04_control.condition;

import java.util.Scanner;

public class IfQuiz {
	public static void main(String[] args) {
//	 + 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
//		>> Input Number : -3
//		>> 음수입니다
//
//	 + 입력한 데이터가 3의 배수인지 판별하시오
//	  (% 연산자 사용)
//		>> Input Number : 7
//		>> 3의 배수가 아닙니다
//
//	 + 두 수를 입력 받아 큰 수를 출력하시오
//		>> Input Number1 : 44
//		>> Input Number2 : 88
//		>> 88 이 더 큰 수
		System.out.print("Input Number : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		if (num1 >= 0) {
			System.out.println("양수입니다");
		}else {			
			System.out.println("음수입니다");
		}
		
		System.out.print("Input Number : ");
		int num2 = sc.nextInt();
		if (num2 % 3 == 0) {
			System.out.println("3의 배수입니다");
		}else {			
			System.out.println("3의 배수가 아닙니다");
		}
		
		
		System.out.print("Input Number : ");
		int num3 = sc.nextInt();
		System.out.print("Input Number : ");
		int num4 = sc.nextInt();
		if (num3 < num4) {
			System.out.println(num4 + "이 더 큰 수");
		}else if(num3 > num4) {			
			System.out.println(num3 + "이 더 큰 수");
		}else {
			System.out.println("둘이 같습니다");
		}
	}
}
