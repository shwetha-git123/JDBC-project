package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HiringProcess {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring","root","root");
			Statement statement=connection.createStatement();
			statement.execute("insert into hiring values(11,'tom',20,'software engineer',20000,2)");
			statement.execute("insert into hiring values(12,'alex',25,'software trainee',15000,7)");
			statement.execute("insert into hiring values(13,'michel',23,'developer',50000,4)");
			statement.execute("insert into hiring values(14,'merry',52,'technician',25000,12)");
			statement.execute("insert into hiring values(15,'reena',48,'manager',30000,30)");
			statement.execute("insert into hiring values(16,'ridhima',30,'assistant software engineeer',16000,20)");
			statement.execute("insert into hiring values(17,'clerk',50,'software engineer',60000,40)");
			statement.execute("insert into hiring values(18,'miller',70,'software engineer',90000,10)");
			connection.close();
			
			
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			
			e.printStackTrace();
		}
	}

}
