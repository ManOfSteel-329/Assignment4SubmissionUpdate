package com.coderscampus.assinment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentFileServiceApplication {
	public static void main(String[] args) throws FileNotFoundException {
		//Student[] studentList = new Student[100];
		//Create an arrayList of the Student data type using the list interface
		List<Student> studentList = new ArrayList<>();
		
		Scanner scan = new Scanner(new File("student-master-list.csv"));
		
		try {
			// Read the csv file to memory
			scan.nextLine();
			//create a while loop to loop through the master csv file while the condition has a next line
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] studentData = line.split(",");
				String studentId = studentData[0];
				String studentName = studentData[1];
				String studentCourse = studentData[2];
				int studentGrade = Integer.parseInt(studentData[3]);
				Student student = StudentFileService.createStudent(studentId, studentName, studentCourse, studentGrade);
				studentList.add(student);
				//System.out.println(Arrays.toString(studentData));
				//System.out.println(student);
			}
			
			
			Collections.sort(studentList);
			
			compSci(studentList);
			apMath(studentList);
			stat(studentList);
			
			System.out.println("");
			System.out.println("File Size: "+studentList.size());
			
			
		}finally{
			scan.close();
		}
		
 		
	}

	private static void stat(List<Student> studentList) {
		System.out.println("");
		System.out.println("----Course 3 STAT.CSV----\n");
		System.out.println("Student ID, Student Name, Course, Grade\n");
		
		for (Student students : studentList) {
			if (students.getStudentCourse().contains("STAT")) {
				System.out.println(students);
				
			}
		}
		
	}

	private static void apMath(List<Student> studentList) {
		System.out.println("");
		System.out.println("----Course 2 APMATH.CSV----\n");
		System.out.println("Student ID, Student Name, Course, Grade\n");
		
		for (Student students : studentList) {
			if (students.getStudentCourse().contains("APMTH")) {
				System.out.println(students);
			}
		}
		
	}

	private static void compSci(List<Student> studentList) {
		System.out.println("");
		System.out.println("----Course 1 COMPSCI.CSV----\n");
		System.out.println("Student ID, Student Name, Course, Grade\n");
		
		for (Student students : studentList) {
			if (students.getStudentCourse().contains("COMPSCI")) {
				System.out.println(students);
			}
		}
		
		
	}

}
