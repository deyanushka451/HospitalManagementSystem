package GUIScreen;
import javax.swing.JOptionPane;



import Connection.ConnectionProvider;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.sql.*;
import java.awt.Window.Type;
public class AddNewPatientRecord extends JFrame {

	private JPanel contentPane;
	private JTextField IDtextField;
	private JTextField NametextField;
	private JTextField ContactNotextField;
	private JTextField AgetextField;
	private JTextField BloodGrouptextField;
	private JTextField AddresstextField;
	private JTextField AnyMoreDiseasetextField;
	private JComboBox GendercomboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewPatientRecord frame = new AddNewPatientRecord();
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
	public AddNewPatientRecord() {
		setType(Type.UTILITY);
		setTitle("AddNewPatientRecord");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		CloseButton.setBounds(513, 423, 116, 23);
		contentPane.add(CloseButton);
		
		JLabel PatientIDLabel = new JLabel("Patient ID");
		PatientIDLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		PatientIDLabel.setBounds(176, 61, 167, 14);
		contentPane.add(PatientIDLabel);
		
		JLabel NameLabel = new JLabel("Name");
		NameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		NameLabel.setBounds(176, 95, 210, 14);
		contentPane.add(NameLabel);
		
		JLabel ContactNoLabel = new JLabel("Contact No");
		ContactNoLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		ContactNoLabel.setBounds(176, 136, 210, 14);
		contentPane.add(ContactNoLabel);
		
		JLabel AgeLabel = new JLabel("Age");
		AgeLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		AgeLabel.setBounds(176, 171, 210, 14);
		contentPane.add(AgeLabel);
		
		JLabel GenderLabel = new JLabel("Gender");
		GenderLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		GenderLabel.setBounds(176, 212, 210, 14);
		contentPane.add(GenderLabel);
		
		JLabel BloodGroupLabel = new JLabel("Blood Group");
		BloodGroupLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		BloodGroupLabel.setBounds(176, 256, 210, 14);
		contentPane.add(BloodGroupLabel);
		
		JLabel AddressLabel = new JLabel("Address");
		AddressLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		AddressLabel.setBounds(176, 296, 210, 14);
		contentPane.add(AddressLabel);
		
		JLabel AnyMajorDiseaseSufferedEarlierLabel = new JLabel("Any Major Disease Suffered Earlier");
		AnyMajorDiseaseSufferedEarlierLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		AnyMajorDiseaseSufferedEarlierLabel.setBounds(176, 333, 210, 14);
		contentPane.add(AnyMajorDiseaseSufferedEarlierLabel);
		
		IDtextField = new JTextField();
		IDtextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		IDtextField.setBounds(390, 60, 239, 20);
		contentPane.add(IDtextField);
		IDtextField.setColumns(10);
		
		NametextField = new JTextField();
		NametextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		NametextField.setBounds(390, 92, 239, 20);
		contentPane.add(NametextField);
		NametextField.setColumns(10);
		
		//code for Auto ID
		//Code Start
		int ID;
		try {
			String query="select count(*) from PatientDetails";
			Connection con=ConnectionProvider.getCon();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			rs.next();
			ID=rs.getInt(1)+1;
			IDtextField.setText(Integer.toString(ID));
			IDtextField.setEditable(false);
		}catch(Exception E)
		{
			JOptionPane.showMessageDialog(null,"Connection Error");
		}
		//Code End
		
		ContactNotextField = new JTextField();
		ContactNotextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		ContactNotextField.setBounds(390, 130, 239, 20);
		contentPane.add(ContactNotextField);
		ContactNotextField.setColumns(10);
		
		AgetextField = new JTextField();
		AgetextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		AgetextField.setBounds(390, 170, 239, 20);
		contentPane.add(AgetextField);
		AgetextField.setColumns(10);
		
		BloodGrouptextField = new JTextField();
		BloodGrouptextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		BloodGrouptextField.setBounds(396, 255, 233, 20);
		contentPane.add(BloodGrouptextField);
		BloodGrouptextField.setColumns(10);
		
		AddresstextField = new JTextField();
		AddresstextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		AddresstextField.setBounds(396, 295, 233, 20);
		contentPane.add(AddresstextField);
		AddresstextField.setColumns(10);
		
		AnyMoreDiseasetextField = new JTextField();
		AnyMoreDiseasetextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		AnyMoreDiseasetextField.setBounds(176, 358, 453, 20);
		contentPane.add(AnyMoreDiseasetextField);
		AnyMoreDiseasetextField.setColumns(10);
		
		GendercomboBox = new JComboBox();
		GendercomboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Others"}));
		GendercomboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		GendercomboBox.setBounds(396, 210, 233, 22);
		contentPane.add(GendercomboBox);
	
		
		JButton SaveButton = new JButton("Save");
		SaveButton.addActionListener(new ActionListener() {
			//Save Button
			public void actionPerformed(ActionEvent e) {
				//Code Start
				String PatientID=IDtextField.getText();
				String Name=NametextField.getText();
				String ContactNo=ContactNotextField.getText();
				String Gender=(String)GendercomboBox.getSelectedItem();
				String Age=AgetextField.getText();
				String BloodGroup=BloodGrouptextField.getText();
				String Address=AddresstextField.getText();
				String AnyMajorDiseaseSufferedEarlier=AnyMoreDiseasetextField.getText();
				String Query="insert into PatientDetails values('"+PatientID+"','"+Name+"','"+ContactNo+"','"+Age+"','"+Gender+"','"+BloodGroup+"','"+Address+"','"+AnyMajorDiseaseSufferedEarlier+"')";
				try
				{
					Connection con=ConnectionProvider.getCon();
					Statement st=con.createStatement();
					st.executeUpdate(Query);
					JOptionPane.showMessageDialog(null,"Successfully Updated");
					setVisible(false);
					new home().setVisible(true);
				}
				catch(Exception E)
				{
					JOptionPane.showMessageDialog(null,"File enter datas in correct format");
				}
				//Code End
				
			}
		
		});
		SaveButton.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\save-icon--1.png"));
		SaveButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		SaveButton.setBounds(176, 423, 106, 23);
		contentPane.add(SaveButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\add new patient background.jpg"));
		lblNewLabel.setBounds(0, 0, 816, 473);
		contentPane.add(lblNewLabel);
	}
}
