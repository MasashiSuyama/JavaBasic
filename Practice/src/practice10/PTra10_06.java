package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

import java.util.Scanner;
public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car car[] = new Car[3];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0 ; i < car.length ; i++) {
			System.out.println((i + 1) +"台目の自動車の色とガソリン量を入力します");
			System.out.println("色、ガソリン量をカンマ区切り(,)で入力してください");
			String a = scanner.nextLine();		//(i + 1)台目の色とガソリン量の情報
			String[] b = a.split(","); 			//b[0]に色、b[1]にガソリン量の情報を入れる
			car[i] = new Car();					//インスタンス作成
			car[i].color = b[0];
			car[i].gasoline = Integer.parseInt(b[1]);
		}
		final int distance = 300;		//目的地までの距離
		for(int i = 0 ; i < car.length ; i++) {
			int sum = 0;	//総移動距離
			int t = 0;		//目的地までの経過時間
			while(sum < distance && car[i].gasoline > 0) {
				sum += car[i].run();
				t++;
			}
			System.out.print((i + 1) +"台目の"+ car[i].color +"色の自動車は");
			if(sum >= distance) {
				System.out.println("目的地にまで"+ t +"時間かかりました。残りのガソリンは"
						+ car[i].gasoline  +"リットルです");
			} else {
				System.out.println("目的地に到達できませんでした");
			}
		}
/*		 while分を使わない書き方(PTra10_05参考)
/*		for(int i = 0 ; i < car.length ; i++) {
			int sum = 0;		//総移動距離
			for(int j = 1 ;; j++) {
				int a = car[i].run();	//移動距離
				if(a == -1) {		//ガソリン不足
					System.out.print((i + 1) +"台目の"+ car[i].color +"色の自動車は");
					System.out.println("目的地に到達できませんでした");
					break;
				}
			sum += a;
				if(sum >= distance) {
					System.out.print((i + 1) +"台目の"+ car[i].color +"色の自動車は");
					System.out.println("目的地にまで"+ j +"時間かかりました。残りのガソリンは"
							+ car[i].gasoline  +"リットルです");
					break;
				}
			}
		}	*/
	}
}
