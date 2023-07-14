package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		//학생 정보 관리 프로그램
		   
		//   이름, 나이, 성별, 국어, 영어, 수학
		   
		//   6가지 정보를 저장할 수 있는 변수를 만들고
		   
		//   총점과 평균을 포함한 결과를 출력한다
		   
		//동작 예시)
		   
		//===== 입력 =====
		//Input Name : Alice
		//Input Age : 33
		   
		//Input Gender : F
		   
		//Input Korean : 100
		//Input English : 99
		//Input Mathematics : 97
		
		//===== 출력 =====
		//이름   나이   성별   국어   영어   수학   총점   평균
		//Alice   33      F      100      99      97      296      98.666666667
		
		System.out.println("===== 입력 =====");
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Name : ");
		String name = sc.nextLine();
		System.out.print("Input Age : ");
		int age = sc.nextInt();
		System.out.print("\nInput Gender : ");
//		String gender = sc.next();
		char gender = sc.next().charAt(0);
		
		System.out.print("\nInput Korean : ");
		int korean = sc.nextInt();
		System.out.print("Input English : ");
		int english = sc.nextInt();
		System.out.print("Input Mathematics : ");
		int mathematics = sc.nextInt();
		
		System.out.println("\n===== 출력 =====");
		System.out.println("이름\t나이\t성별\t국어\t영어\t수학\t총점\t평균");
		int total_score = korean + english + mathematics;
		double average = (double)total_score/3;
//		System.out.println(name + "\t" + age + "\t" + gender + "\t" + korean + "\t" + english + "\t" + mathematics
//				 + "\t" + total_score + "\t" + average);
		System.out.println(name + "\t" + age + "\t" + gender + "\t" + korean + "\t" + english + "\t" + mathematics
				+ "\t" + total_score + "\t" + String.format("%.2f", average));
		
//		System.out.print(age + "\t");
//		System.out.print(gender + "\t");
//		System.out.print(korean + "\t");
//		System.out.print(english + "\t");
//		System.out.print(mathematics + "\t");
		
		
//		System.out.printf("%.2f", avg);
//		==System.out.println(String.format("%.2f", avg));
		
	}

}
