package GUIScreen;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Window.Type;

public class home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		setType(Type.UTILITY);
		setTitle("HomePage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 612);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton AddNewPatientRecordButton = new JButton("Add New Patient Record");
		//Add New Patient Record Button
		AddNewPatientRecordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code Start
				setVisible(false);
				new AddNewPatientRecord().setVisible(true);
				//Code End
			}
		});
		AddNewPatientRecordButton.setBounds(10, 11, 221, 82);
		AddNewPatientRecordButton.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\add new patient.png"));
		contentPane.add(AddNewPatientRecordButton);
		
		JButton AddDiagnosisInformationButton = new JButton("Add Diagnosis Information");
		//Add Diagnosis Information Button
		AddDiagnosisInformationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code Start
				setVisible(false);
				new AddDiagnosisInformation().setVisible(true);
				//Code End
			}
		});
		AddDiagnosisInformationButton.setBounds(10, 114, 221, 74);
		AddDiagnosisInformationButton.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\add diag.png"));
		contentPane.add(AddDiagnosisInformationButton);
		
		JButton FullHistoryOfThePatientButton = new JButton("Full History Of The Patient");
		//Full History Of The Patient Button
		FullHistoryOfThePatientButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code Start
				setVisible(false);
				new FullHistoryOfThePatient().setVisible(true);
				//Code End
			}
		});
		FullHistoryOfThePatientButton.setBounds(10, 215, 221, 67);
		FullHistoryOfThePatientButton.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\rsz_history1.png"));
		contentPane.add(FullHistoryOfThePatientButton);
		
		JButton UpdatePatientRecordButton = new JButton("Update Patient Record");
		//Update Patient Record Button
		UpdatePatientRecordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code Start
				setVisible(false);
				new UpdatePatientRecord().setVisible(true);
				//Code End
			}
		});
		UpdatePatientRecordButton.setBounds(10, 312, 221, 56);
		UpdatePatientRecordButton.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\rsz_update_details.png"));
		contentPane.add(UpdatePatientRecordButton);
		
		JButton SelfInformationButton = new JButton("Self Information");
		//Self Information Button
		SelfInformationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code Start
				setVisible(false);
				new SelfInformation().setVisible(true);
				//Code End
			}
		});
		SelfInformationButton.setBounds(10, 394, 221, 56);
		SelfInformationButton.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\rsz_hospital_information.png"));
		contentPane.add(SelfInformationButton);
		
		JButton LogoutButton = new JButton("Logout");
		//Logout Button
		LogoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code Start
				int a=JOptionPane.showConfirmDialog(null,"Do you really want to logout","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					setVisible(false);
					new LoginPage().setVisible(true);
				}
				//Code End
			}
		});
		LogoutButton.setBounds(10, 477, 221, 56);
		LogoutButton.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\exit.png"));
		contentPane.add(LogoutButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\home.jpg"));
		lblNewLabel.setBounds(0, 0, 814, 573);
		contentPane.add(lblNewLabel);
	}
}
