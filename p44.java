import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class p44 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					p44 window = new p44();
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
	public p44() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1347, 734);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update Account Balance");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(345, 79, 402, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Aadhar No:");
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(266, 179, 205, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(451, 179, 214, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Addhar_No=textField.getText();
				
				try
				   {
					   Class.forName("com.mysql.jdbc.Driver");
					   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");
					
					if(textField.getText().equals(" "))
					{
						JOptionPane.showMessageDialog(null,"Please Fill Aadhar No");
						textField.setText(" ");
					}
					else
					{
						PreparedStatement st = con.prepareStatement("Select Addhar_No from bank1 where Addhar_No=?");
						st.setString(1,Addhar_No);
						ResultSet  rs=st.executeQuery();
						if(rs.next())
						{
							JOptionPane.showMessageDialog(btnNewButton,"Aadhar No is correct");
						}
						else
						{
							JOptionPane.showMessageDialog(btnNewButton,"Aadhar No is not correct");
							textField.setText(" ");
						}
					}}
				catch(Exception e1)
				   {
					   System.out.println(e1);
				   }
			}
			
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(693, 179, 125, 31);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Deposit Amount");
		lblNewLabel_2.setForeground(Color.GREEN);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(266, 256, 188, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setBounds(451, 256, 214, 31);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Update Amount");
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Addhar_No=textField.getText();
				String Opening_Amount=textField_1.getText();
				
				try
				   {
					   Class.forName("com.mysql.jdbc.Driver");
					   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");
					   if(	textField.getText().equals("")&& textField_1.getText().equals(""))
		               {
		            	   JOptionPane.showMessageDialog(null,"Please Fill Aadhar No");
		            	   textField.setText(" ");
		            	   textField_1.setText(" ");
		               }
		               else
		               {
		            		PreparedStatement st = con.prepareStatement("Select Addhar_No from bank1 where Addhar_No=?");
		            		st.setString(1, Addhar_No);
		            		ResultSet  rs=st.executeQuery();
		            		if(rs.next())
							{
								
								String sql="UPDATE bank1 SET Opening_Amount=? WHERE Addhar_No=?";
								PreparedStatement st1 = con.prepareStatement(sql);
								st1.setString(1,Opening_Amount);
								st1.setString(2,Addhar_No);
								st1.executeUpdate();
								JOptionPane.showMessageDialog(btnNewButton_1,"Amount Deposite Succesfully");
							}
		            		
		               }
				   
				   }
				catch(Exception e1)
				  {
					  System.out.println(e1);
				  }
				
			}
			
		});
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(282, 352, 229, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Login");
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				 new p11();
			}
		});
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(580, 352, 125, 39);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete Account");
		btnNewButton_3.setBackground(Color.ORANGE);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				 new p55();
			}
		});
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBounds(661, 492, 183, 33);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Back");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				 new p22();
			}
		});
		btnNewButton_4.setBackground(Color.YELLOW);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_4.setBounds(54, 44, 107, 21);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Pratik\\Downloads\\news_today-master\\news_today-master\\15.jpg"));
		lblNewLabel_3.setBounds(24, 21, 1299, 666);
		frame.getContentPane().add(lblNewLabel_3);
		frame.setVisible(true);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	}
}
