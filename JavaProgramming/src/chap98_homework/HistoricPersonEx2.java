package chap98_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HistoricPersonEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<HistoricPerson> hpList = new ArrayList<HistoricPerson>();
		Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
		
		hpList.add(new HistoricPerson("이도", "한글", "조선"));
		hpList.add(new HistoricPerson("이순신", "임진왜란", "조선"));
		hpList.add(new HistoricPerson("담덕", "세력확장", "고구려"));
		hpList.add(new HistoricPerson("장영실", "측우기", "조선"));
		hpList.add(new HistoricPerson("이성계", "조선건국", "조선"));
		hpList.add(new HistoricPerson("을지문덕", "살수대첩", "고구려"));
		hpList.add(new HistoricPerson("이승만", "초대대통령", "대한민국"));
		hpList.add(new HistoricPerson("고주몽", "고려건국", "고려"));
		hpList.add(new HistoricPerson("김구", "독립운동", "대한민국"));
		hpList.add(new HistoricPerson("제갈공명", "책략가", "촉"));
		
//		hpList.stream().filter(person -> 
//			person.getAchievement().equals(input))
//		.forEach(person -> System.out.println(person));
		
//		hpList.stream().filter(person -> person.getName().charAt(0)== '이')
//						.forEach(person -> System.out.println(person));
		
		hpList.stream().filter(person -> person.getSameCountryPerson(input))
						.forEach(person -> System.out.println(person.getName()+ ", " + 
									person.getAchievement() + ", " + person.getCountry()));
			
		
		sc.close();
	}

}
