package chap99_etc;

public class CountKorea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "가A나B다C라D";
		char ch;
		int kCnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			
			if(ch >= 44032 && ch <= 50808) {
				kCnt += 1;
			}
		}
		
		System.out.println(kCnt);
	}

}
