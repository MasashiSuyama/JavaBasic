/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

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

		for(int i = array.size() - 1 ; i >= 0 ; i-- ) {
			Player player = array.get(i);
			String team = player.getTeam();
			if(team.equals("レアル・マドリード") || team.equals("バルセロナ")) {
				array.remove(i);
			}
		}

		// ★ 削除後のArrayListの中身を全件出力してください
		for(Player player: array) {
			System.out.println(player);
		}

	}
}
