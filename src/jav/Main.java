package jav;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main { // 게임 조작, 각종 게임 기본 시스템 관리 클래스

	public static void main(String[] args) {
		Functions.ZeroSet();
		Functions.MineSet(20);
		Ui ui = new Ui();
		class click implements KeyListener {

			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("asdf");
				if (e.getKeyCode() == 49) { // 일반 클릭
					DataBase.clickType = false;
				} else if (e.getKeyCode() == 50) { // 지뢰 체크
					DataBase.clickType = true;
				}
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("asdf");
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("asdf");
				// TODO Auto-generated method stub

			}

		}

	}
}