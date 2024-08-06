package operator;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("=== 삼항 연산자 ===");
		int su1 = 20, su2 = 10;
		String str = (su1 > su2) ? "su1이 su2보다 크다" : "su2이 su1보다 크거나 같다";
		System.out.println(str);
		
		System.out.println("=== 증감 연산자 ===");
		int number1 = 5, number2 = 5;
		System.out.println(number1++); // 5
		System.out.println(++number2); // 6

		number1 = 10;
		// 자기 자신을 먼저 증가 후 연산
		number2 = ++number1;
		System.out.println("n1 : " + number1); // 11
		System.out.println("n2 : " + number2); // 11

		System.out.println("=== 논리 연산자 ===");
		int n3 = 10, n4 = 5, n5 = 7;

		System.out.println("=== and ===");
		System.out.println(n4 > n5 && n4 > n3); // 5 > 7 && 5 > 10 f
		System.out.println(n5 > n4 && n5 > n3); // 7 > 5 && 7 > 10 f
		System.out.println(n3 > n4 && n3 > n4); // t && t = t

		System.out.println("=== or ===");
		System.out.println(n4 > n5 || n4 > n3); // 5 > 7 && 5 > 10 f
		System.out.println(n5 > n4 || n5 > n3); // 7 > 5 && 7 > 10 t
		System.out.println(n3 > n4 || n3 > n4); // t && t = t

		System.out.println("=== not ===");
		System.out.println(!(false && true)); // t
		System.out.println(!false); // t

		System.out.println("=== 관계 연산자 ===");
		int num1 = 5, num2 = 4;

		System.out.println(num1 > num2); // t
		System.out.println(num1 <= num2); // f
		System.out.println(num1 == num2); // f
		System.out.println(num1 != num2); // t

		System.out.println("=== 복합 연산자 ===");
		int s1, s2;
		s1 = s2 = 5;

		s1 += 1;
		System.out.println(s1); // 6

		s1 -= 1;
		System.out.println(s1); // 5

		s1 *= s2;
		System.out.println(s1); // 25

		s1 /= s2;
		System.out.println(s1); // 25 /= 5 => 5

		s1 %= s2;
		System.out.println(s1); // 0

		System.out.println("==== 산술 연산자 ====");
		int n1 = 9, n2 = 2;
		System.out.println(n1 / n2); // 9 / 2 = 4
		System.out.println(n1 / (double) n2); // 9 / 2 = 4.5
		System.out.println(n1 % n2); // 9 % 2 = 1
	}

}
