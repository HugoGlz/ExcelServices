package com.hugo.mx.web.app.data;

public class Record {
	
	private int id;
	private String name;
	
	public Record(int id, String name){
		this.id = id;
		this.name = name;
	}

	public Record(){}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return String.format("ID(%d), NAME(%s)", id, name);
	}
}
