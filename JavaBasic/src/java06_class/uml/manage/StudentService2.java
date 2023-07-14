package java06_class.uml.manage;

import java.util.Scanner;

public class StudentService2 {
   Student[] stu;
   Scanner input;
   private int num = 3;
   
   public StudentService2() {
      stu = new Student[num];
      for(int i = 0; i < num; i++) {
         stu[i] = new Student();
      }
      input = new Scanner(System.in);
   }
   
   public void insertInfo() {
      for(int i = 0; i < num; i++) {
         System.out.print("학생"+ (i+1) + "이름 :");
         stu[i].setName(input.nextLine());
         System.out.print("학생"+ (i+1) + "나이 :");
         stu[i].setAge(input.nextInt());
         input.nextLine();
      }
   }
   
   public void insertScore() {
      for(int i = 0; i < num; i++) {
         System.out.print("학생"+ (i+1) + "국어 :");
         stu[i].setKor(input.nextInt());
         System.out.print("학생"+ (i+1) + "영어 :");
         stu[i].setEng(input.nextInt());
         System.out.print("학생"+ (i+1) + "수학 :");
         stu[i].setMath(input.nextInt());
         calcSum();
         calcAvg();
      }
   }
   
   private void calcSum() {
      for(int i = 0; i < num; i++) {
         stu[i].setSum(stu[i].getKor() + stu[i].getEng() + stu[i].getMath());
      }
   }
   private void calcAvg() {
      for(int i = 0; i < num; i++) {
         stu[i].setAvg(stu[i].getSum()/(double)3);
      }
   }
   
   public void printStu() {
      for(int i = 0; i < num; i++) {
         System.out.println("학생"+ (i+1) + "\t이름\t나이\t국어\t영어\t수학\t총점\t평균");
         System.out.print("\t" + stu[i].getName() + "\t");
         System.out.print(stu[i].getAge() + "\t");
         System.out.print(stu[i].getKor() + "\t");
         System.out.print(stu[i].getEng() + "\t");
         System.out.print(stu[i].getMath() + "\t");
         System.out.print(stu[i].getSum() + "\t");
         System.out.printf("%.1f" , stu[i].getAvg());
         System.out.println();
      }
   }
   
}