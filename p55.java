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
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class p55 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					p55 window = new p55();
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
	public p55() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1392, 732);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Account");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(359, 89, 537, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter PAN-No");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(332, 267, 187, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(560, 266, 207, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete Account");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pan_No=textField.getText();
				
				
				try
				   {
					   Class.forName("com.mysql.jdbc.Driver");
					   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");
					   if(	textField.getText().equals(""))
		               {
		            	   JOptionPane.showMessageDialog(null,"Please Fill PAN No");
		            	   textField.setText(" ");
		            	   
		               }
					   else
		               {
			         		PreparedStatement st = con.prepareStatement("Select Pan_No from bank1 where Pan_No=?");
		            		st.setString(1,Pan_No);
		            		
		            		ResultSet  rs=st.executeQuery();
		            		if(rs.next())
							{
		            			JOptionPane.showMessageDialog(btnNewButton,"PAN-No is Correct");
								String sql="DELETE FROM bank1  WHERE Pan_No=?";
								PreparedStatement st1 = con.prepareStatement(sql);
								st1.setString(1,Pan_No);
								int i=st1.executeUpdate();
								st1.executeUpdate();
								JOptionPane.showMessageDialog(btnNewButton,"Account Delete Succesfully");
								
								frame.dispose();
								new p11();
							}
		            		else
		            		{
		            			JOptionPane.showMessageDialog(btnNewButton,"Invalid PAN-NO");
		            		}
		            		
		               }
				   }
						catch(Exception e1)
						  {
							  System.out.println(e1);
						  }
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(471, 404, 187, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				new p44();
				
			}
		});
		btnBack.setBackground(Color.YELLOW);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(62, 51, 117, 21);
		frame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Pratik\\Downloads\\news_today-master\\news_today-master\\20.jpg"));
		lblNewLabel_2.setBounds(23, 10, 1345, 675);
		frame.getContentPane().add(lblNewLabel_2);
		frame.setVisible(true);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	}
}
