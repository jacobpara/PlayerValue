import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;


public class playerValue {

	private JFrame frame;  //only calling from within this class so private variable
	Connection table;
	JList list;
	String get;
	private JTextField number;
	int years;
	String player;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					playerValue window = new playerValue();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public void listoptions() {
	try {
		String choose = "SELECT * FROM Players";	
		Statement state = table.createStatement();
		ResultSet options = state.executeQuery(choose);
	
		DefaultListModel choice = new DefaultListModel<String>();
	
	while (options.next()) {
	
		choice.addElement(options.getString("Name"));
		
	}
	list.setModel(choice);
	state.close();
	options.close();
	} catch (Exception e1) {
		System.out.println(e1.getMessage());
	
}}
	
	
	public playerValue() {
		initialize();
		//table = mySQLconnect.connect();
		
	
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		table = mySQLconnect.connect();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Click here to select the player.");
		lblNewLabel.setBounds(31, 23, 221, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("How many years do you want to sign them for?");
		lblNewLabel_1.setBounds(31, 194, 313, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(283, 23, 127, 144);
		frame.getContentPane().add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		JButton subBtn = new JButton("Submit");
		subBtn.setBackground(new Color(192, 192, 192));
		subBtn.setForeground(new Color(0, 0, 0));
		subBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				get = number.getText();
				years = Integer.parseInt(get);
				String player =  (String) list.getSelectedValue();
		
				//System.out.println(player);
				//System.out.println(years);
				
				valueCalc price = new valueCalc();
				price.data(player, years);  //player, years
				
			}
		});
		subBtn.setBounds(321, 227, 89, 23);
		frame.getContentPane().add(subBtn);
		
		number = new JTextField();
		number.setBounds(354, 191, 56, 20);
		frame.getContentPane().add(number);
		number.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("(Enter a number)");
		lblNewLabel_2.setBounds(31, 212, 221, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JTextArea txtrThisProgramIs = new JTextArea();
		txtrThisProgramIs.setBackground(new Color(192, 192, 192));
		txtrThisProgramIs.setWrapStyleWord(true);
		txtrThisProgramIs.setForeground(new Color(0, 128, 255));
		txtrThisProgramIs.setLineWrap(true);
		txtrThisProgramIs.setText("Instructions:\r\n\r\nThis program is designed to help you assess the financial costs and benefits of signing a soccer player, based on current data");
		txtrThisProgramIs.setBounds(31, 57, 200, 109);
		frame.getContentPane().add(txtrThisProgramIs);
		
		listoptions();
	}
	}
