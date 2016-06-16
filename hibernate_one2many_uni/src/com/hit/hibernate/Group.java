package com.hit.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="_group")
public class Group {
	private int id;
	private String name;
	private Set<User> users = new HashSet<User>();
	
	@Id
	@GeneratedValue
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
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	@OneToMany
	@JoinColumn(name="groupId")
	//默认写OneToMany会把它当成多对多来处理，会生成中间表。
	public Set<User> getUsers() {
		return users;
	}

}
