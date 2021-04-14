package jav;

public class Main { // 게임 조작, ui등 각종 게임 기본 시스템 관
	public static void main(String[] args) {

		Functions.MineSet(20);
		Functions.Click(1,1);
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
				System.out.print(DataBase.map[x][y]);
			}
			System.out.println(" ");
		}
	}
}
