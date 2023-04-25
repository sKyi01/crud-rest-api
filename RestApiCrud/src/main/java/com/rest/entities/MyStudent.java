package com.rest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "student_info")
public class MyStudent {

	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "roll_number")
	private int rollNo;

	@Column(name = "student_name")
	private String name;

	@Column(name = "clg_name")
	private String clgName;

	@Column(name = "branch_name")
	private String branch;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "MyStudent [name=" + name + ", clgName=" + clgName + ", rollNo=" + rollNo + ", branch=" + branch + "]";
	}

	public MyStudent(int rollNo, String name, String clgName, String branch) {
		super();
		this.name = name;
		this.clgName = clgName;
		this.rollNo = rollNo;
		this.branch = branch;
	}

	public MyStudent() {
		super();

	}

}
