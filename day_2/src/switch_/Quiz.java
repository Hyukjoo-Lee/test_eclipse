package switch_;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// 1.
		System.out.println("날짜 입력: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch (num % 7) {
		case 1:
			System.out.println("월");
			break;
		case 2:
			System.out.println("화");
			break;
		case 3:
			System.out.println("수");
			break;
		case 4:
			System.out.println("목");
			break;
		case 5:
			System.out.println("금");
			break;
		case 6:
			System.out.println("토");
			break;
		case 0:
			System.out.println("일");
			break;
		}

		// 2.
		String house = null;
		String office = null;
		boolean run = true;
		int number; 
		
		while (run) {
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			number = sc.nextInt();

			switch (number) {
			case 1: {
				System.out.println("우리집 목적지 입력: ");
				String input = sc.next();
				house = input;
			}
			break;
			case 2: {
				System.out.println("회사 목적지 입력: ");
				String input = sc.next();
				office = input;
			}
			break;
			case 3: {
				if (house != null) {
					System.out.println("우리집 : " + house);
				} else {
					System.out.println("우리집이 등록되지 않았습니다.");
				}
				if (office != null) {
					System.out.println("회사 : " + office);
				} else {
					System.out.println("회사가 등록되지 않았습니다.");
				}
				run = false;
			}

			}
		}
	}
}
