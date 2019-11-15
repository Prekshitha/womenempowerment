package com.model;

public class Query {
	private String name;
	private String info;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Query() {
		super();
	}
	@Override
	public String toString() {
		return "Query [name=" + name + ", info=" + info + "]";
	}
	
	

}
