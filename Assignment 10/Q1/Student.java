package com.sunbeam.student;

public class Student implements Comparable<Student> {
	private int rollno;
	private String name;
	private int marks;

	public Student(int rollno, String name, int marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		return o.getMarks() - this.getMarks();
//		return o.getMarks() - this.getMarks();
//		return Integer.compare(o.getMarks(), this.getMarks());
//		return Integer.compare(o.getRollno(), this.getRollno());
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

}
