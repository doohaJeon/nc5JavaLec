package chap98_homework;

public class Card {
	private String cardName;
	private int validYear;
	
	public Card(String cardName, int validYear) {
		this.cardName = cardName;
		this.validYear = validYear;
	}
	
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public int getVaildYear() {
		return validYear;
	}
	public void setVaildYear(int validYear) {
		this.validYear = validYear;
	}
	
	public void vaildEnlong(int year, CardVali cv) {
		cv.enlong(year);;
	}

	@Override
	public String toString() {
		return  cardName + "카드의 유효기간은 " + validYear + "년입니다.";
	}
	
	
}
