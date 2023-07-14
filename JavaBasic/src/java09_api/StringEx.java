package java09_api;

public class StringEx {

	public static void main(String[] args) {
		
		String str1 = "Apple";	//리터럴 상수
		String str2 = new String("Banana");	//객체로 생성한 문자열 (동적 할당)
	
		//---------------------------------------------------------------------
	
		System.out.println("--------length()-----------");
		
		System.out.println("str1의 길이 : " + str1.length());
		System.out.println("str2의 길이 : " + str2.length());
		
		System.out.println("\"Cherry\"의 길이 : " + "Cherry".length());
		
		//---------------------------------------------------------------------
		System.out.println("-----------------------------------");
		System.out.println("\n--- toLowerCase() -------");
		//str1 문자열의 모든 알파벳을 소문자로 변경한 결과를 반환한다
		System.out.println(str1.toLowerCase());
		
		System.out.println("\n--- toUpperCase() -------");
		//str2문자열의 모든 알파벳을 대문자로 변경한 결과를 반환한다
		System.out.println(str2.toUpperCase());
		
		System.out.println("\n--- charAt(int) -------");
		//str1의 3번째 인덱스 값을 추출한다
		System.out.println(str1.charAt(3));
		
		System.out.println("\n--- replace(char, char) -------");
		//str2 문자열의 'n'을 'X'로 변환한다
		System.out.println(str2.replace('n', 'X'));
		System.out.println(str2.replace("n", "XXX"));
		
		System.out.println("\n--- contains() -------");
		//특정 문자열을 포함하고 있는지 확인한다
		boolean res1 = "Hello Java, Welcome".contains("ava");
		System.out.println(res1);
		
		System.out.println("\n--- substring() -------");
		//문자열의 일부분을 발췌하여 반환한다
		System.out.println(str1.substring(1));
		System.out.println(str1.substring(1,3));
		
	}

}
