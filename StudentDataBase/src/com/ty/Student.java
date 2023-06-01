package com.ty;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StudentInterface student=new StudentImplementation();
		while(true) {
			
			System.out.println("Welcome to Student Database");
			System.out.println("1:Add\n2:Delete\n3:Update\n4:Get by Marks\n5:Get All Students");
			System.out.println("Enter your choice between 1 to 5");
			int choice=s.nextInt();
			switch(choice) {
			case 1:
				student.addStudent();
				break;
			case 2:
				student.deleteStudent();
				break;
			case 3:
				student.updateStudent();
				break;
			case 4:
				student.getStudentByMarks();
				break;
			case 5:
				student.getAllStudents();
				break;
			default:
				System.out.println("Invalid choice");
			}
			
		}
		}

}
