package two.txt;

public class FreeBoard implements Board {
	
	private long no;
	private String title;
	private String content;
	
	
	
	
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

	@Override
	public void addMessage() {
		// TODO Auto-generated method stub
		System.out.println("게시글번호와 제목, 내용을 담고 게시글 등록");
	}

	@Override
	public void setMessage() {
		// TODO Auto-generated method stub
		System.out.println("게시글 내용 수정");
	}

	@Override
	public void deleteMessage() {
		// TODO Auto-generated method stub
		System.out.println("게시글 번호와 제목, 내용을 전부 삭제");
    }

	@Override
	public void lookAtMessage() {
		// TODO Auto-generated method stub
		System.out.println("게시글 조회");
	}

}
