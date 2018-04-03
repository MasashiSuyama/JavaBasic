package practice02;
/*
 * PTra02_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra02_07 {
	public static void main(String[] args) {
		int num = 97;
		System.out.println("num:" + num);

		// ★ int型の変数targetを宣言して、97未満の数字を代入してください（値は任意です）
		int target = 20;

		// ★ 変数numを、変数targetの数字で割った商と余りを出力してください
		int a = num / target;	//商
		int b = num % target;	//余り
		System.out.println(num +"を"+ target +"で割ったとき、商は"+ a +",余りは"+ b);
	}
}
