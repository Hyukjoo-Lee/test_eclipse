package repeat_;

public class Ex_04 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				System.out.println(33333);
//				break;
				continue;
			}
			System.out.println("i : " + i);
		}
	}
}
