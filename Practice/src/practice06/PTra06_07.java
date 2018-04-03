package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		for(int i = 0 ; i < 10 ; i++) {
			if(i <= 5) {
				for(int j = 1 ; j <= i ; j++) {
					System.out.print("■");
				}
				for(int j = 5 ; j > i ; j--) {
					System.out.print("□");
				}
			}
			if(i > 5) {
				for(int j = 10 ; j > i ; j--) {
					System.out.print("■");
				}
				for (int j = 5 ; j < i ; j++) {
					System.out.print("□");
				}
			}

			System.out.println();
		}
	}
}
