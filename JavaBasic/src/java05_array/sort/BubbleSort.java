package java05_array.sort;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {

	public static void main(String[] args) {

		//버블 정렬
		int[] arr = {3, 2, 5, 4, 1, 7, 8, 10, 123};
		
		//원본출력
		System.out.println("----정렬전----");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//---버블 정렬 수행---
		int temp;
		for(int i = 0; i < arr.length-1; i++) {			//전체 회차 진행
			for(int j = 0; j < arr.length-1-i; j++) {	//각 회차 반복
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		//결과출력
		System.out.println("----정렬후----");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n--------------");
		
		Integer[] arr2 = {56, 3, 4, 7, 23, 9, 2346, 567};
		
		//정렬
//		Arrays.sort(arr2);
		
		Arrays.sort(arr2, Collections.reverseOrder());		//역순정렬은 참조형으로 사용해야해서 Integer사용
		
		System.out.println(Arrays.toString(arr2));
		
		
		
	}
	
}
