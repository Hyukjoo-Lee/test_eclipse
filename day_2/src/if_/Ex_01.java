package if_;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("1.쉬운게임");
		System.out.println("2.어려운게임");
		System.out.println("3.종료");
		System.out.println(">>> : ");
		num = input.nextInt();
		if (num == 1)
			System.out.println("쉬운 게임을 시작합니다");
		if (num == 2)
			System.out.println("어려운게임 시작합니다");
		if (num == 3)
			System.out.println("종료합니다");
	}

}