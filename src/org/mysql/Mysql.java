package org.mysql;

import java.sql.*;

public class Mysql {
	public static void main(String[] args) throws SQLException {
//		

		String Url, UserName, UserPassword, Query;
		Url = "Jdbc:Mysql://Localhost:3306";
		UserName = "root";
		
		UserPassword = "bala@123";
		Query = "select *from student.std; ";

		Connection con = DriverManager.getConnection(Url, UserName, UserPassword);

		Statement Statement = con.createStatement();
		ResultSet Result = Statement.executeQuery(Query);
		//System.out.println("id  " + "username  " + "email");
		
		//Result.next();// 
		while (Result.next()) {
			
				
				System.out.println(Result.getString(1)+Result.getString(2)+Result.getString(3 ));
			
		}
		
		
		
	

	}
}