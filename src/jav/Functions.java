package jav;

import java.lang.Math;

public class Functions {

	public static void MineSet(int mineNum) { // 마인 위치 세팅 함수
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

	public static void Check(int x, int y) { // 초기 세팅 함수
		if (DataBase.map[x][y] == 1) {
			// 지뢰 있는것.
		} else { // 지뢰 없으면 주변 체크 하기.
			int aroundMine = 0;
			for (int cY = y - 1; cY < y + 2; y++) {
				for (int cX = x - 1; cX < x + 2; x++) {
					try { // 끝쪽에 있는 데이터 예외 처리
						if (DataBase.map[x][y] == 1) { //지뢰 있으
							aroundMine++; // 주변 지뢰량 1 추가 
						}
					} catch (Exception e) {
						// null
					}
				}
			}
			DataBase.map[x][y] = ++aroundMine;
		}
	}
}
