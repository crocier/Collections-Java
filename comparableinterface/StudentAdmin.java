package com.pratian.comparableinterface;

import java.util.Collections;
import java.util.List;

public class StudentAdmin {
	
	Student student = new  Student();
	
	public void createStudent(List<Student> studentArr) {
		Student student1 = new Student(1005, "Deetha", 80);
		Student student2 = new Student(1001, "Deepa", 70);
		Student student3 = new Student(1003, "Shwetha", 75);
		Student student4 = new Student(1005, "Lakshmi", 60);
		Student student5 = new Student(1002, "Roopa", 65);
		Student student6 = new Student(1006, "Mamatha", 77);
		
		studentArr.add(student1);
		studentArr.add(student2);
		studentArr.add(student3);
		studentArr.add(student4);
		studentArr.add(student5);
		studentArr.add(student6);
	}
	
	public void sortStudent(List<Student> studentArr) {
		Collections.sort(studentArr);
	}

}
