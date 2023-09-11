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
		
		//finally { 
			//try {
				//if (table != null) {
					//table.close();
					
				//}}
			//catch (SQLException e) {
				//System.out.println(e.getMessage());
			//}
			
		//}
	}

	//public Object[][] selectALL() {
		//String sqlite = "SELECT * FROM Players";
		//Object[][] lookup = new Object[10][2];
		//int idcounter = 0;  
		//try (Connection table = this.connect();
		             //Statement state = table.createStatement();
		             //ResultSet rs    = state.executeQuery(sqlite)){
			   
			   //while (rs.next()) {
				   //lookup[idcounter][0] = rs.getInt("PlayerID");
				   //lookup[idcounter][1] = rs.getString("Name");
				   //idcounter ++;
				   
				   //System.out.println( 
                           //rs.getString("Name") + "\t    " +
                           //rs.getString("Nationality") + "\t  " + 
                           //rs.getString("Position") + "\t" + 
                           //rs.getInt("Est_Market_Value") + "\t" +
                           //rs.getInt("XP_Annual_Salary") + "\t" +
                           //rs.getInt("Revenue_Potential") + "\t" +
                           //rs.getInt("Age") + "\t"
						   //);}
			
			   
			   //}   } catch (SQLException e) {
	            //System.out.println(e.getMessage());
	            
		   //}
		   //return lookup;	   
	
	//}
	
	
	
	//public static void main(String[] args) {
		
		//connect();
		
	//}

}
	
	
	