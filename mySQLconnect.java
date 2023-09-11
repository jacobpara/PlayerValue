import java.sql.Statement;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class mySQLconnect {

	public static Connection connect()  {
		Connection table = null;
		
		String url = "jdbc:sqlite:C:/Users/Jacob/Desktop/SQLite/new.db";
		try {
			
			table = DriverManager.getConnection(url);
			//JOptionPane.showMessageDialog(null, "Our connection is successful");
			//System.out.println("Connection to SQLite database is being established");
			
			}
		
		catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e);
			System.out.println(e.getMessage());
		
		}
		return table; 
		
}
	
	
	
