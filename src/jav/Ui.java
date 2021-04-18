package jav;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ui {

	public static JFrame frame = new JFrame("Mine");
	JButton ok = new JButton();
	Container a = frame.getContentPane();
	public static JButton btn[][] = new JButton[10][10];

	Ui() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 428); // canvas 크기 조정
		frame.setVisible(true);
		frame.setResizable(false); // 사이즈 재조정 불가능
		frame.setLocationRelativeTo(null); // 창이 가운데에 뜨도록 함
		Print();
		a.setBackground(null);
		// frame.setVisible(true);
	}

	void Print() {
		int dis = 40;
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
				if (DataBase.map[x][y] <= 1) {
					ok = new JButton(x + ":" + y);
					ok.setForeground(Color.white);
					ok.setLocation(dis * x, dis * y);
					ok.setCursor(new Cursor(Cursor.HAND_CURSOR));
					ok.setSize(40, 40);
					ok.addActionListener(btnClick);
					btn[x][y] = ok;
					a.add(btn[x][y]);
				}
			}
		}
	}

	ActionListener btnClick = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			String val = ((AbstractButton) e.getSource()).getText();
			int valX = Integer.valueOf(val.split(":")[0].trim());
			int valY = Integer.valueOf(val.split(":")[1].trim());
			Functions.Click(valX, valY);
			btn[9][9].setSize(40, 40);

		}
	};

	public static void CheckSet(int x, int y) {
		if (DataBase.checked[x][y] == 1) {
			btn[x][y].setLabel("!");
			btn[x][y].setForeground(Color.black);
		} else {
			btn[x][y].setLabel(x+":"+y);
			btn[x][y].setForeground(Color.WHITE);
			
		}
	}

	public static void BtnNumSet(int x, int y, int val) {
		if (val != 0)
			btn[x][y].setLabel(String.valueOf(val));
		else
			btn[x][y].setLabel(null);
		btn[x][y].setEnabled(false);
	}

	public static void GameOver() {
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
				if (DataBase.map[x][y] <= 1) {
					if (DataBase.map[x][y] == 1)
						btn[x][y].setLabel("*");
					else
						btn[x][y].setLabel(null);
					btn[x][y].setEnabled(false);
				}
			}
		}
	}
}
