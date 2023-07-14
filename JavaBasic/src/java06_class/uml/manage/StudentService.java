package java06_class.uml.manage;

import java.util.Scanner;

public class StudentService {
	private Student stu;
	private Scanner input;
	
	//디폴트 생성자(초기화의 의미가 있다)
	//->ctrl + space 하면 자동 추천 해준다
	public StudentService() {
		stu = new Student();
		input = new Scanner(System.in);
	}
	
	public void insertInfo() {
		System.out.print("이름입력 : ");
		stu.setName(input.nextLine());
		System.out.print("나이입력 : ");
		stu.setAge(input.nextInt());
	}
	
	public void insertScore() {
		System.out.print("영어성적 입력 : ");
		stu.setEng(input.nextInt());
		System.out.print("국어성적 입력 : ");
		stu.setKor(input.nextInt());
		System.out.print("수학성적 입력 : ");
		stu.setMath(input.nextInt());
		calcSum();
		calcAvg();
	}
	
	private void calcSum() {
		stu.setSum(stu.getEng() + stu.getKor() + stu.getMath());
	}
	
	private void calcAvg() {
		stu.setAvg(stu.getSum()/(double)3);
	}
	
	public void printStu() {
		System.out.println("--------------------학생정보--------------------");
		System.out.println("이름\t나이\t국어\t영어\t수학\t총점\t평균");
		System.out.print(stu.getName() + "\t");
		System.out.print(stu.getAge() + "\t");
		System.out.print(stu.getEng() + "\t");
		System.out.print(stu.getKor() + "\t");
		System.out.print(stu.getMath() + "\t");
		System.out.print(+ stu.getSum() + "\t");
		System.out.printf("%.1f" , stu.getAvg());
		System.out.println("\n------------------------------------------------");
	}

}
