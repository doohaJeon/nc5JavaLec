package chap20_lambda.clazz;

public class UserCharString {
	private String str;
	
	public UserCharString(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public void changeStr(char ch, UserChar uc) {
		this.str = uc.findUserChar(ch, this.str);
	}
}