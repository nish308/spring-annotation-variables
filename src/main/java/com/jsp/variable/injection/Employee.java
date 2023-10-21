package com.jsp.variable.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value(value = "1")
	int id;
	@Value(value = "Nishant")
	String name;
	@Value(value = "nish@mail.com")
	String email;
	
	public Employee() {
		System.out.println("Object Created");
	}
	
	public void printEmp() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
	}
}
