package jav;

public class DataBase { // 데이터 관리 클래스
	public static boolean clickType = false;
	public static int[][] map = new int[10][10]; // 0 미클릭 1 지뢰  10 ~지롸 겟
	public static int[][] checked = new int[10][10]; // 지뢰 체크 된 위치 
}