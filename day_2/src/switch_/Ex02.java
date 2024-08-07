package switch_;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력");
		String str = sc.next();
		switch (str) {
		case "안녕":
			System.out.println(str + "하세요");
			break;
		case "그래":
			System.out.println(str + "반갑다");
		}
	}
}
