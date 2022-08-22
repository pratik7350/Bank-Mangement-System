import java.awt.EventQueue;

import javax.swing.JFrame;



	import java.awt.EventQueue;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import java.awt.Font;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.awt.event.ActionEvent;
	import java.awt.Color;
	import javax.swing.ImageIcon;

	public class p11 {
		

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
							p11 window = new p11();
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
			public p11() {
				
				
				initialize();
			}

			/**
			 * Initialize the contents of the frame.
			 */
			public void initialize() {
				frame = new JFrame();
				frame.getContentPane().setBackground(new Color(0, 0, 0));
				frame.setBounds(100, 100, 1379, 825);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				
				JLabel lblNewLabel = new JLabel("Bank Magement System ");
				lblNewLabel.setForeground(Color.WHITE);
				lblNewLabel.setBackground(Color.ORANGE);
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
				lblNewLabel.setBounds(554, 40, 386, 45);
				frame.getContentPane().add(lblNewLabel);
				
				textField = new JTextField();
				textField.setForeground(Color.BLACK);
				textField.setFont(new Font("Tahoma", Font.BOLD, 15));
				textField.setBackground(Color.WHITE);
				textField.setBounds(773, 186, 205, 34);
				frame.getContentPane().add(textField);
				textField.setColumns(10);
				
				JLabel lblNewLabel_1 = new JLabel("Username:");
				lblNewLabel_1.setForeground(Color.ORANGE);
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
				lblNewLabel_1.setBounds(554, 171, 186, 51);
				frame.getContentPane().add(lblNewLabel_1);
				
				JLabel lblNewLabel_2 = new JLabel("Password:");
				lblNewLabel_2.setForeground(Color.ORANGE);
				lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
				lblNewLabel_2.setBounds(554, 241, 172, 51);
				frame.getContentPane().add(lblNewLabel_2);
				
				textField_1 = new JTextField();
				textField_1.setForeground(Color.BLACK);
				textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
				textField_1.setBounds(773, 256, 205, 34);
				frame.getContentPane().add(textField_1);
				textField_1.setColumns(10);
				
				JButton btnNewButton = new JButton("Login");
				btnNewButton.setForeground(Color.BLACK);
				btnNewButton.setBackground(Color.ORANGE);
				btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try
						{
							 Class.forName("com.mysql.jdbc.Driver");
							   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");

							//Class.forName("com.mysql.jdbc.Driver");
							 //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");
							Statement st;
						
							
								st=con.createStatement();
								String username=textField.getText();
								String password1=textField_1.getText();
								
								ResultSet rs=st.executeQuery("SELECT * from  bank1 WHERE username= '"+username+"' && password1= '"+password1+"'");
							
							if(rs.next())
							{
								if(username.equals(username)&& password1.equals(password1))
								{
									JOptionPane.showMessageDialog(btnNewButton, "Login Successfully");
									frame.dispose();
									 new p22();
									//window.frame.setVisible(true);
									 
								}
								
							}
							else
							{
								JOptionPane.showMessageDialog(btnNewButton, "Invalid username or password");
							}
							
							
							
						
							
						
						
						}
						
						catch(Exception e1)
						{
							System.out.println(e1);
						}
					}			
					});
					
				
				btnNewButton.setBounds(690, 340, 192, 34);
				frame.getContentPane().add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("Create Account");
				btnNewButton_1.setForeground(Color.RED);
				btnNewButton_1.setBackground(Color.GREEN);
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						frame.dispose();
						new p33();
						
					}
				});
				
				btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnNewButton_1.setBounds(675, 422, 236, 45);
				frame.getContentPane().add(btnNewButton_1);
				
				JButton btnNewButton_2 = new JButton("Learn More");
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.dispose();
						new p66();
					}
				});
				btnNewButton_2.setBackground(Color.YELLOW);
				btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
				btnNewButton_2.setBounds(1007, 533, 172, 27);
				frame.getContentPane().add(btnNewButton_2);
				
				JLabel lblNewLabel_3 = new JLabel("New label");
				lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Pratik\\Downloads\\news_today-master\\news_today-master\\11.jpg"));
				lblNewLabel_3.setBounds(35, 10, 1330, 707);
				frame.getContentPane().add(lblNewLabel_3);
				
			}
		}



