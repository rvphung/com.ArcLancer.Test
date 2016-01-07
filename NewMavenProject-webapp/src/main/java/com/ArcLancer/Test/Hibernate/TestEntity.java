package com.ArcLancer.Test.Hibernate;

public class TestEntity {

	private int rowid;
	private int _id;
	private String name;

	public TestEntity() {
	}

	public TestEntity(int int_id, String name) {

		this.set_id(int_id);
		this.setName(name);
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int int_id) {
		this._id = int_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRowid() {
		return rowid;
	}

	public void setRowid(int rowid) {
		this.rowid = rowid;
	}
}
