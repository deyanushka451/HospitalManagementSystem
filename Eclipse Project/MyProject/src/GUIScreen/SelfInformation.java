package GUIScreen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelfInformation extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelfInformation frame = new SelfInformation();
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
	public SelfInformation() {
		setType(Type.UTILITY);
		setTitle("Self Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ProjectByLabel = new JLabel("Project By");
		ProjectByLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		ProjectByLabel.setBounds(147, 219, 153, 14);
		contentPane.add(ProjectByLabel);
		
		JLabel RollNoLabel = new JLabel("Roll No");
		RollNoLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		RollNoLabel.setBounds(147, 261, 153, 14);
		contentPane.add(RollNoLabel);
		
		JLabel lEmailAddressLabel = new JLabel("Email Address");
		lEmailAddressLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lEmailAddressLabel.setBounds(147, 301, 153, 14);
		contentPane.add(lEmailAddressLabel);
		
		JLabel MobileNoLabel = new JLabel("Mobile No");
		MobileNoLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		MobileNoLabel.setBounds(147, 343, 153, 14);
		contentPane.add(MobileNoLabel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\HospitalInformation.jpeg"));
		lblNewLabel.setBounds(101, 0, 446, 217);
		contentPane.add(lblNewLabel);
		
		JLabel ProjectByLabel_1 = new JLabel("Anushka Dey");
		ProjectByLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		ProjectByLabel_1.setBounds(319, 221, 228, 14);
		contentPane.add(ProjectByLabel_1);
		
		JLabel RollNoLabel_1 = new JLabel("24400317047");
		RollNoLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		RollNoLabel_1.setBounds(318, 263, 237, 14);
		contentPane.add(RollNoLabel_1);
		
		JLabel EmailAddressLabel = new JLabel("deyanushka451@gmail.com");
		EmailAddressLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		EmailAddressLabel.setBounds(318, 303, 229, 14);
		contentPane.add(EmailAddressLabel);
		
		JLabel MobileNoLabel_1 = new JLabel("8777064376");
		MobileNoLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		MobileNoLabel_1.setBounds(319, 345, 228, 14);
		contentPane.add(MobileNoLabel_1);
		
		JButton CloseButton = new JButton("Close");
		//Close Button
		CloseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code Start
				setVisible(false);
				new home().setVisible(true);
				//Code End
			}
		});
		CloseButton.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\Close.png"));
		CloseButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		CloseButton.setBounds(439, 406, 108, 23);
		contentPane.add(CloseButton);
	}
}
