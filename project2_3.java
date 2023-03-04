// 배열

public class project2_3 {
	public static void main(String[] args) {
		// 첫번째 방법
		int[] score = new int[]{ 1, 2, 3, 4, 5 }; // 배열 선언 (생성된 배열을 다루는데 사용될 참조 변수 선언)
		// new 는 클래스 타입의 인스턴스(객체)를 생성해주는 역할을 담당

		for (int i = 0; i < 5; i++) {
			System.out.println(score[i]);
		}
		System.out.println("-----------------------------------------------");
		// second
		int[] array;
		array = new int[5];
		
		for (int t=0;t<5;t++) {
			array[t] = t;
			System.out.println(array[t]);
		}
		
		

	}
}