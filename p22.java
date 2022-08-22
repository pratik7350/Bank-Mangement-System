import java.awt.EventQueue;

import javax.swing.JFrame;



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
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.awt.event.ActionEvent;
	import javax.swing.ImageIcon;


	public class p22 {
		

			private JFrame frame;
			private JTextField textField;
			private JTextField textField_1;
			private JTextField textField_2;
			private JTextField textField_3;
			private JTextField textField_4;

			/**
			 * Launch the application.
			 */
			public static void main(String[] args) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							p22 window = new p22();
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
			public p22() {
				frame = new JFrame();
				frame.getContentPane().setBackground(Color.BLACK);
				frame.setBounds(100, 100, 1389, 776);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
				
				JLabel lblNewLabel = new JLabel("Welcome");
				lblNewLabel.setForeground(Color.WHITE);
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 57));
				lblNewLabel.setBounds(44, 10, 327, 63);
				frame.getContentPane().add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("Account Details:");
				lblNewLabel_1.setForeground(Color.DARK_GRAY);
				lblNewLabel_1.setBackground(Color.BLUE);
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1.setBounds(150, 160, 221, 29);
				frame.getContentPane().add(lblNewLabel_1);
				
				textField = new JTextField();
				textField.setFont(new Font("Times New Roman", Font.BOLD, 20));
				textField.setBounds(701, 223, 178, 29);
				frame.getContentPane().add(textField);
				textField.setColumns(10);
				
				JButton btnNewButton = new JButton("View balance");
				btnNewButton.setBackground(Color.ORANGE);
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						 
						 try
						   {
							   Class.forName("com.mysql.jdbc.Driver");
							   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");
							   Statement st;
								   if(e.getSource()==btnNewButton )
								   {
									   st= con.createStatement();
								
							   	   String Addhar_No=(textField.getText());
							   	   
							   	   //System.out.println(Addhar_No);
								
							   	 ResultSet rs=st.executeQuery("select * from bank1 where Addhar_No="+Addhar_No);
								   
								   while(rs.next())
								   {
									   
									   System.out.println(rs.getInt(10));
									   String Opening_Amount = rs.getString(10);
									   textField_1.setText(Opening_Amount);
									   
									  
								   }
								 
								   JOptionPane.showMessageDialog(btnNewButton,"Balance is Load");
							   }
						   }
							   catch(Exception e1)
							   {
								   System.out.println(e1);
							   }
					}
				});
				btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnNewButton.setBounds(498, 223, 164, 29);
				frame.getContentPane().add(btnNewButton);
				
				textField_1 = new JTextField();
				textField_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
				textField_1.setBounds(701, 295, 178, 29);
				frame.getContentPane().add(textField_1);
				textField_1.setColumns(10);
				
				JLabel lblNewLabel_2 = new JLabel("Account_Balance:");
				lblNewLabel_2.setBackground(Color.WHITE);
				lblNewLabel_2.setForeground(Color.DARK_GRAY);
				lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblNewLabel_2.setBounds(493, 294, 185, 29);
				frame.getContentPane().add(lblNewLabel_2);
				
				JButton btnNewButton_2 = new JButton("View more details");
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						 try
						   {
							   Class.forName("com.mysql.jdbc.Driver");
							   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");
							   Statement st;
								   if(e.getSource()==btnNewButton_2 )
								   {
									   st= con.createStatement();
								
							   	   String Addhar_No=(textField.getText());
							   	   
							   	   //System.out.println(Addhar_No);
								
							   	 ResultSet rs=st.executeQuery("select * from bank1 where Addhar_No="+Addhar_No);
								   
								   while(rs.next())
								   {
									   
									  // System.out.println(rs.getInt(1));
									   
									   String First_Name = rs.getString(1);
									   textField_2.setText(First_Name);
									   String Last_Name = rs.getString(2);
									   textField_3.setText(Last_Name);
									   
									   int an_income=rs.getInt(9);
									   textField_4.setText(Integer.toString(an_income));
									 
									 
									   
									  
								   }
								   
								 
								   JOptionPane.showMessageDialog(btnNewButton_2,"Information is Load");
							   }
						   }
							   catch(Exception e2)
							   {
								   System.out.println(e2);
							   }
					
						
						
						
						
						
					}
				});
				btnNewButton_2.setBackground(Color.GREEN);
				btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnNewButton_2.setBounds(584, 358, 232, 36);
				frame.getContentPane().add(btnNewButton_2);
				
				JLabel lblNewLabel_4 = new JLabel("Please Fill Aadhar No");
				lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblNewLabel_4.setForeground(Color.RED);
				lblNewLabel_4.setBounds(711, 262, 178, 18);
				frame.getContentPane().add(lblNewLabel_4);
				
				JLabel lblNewLabel_5 = new JLabel("First_Name:");
				lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblNewLabel_5.setForeground(Color.DARK_GRAY);
				lblNewLabel_5.setBounds(498, 443, 151, 29);
				frame.getContentPane().add(lblNewLabel_5);
				
				textField_2 = new JTextField();
				textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
				textField_2.setBounds(711, 443, 178, 28);
				frame.getContentPane().add(textField_2);
				textField_2.setColumns(10);
				
				JLabel lblNewLabel_3 = new JLabel("Last_Name:");
				lblNewLabel_3.setForeground(Color.DARK_GRAY);
				lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblNewLabel_3.setBounds(498, 500, 136, 18);
				frame.getContentPane().add(lblNewLabel_3);
				
				textField_3 = new JTextField();
				textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
				textField_3.setBounds(711, 495, 178, 28);
				frame.getContentPane().add(textField_3);
				textField_3.setColumns(10);
				
				JLabel lblNewLabel_7 = new JLabel("Anual_Income:");
				lblNewLabel_7.setForeground(Color.DARK_GRAY);
				lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblNewLabel_7.setBounds(498, 551, 164, 23);
				frame.getContentPane().add(lblNewLabel_7);
				
				textField_4 = new JTextField();
				textField_4.setFont(new Font("Tahoma", Font.BOLD, 20));
				textField_4.setBounds(711, 548, 178, 29);
				frame.getContentPane().add(textField_4);
				textField_4.setColumns(10);
				
				JButton btnNewButton_1 = new JButton("Update");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.dispose();
						 new p44();
					}
				});
				btnNewButton_1.setBackground(Color.GREEN);
				btnNewButton_1.setForeground(Color.BLACK);
				btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnNewButton_1.setBounds(584, 625, 215, 46);
				frame.getContentPane().add(btnNewButton_1);
				
				JButton btnNewButton_3 = new JButton("Back");
				btnNewButton_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						frame.dispose();
						 new p11();
					}
				});
				btnNewButton_3.setBackground(Color.YELLOW);
				btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnNewButton_3.setBounds(67, 98, 104, 29);
				frame.getContentPane().add(btnNewButton_3);
				
				JLabel lblNewLabel_6 = new JLabel("New label");
				lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Pratik\\Downloads\\news_today-master\\news_today-master\\12.jpg"));
				lblNewLabel_6.setBounds(25, 75, 1340, 636);
				frame.getContentPane().add(lblNewLabel_6);
				initialize();
				frame.setVisible(true);
			}

			/**
			 * Initialize the contents of the frame.
			 */
			private void initialize() {
				
			}
		}



