package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import chap21_stream.clazz.CreditCard;

public class _04_pipeLineEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<CreditCard> cardList = new ArrayList<CreditCard>();
		
		cardList.add(new CreditCard("카카오", "라이언카드", 1000));
		cardList.add(new CreditCard("삼성카드", "탭탭카드", 2000));
		cardList.add(new CreditCard("신한카드", "드림카드", 3000));
		cardList.add(new CreditCard("삼성카드", "ID카드", 5000));
		cardList.add(new CreditCard("현대카드", "더블랙", 100000));
		cardList.add(new CreditCard("아멕스", "블랙카드", 300000));
		
		Stream<CreditCard> creditStream = cardList.stream();
		Stream<CreditCard> limitStream
		= creditStream.filter(cardLimit -> cardLimit.getLimitMoney() >= 5000);
		
		limitStream.forEach(card -> System.out.println(card.getCompany()+" "+card.getCardName()));
		
		
	   /* 
		*카카오, 라이언카드, 1000
		*삼성카드, 탭탭카드, 2000
		*신한카드, 드림카드, 3000
		*삼성카드, ID카드, 5000
		*현대카드, 더블랙, 100000
		*아멕스, 블랙카드, 300000
		*/
		//스트림으로 한도가 5000이상인 카드의 회사와 카드이름 출력
		
		
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 1; i<=30; i++) {
			intList.add(i);
		}
		
		int sum = intList.stream().reduce((result, num) -> result + num)
		.get();
		
		System.out.println(sum);
		
	}

}
