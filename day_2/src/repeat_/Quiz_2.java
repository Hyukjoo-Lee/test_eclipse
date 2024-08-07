package repeat_;

import java.util.Scanner;

public class Quiz_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		login_account(sc);
		coffee_machine(sc);
	}

	private static void login_account(Scanner sc) {
		boolean run = true;
		String id = null;
		String password = null;

		while (run) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.나가기");
			System.out.println(">>>>");

			int num = sc.nextInt();

			switch (num) {
			case 1: {
				if (id != null) {
					System.out.println("아이디를 입력하세요.");
					String id1 = sc.next();
					if (id1.equals(id)) {
						System.out.println("비밀번호를 입력하세요.");
						String password1 = sc.next();
						if (password1.equals(password)) {
							System.out.println("로그인 성공");
						} else {
							System.out.println("비밀번호 불일치");
						}
					} else {
						System.out.println("회원이 존재하지 않습니다.");
					}
				} else {
					System.out.println("회원 정보가 존재하지 않습니다.");
				}

			}
				break;
			case 2: {
				System.out.println("아이디를 입력하세요.");
				id = sc.next();
				System.out.println("비밀번호를 입력하세요.");
				password = sc.next();
				System.out.println("회원가입에 성공했습니다.");
			}
				break;
			case 3: {
				run = false;
			}
				break;
			}
		}
	}

	private static void coffee_machine(Scanner sc) {
		System.out.println("요금을 투입 하세요 >>>");
		int money = sc.nextInt();
		boolean run = true;
		int num;
		int coffee = 200;
		int cocoa = 250;

		while (run) {
			System.out.println("=========커피자판기========");
			System.out.print("1. 커피 (200)" + "\t");
			System.out.print("2. 코코아 (250)" + "\t");
			System.out.print("3. 반환" + "\t");
			System.out.print("4. 종료");
			System.out.println();
			System.out.print("메뉴를 선택하세요 >>> ");
			num = sc.nextInt();
			switch (num) {
			case 1: {
				if (money > coffee) {
					money -= coffee;
					System.out.println("맛있게 드세요");
				} else {
					System.out.println("요금이 부족합니다");
				}
			}
				break;
			case 2: {
				if (money > cocoa) {
					money -= cocoa;
					System.out.println("맛있게 드세요");
				} else {
					System.out.println("요금이 부족합니다");
				}
			}
				break;
			case 3: {
				System.out.println("거스름 돈: " + money);
			}
				break;
			case 4:
				run = false;
			}
		}
	}

}
