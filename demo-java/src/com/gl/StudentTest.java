package com.gl;

public class StudentTest{
	
	private String name;
	private int age;



	public StudentTest(String name1, int age) {
		this.name = name1;
		this.age = age;
		
		this.toString();

	}



	@Override
	public String toString() {
		return super.toString() + this.name + " age: " + this.age;
	}


	

}
