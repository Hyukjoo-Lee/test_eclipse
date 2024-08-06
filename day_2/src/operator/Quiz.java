package operator;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {

		int num;
		String result; // 수를 입력 받아 짝, 홀 구분 + 3배 배수 여부

		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력");
		num = sc.nextInt();

		result = (num % 2 == 0) ? num + "은 짝수이고" : num + "은 홀수이고";
		result += (num % 3 == 0) ? " 3의 배수 입니다" : " 3의 배수가 아닙니다";
		System.out.println(result);
		
		// 두 수를 입력 받아 큰 수 출력
		int num1;
		int num2;
		int result2;
		
		System.out.println("두 수 입력");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		result2 = (num1 > num2) ? num1 : num2;
		System.out.println("큰 수는 " + result2 + " 입니다");
		
		// 수를 입력 받아 5의 배수이면서 짝수인지 확인
		// "5의 배수이며 짝수" 또는 "아님"
	
		System.out.println("수 입력");
		num1 = sc.nextInt();
		result = (num1 % 5 == 0 && num1 % 2 == 0) ? "5의 배수면서 짝수" : "아님"; 
		System.out.println(result);
		
		sc.close();

	}
}
