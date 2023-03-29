package chap18_enum;

import chap18_enum.enums.Season;

public class _07_useOfSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season [] seaArr = Season.values();
		Season spring = Season.SPRING;
		Season summer = Season.valueOf("SUMMER");
		for(Season s : seaArr) {
			s.printSeasonMonth();
		}
	}

}
