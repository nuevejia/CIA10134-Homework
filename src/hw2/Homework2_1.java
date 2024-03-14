package hw2;

public class homework2_1 {
	public static void main(String[] args) {
		// for+while迴圈，輸出九九乘法表

		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();

		}

		System.out.println("========================================================");
		
		// for+do while迴圈，輸出九九乘法表
		for (int a = 1; a <= 9; a++) {
			int b = 1;
			do {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;
			} while (b <= 9);
			System.out.println();

		}
		
		System.out.println("========================================================");
		
		// while+do while迴圈，輸出九九乘法表
		int c = 1;
		while (c <= 9) {
			int d = 1;
			do {
				System.out.print(c + "*" + d + "=" + c * d + "\t");
				d++;

			} while (d <= 9);
			c++;
			System.out.println();
		}
	}

}
