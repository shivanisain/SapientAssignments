package com.sapient.student;

public class StudentRunner {

	public static void main(String[] args) {
		
		stu x = new stu();
		
		x.readStudent();
		x.displayStudent();
		x.studentsByCity("gurgaon");
		x.sortByName();
		x.sortByCity();
		x.studentsById(101);

	}

}
