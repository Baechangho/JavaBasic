package java05_array.quiz;

public class ArrayQuiz2 {

	public static void main(String[] args) {
		
		int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		
		//arr 배열을 invert_arr라는 배열에 거꾸로 입력하시오
		
		int[] invert_arr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			invert_arr[i] = arr[arr.length-i-1];
		}
		System.out.print("invert_arr : {");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(invert_arr[i]);
			if(i == arr.length-1) {
				System.out.println("}");
				break;
			}
			System.out.print(", ");
		}
		
		System.out.println("---------------------------------------------------");
		//--------------------------------------------------------------------------------
		
		//arr 배열의(짝수번째 인덱스 내용의 합) - (홀수번째 인덱스 내용의 합)을 구하시오
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i%2 == 0) {
				count += arr[i];
			}else {
				count -= arr[i];
			}
		}
		System.out.println(count);
		
		
		System.out.println("---------------------------------------------------");
		//--------------------------------------------------------------------------------
		
		//arr 배열의 숫자들 중 높은 숫자가 1등이 되게하여 rank_arr라는 배열에 순위를 입력하시오
		int[] rank_arr = new int[arr.length];
		
		for(int j = 0; j < arr.length; j++) {
			int max = -9999;
			int max_index = -1;
			for(int i = 0; i < arr.length; i++) {
				if(rank_arr[i] == 0 && arr[i] > max) {
					max = arr[i];
					max_index = i;
				}
			}
			rank_arr[max_index] = j+1; 
		}
		System.out.print("rank_arr : {");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(rank_arr[i]);
			if(i == arr.length-1) {
				System.out.println("}");
				break;
			}
			System.out.print(", ");
		}
		
		System.out.println("---------------------------------------------------");
		//--------------------------------------------------------------------------------
		
		//arr 배열의 요소들 중 중복된 값은 over_arr에 넣고 중복되지 않은 값은 ret_arr에 입력하시오
		
		int[] over_arr = new int[arr.length];
		int[] ret_arr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j] && arr[j] != 0) {
					over_arr[i] = arr[i];
					over_arr[j] = arr[i];
					break;
				}
			}	
			if(over_arr[i] == 0) {
				ret_arr[i] = arr[i];
			}
		}
		
		//sorting
		int convert;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if (over_arr[i] > over_arr[j]) {
					convert = over_arr[i];
					over_arr[i] = over_arr[j];
					over_arr[j] = convert;
				}
				if (ret_arr[i] > ret_arr[j]) {
					convert = ret_arr[i];
					ret_arr[i] = ret_arr[j];
					ret_arr[j] = convert;
				}
			}
		}
		
		//printing
		System.out.print("over_arr : ");
		boolean check_once = true;
		for(int i = 0; i < arr.length; i=i+2) {
			if(over_arr[i]!= 0) {
				if (check_once) {					
					System.out.print(over_arr[i]);
					check_once = false;
				}else {					
					System.out.print(", " + over_arr[i]);
				}
			}
		}
		check_once = true;
		System.out.print("\n" + "ret_arr : ");
		for(int i = 0; i < arr.length; i++) {
			if(ret_arr[i]!= 0) {
				if (check_once) {					
					System.out.print(ret_arr[i]);
					check_once = false;
				}else {	
					System.out.print(", " + ret_arr[i]);
				}
			}
		}
		
	}

}
