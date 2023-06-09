package chap98_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class StudyGroup<T> {
	private List<T> allList = new ArrayList<T>();
	

	public List<T> getAllList() {
		return allList;
	}

	public void setAllList(List<T> list) {
		this.allList = list;
	}
	
	public List<Entry<String, String>> getCaptins(){
		List<Entry<String, String>> capList = new ArrayList<Entry<String, String>>();
		
		for(T t : allList) {
			Group g = (Group)t;
			capList.add(g.getCaptin());
		}
		return capList;
	}
	
	public static void main(String[] args) {
		
	}
	
}
