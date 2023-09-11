import java.sql.Statement;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class valueCalc {
	
	Connection values;
    int years;
    String player;
    int cost;
    int revenue;
    int final_profit;
    int initial_cost;

	//public static void main(String[] args, Object x) {
		//playerValue A = new playerValue();
		//}
	
	//public valueCalc(int cost, int final_profit, int initial_cost) {
		
		
		//this.cost = cost;
		//this.revenue = revenue;
		//this.final_profit = final_profit;
		//this.initial_cost = initial_cost;
		
		
		//return; 
		
		
	//}

	public static void data (String player, int years) {   //String player, int years
		
		//playerValue userinputs =new playerValue();
		//userinputs.initialize();
		
		try {
			mySQLconnect.connect(); //values = mySQLconnect.connect();
			//Est_Market_Value, XP_Annual_Salary, Revenue_Potential
			//JOptionPane.showMessageDialog(null, player);
			String sqlite = "SELECT * FROM Players WHERE Name =" + "'" + player + "'";    
			Statement prep = mySQLconnect.connect().createStatement();
	        ResultSet rs    = prep.executeQuery(sqlite); 
		   
		    while (rs.next()) {
			  
			   //System.out.println(years);   Prints to console
			   int cost = rs.getInt("Est_Market_Value") + (rs.getInt("XP_Annual_Salary") * years);
			   //System.out.println(cost);
			   int revenue = (rs.getInt("XP_Annual_Salary") * rs.getInt("Revenue_Potential")) * years;
			   //System.out.println(revenue);
			   int final_profit = revenue - cost;
			   //System.out.println("test " + final_profit);
			   int initial_cost = rs.getInt("Est_Market_Value") + rs.getInt("XP_Annual_Salary")*1;
			   
			  
			   results show = new results();
			   show.frame1.setVisible(true);
			   show.output(cost, final_profit, initial_cost);
			   //JOptionPane.showMessageDialog(null, "");
			   
		    }
		
		   
		   } catch (SQLException e) {
           System.out.println(e.getMessage());
           
	   }	   
	
	}

	}

