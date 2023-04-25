package com.rest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "student_info")
public class MyStudent {

	@Id
	@Column(name = "roll_number")
	private Long rollNo;

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



	public Long getRollNo() {
		return rollNo;
	}

	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	

	public MyStudent(Long rollNo, String name, String clgName, String branch) {
		super();
		this.name = name;
		this.clgName = clgName;
		this.rollNo = rollNo;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "MyStudent [rollNo=" + rollNo + ", name=" + name + ", clgName=" + clgName + ", branch=" + branch + "]";
	}

	public MyStudent() {
		super();

	}

}
