package repeat_;

import java.util.Scanner;

/**
 * 문자열 비교
 */
public class Ex_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.println("문자열 입력");
		n1 = input.next();
		System.out.println("문자열 입력");
		n2 = input.next();
		
		System.out.println("n1 == n2 : " + (n1 == n2));
		System.out.println("n1.equals(n2) : " + n1.equals(n2));
		
		
	}

}
