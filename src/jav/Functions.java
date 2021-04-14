package jav;

import java.lang.Math;

public class Functions { // 게임 플레이시 필요한 각종 함수들 모음 클래스  

	public static void ZeroSet() {
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
				DataBase.map[x][y] = 0;
			}
		}
	}

	public static void MineSet(int mineNum) { // 지뢰 위치 세팅 함수

		for (; mineNum > 0; mineNum--) {
			int x = (int) (Math.random() * 10);
			int y = (int) (Math.random() * 10);
			if (DataBase.map[x][y] == 1) {
				mineNum++;
				continue;
			} else {
				DataBase.map[x][y]++;
			}
		}

	}

	public static void Click(int x, int y) {

		if (DataBase.map[x][y] == 0) { // 지뢰를 클릭하지 않았다
			int aroundMine = 0;
			for (int cY = y - 1; cY < y + 2; cY++) {
				for (int cX = x - 1; cX < x + 2; cX++) {
					try { // 끝쪽에 있는 데이터 예외 처리
						if (DataBase.map[cX][cY] == 1) { // 지뢰 있으면
							aroundMine++; // 주변 지뢰량 1 추가
						}
					} catch (Exception e) {
						// null
					}
				}
			}

			DataBase.map[x][y] = 2; // 클릭처리
			AllCheck(); 
			if (aroundMine > 0) { // 주변에 지뢰가 있으면
				DataBase.map[x][y] = aroundMine + 10; // 겟수 데이터 기록
				return; // 함수종료
			} else if (aroundMine == 0) { // 주변 지뢰 없는 구역들 클릭 처리
				try {
					// TODO : 모서리 부분에서 버그 발생중
					if (x == 0) {
						if (y == 0) {
							Click(x, y + 1);
							Click(x + 1, y);
						} else if (y == 9) {
							Click(x, y - 1);
							Click(x + 1, y);
						} else {
							Click(x + 1, y);
							Click(x, y - 1);
							Click(x, y + 1);
						}
					} else if (x == 9) {
						if (y == 0) {
							Click(x, y + 1);
							Click(x - 1, y);
						} else if (y == 9) {
							Click(x, y - 1);
							Click(x, y - 1);
						} else {
							Click(x - 1, y);
							Click(x, y - 1);
							Click(x, y + 1);
						}
					} else if (y == 0) {
						if (x == 0) {
							Click(x, y + 1);
							Click(x + 1, y);
						} else if (x == 9) {
							Click(x, y + 1);
							Click(x - 1, y);
						} else {
							Click(x, y + 1);
							Click(x + 1, y);
							Click(x - 1, y);
							Click(x, y - 1);
						}
					} else if (y == 9) {
						if (x == 0) {
							Click(x, y - 1);
							Click(x + 1, y);
						} else if (x == 9) {
							Click(x, y - 1);
							Click(x, y - 1);
						} else {
							Click(x, y - 1);
							Click(x + 1, y);
							Click(x - 1, y);
							Click(x, y + 1);
						}
					} else {
						Click(x, y - 1);
						Click(x + 1, y);
						Click(x, y + 1);
						Click(x - 1, y);
					}
				} catch (Exception e) {
					return;
				}
			}
		} else {
			if (DataBase.map[x][y] == 1) { // 지뢰 클릭
				// gameover
			}
		}
	}

	public static void AllCheck() {
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
				if (DataBase.map[x][y] == 0) {
					return;
				}
				// 게임 승리
			}
		}
	}

}