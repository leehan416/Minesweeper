package jav;


public class Main { // 게임 조작, 각종 게임 기본 시스템 관리 클래스

	public static void main(String[] args) {
		Functions.ZeroSet();
		Functions.MineSet(20);
		Ui ui = new Ui();
	}
}