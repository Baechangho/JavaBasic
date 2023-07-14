package java04_control.loop;

public class For_07 {

	public static void main(String[] args) {
		//quiz
		//첫날에 10원을 예금하고
		//다음날에는 전날의 2배를
		//예금하는 방식으로
		//보름(15일) 동안 저축한 금액은?
//		int total = 0;
//		int mul = 1;
//		for(int i = 0; i < 15; i++) {
//			total = total + 10 * mul;
//			mul = mul * 2;
//		}
		
//		
//		int total = 0;
//		int mul = 10;
//		for (int i = 0; i < 15; i++) {
//			total = total + mul;
//			mul = mul *2;		//10, 20, 40, 80,....
//		}						//10, 20, 30, 40
//		System.out.println(total);
		
		//----------------------------------------------
		
		//1. 필요한 데이터 파악 - 사용 목적
		//날짜		int day
		//예금액	int money
		//총 금액	int total
		
		//2. 반복 패턴 - 몇번 반복
		//반복횟수 : 15번
		//반복구간 : 0~14
		//day, 0~14, *15
		
		//3. 반복에 맞춰 수행해야하는 작업 - 중괄호 안쪽 코드
		//예금액 2배로 증가
		//총 금액에 추가
		
		//----------------------------------------------
		
		int money = 10;
		int day = 0;
		int total = 0;
		
		for(day = 0; day < 15; day++) {
			total += money;
			money *= 2;
		}
		System.out.println("저축한 총 금액 : " +total + "원");
		
	}
}
