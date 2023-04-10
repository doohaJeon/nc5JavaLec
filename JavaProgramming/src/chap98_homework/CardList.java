package chap98_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CardList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Card> cardList = new ArrayList<Card>();
		
		cardList.add(new Card("a", 3));
		cardList.add(new Card("b", 1));
		cardList.add(new Card("c", 0));
		cardList.add(new Card("d", 1));
		cardList.add(new Card("e", 2));
		cardList.add(new Card("f", 5));
		
//		Stream<Card> cardStream = cardList.stream();
//		Stream<Card> newStream = cardStream.filter(card -> card.getVaildYear() <= 1);
//		newStream.forEach(card -> card.vaildEnlong(3, year -> {
//			card.setVaildYear(card.getVaildYear() + year);
//			System.out.println(year + "년 연장되었습니다.");
//			System.out.println(card.toString()); 
//			}));
		
		cardList.stream().filter(card -> card.getVaildYear() <= 1)
		.forEach(card -> card.vaildEnlong(3, year -> {
			System.out.println(year+"년 연장되었습니다.");
			card.setVaildYear(card.getVaildYear() + year);
			System.out.println(card.toString());
		}));
		
	}

}
