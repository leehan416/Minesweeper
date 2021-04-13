package jav;

import java.lang.Math;

public class Functions { // 게임 플레이시 필요한 각종 함수들 모음 클래

	public static void MineSet(int mineNum) { // 지뢰 위치 세팅 함수
		for (; mineNum >= 0; mineNum--) {
			int x = (int) (Math.random() * 10);
			int y = (int) (Math.random() * 10);
			if (DataBase.map[x][y] > 0) {
				mineNum++;
				continue;
			} else {
				DataBase.map[x][y]++;
			}
		}
	}

	public static void Click(int x, int y) {
		
		/*if (DataBase.map[x][y] == 0) { // 지뢰를 클릭하지 않았다
			int aroundMine = 0;
			for (int cY = y - 1; cY < y + 2; y++) {
				for (int cX = x - 1; cX < x + 2; x++) {
					try { // 끝쪽에 있는 데이터 예외 처리
						if (DataBase.map[cX][cY] == 1) { // 지뢰 있으면
							aroundMine++; // 주변 지뢰량 1 추가
						}
					} catch (Exception e) {
						// null
					}
				}
			}
			DataBase.map[x][y] = aroundMine;
			if (aroundMine == 0) {
				// 주변 지뢰 없는 구역들 클릭 처리
				Click(x + 1, y);
				Click(x, y + 1);
				Click(x - 1, y);
				Click(x, y - 1);
			}
		} else {
			if (DataBase.map[x][y] == 1) { // 지뢰 클릭
				// gameover
			} else { // 지뢰 주변 클릭
				return;
			}
		}
	*/}
}
