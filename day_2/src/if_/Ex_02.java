package if_;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int num;
//		System.out.println("수 입력");
//		num = input.nextInt();
//		if (num > 10)
//			System.out.println("1. 10보다 크다");
//		System.out.println("2. 10보다 크다");
//		System.out.println("3. 10보다 크다");
//		
//		System.out.println("다음 문장들 실행");
//		System.out.println("다음 문장들 실행");
//		
//		if( num % 2 != 0) {
//			System.out.println("입력 값은 홀수");
//		} else {
//			System.out.println("짝수");
//		}

		// 1. 두 수 입력 큰 수 출력
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		System.out.println("두 수 입력");
		num1 = input.nextInt();
		num2 = input.nextInt();
		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}

		// 2. 세 수 입력 가장 큰 수 출력
		System.out.println("세 수 입력");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		int numMax = 0;
		
		if(num1 > num2 && num1 > num3) System.out.println("num1이 가장 크다");
		if(num2 > num1 && num2 > num3) System.out.println("num2이 가장 크다");
		if(num3 > num1 && num3 > num2) System.out.println("num3이 가장 크다");
		
		int[] nums = new int[] { num1, num2, num3 };

		for (int num : nums)
			numMax = Math.max(num, numMax);

		System.out.println(numMax);

		// 3. 두 수 입력 합이 짝수이고 3의 배수 출력
		System.out.println("두 수 입력");
		String res;
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = num1 + num2;
		res = (num3 % 2 == 0 && num3 % 3 == 0) ? "입력 합이 짝수이고 3의 배수" : "아님";
		System.out.println(res);
	}

}
