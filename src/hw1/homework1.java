package hw1;

public class homework1 {
	public static void main(String[] args) {
		//請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12;
		int b = 6;
		System.out.println(a + b);
		System.out.println(a * b);

        //請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int eggs = 200;
		int egg = eggs / 12;
		int dozen = eggs % 12;
		System.out.println(egg + "打" + dozen + "顆");

        //請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int times = 256559;
		int second = times % 60;
		int minute = (times / 60) % 60;
		int hour = (times / 3600) % 60;
		int day = (times / 3600) / 24;
		System.out.println(day + "天" + hour + "時" + minute + "分" + second + "秒");

        //請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		int radius = 5;
		double area = Math.pow(radius, 2) * PI;
		double circumference = (radius + radius) * PI;
		System.out.println("園面積" + area);
		System.out.println("圓周長" + circumference);

		/*
		 * 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本 金加利息共有多少錢 (用複利計算,公式請自行google)
		 */
		int p = 1_500_000; // 本金
		double interest = 0.02; // 利率
		int n = 10; // 期數
		double sum = p;
		for (int i = 1; i <= n; i++) {
			sum *= (1 + interest);
			System.out.println("第" + i + "期" + sum);
		}

		/*
		 * 請寫一隻程式,利用System.out.println()印出以下三個運算式結果: 5 + 5 5 + ‘5’ 5 + “5”
		 * 並請用註解各別說明答案的產生原因
		 */
		System.out.println(5 + 5); // 數字加數字為10
		System.out.println(5 + '5'); // 數字加字符為58
		System.out.println(5 + "5"); // 數字加字串為55
	}

}



