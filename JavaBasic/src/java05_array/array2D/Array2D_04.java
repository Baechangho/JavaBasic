package java05_array.array2D;

import java.util.Scanner;

public class Array2D_04 {

	public static void main(String[] args) {

		//학생 성적 관리 프로그램
		//->국영수 3과목 점수
		
		//점수1개 		-> int
		//3과목점수 	-> int[3]
		//4학생의 점수 	-> int[4][3]
		//2개 학급		-> int[2][4][3]
		//1~3학년		-> int[3][2][4][3]
		
//		int[][][][] sco = new int[3][2][4][3];
//		
//		int[][][] sco1 = new int[2][4][3];
//		int[][][] sco2 = new int[2][4][3];
//		int[][][] sco3 = new int[2][4][3];
		
		//----------------------------------------------------------
		
	      //QUIZ.
	      //   2명의 국어, 영어, 수학 점수를 처리하기
	      //   학생들의 점수를 입력받고 총점과 평균을 계산하여 출력한다 
	      
	      //   ** 2차원배열 이용해보기
	      
	      //   int[2][3] - 학생들 점수
	      //   int[2] - 학생들 총점
	      //   double[2] - 학생들 평균
	      
	      //----- 최종 출력 -----
	      //   번호   국어   영어   수학   총점   평균
	      //   1번      xxx      xxx      xxx      xxx      xxx.xx
	      //   2번      xxx      xxx      xxx      xxx      xxx.xx
	      		
		
		final int STUDENT = 2;
		final int SUBJECT = 3;
		final String[] SUB_NAME= {"국어", "영어", "수학"};
		
		int[][] score = new int[STUDENT][SUBJECT];
		int[] total_score = new int[STUDENT];
		double[] avg = new double[STUDENT];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < STUDENT; i++) {
			for(int j = 0; j < SUBJECT; j++) {
				System.out.print("학생" + (i+1) + "번의 " + SUB_NAME[j] + " 점수를 입력하세요 : ");
//				switch(j) {
//				case 0:
//					System.out.print("학생 " + i + " 번의 국어 점수를 입력하세요 : ");
//					break;
//				case 1:
//					System.out.print("학생 " + i + " 번의 영어 점수를 입력하세요 : ");
//					break;
//				case 2:
//					System.out.print("학생 " + i + " 번의 수학 점수를 입력하세요 : ");
//					break;
//				default:
//					System.out.println("err");
//				}
				score[i][j] = sc.nextInt();				
				total_score[i] += score[i][j];
			}
			avg[i] = (double)total_score[i]/SUBJECT;
			System.out.println("-------------------------------------------");	
		}	
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i = 0; i < STUDENT; i++) {
			System.out.print((i+1) + "번\t");
			
			for(int j = 0; j < SUBJECT; j++) {
				System.out.print(score[i][j] + "\t");
			}
			
			System.out.print(total_score[i] + "\t");
			System.out.printf("%.2f" + "\n", avg[i]);
		}
			
	}

}
