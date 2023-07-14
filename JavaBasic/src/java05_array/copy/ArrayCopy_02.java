package java05_array.copy;

public class ArrayCopy_02 {

	public static void main(String[] args) {

		int[] arr1 = {50, 60, 70};			//원본데이터
		int[] arr2 = new int[arr1.length];	//사본데이터
		
		//깊은복사, Deep Copy
		//참조 대상의 내용물을 새로운 공간에 복사하는 것
		//원본데이터와 사본데이터가 분리된 별개의 공간을 가진다
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
		
		System.out.println("-----------------------------");
		arr2[1] = 8888;
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
		
		System.out.println("arr1 : " + arr1);
		System.out.println("arr2 : " + arr2);
		
	}

}
