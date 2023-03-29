package chap17_generic;

import chap17_generic.clazz.BoardFile;
import chap17_generic.clazz.FreeBoard;
import chap17_generic.clazz.NoticeBoard;

public class _01_useOfGeneric {

	public static void main(String[] args) {
		//자유 게시판 게시글에 대한 첨부파일
		BoardFile<FreeBoard> fBoardFile = new BoardFile<FreeBoard>();
		
		//아래 방식으로도 선언할 수 있고
//		fBoardFile.setT(new FreeBoard());
		
		FreeBoard fBoard = new FreeBoard();
		fBoard.setfBoardNo(1);
		fBoard.setfBoardTitle("test");
		fBoard.setfBoardContent("test입니다");
		
		fBoardFile.setT(fBoard);
		
		fBoardFile.setBoardNo(fBoardFile.getT().getfBoardNo());
		
		fBoardFile.setType(fBoardFile.getT().getClass().getSimpleName().equals("FreeBoard")? 1 : 2);
		
		
		//공지사항 게시글에 대한 첨부파일
		BoardFile<NoticeBoard> nBoardFile = new BoardFile<NoticeBoard>();
		
		NoticeBoard nBoard = new NoticeBoard();
		nBoard.setnBoardNo(2);
		nBoard.setnBoardTitle("test2");
		nBoard.setnBoardContent("테스트입니다.");
		
		nBoardFile.setT(nBoard);
		
		nBoardFile.setBoardNo(nBoardFile.getT().getnBoardNo());
		
		nBoardFile.setType(nBoardFile.getT().getClass().getSimpleName().equals("NoticeBoard")? 2 : 1);
		
		nBoardFile.setBoardFileNm("첨부파일");
		
		System.out.println(nBoardFile);
		
		
		
		
	}

}
