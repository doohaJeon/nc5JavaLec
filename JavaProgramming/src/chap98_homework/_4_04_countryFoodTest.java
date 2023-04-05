package chap98_homework;

public class _4_04_countryFoodTest {
	public void notifyFood(String country) {

		for (_4_04_CountryFood c : _4_04_CountryFood.values()) {

			if (c.getCountry().equals(country)) {

				System.out.println(c.getCountry() + "의 대표음식은 "

						+ c.getFood() + "입니다.");

			}

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
