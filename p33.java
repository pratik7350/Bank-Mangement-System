import java.awt.EventQueue;

import javax.swing.JFrame;



	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;

	import java.awt.Font;
	import javax.swing.JTextField;
	import javax.swing.JRadioButton;
	import java.awt.Color;

	import javax.swing.ButtonGroup;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.awt.event.ActionEvent;
	import javax.swing.ImageIcon;

	public class p33 {

		

			private JFrame frame;
			private JTextField textField;
			private JTextField textField_1;
			private JTextField textField_2;
			private JTextField textField_3;
			private JTextField textField_4;
			private JTextField textField_5;
			private JTextField textField_6;
			private JTextField textField_7;
			private JTextField textField_8;

			/**
			 * Launch the application.
			 */
			public static void main(String[] args) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							p33 window = new p33();
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
			public p33() {
				frame = new JFrame();
				frame.getContentPane().setForeground(Color.WHITE);
				frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
				frame.getContentPane().setBackground(Color.BLACK);
				frame.setBounds(100, 100, 1391, 781);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null); 
				
				
				JLabel lblNewLabel = new JLabel("Open New Account");
				lblNewLabel.setForeground(Color.DARK_GRAY);
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
				lblNewLabel.setBounds(25, 35, 421, 102);
				frame.getContentPane().add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("First Name:");
				lblNewLabel_1.setForeground(Color.WHITE);
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblNewLabel_1.setBounds(389, 200, 118, 23);
				frame.getContentPane().add(lblNewLabel_1);
				
				textField = new JTextField();
				textField.setBackground(Color.WHITE);
				textField.setForeground(Color.DARK_GRAY);
				textField.setFont(new Font("Tahoma", Font.BOLD, 15));
				textField.setBounds(507, 200, 136, 24);
				frame.getContentPane().add(textField);
				textField.setColumns(10);
				
				JLabel lblNewLabel_2 = new JLabel("Last Name:");
				lblNewLabel_2.setForeground(Color.WHITE);
				lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblNewLabel_2.setBounds(389, 246, 118, 23);
				frame.getContentPane().add(lblNewLabel_2);
				
				textField_1 = new JTextField();
				textField_1.setForeground(Color.DARK_GRAY);
				textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
				textField_1.setBounds(507, 247, 136, 23);
				frame.getContentPane().add(textField_1);
				textField_1.setColumns(10);
				
				JLabel lblNewLabel_3 = new JLabel("Email-ID:");
				lblNewLabel_3.setForeground(Color.WHITE);
				lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblNewLabel_3.setBounds(389, 293, 118, 23);
				frame.getContentPane().add(lblNewLabel_3);
				
				textField_2 = new JTextField();
				textField_2.setForeground(Color.DARK_GRAY);
				textField_2.setFont(new Font("Tahoma", Font.BOLD, 15));
				textField_2.setBounds(507, 293, 136, 24);
				frame.getContentPane().add(textField_2);
				textField_2.setColumns(10);
				
				JLabel lblNewLabel_4 = new JLabel("Username:");
				lblNewLabel_4.setForeground(Color.WHITE);
				lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblNewLabel_4.setBounds(389, 343, 118, 23);
				frame.getContentPane().add(lblNewLabel_4);
				
				textField_3 = new JTextField();
				textField_3.setForeground(Color.DARK_GRAY);
				textField_3.setFont(new Font("Tahoma", Font.BOLD, 15));
				textField_3.setBounds(507, 343, 136, 24);
				frame.getContentPane().add(textField_3);
				textField_3.setColumns(10);
				
				JLabel lblNewLabel_5 = new JLabel("Password:");
				lblNewLabel_5.setForeground(Color.WHITE);
				lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblNewLabel_5.setBounds(389, 384, 118, 23);
				frame.getContentPane().add(lblNewLabel_5);
				
				textField_4 = new JTextField();
				textField_4.setForeground(Color.DARK_GRAY);
				textField_4.setFont(new Font("Tahoma", Font.BOLD, 15));
				textField_4.setBounds(507, 385, 136, 23);
				frame.getContentPane().add(textField_4);
				textField_4.setColumns(10);
				
				JLabel lblNewLabel_6 = new JLabel("Addhar No:");
				lblNewLabel_6.setForeground(Color.WHITE);
				lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblNewLabel_6.setBounds(389, 423, 118, 26);
				frame.getContentPane().add(lblNewLabel_6);
				
				textField_5 = new JTextField();
				textField_5.setForeground(Color.DARK_GRAY);
				textField_5.setFont(new Font("Tahoma", Font.BOLD, 15));
				textField_5.setBounds(507, 426, 136, 23);
				frame.getContentPane().add(textField_5);
				textField_5.setColumns(10);
				
				JLabel lblNewLabel_7 = new JLabel("PAN-No:");
				lblNewLabel_7.setForeground(Color.WHITE);
				lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblNewLabel_7.setBounds(389, 470, 118, 23);
				frame.getContentPane().add(lblNewLabel_7);
				
				textField_6 = new JTextField();
				textField_6.setForeground(Color.DARK_GRAY);
				textField_6.setFont(new Font("Tahoma", Font.BOLD, 15));
				textField_6.setBounds(507, 471, 136, 23);
				frame.getContentPane().add(textField_6);
				textField_6.setColumns(10);
				
				JLabel lblNewLabel_8 = new JLabel("Account Type:");
				lblNewLabel_8.setForeground(Color.WHITE);
				lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblNewLabel_8.setBounds(389, 522, 141, 23);
				frame.getContentPane().add(lblNewLabel_8);
				
				JRadioButton rdbtnNewRadioButton = new JRadioButton("Saving");
				rdbtnNewRadioButton.setBackground(Color.YELLOW);
				rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
				rdbtnNewRadioButton.setBounds(540, 523, 103, 21);
				frame.getContentPane().add(rdbtnNewRadioButton);
				
				JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Current");
				rdbtnNewRadioButton_1.setBackground(Color.YELLOW);
				rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
				rdbtnNewRadioButton_1.setBounds(674, 523, 103, 21);
				frame.getContentPane().add(rdbtnNewRadioButton_1);
				
				JLabel lblNewLabel_9 = new JLabel("Annual_Icome:");
				lblNewLabel_9.setForeground(Color.WHITE);
				lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblNewLabel_9.setBounds(389, 572, 153, 23);
				frame.getContentPane().add(lblNewLabel_9);
				
				textField_7 = new JTextField();
				textField_7.setForeground(Color.DARK_GRAY);
				textField_7.setFont(new Font("Tahoma", Font.BOLD, 15));
				textField_7.setBounds(547, 572, 130, 24);
				frame.getContentPane().add(textField_7);
				textField_7.setColumns(10);
				
				JLabel lblNewLabel_10 = new JLabel("Opening_Amount:");
				lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblNewLabel_10.setForeground(Color.WHITE);
				lblNewLabel_10.setBounds(389, 619, 170, 23);
				frame.getContentPane().add(lblNewLabel_10);
				
				textField_8 = new JTextField();
				textField_8.setForeground(Color.DARK_GRAY);
				textField_8.setFont(new Font("Tahoma", Font.BOLD, 15));
				textField_8.setBounds(569, 619, 136, 24);
				frame.getContentPane().add(textField_8);
				textField_8.setColumns(10);
				frame.setVisible(true);
				
				ButtonGroup bg=new ButtonGroup();
				bg.add(rdbtnNewRadioButton);
				bg.add(rdbtnNewRadioButton_1);
				
				JButton btnNewButton = new JButton("Submit");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						 
						  
							  try
							  {
								  Class.forName("com.mysql.jdbc.Driver");
								  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");
								  
								  String type="";
								  
								  if(rdbtnNewRadioButton.isSelected())
								  {
									  type="Saving";
								  }
								  else if(rdbtnNewRadioButton_1.isSelected())
								  {
									  type="Current";
								  }
								  System.out.println(bg.getSelection().getActionCommand());
								  
								  if(e.getSource()==btnNewButton)
								   {
									  String  First_Name  =textField.getText();
									  String  Last_Name  =textField_1.getText();
									  String  Email_ID  =textField_2.getText();
									  String  username  =textField_3.getText();
									  String  password1  =textField_4.getText();
									  String  Addhar_No  =textField_5.getText();
									  String  Pan_No  =textField_6.getText();
									  
									   String  Account_Type  =rdbtnNewRadioButton.getText();
									   String Annual_Icome  =textField_7.getText();
									  String Opening_Amount  =textField_8.getText();
									   
									  
									  
										
										
										  String query="insert into bank1 values(?,?,?,?,?,?,?,?,?,?)";
										   PreparedStatement stmt=con.prepareStatement(query);
										   stmt.setString(1,First_Name);
										   stmt.setString(2,Last_Name);
										   stmt.setString(3,Email_ID);
										   stmt.setString(4, username);
										   stmt.setString(5,password1);
										   stmt.setString(6,Addhar_No);
										   stmt.setString(7, Pan_No);
										   stmt.setString(8, Account_Type);
										   stmt.setString(9,Annual_Icome);
										   stmt.setString(10,Opening_Amount);
										   
										   stmt.executeUpdate();
										   JOptionPane.showMessageDialog(btnNewButton,"Your Data Sucusfully Added");
										   textField.setText("");
										   textField_1.setText("");
										   textField_2.setText("");
										   textField_3.setText("");
										   textField_4.setText("");
										   textField_5.setText("");
										   textField_6.setText("");
										   textField_7.setText("");
										   textField_8.setText("");
										
										   
								   }
								}
							  catch(Exception e1)
							  {
								  System.out.println(e1);
							  }
						  }
					
				});
				btnNewButton.setBackground(Color.MAGENTA);
				btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnNewButton.setBounds(434, 659, 108, 26);
				frame.getContentPane().add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("Login");
				btnNewButton_1.setBackground(Color.MAGENTA);
				btnNewButton_1.setForeground(Color.BLACK);
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						frame.dispose();
						p11 window = new p11();
					}
				});
				btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnNewButton_1.setBounds(592, 659, 85, 26);
				frame.getContentPane().add(btnNewButton_1);
				
				JLabel lblNewLabel_11 = new JLabel("New label");
				lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\Pratik\\Downloads\\news_today-master\\news_today-master\\18.jpg"));
				lblNewLabel_11.setBounds(25, 23, 1342, 711);
				frame.getContentPane().add(lblNewLabel_11);
				
			
				initialize();
			}

			/**
			 * Initialize the contents of the frame.
			 */
			private void initialize() {
				
			}
		}

  
