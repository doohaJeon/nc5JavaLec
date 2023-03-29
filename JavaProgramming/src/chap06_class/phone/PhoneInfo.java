package chap06_class.phone;

import java.util.Scanner;

public class PhoneInfo {
	//이름 100개와 전화번호 100개를 담을 수 있는 배열 2개(String)
	String [] name = new String[100];
	String [] phoneNum = new String[100];
	//배열의 현재 인덱스를 담고 있을 변수
	int index = 0;
	//전달받은 이름과 전화번호를 저장하는 메소드
	//insertPhoneNum	
	
	public void insertPhoneNum(String name, String phoneNum) {
		this.name[index] = name;
		this.phoneNum[index] = phoneNum;
		index++;
	}
	//저장된 모든 이름과 전화번호를 출력하는 메소드
	//printAllPhoneNum
	public void printAllPhoneNum() {
		for(int i = 0; i < index; i++) {
			if(name[i] != null) {
				System.out.print("이름 : " + name[i] +", ");
			}
			if(phoneNum[i] != null) {
				System.out.println("전화번호 : " + phoneNum[i]);
			}
		}
	}
	//ex) 이름 : 홍길동, 전화번호 : 1111111111
	
	//전달받은 인덱스의 해당하는 이름과 전화번호를 출력하는 메소드
	//printPhoneNum
	public void printPhoneNum(int num) {
		if(name[num] != null && phoneNum[num] != null) {
			System.out.println("이름 : " + name[num] + ", " + "전화번호 : " + phoneNum[num]);
		}
	}
}
