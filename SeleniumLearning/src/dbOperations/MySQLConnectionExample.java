package dbOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");


		Connection connection = DriverManager.
				getConnection("jdbc:mysql://root@localhost/selenium_users");
		//"jdbc:mysql://localhost:3306/selenium_users","root","root");  

		Statement statement=connection.createStatement();

		ResultSet result=statement.executeQuery("SELECT * FROM superheroes_table");

		while(result.next()){

			System.out.println("Name: "+result.getString(1)+
					" Nick Name: "+ result.getString(2));
		}


	}

}
