package chap98_homework;

public class phoneInfo {
	
	String[] name = new String[100];
	String[] phoneNum = new String[100];
	
	int i = 0;
	
	   //이름과 번호를 배열에 저장
	   public void insertPhoneInfo(String name, String number) {
				
					this.name[i] = name;
					this.phoneNum[i] = number;
					i++;		
		   }
	  
	   //모든 PhoneInfo 출력
	   public void printAllPhoneInfo() {
		   for(int i = 0; i < name.length; i ++) {
			   if(name[i] != null) {
			   System.out.print("이름 : " + name[i] + ", 번호 : " + phoneNum[i] + "\n");
			   }
		   }
		  
	   }

	   //번호에 해당하는 이름과 번호 출력
	    public void printPhoneInfo(int index) {
	    	System.out.println(name[index]);
	    	System.out.println(phoneNum[index]);
	   }
	  
	  
	  
	  
	  
}		
