/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<Player>();

		try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
            	 String line = scanner.nextLine();
            	 String[] a = line.split(",");
            	 Player player = new Player();
            	 player.setPosition(a[0]);
            	 player.setName(a[1]);
            	 player.setCountry(a[2]);
            	 player.setTeam(a[3]);
            	 array.add(player);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		Collections.shuffle(array);
		ArrayList<Player> gk = new ArrayList<Player>();
		ArrayList<Player> df = new ArrayList<Player>();
		ArrayList<Player> mf = new ArrayList<Player>();
		ArrayList<Player> fw = new ArrayList<Player>();
		for(Player player : array) {
				if(player.getPosition().equals("GK")) {
					gk.add(player);
				} else if(player.getPosition().equals("DF")) {
					df.add(player);
				} else if(player.getPosition().equals("MF")) {
					mf.add(player);
				} else {
					fw.add(player);
				}
		}
		for(int i = 0 ; i < 1 ; i++) {
			System.out.println(gk.get(i));
		}
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println(df.get(i));
		}
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println(mf.get(i));
		}
		for(int i = 0 ; i < 2 ; i++) {
			System.out.println(fw.get(i));
		}


	}
}
