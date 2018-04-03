package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{500,40,6},
				{70,8,90,1000}
		};

		// ★ 配列arrayに格納されている全ての数字の平均を出力してください
		int sum1 = 0; 	//全ての数字の合計値
		int sum2 = 0;	//全ての数字の数
		for(int[] a:array) {
			for(int b: a) {
				sum1 += b;
			}
		}
		for(int i = 0 ; i < array.length ;i++) {
			sum2 += array[i].length;
		}
		double avg =(double) sum1 / sum2;
		System.out.println(avg);
	}
}
