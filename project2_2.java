// 입출력

import java.util.Scanner;

public class project2_2 {
	public static void main(String[] args) {
		String message;
		Scanner scan = new Scanner(System.in); //문자 입력을 인자로 Scanner 생성
		System.out.println("input the meassge: ");
		
		message = scan.nextLine(); //키보드 문자 입력
		System.out.println("input message :\"" +message+ "\""); // 입력 문자 출력
		
		int kilometer;
		double liter, mpg;
		
		System.out.println("enter the values as integer(km) values: ");
		
		kilometer = scan.nextInt(); // 키보드 숫자 정수 값

		System.out.println("input the liter: ");
		
		liter =scan.nextDouble(); // 키보드 숫자 Double 형 입력
		mpg = kilometer / liter; // 입력받은 kilometer와 liter 계산
		
		System.out.println("Kilometer per liter : "+ mpg);
		
		scan.close();
		
		
	}
}