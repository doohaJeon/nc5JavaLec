package chap98_homework;

/*1. 인터페이스 Student - void saveInfo();
- void printInfo();
- double getAvg(); => round로 소수점 두 자리까지만 표출
클래스 CommonStat - int sno; 학번
         - StringBuffer name;
- String[] subject;
- int[] finalExam;

위 인터페이스와 클래스를 상속받은 MathStudent, EngStudent, ComStudent 구현
학생별로 수강중인 과목의 개수가 다릅니다. 
그리고 MainPage(메인화면 페이지)
InputStudentInfo 클래스(학생정보 입력 페이지)
InputSubject 클래스(과목과 점수 입력 페이지)
PrintStInfo(학생정보 출력 페이지)
PrintStRank(학과별 학생 성적 평균 순위)를 클래스로 나눠서 화면을 구성하세요.

------학적관리------
1. 학생정보 입력
2. 학생정보 검색
3. 학생정보 전체출력
4. 학과별 성적 순위
5. 종료


------학생정보 입력------
1. 기본정보 입력
2. 과목정보 입력

------기본정보 입력------
학번 : 
이름 : 
학과 : 

------과목정보 입력------
과목을 입력하세요.

점수를 입력하세요.

------학생정보 검색------
검색할 학생의 학번을 입력하세요.
1
학번 : 1
이름 : 홍길동
학과 : 클래스로 유추
평균 점수 : 75.34


------학생정보 전체출력------
학번 : 1
이름 : 홍길동
학과 : 클래스로 유추
평균 점수 : 75.34
------------------------------------
학번 : 2
이름 : 김길동
학과 : 클래스로 유추
평균 점수 : 90.15

*/
public interface Student {
	void saveInfo();
	void printInfo();
	double getAvg(); 
	
	
}
