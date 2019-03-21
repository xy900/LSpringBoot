package com.xy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private Integer age;

	public Long getId() {
		return id;
	}

	public void setId(Long iD) {
		this.id = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String naMe) {
		this.name = naMe;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer agE) {
		this.age = agE;
	}

	@Override
	public String toString() {
		return "User[id=" + id + ", name=" + name + ", age=" + age +  "]";
	}

}
