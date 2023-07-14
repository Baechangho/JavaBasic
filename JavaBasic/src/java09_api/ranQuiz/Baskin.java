package java09_api.ranQuiz;

import java.util.Random;
import java.util.Scanner;

public class Baskin {

	public static void main(String[] args) {

		int com;	//컴퓨터의 숫자(랜덤)
		int user;	//사용자의 숫자(키보드 입력)
		
		Random ran = new Random();		//랜덤 객체
		Scanner sc = new Scanner(System.in);	//키보드 입력 객체
		int num = 1;	//게임 진행 숫자
		int MAX = 31;	//게임 종료 숫자
		int winner = 0;	//승자 체크 변수
		//1 : user승
		//2 : com승
		final int USER_WIN = 1;
		final int COM_WIN = 2;
		
		System.out.println("=================START=================");
		GAME:	//레이블
		while(num <= MAX) {	
			//컴퓨터의 보정값
			//->랜덤을 무시하고 컴퓨터가 이길 수 있는 연속 숫자까지만 출력함
			if(num > MAX-4 && num < MAX-1) {
				com = MAX - num;
				System.out.println("[TEST] com보정됨 : " + com);
			}else {
				com = ran.nextInt(3) + 1;	//컴퓨터가 출력할 연속 숫자의 개수, 1~3
				System.out.println("[TEST] com랜덤 : " + com);
			}
			
//			System.out.println("[TEST] com : " + com);
			for(int i = 0; i < com; i++) {
				System.out.println("com >> " + num++);
				if(num > MAX) {
					winner = 1;
					break GAME;
				}
			}
			System.out.print("\n몇 개 연속? :");
			while(true) {
				System.out.print("1~3 중 하나 입력 : ");
				user = sc.nextInt();
				if(user >=1 && user <= 3) {
					break;
				}else {
					System.out.println("[SYSTEM] 1~3 범위의 숫자만 입력하세요!");
				}
			}
			
			for(int i = 0; i < user; i++) {
				System.out.println("user >> " + num++);
				if(num > MAX) {
					winner = 2;
					break GAME;
				}
			}
			
		}
		System.out.println();
		if(winner == USER_WIN) {
			System.out.println(">> 사용자가 승리하였습니다");
		}else if(winner == COM_WIN) {
			System.out.println(">> 컴퓨터가 승리하였습니다");
		}
	}

}
