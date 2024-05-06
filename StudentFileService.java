package com.coderscampus.assinment4;

public class StudentFileService {
	public static Student createStudent(String studentId, String studentName, String studentCouerse, Integer studentGrade) {
		Student student = new Student(studentId, studentName, studentCouerse, studentGrade);
//		student.setStudentId(studentId);
//		student.setStudentName(studentName);
//		student.setStudentCourse(studentCouerse);
//		student.setStudentGrade(studentGrade);
//		return student;
		
		student.getStudentId();
		student.getStudentName();
		student.getStudentCourse();
		student.getStudentGrade();
		return student;
	}

}
