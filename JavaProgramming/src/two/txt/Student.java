package two.txt;

public class Student {
	private String name;
	private int sno;
	private String sub;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	
	public void addStudentInfo(String name, int sno, String sub) {
		this.name = name;
		this.sno = sno;
		this.sub = sub;
	}
	
	public void viewStudentInfo() {
		System.out.println(this.sno +"번 학생의 이름 : " + this.name + ", 학과 : " + this.sub);
	}
	
	
}
