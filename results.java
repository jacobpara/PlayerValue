import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class results {      // extends valueCalc

	public JFrame frame1;  //make this variable public because I am calling this variable from another class, valueCalc
	valueCalc view = new valueCalc();
	JLabel Profit;
	JLabel Cost;
	JLabel Upfront;
	//private Object cost;
	//private Object revenue;
	//private Object final_profit;
	//private Object initial_cost;
	int cost;
	int final_profit;
	int initial_cost;
	String textProfit;
	String textCost;
	String textUpfront;
	
	
	results report; 
	
	//int out_cost;
	//int out_profit;
	//int out_upfront;
	

	/**
	 * Launch the application.
	 */
	//public static void main(String[] args) {     there should only be one main function. That serves as the hub of the program
		//EventQueue.invokeLater(new Runnable() {
			//public void run() {
				//try {
					//results window = new results();
					//window.frame1.setVisible(true);
				//} catch (Exception e) {
					//e.printStackTrace();
				//}
			//}
		//});
	//}

	/**
	 * Create the application.
	 */
	public results() {
		//this.cost = cost;
		//this.revenue = revenue;
		//this.final_profit = final_profit;
		//this.initial_cost = initial_cost;
		///out_cost = view.cost;
		//out_profit = view.final_profit;
		//out_upfront = view.initial_cost;
		
		initialize();
	
		//output(view.cost, view.final_profit, view.initial_cost);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//System.out.println("out1 " + out_cost);
		//System.out.println("out2 " + out_profit);
		//System.out.println("out3 " + out_upfront);
		
		
		
		frame1 = new JFrame();
		frame1.setBounds(100, 100, 450, 300);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Results");
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(155, 11, 132, 14);
		frame1.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cost Over Time:");     
		lblNewLabel_1.setBounds(40, 78, 180, 14);
		frame1.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Potential Profit:");
		lblNewLabel_2.setBounds(40, 117, 180, 14);
		frame1.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Initial Cost:");
		lblNewLabel_3.setBounds(40, 157, 180, 14);
		frame1.getContentPane().add(lblNewLabel_3);
		
		Cost = new JLabel("textCost");   //if local variable is defined even when global variable is defined, local overwrites global variable
		Cost.setBounds(230, 78, 150, 14);
		frame1.getContentPane().add(Cost);
		//Cost.setText(textCost);
		
		Profit = new JLabel("textProfit");
		Profit.setBounds(230, 117, 150, 14);
		frame1.getContentPane().add(Profit);
		///Cost.setText(textProfit);
		
		Upfront = new JLabel("textUpfront");
		Upfront.setBounds(230, 157, 150, 14);
		frame1.getContentPane().add(Upfront);
		//Cost.setText(textUpfront);
		
	}

	public void output(int cost, int final_profit, int initial_cost) {
		//this.cost = cost;
		//this.revenue = revenue;
		//this.final_profit = final_profit;
		//this.initial_cost = initial_cost;
		
		//report = new results();
		
		//System.out.println("cost " + view.cost);
		//System.out.println("profit " + view.final_profit);
		//System.out.println("starting " + view.initial_cost);
		//playerValue info = new playerValue();
		//view.data(info.player, info.years);   ///cost, profit, and initial cost variables from valueCalc
		
		
		//System.out.println("cost " + cost);
		//System.out.println("profit " + final_profit);
		//System.out.println("starting " + initial_cost);
		
		textCost = Integer.toString(cost);   //report.cost
		textProfit = Integer.toString(final_profit);   //report.final_profit
		textUpfront = Integer.toString(initial_cost);  //report.initial_cost
		
		Profit.setText(textProfit + " million euros");
		//Profit.setVisible(true);
		//frame1.getContentPane().add(Profit);
		Upfront.setText(textUpfront + " million euros");
		//Upfront.setVisible(true);
		//frame1.getContentPane().add(Upfront);
		Cost.setText(textCost + " million euros");
		//Cost.setVisible(true);
		//frame1.getContentPane().add(Cost);
		
		initialize();
	
	}
}
