package repeat_;

public class Ex_01 {
	public static void main(String[] args) {
		// int sum = 0;
		//
		// for(int i = 0; i <= 10; i++) {
		// sum += i;
		// }
		//
		// System.out.println(sum);
		//
		//
		// int j =1, sum2 = 0;
		// while(j <= 10) {
		// sum2 += j;
		// j++;
		// }
		//
		// System.out.println(sum2);
		//
		// 1~10 총합, 홀합, 짝합
		int oddSum = 0;
		int evenSum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				oddSum += i;
			} else {
				evenSum += i;
			}
		}

		int total = oddSum + evenSum;
		System.out.println("홀합: " + oddSum);
		System.out.println("짝합: " + evenSum);
		System.out.println("총합: " + total);

	}
}
