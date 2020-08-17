package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.awt.SystemColor;
import javax.swing.JTextPane;

public class Log_In extends JFrame {
	private JTextField emailtextField;
	private JPasswordField passwordField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log_In frame = new Log_In();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Log_In() {
		getContentPane().setBackground(SystemColor.menu);
		setBackground(Color.GREEN);
		setTitle("LOG IN Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 481);
		getContentPane().setLayout(null);
		
		JLabel emailLabel = new JLabel("E-mail :");
		emailLabel.setFont(new Font("Cambria Math", Font.BOLD, 14));
		emailLabel.setBounds(10, 157, 92, 35);
		getContentPane().add(emailLabel);
		
		emailtextField = new JTextField();
		emailtextField.setBounds(128, 161, 155, 35);
		getContentPane().add(emailtextField);
		emailtextField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password :");
		passwordLabel.setEnabled(true);
		passwordLabel.setFont(new Font("Cambria Math", Font.BOLD, 14));
		passwordLabel.setBounds(10, 214, 83, 27);
		getContentPane().add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(128, 214, 155, 35);
		getContentPane().add(passwordField);
		
		JButton resetButton = new JButton("RESET");
		resetButton.setBackground(SystemColor.activeCaption);
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				emailtextField.setText("");
				passwordField.setText("");
			}
		});
		resetButton.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		resetButton.setBounds(154, 272, 92, 27);
		getContentPane().add(resetButton);
		
		JButton loginButton = new JButton("LOG IN");
		loginButton.setBackground(SystemColor.activeCaption);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String emaill = emailtextField.getText();
		        String pass = passwordField.getText();
		        
		        if(emaill.equals("iqra@gmail.com")&&pass.equals("1070"))
		        {
		           Main m = new Main();
		            m.setVisible(true);
		           JOptionPane.showMessageDialog(rootPane,"Log In successful");
		        }
		        else
		              {
		               JOptionPane.showMessageDialog(rootPane,"Error!! Invalid password or email");
		           
		             }
			}
		});
		loginButton.setFont(new Font("Cambria Math", Font.BOLD, 14));
		loginButton.setBounds(157, 328, 89, 27);
		getContentPane().add(loginButton);
		
		JLabel creatLabel = new JLabel("Creat an account");
		creatLabel.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		creatLabel.setBounds(336, 354, 131, 35);
		getContentPane().add(creatLabel);
		
		JButton signInButton = new JButton("Sign In");
		signInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Registration m = new Registration();
				m.setVisible(true);
			}
		});
		signInButton.setFont(new Font("Cambria Math", Font.BOLD, 14));
		signInButton.setBounds(346, 386, 101, 27);
		getContentPane().add(signInButton);
		
		JLabel iconLabel = new JLabel("    E-TALKING");
		iconLabel.setBackground(Color.WHITE);
		iconLabel.setFont(new Font("Cambria", Font.ITALIC, 18));
		iconLabel.setIcon(new ImageIcon("C:\\Users\\Iqra\\Pictures\\images (1).jpg"));
		iconLabel.setBounds(71, 0, 406, 123);
		getContentPane().add(iconLabel);
	}
}

