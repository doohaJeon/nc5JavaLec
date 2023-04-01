package two.txt;

public class Book {
	private String bName;
	private String author;
	private String company;
	private int price;
	
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void addStudentInfo(String bName, String author, String company, int price) {
		this.bName = bName;
		this.author = author;
		this.company = company;
		this.price = price;
	}
	
	public void viewBookInfo() {
		System.out.println("책 제목 : " + this.bName + ", 저자 : " + this.author + ","
				+ " 출판사 : " + company + ", 가격 : " + price);
	}
}
