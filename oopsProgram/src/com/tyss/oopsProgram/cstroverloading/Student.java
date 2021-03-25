package com.tyss.oopsProgram.cstroverloading;

public class Student {

	int id;
	String name;
	int age;
	
	
	
	public Student(int id, String name,int age) {
//		this(id);
		this.age=age;
		this.id = id;
		this.name = name;
		System.out.println("id of student is  "+id);
		System.out.println("name of student is "+name);
		System.out.println("age of student is "+age);
	}
	public Student(int age) {
		this.age = age;
		System.out.println(age);
	}
	
}
