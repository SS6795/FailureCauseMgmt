package main.java;

import java.util.ArrayList;
import java.util.List;

public class FCMMain {
	
	private List<String> list = new ArrayList<>();

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	public void addListElement() {
		list.add("Hi");
	}

}
