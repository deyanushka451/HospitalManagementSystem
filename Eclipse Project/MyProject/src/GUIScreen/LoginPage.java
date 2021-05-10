package GUIScreen;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.Window.Type;
public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField UsernametextField;
	private JPasswordField PasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setType(Type.UTILITY);
		setTitle("LoginScreen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel UsernameLabel = new JLabel("Username");
		UsernameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		UsernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		UsernameLabel.setBounds(329, 262, 89, 14);
		contentPane.add(UsernameLabel);
		
		JLabel PasswordLabel = new JLabel("Password");
		PasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PasswordLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		PasswordLabel.setBounds(329, 336, 89, 14);
		contentPane.add(PasswordLabel);
		
		UsernametextField = new JTextField();
		UsernametextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		UsernametextField.setBounds(494, 259, 265, 20);
		contentPane.add(UsernametextField);
		UsernametextField.setColumns(10);
		
		JButton LoginButton = new JButton("Login");
		//Login Button
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code Start
				if(UsernametextField.getText().equals("Anushka") && PasswordField.getText().equals("110399"))
				{
					setVisible(false);
					new home().setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
				//Code End
			}
		});
		LoginButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		LoginButton.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\login.png"));
		LoginButton.setBounds(494, 389, 114, 23);
		contentPane.add(LoginButton);
		
		JButton CloseButton = new JButton("Close");
		//Close Button
		CloseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code Start
				int a=JOptionPane.showConfirmDialog(null,"Do you really want to close Application","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
					System.exit(a);
				//Code End
			}
		});
		CloseButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		CloseButton.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\Close.png"));
		CloseButton.setBounds(653, 389, 106, 23);
		contentPane.add(CloseButton);
		
		PasswordField = new JPasswordField();
		PasswordField.setFont(new Font("Tahoma", Font.BOLD, 14));
		PasswordField.setBounds(494, 336, 265, 20);
		contentPane.add(PasswordField);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\login Background final.PNG"));
		lblNewLabel.setBounds(10, -25, 795, 495);
		contentPane.add(lblNewLabel);
	}
}
