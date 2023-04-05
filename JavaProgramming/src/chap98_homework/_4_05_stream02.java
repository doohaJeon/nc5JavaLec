package chap98_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _4_05_stream02 {
	private int sno;
	private String sName;
	private int score;
	private String grade;
	
	public _4_05_stream02() {}
	
	public _4_05_stream02(int sno, String sName, int score) {
		this.sno = sno;
		this.sName = sName;
		this.score = score;
	}
	

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	@Override
	public String toString() {
		return "_4_05_stream02 [sno=" + sno + ", sName=" + sName + ", score=" + score + ", grade=" + grade + "]";
	}

	public static void main(String[] args) {
		
		List<_4_05_stream02> studentList = new ArrayList<_4_05_stream02>();
		
		studentList.add(new _4_05_stream02(1, "홍길동", 100));
		studentList.add(new _4_05_stream02(2, "임꺽정", 75));
		studentList.add(new _4_05_stream02(3, "장길산", 86));
		studentList.add(new _4_05_stream02(4, "정도전", 97));
		studentList.add(new _4_05_stream02(5, "이순신", 95));
		
		Stream<_4_05_stream02> stuStream = studentList.stream()
							.filter(student -> student.getScore()>= 95);
		
		 Stream<_4_05_stream02> smartStu = stuStream.map(student -> {
			 student.setGrade("A+");
			 return student;
			 });
		smartStu.forEach(student -> System.out.println(student.toString()));
		
	}
	
}
