package com.sample.model;

import java.util.List;

public class StudentListAccessor {
	private Student thirdStudentInList;
	private List<Student> failedStudent;
	private List<String> studentNames;
	public Student getThirdStudentInList() {
		return thirdStudentInList;
	}
	public void setThirdStudentInList(Student thirdStudentInList) {
		this.thirdStudentInList = thirdStudentInList;
	}
	public List<Student> getFailedStudent() {
		return failedStudent;
	}
	public void setFailedStudent(List<Student> failedStudent) {
		this.failedStudent = failedStudent;
	}
	public List<String> getStudentNames() {
		return studentNames;
	}
	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	} 





}
