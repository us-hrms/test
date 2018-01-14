package com.hfp.entity;

import com.hfp.anno.Column;
import com.hfp.anno.Table;

@Table("demo_test")
public class Demo {
	
	@Column("name_test")
	private String name;
	
	@Column("password_test")
	private String password;
	
	

	public Demo(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Demo [name=" + name + ", password=" + password + "]";
	}
	
	
}
