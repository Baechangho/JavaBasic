package java04_control.selection;

import java.util.Scanner;

public class SwitchQuiz_Menu_v2 {

	public static void main(String[] args) {

		final int HELLO_MENU = 1;	//Hello World
		final int NAME_MENU = 2;	//이름
		final int GENDER_MENU = 3;	//성별
		final int EXIT_MENU = 4;	//종료
		
		Scanner sc = new Scanner(System.in);
		
		//메뉴 실행 객체 생성
		RunMenu runMenu = new RunMenu();
		
		int num = 0;
		while(num != EXIT_MENU) {
			runMenu.printMenu();
			num = sc.nextInt();
			System.out.print("\t>>");
			switch(num) {
			case HELLO_MENU:
				runMenu.printHello();
				break;
			case NAME_MENU:
				runMenu.printName();
				break;
			case GENDER_MENU:
				runMenu.printGender();
				break;
			case EXIT_MENU:
				runMenu.printBye();
				break;
			default:
				runMenu.printErr();
			}
			
		}
		
	}

}
