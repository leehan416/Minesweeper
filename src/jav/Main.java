package jav;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main { // 게임 조작, ui등 각종 게임 기본 시스템 관리 클래스

	public static JButton[][] btn = new JButton[10][10];
	public static JFrame frame = new JFrame("Mine");

	public static void main(String[] args) {
		/*
		 * Functions.ZeroSet(); Functions.MineSet(20); Functions.Click(5, 5);
		 */
		// --------------------------------------------------

		// --------------------------------------------------

		// ------------임시출력
		/*
		 * for (int y = 0; y < 10; y++) { for (int x = 0; x < 10; x++) {
		 * System.out.print(DataBase.map[x][y] + " "); } System.out.println(" "); } //
		 * ------------임시출력
		 */
		// JLabel txt1=new JLabel("0");
		// Ui ui = new Ui();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(480, 480); // canvas 크기 조정
		frame.setVisible(true);
		frame.setResizable(false); // 사이즈 재조정 불가능
		frame.setLocationRelativeTo(null); // 창이 가운데에 뜨도록 함

		GridLayout grid = new GridLayout(10, 10);
		frame.setLayout(grid);

		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
				frame.add(btn[x][y]);
				frame.validate();
				// btn[x][y].addActionListener(btnClick);

			}
		}

		// TODO 자식 컴포넌트 이벤트 정의
		ActionListener btnClick = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		};

	}
	// ------------------------------------------------ui
}
