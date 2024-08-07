package repeat_;

public class Quiz_1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 25; i++) {
			if (i % 5 == 0) {
				System.out.print(i + "\n");
			} else {
				System.out.print(i + "\t");
			}
		}
	}
}
