package java04_control.loop;

import java.util.Scanner;

public class DoWhile_02 {

	public static void main(String[] args) {

		//DoWhile 사용 예시
		
		//메뉴 만들기
		
		//1. 사용자 정보 입력
		//2. 사용자 검색
		//3. 전체 사용자 출력
		//4. 종료
		
		Scanner sc = new Scanner(System.in);
		int menu_num;
		do{
			System.out.println("1. 사용자 정보 입력");
			System.out.println("2. 사용자 검색");
			System.out.println("3. 전체 사용자 출력");
			System.out.println("4. 종료");
			System.out.print("메뉴를 입력하세요 : ");
			menu_num = sc.nextInt();
		}while(menu_num != 4);
		
		//슈도 코드, 수도 코드, Pseudo Code
		//가짜 코드
		//실제 구현된 코드는 아니지만 흐름, 알고리즘 등을 파악할 수 있도록 작성한 것
		
		//--------------------------------------------------------------------------
		
		int i = 0;	//초기식
		
		do {
			System.out.println(i);	//수행 코드
			
			i++;	//증감식
		}while(i < 5); //조건식
		
	}

}
