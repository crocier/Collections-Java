package com.pratian.comparableinterface;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		
		List<Student> studentArr = new ArrayList<Student>();
		
		StudentAdmin admin = new StudentAdmin();
		
		admin.createStudent(studentArr);
		
		admin.sortStudent(studentArr);
		
		System.out.print(studentArr.toString());
	}

}
