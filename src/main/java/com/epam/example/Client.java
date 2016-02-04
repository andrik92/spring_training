package com.epam.example;

public class Client {

	private String id;
	private String fullName;

	public Client(String id, String fullname) {
		super();
		this.id = id;
		this.fullName = fullname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullname) {
		this.fullName = fullname;
	}

	
}
