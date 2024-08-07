package repeat_;

public class Ex_03 {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println("for : " + i);
		}

		int k = 0;
		while (k < 3) {
			System.out.println("while : " + k);
			k++;
		}

		int j = 0;
		for (; j < 3;) {
			System.out.println("while-like-for: " + j);
			j++;
		}
	}
}
