package switch_;

import java.util.Scanner;

/**
 * f11: 디버깅 시작 모드 f6: 한줄 실행 ( 무조건 ) f5: 한줄 실행 (메소드 이동) f8: 다음 브레이크 포인터 이동 CTRL +
 * F2: 종료
 */
public class Ex01 {
	public static void main(String[] args) {
		int select = 2;
		switch (select) {
		case 1:
			System.out.println("1입력");
			break;
		case 2:
			System.out.println("2입력");
			break; // switch 문을 빠져 나올 때 사용
		default:
			System.out.println("그 외의 값 입력");
		}
		System.out.println("다음 문장들 실행!");

	}
}
