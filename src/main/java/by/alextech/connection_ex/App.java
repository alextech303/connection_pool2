package by.alextech.connection_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App{
	

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/connection_pool?useSSL=false","root", "g145101988Q");
//
		String sql = "INSERT INTO users(name,surname) VALUES(?,?)";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, "1");
	    ps.setString(2, "2");

		ps.executeUpdate();

System.out.println("!!!");
}
}