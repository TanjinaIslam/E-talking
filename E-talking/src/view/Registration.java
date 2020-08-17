package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField titleField;
	private JTextField FirsttextField;
	private JTextField Lasttextfield;
	private JTextField usertextfield;
	private JPasswordField passwordField;
	private JPasswordField confirmpassfield;
	private JTextField RegEmailtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		setBackground(Color.CYAN);
		setTitle("Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		titleField = new JTextField();
		titleField.setBackground(Color.BLACK);
		titleField.setFont(new Font("Cambria Math", Font.BOLD, 24));
		titleField.setForeground(Color.WHITE);
		titleField.setText("Registration");
		titleField.setBounds(0, 5, 607, 61);
		contentPane.add(titleField);
		titleField.setColumns(10);
		
		JLabel FirstLabel = new JLabel("First Name :");
		FirstLabel.setFont(new Font("Cambria Math", Font.BOLD, 14));
		FirstLabel.setBounds(10, 77, 98, 30);
		contentPane.add(FirstLabel);
		
		FirsttextField = new JTextField();
		FirsttextField.setBounds(178, 77, 140, 30);
		contentPane.add(FirsttextField);
		FirsttextField.setColumns(10);
		
		JLabel lastLabel = new JLabel("Last Name :");
		lastLabel.setFont(new Font("Cambria Math", Font.BOLD, 14));
		lastLabel.setBounds(10, 118, 98, 30);
		contentPane.add(lastLabel);
		
		Lasttextfield = new JTextField();
		Lasttextfield.setBounds(178, 118, 140, 30);
		contentPane.add(Lasttextfield);
		Lasttextfield.setColumns(10);
		
		JLabel userLabel = new JLabel("UserName :");
		userLabel.setFont(new Font("Cambria Math", Font.BOLD, 14));
		userLabel.setBounds(10, 159, 108, 38);
		contentPane.add(userLabel);
		
		usertextfield = new JTextField();
		usertextfield.setBounds(178, 159, 140, 30);
		contentPane.add(usertextfield);
		usertextfield.setColumns(10);
		
		JLabel PassLabel = new JLabel(" Password :");
		PassLabel.setFont(new Font("Cambria Math", Font.BOLD, 14));
		PassLabel.setBounds(10, 247, 98, 30);
		contentPane.add(PassLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(178, 247, 140, 30);
		contentPane.add(passwordField);
		
		JLabel ConfirmLabel = new JLabel("Confirm Password :");
		ConfirmLabel.setFont(new Font("Cambria Math", Font.BOLD, 14));
		ConfirmLabel.setBounds(10, 288, 140, 30);
		contentPane.add(ConfirmLabel);
		
		confirmpassfield = new JPasswordField();
		confirmpassfield.setBounds(178, 288, 140, 30);
		contentPane.add(confirmpassfield);
		
		JLabel DateLabel = new JLabel("Date :");
		DateLabel.setFont(new Font("Cambria Math", Font.BOLD, 14));
		DateLabel.setBounds(10, 329, 98, 30);
		contentPane.add(DateLabel);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(178, 329, 140, 30);
		contentPane.add(dateChooser);
		
		JLabel userpickLabel = new JLabel("User :");
		userpickLabel.setFont(new Font("Cambria Math", Font.BOLD, 14));
		userpickLabel.setBounds(10, 370, 82, 25);
		contentPane.add(userpickLabel);
		
		JRadioButton studentRadioButton = new JRadioButton("Student");
		studentRadioButton.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		studentRadioButton.setBounds(178, 370, 108, 24);
		contentPane.add(studentRadioButton);
		
		JRadioButton examinerRadioButton = new JRadioButton("Examiner");
		examinerRadioButton.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		examinerRadioButton.setBounds(288, 371, 109, 23);
		contentPane.add(examinerRadioButton);
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(studentRadioButton);
		bg.add(examinerRadioButton);
		
		JButton SubmitButton = new JButton("Submit");
		SubmitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String message = "Submitted";
		     JOptionPane.showMessageDialog(null, message);
			}
		});
		SubmitButton.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		SubmitButton.setBounds(178, 414, 98, 30);
		contentPane.add(SubmitButton);
		
		JLabel EmailregLebel = new JLabel("E-mail :");
		EmailregLebel.setFont(new Font("Cambria Math", Font.BOLD, 14));
		EmailregLebel.setBounds(10, 208, 82, 25);
		contentPane.add(EmailregLebel);
		
		RegEmailtextField = new JTextField();
		RegEmailtextField.setBounds(178, 205, 140, 30);
		contentPane.add(RegEmailtextField);
		RegEmailtextField.setColumns(10);
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
			}
		});
		exitButton.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		exitButton.setBounds(297, 415, 100, 30);
		contentPane.add(exitButton);
	}
}
