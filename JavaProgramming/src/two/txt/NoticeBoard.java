package two.txt;

public class NoticeBoard implements Board {
	private long no;
	private String title;
	private String content;
	private boolean manager;
	
	
	
	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isManager() {
		return manager;
	}

	public void setManager(boolean manager) {
		this.manager = manager;
	}

	@Override
	public void addMessage() {
		// TODO Auto-generated method stub
		System.out.println("관리자 권한이 있으면 공지글 추가.");
	}

	@Override
	public void setMessage() {
		// TODO Auto-generated method stub
		System.out.println("관리자 권한이 있으면 공지글 수정.");
	}

	@Override
	public void deleteMessage() {
		// TODO Auto-generated method stub
		System.out.println("관리자 권한이 있으면 공지글 삭제.");
	}

	@Override
	public void lookAtMessage() {
		// TODO Auto-generated method stub
		System.out.println("누구나 조회는 가능.");
	}

}
