package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel mainLebel = new JLabel("  SPEAKING  TEST  PRACTICE");
		mainLebel.setFont(new Font("Cambria", Font.BOLD, 20));
		mainLebel.setBackground(Color.WHITE);
		mainLebel.setBounds(69, 6, 308, 35);
		contentPane.add(mainLebel);
		
		JLabel viewLabel = new JLabel("View  Examiner");
		viewLabel.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		viewLabel.setBounds(20, 63, 99, 31);
		contentPane.add(viewLabel);
		
		JLabel searchLabel = new JLabel("Search");
		searchLabel.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		searchLabel.setBounds(142, 65, 77, 24);
		contentPane.add(searchLabel);
		
		JLabel proLabel = new JLabel("Profile");
		proLabel.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		proLabel.setBounds(218, 66, 77, 23);
		contentPane.add(proLabel);
		
		JButton logOutButton = new JButton("Log Out");
		logOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String message = "log out";
			     JOptionPane.showMessageDialog(null, message);
			     System.exit(0);
				
			}
		});
		logOutButton.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		logOutButton.setBounds(305, 67, 89, 23);
		contentPane.add(logOutButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(0, 57, 416, 336);
		contentPane.add(panel);
	}
}
