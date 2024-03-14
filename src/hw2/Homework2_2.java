package hw2;

public class Homework2_2 {
	public static void main(String[] args) {
		// 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum = 0;
		for (int i = 2; i <= 1000; i += 2)
			sum += i;
		System.out.println(sum);

		// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int sum1 = 1;
		for (int a = 1; a <= 10; a++)
			sum1 *= a;
		System.out.println(sum1);

		// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int sum2 = 1;
		int b = 1;
		while (b <= 10) {
			sum2 *= b;
			b++;
			System.out.println(sum2);
		}

		/*
		 * 請設計一隻Java程式,輸出結果為以下: 1 4 9 16 25 36 49 64 81 100
		 */

		for (int c = 1; c <= 10; c++)
			System.out.println(c * c);

	}

}
