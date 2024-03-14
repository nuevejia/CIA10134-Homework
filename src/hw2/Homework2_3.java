package hw2;

public class Homework2_3 {
	public static void main(String[] args) {
		/*
		 * 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。 
		 * 請設計一隻程式, 輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		 */
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if (i / 10 != 4 && i % 10 != 4) {
				count++;
			}
			System.out.println(i);

		}

		System.out.println(count);

		/*
		 * 請設計一隻Java程式,輸出結果為以下: 
		 * 1 2 3 4 5 6 7 8 9 10 
		 * 1 2 3 4 5 6 7 8 9 
		 * 1 2 3 4 5 6 7 8 
		 * 1 2 3 4 5 6 7 
		 * 1 2 3 4 5 6 
		 * 1 2 3 4 5 
		 * 1 2 3 4 
		 * 1 2 3 
		 * 1 2 
		 * 1
		 */
		for (int a = 10; a >= 1; a--) {
			for (int b = 1; b <= a; b++)
				System.out.print(b + " ");
			System.out.println();

		}

		/*
		 * 請設計一隻Java程式,輸出結果為以下: 
		 * A 
		 * BB 
		 * CCC 
		 * DDDD 
		 * EEEEE 
		 * FFFFFF
		 */
		char a = 'A';
		for (int c = 1; c <= 5; c++) {
			for (int d = 1; d <= c; d++)
				System.out.print(a);
			a++;
			System.out.println();
		}

	}
}
