package java01_variables;

public class Variables_05 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//학생의 나이
//		int student age; //에러, 띄어쓰기 금지
		int student_age;	//snake case, 뱀 표기법
		int studentAge;		//camel case, 낙타 표기법 -> Java 권장 표기법
//--------------------------------------------------------------
//		int 1stNumber; 		//에러, 숫자로 시작하면 안된다
		int firstNumber;
//--------------------------------------------------------------
//		int int; 			//에러, 예약어(키워드)는 사용할 수 없다
		
		int intNum;
		int intData;
//--------------------------------------------------------------
		
		//** 의미 없는 변수명을 사용하지 않도록 한다
		int a;
		int b;
		int c;
		
//--------------------------------------------------------------
		
		//알아보기 힘든 변수명 사용하지 않기
//		int _;
		int $;
		int ____;
		int ___$$____;
		int _$_$_$_$$$_$$;
		___$$____ = 123;
		System.out.println(___$$____);

//--------------------------------------------------------------
		
		int number;
		
		int number_;
		int _number;
		int $number;
		
		int number1;
		int number2;
		int number3;

//--------------------------------------------------------------
		
		//한글 식별자 사용 금지
		
		double 넓이 = 543.32;
		System.out.println( 넓이 );
		
	}

}
