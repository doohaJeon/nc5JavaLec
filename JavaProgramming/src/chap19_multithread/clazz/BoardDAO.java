package chap19_multithread.clazz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardDAO {
	public List<Map<String, String>> selectBoardList() {
		List<Map<String, String>> boardList = new ArrayList<Map<String, String>>();
		
		for(int i = 1; i<= 100; i++) {
			Map<String, String> map = new HashMap<String, String>();
			
			map.put("boardNo", String.valueOf(i));
			map.put("boardTitle", "test");
			map.put("boardContent", "test입니다.");
			map.put("boardWriter", "홍길동");
			boardList.add(map);
		}
		return boardList;
	}
}
