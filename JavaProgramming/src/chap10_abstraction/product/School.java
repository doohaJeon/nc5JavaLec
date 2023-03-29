package chap10_abstraction.product;

public abstract class School {
	int classCnt;
	int studentCnt;
	int teacherCnt;
	int subjectCnt;
	
	public abstract void teach();
	
	public abstract void solveHomework();
	
	public abstract void rest();
	
	public abstract void attend();
}
