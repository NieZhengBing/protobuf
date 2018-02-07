package com.nzb.netty.protobuftest.java;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Player implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4024973256930253974L;

	private long palyerId;

	private int age;

	private String name;

	private List<Integer> skills = new ArrayList<Integer>();

	public Player(long palyerId, int age, String name) {
		super();
		this.palyerId = palyerId;
		this.age = age;
		this.name = name;
	}

	public long getPalyerId() {
		return palyerId;
	}

	public void setPalyerId(long palyerId) {
		this.palyerId = palyerId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getSkills() {
		return skills;
	}

	public void setSkills(List<Integer> skills) {
		this.skills = skills;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
