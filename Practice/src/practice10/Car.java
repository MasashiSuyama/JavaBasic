package practice10;

public class Car {
	int serialNo;
	String color;
	int gasoline;
	public int run() {
		if(gasoline == 0) {
			return -1;
		} else {
			gasoline--;
			int a = new java.util.Random().nextInt(15) +1;	//移動距離
			return a;
		}
	}
}
