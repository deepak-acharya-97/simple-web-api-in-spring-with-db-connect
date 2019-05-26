package com.javapoint.models;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Employee {
	private @Id @GeneratedValue Long Id;
	private String name;
	private String role;
	
	public Employee() {
	}

	public Employee(String name, String role) {
		this.name = name;
		this.role = role;
	}	
}
