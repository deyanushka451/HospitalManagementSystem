package GUIScreen;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.sql.*;

import Connection.ConnectionProvider;
import net.proteanit.sql.DbUtils;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class UpdatePatientRecord extends JFrame {

	private JPanel contentPane;
	private JTextField AnyMajorDiseaseSufferedEarliertextField;
	private JTextField PatientIDtextField;
	private JTextField NametextField;
	private JTextField ContactNotextField;
	private JTextField AgetextField;
	private JTextField GendertextField;
	private JTextField BloodGrouptextField;
	private JTextField AddresstextField;
	private JTextField SymptomstextField;
	private JTextField DiagnosistextField;
	private JTextField MedicinestextField;
	private JTextField WardRequiredtextField;
	private JTextField TypesOfWardtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdatePatientRecord frame = new UpdatePatientRecord();
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
	public UpdatePatientRecord() {
		setType(Type.UTILITY);
		setTitle("Update Patient Record");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 691);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel PatientIDLabel = new JLabel("Patient ID");
		PatientIDLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		PatientIDLabel.setBounds(121, 69, 199, 14);
		contentPane.add(PatientIDLabel);
		
		JLabel NameLabel = new JLabel("Name");
		NameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		NameLabel.setBounds(121, 106, 199, 14);
		contentPane.add(NameLabel);
		
		JLabel ContactNoLabel = new JLabel("Contact No");
		ContactNoLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		ContactNoLabel.setBounds(121, 143, 199, 14);
		contentPane.add(ContactNoLabel);
		
		JLabel AgeLabel = new JLabel("Age");
		AgeLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		AgeLabel.setBounds(121, 182, 199, 14);
		contentPane.add(AgeLabel);
		
		JLabel GenderLabel = new JLabel("Gender");
		GenderLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		GenderLabel.setBounds(121, 221, 199, 14);
		contentPane.add(GenderLabel);
		
		JLabel BloodGrouoLabel = new JLabel("Blood Group");
		BloodGrouoLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		BloodGrouoLabel.setBounds(121, 257, 199, 14);
		contentPane.add(BloodGrouoLabel);
		
		JLabel AddressLabel = new JLabel("Address");
		AddressLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		AddressLabel.setBounds(121, 298, 199, 14);
		contentPane.add(AddressLabel);
		
		JLabel AnyMajorDiseaseSufferedEarlierLabel = new JLabel("Any Major Disease Suffered Earlier");
		AnyMajorDiseaseSufferedEarlierLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		AnyMajorDiseaseSufferedEarlierLabel.setBounds(121, 337, 277, 14);
		contentPane.add(AnyMajorDiseaseSufferedEarlierLabel);
		
		AnyMajorDiseaseSufferedEarliertextField = new JTextField();
		AnyMajorDiseaseSufferedEarliertextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		AnyMajorDiseaseSufferedEarliertextField.setBounds(121, 371, 370, 20);
		contentPane.add(AnyMajorDiseaseSufferedEarliertextField);
		AnyMajorDiseaseSufferedEarliertextField.setColumns(10);
		
		PatientIDtextField = new JTextField();
		PatientIDtextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		PatientIDtextField.setBounds(296, 68, 195, 20);
		contentPane.add(PatientIDtextField);
		PatientIDtextField.setColumns(10);
		
		NametextField = new JTextField();
		NametextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		NametextField.setBounds(296, 105, 195, 20);
		contentPane.add(NametextField);
		NametextField.setColumns(10);
		
		ContactNotextField = new JTextField();
		ContactNotextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		ContactNotextField.setBounds(296, 142, 195, 20);
		contentPane.add(ContactNotextField);
		ContactNotextField.setColumns(10);
		
		AgetextField = new JTextField();
		AgetextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		AgetextField.setBounds(296, 181, 199, 20);
		contentPane.add(AgetextField);
		AgetextField.setColumns(10);
		
		GendertextField = new JTextField();
		GendertextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		GendertextField.setBounds(296, 220, 195, 20);
		contentPane.add(GendertextField);
		GendertextField.setColumns(10);
		
		BloodGrouptextField = new JTextField();
		BloodGrouptextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		BloodGrouptextField.setBounds(296, 251, 195, 20);
		contentPane.add(BloodGrouptextField);
		BloodGrouptextField.setColumns(10);
		
		AddresstextField = new JTextField();
		AddresstextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		AddresstextField.setBounds(296, 297, 195, 20);
		contentPane.add(AddresstextField);
		AddresstextField.setColumns(10);
		
		JButton SearchButton = new JButton("Search");
		//Search Button
		SearchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code Start
				String PatientID=PatientIDtextField.getText();
				String Query="select PatientDetails.ID,PatientDetails.Name,PatientDetails.ContactNumber,PatientDetails.Age,PatientDetails.Gender,PatientDetails.BloodGroup,PatientDetails.Address,PatientDetails.AnyMajorDisease,DiagnosisDetails.Symptom,DiagnosisDetails.Diagnosis,DiagnosisDetails.Medicines,DiagnosisDetails.WardRequired,DiagnosisDetails.TypesOfWard from PatientDetails,DiagnosisDetails where PatientDetails.ID='"+PatientID+"' and DiagnosisDetails.PatientID='"+PatientID+"';";
				try
				{
					Connection con=ConnectionProvider.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(Query);
					if(rs.next())
					{
						NametextField.setText(rs.getString(2));
						ContactNotextField.setText(rs.getString(3));
						AgetextField.setText(rs.getString(4));
						GendertextField.setText(rs.getString(5));
						BloodGrouptextField.setText(rs.getString(6));
						AddresstextField.setText(rs.getString(7));
						AnyMajorDiseaseSufferedEarliertextField.setText(rs.getString(8));
						SymptomstextField.setText(rs.getString(9));
						DiagnosistextField.setText(rs.getString(10));
						MedicinestextField.setText(rs.getString(11));
						WardRequiredtextField.setText(rs.getString(12));
						TypesOfWardtextField.setText(rs.getString(13));
						PatientIDtextField.setEditable(false);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"PatientID does not Exist");
					}
				}
				catch(Exception E)
				{
					JOptionPane.showMessageDialog(null,E);
				}
				//Code End
				
			}
		});
		SearchButton.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\search.png"));
		SearchButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		SearchButton.setBounds(526, 67, 121, 23);
		contentPane.add(SearchButton);
		
		JButton UpdateButton = new JButton("Update");
		//Update Button
		UpdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code Start
				String PatientID=PatientIDtextField.getText();
				String Name=NametextField.getText();
				String ContactNo=ContactNotextField.getText();
				String Gender=GendertextField.getText();
				String Age=AgetextField.getText();
				String BloodGroup=BloodGrouptextField.getText();
				String Address=AddresstextField.getText();
				String Symptom=SymptomstextField.getText();
				String Diagnosis=DiagnosistextField.getText();
				String Medicines=MedicinestextField.getText();
				String WardRequired=WardRequiredtextField.getText();
				String TypesOfWard=TypesOfWardtextField.getText();
				String AnyMajorDiseaseSufferedEarlier=AnyMajorDiseaseSufferedEarliertextField.getText();
				String Query="Update PatientDetails set Name='"+Name+"',ContactNumber='"+ContactNo+"',Age='"+Age+"',Gender='"+Gender+"',BloodGroup='"+BloodGroup+"',Address='"+Address+"',AnyMajorDisease='"+AnyMajorDiseaseSufferedEarlier+"' where ID='"+PatientID+"'";
				String Query1="Update DiagnosisDetails set Symptom='"+Symptom+"',Diagnosis='"+Diagnosis+"',Medicines='"+Medicines+"',WardRequired='"+WardRequired+"',TypesOfWard='"+TypesOfWard+"' where PatientID='"+PatientID+"'";
				try
				{
					Connection con=ConnectionProvider.getCon();
					Statement st=con.createStatement();
					st.executeUpdate(Query);
					st.executeUpdate(Query1);
					JOptionPane.showMessageDialog(null,"Successfully Updated");
					setVisible(false);
					new home().setVisible(true);
				}
				catch(Exception E)
				{
					JOptionPane.showMessageDialog(null,"Pls Enter Data In Correct Format!");
				}
				//Code End
				
			}
		});
		UpdateButton.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\save-icon--1.png"));
		UpdateButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		UpdateButton.setBounds(121, 618, 129, 23);
		contentPane.add(UpdateButton);
		
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
		CloseButton.setBounds(539, 618, 108, 23);
		contentPane.add(CloseButton);
		
		JLabel SymptomsLabel = new JLabel("Symptom's");
		SymptomsLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		SymptomsLabel.setBounds(121, 417, 138, 14);
		contentPane.add(SymptomsLabel);
		
		SymptomstextField = new JTextField();
		SymptomstextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		SymptomstextField.setBounds(297, 416, 194, 20);
		contentPane.add(SymptomstextField);
		SymptomstextField.setColumns(10);
		
		JLabel DiagnosisLabel = new JLabel("Diagnosis");
		DiagnosisLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		DiagnosisLabel.setBounds(121, 454, 138, 14);
		contentPane.add(DiagnosisLabel);
		
		DiagnosistextField = new JTextField();
		DiagnosistextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		DiagnosistextField.setBounds(296, 453, 195, 20);
		contentPane.add(DiagnosistextField);
		DiagnosistextField.setColumns(10);
		
		JLabel MedicinesLabel = new JLabel("Medicines");
		MedicinesLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		MedicinesLabel.setBounds(121, 496, 138, 14);
		contentPane.add(MedicinesLabel);
		
		MedicinestextField = new JTextField();
		MedicinestextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		MedicinestextField.setBounds(296, 495, 195, 20);
		contentPane.add(MedicinestextField);
		MedicinestextField.setColumns(10);
		
		JLabel WardRequiredLabel = new JLabel("Ward Required");
		WardRequiredLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		WardRequiredLabel.setBounds(121, 536, 138, 14);
		contentPane.add(WardRequiredLabel);
		
		WardRequiredtextField = new JTextField();
		WardRequiredtextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		WardRequiredtextField.setBounds(296, 535, 195, 20);
		contentPane.add(WardRequiredtextField);
		WardRequiredtextField.setColumns(10);
		
		JLabel TypesOfWardLabel = new JLabel("Types Of Ward");
		TypesOfWardLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		TypesOfWardLabel.setBounds(121, 574, 138, 14);
		contentPane.add(TypesOfWardLabel);
		
		TypesOfWardtextField = new JTextField();
		TypesOfWardtextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		TypesOfWardtextField.setBounds(296, 573, 195, 20);
		contentPane.add(TypesOfWardtextField);
		TypesOfWardtextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\add new patient background.jpg"));
		lblNewLabel.setBounds(0, -25, 691, 642);
		contentPane.add(lblNewLabel);
	}
}
