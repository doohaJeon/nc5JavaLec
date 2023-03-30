package chap98_homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Group {
	private Map<String, String> memberMap = new HashMap<String, String>();
	
	public Group() {};
	
	public Group(Map<String, String> map) {
		this.memberMap = map;
	}

	public Map<String, String> getMemberMap() {
		return memberMap;
	}

	public void setMemberMap(Map<String, String> memberMap) {
		this.memberMap = memberMap;
	}
	
	public Entry<String, String> getCaptin() {
		
		Entry<String, String> captin = null;
		for(Entry<String, String> ent : memberMap.entrySet()) {
			if(ent.getValue().equals("조장")) {
				 captin = ent;
			}
		}
		
		return captin;
	};
}
