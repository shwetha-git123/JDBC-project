package com.ty;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class StudentImplementation implements StudentInterface{
Scanner s=new Scanner(System.in);
	@Override
	public void addStudent() {
		System.out.println("Enter the student id:");
		int id=s.nextInt();
		System.out.println("Enter Student name:");
		String name=s.next();
		System.out.println("Enter Student age:");
		int age=s.nextInt();
		System.out.println("Enter student gender");
		String gender=s.next();
		System.out.println("Enter Student marks");
		double marks=s.nextDouble();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","root");
			PreparedStatement preparedstatement=connection.prepareStatement("insert into student1 values(?,?,?,?,?)");
			preparedstatement.setInt(1, id);
			preparedstatement.setString(2, name);
			preparedstatement.setInt(3, age);
			preparedstatement.setString(4, gender);
			preparedstatement.setDouble(5, marks);
			preparedstatement.execute();
			connection.close();
		} 
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteStudent() {
		System.out.println("Enter the student id:");
		int id=s.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","root");
			PreparedStatement preparedstatement=connection.prepareStatement("delete from student1 where id=?");
			preparedstatement.setInt(1, id);
			preparedstatement.execute();
			connection.close();
			
		} 
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void updateStudent() {
		System.out.println("Enter the student id:");
		int id=s.nextInt();
		System.out.println("Enter Student marks");
		double marks=s.nextDouble();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","root");
			PreparedStatement preparedstatement=connection.prepareStatement("update student1 set marks=? where id=?");
			preparedstatement.setDouble(1, marks);
			preparedstatement.setInt(2, id);
			preparedstatement.execute();
			connection.close();
			
		} 
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		b
	}

	@Override
	public void getStudentByMarks() {
		System.out.println("Enter Student marks");
		double marks=s.nextDouble();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","root");
			PreparedStatement preparedstatement=connection.prepareStatement("select * from student1  where marks=?");
			preparedstatement.setDouble(1, marks);
			ResultSet result=preparedstatement.executeQuery();
			while(result.next()) {
				System.out.println("Id:"+result.getInt(1));
				System.out.println("Name:"+result.getString(2));
				System.out.println("Age:"+result.getInt(3));
				System.out.println("Gender:"+result.getString(4));
				System.out.println("Marks:"+result.getDouble(5));
				
	}
			connection.close();
			
		} 
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void getAllStudents() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","root");
			PreparedStatement preparedstatement=connection.prepareStatement("select * from student1");
			ResultSet result=preparedstatement.executeQuery();
			while(result.next()) {
				System.out.println("Id:"+result.getInt(1));
				System.out.println("Name:"+result.getString(2));
				System.out.println("Age:"+result.getInt(3));
				System.out.println("Gender:"+result.getString(4));
				System.out.println("Marks:"+result.getDouble(5));
				
	}
			connection.close();
			
		} 
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

}
