package repeat_;

public class Ex_02 {
	public static void main(String[] args) {
		// using for loop
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " : 짝");
			} else {
				System.out.println(i + " : 홀");
			}
		}

		// using while loop
		int j = 1;
		while (j <= 10) {
			if (j % 2 == 0) {
				System.out.println(j + " : 짝");
			} else {
				System.out.println(j + " : 홀");
			}
			j++;
		}
	}
}
