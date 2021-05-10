package GUIScreen;

import java.awt.BorderLayout;




import javax.swing.JOptionPane;
import java.sql.*;

import Connection.ConnectionProvider;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class AddDiagnosisInformation extends JFrame {

	public int flag=0;
	private JPanel contentPane;
	private JTextField PatientIDtextField;
	private JTextField SymptomstextField;
	private JTextField DiagnosistextField;
	private JTextField MedicinestextField;
	private JTable table;
	private JComboBox TypesOfWardcomboBox;
	private JLabel TypesOfWardLabel;
	private JLabel PatientIDDoesNotExistLabel;
	private JCheckBox WardRequiredCheckBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddDiagnosisInformation frame = new AddDiagnosisInformation();
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
	public AddDiagnosisInformation() {
		setType(Type.UTILITY);
		setTitle("Add Diagnosis Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel PatientIDLabel = new JLabel("Patient ID");
		PatientIDLabel.setBounds(65, 66, 88, 17);
		PatientIDLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(PatientIDLabel);
		
		PatientIDtextField = new JTextField();
		PatientIDtextField.setBounds(177, 64, 167, 20);
		PatientIDtextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(PatientIDtextField);
		PatientIDtextField.setColumns(10);
		
		JButton SearchButton = new JButton("Search");
		JScrollPane TablescrollPane = new JScrollPane();
		TablescrollPane.setBounds(23, 148, 569, 52);
		contentPane.add(TablescrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 14));
		TablescrollPane.setViewportView(table);
		
		
		PatientIDDoesNotExistLabel = new JLabel("Patient ID Does Not Exist!");
		PatientIDDoesNotExistLabel.setBounds(177, 111, 208, 14);
		PatientIDDoesNotExistLabel.setForeground(Color.RED);
		PatientIDDoesNotExistLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(PatientIDDoesNotExistLabel);
		PatientIDDoesNotExistLabel.setVisible(false);
		
		//Search Button
		SearchButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//Code Start
				 flag=0;
				String PatientID=PatientIDtextField.getText();
				try
				{
					Connection con=ConnectionProvider.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from PatientDetails where ID='"+PatientID+"';");
					if(!rs.isBeforeFirst())
					{
						PatientIDDoesNotExistLabel.setVisible(true);
					}
					else
					{
						table.setModel(DbUtils.resultSetToTableModel(rs));
						PatientIDDoesNotExistLabel.setVisible(false);
						PatientIDtextField.setEditable(false);
						flag=1;
					}
				}
				catch(Exception E)
				{
					JOptionPane.showMessageDialog(null,E);
				}
				//Code End
			}
		});
		SearchButton.setBounds(378, 63, 122, 23);
		SearchButton.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\search.png"));
		SearchButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(SearchButton);
		
		
		
		
		JLabel SymptomsLabel = new JLabel("Symptom's");
		SymptomsLabel.setBounds(23, 243, 88, 14);
		SymptomsLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(SymptomsLabel);
		
		JLabel DiagnosisLabel = new JLabel("Diagnosis");
		DiagnosisLabel.setBounds(23, 288, 88, 14);
		DiagnosisLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(DiagnosisLabel);
		
		JLabel MedicinesLabel = new JLabel("Medicines");
		MedicinesLabel.setBounds(23, 329, 88, 14);
		MedicinesLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(MedicinesLabel);
		
		SymptomstextField = new JTextField();
		SymptomstextField.setBounds(141, 242, 146, 20);
		SymptomstextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(SymptomstextField);
		SymptomstextField.setColumns(10);
		
		DiagnosistextField = new JTextField();
		DiagnosistextField.setBounds(141, 287, 146, 20);
		DiagnosistextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(DiagnosistextField);
		DiagnosistextField.setColumns(10);
		
		MedicinestextField = new JTextField();
		MedicinestextField.setBounds(141, 328, 146, 20);
		MedicinestextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(MedicinestextField);
		MedicinestextField.setColumns(10);
		
		JLabel WarRequiredLabel = new JLabel("Ward Required?");
		WarRequiredLabel.setBounds(339, 245, 122, 14);
		WarRequiredLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(WarRequiredLabel);
		
		TypesOfWardLabel = new JLabel("Types Of Ward");
		TypesOfWardLabel.setBounds(339, 290, 122, 14);
		TypesOfWardLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(TypesOfWardLabel);
		
		TypesOfWardcomboBox = new JComboBox();
		TypesOfWardcomboBox.setBounds(495, 284, 97, 22);
		TypesOfWardcomboBox.setModel(new DefaultComboBoxModel(new String[] {"General", "Single", "Duo"}));
		TypesOfWardcomboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(TypesOfWardcomboBox);
		TypesOfWardcomboBox.setVisible(false);
		
		WardRequiredCheckBox = new JCheckBox("Yes");
		WardRequiredCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(WardRequiredCheckBox.isSelected())
				{
					TypesOfWardLabel.setVisible(true);
					TypesOfWardcomboBox.setVisible(true);
				}
				else
				{
					TypesOfWardLabel.setVisible(false);
					TypesOfWardcomboBox.setVisible(false);
				}
			}
		});
		WardRequiredCheckBox.setBounds(495, 241, 97, 23);
		WardRequiredCheckBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(WardRequiredCheckBox);
		
		JButton SaveButton = new JButton("Save");
		//Save Button
		SaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code Start
				if(flag==1)
				{
					String PatientID=PatientIDtextField.getText();
					String Symptom=SymptomstextField.getText();
					String Diagnosis=DiagnosistextField.getText();
					String Medicines=MedicinestextField.getText();
					String WardRequired="";
					String TypesOfWard="";
					
					if(WardRequiredCheckBox.isSelected())
					{
						WardRequired="Yes";
						TypesOfWard=(String)TypesOfWardcomboBox.getSelectedItem();
					}
					else
					{
						WardRequired="No";
						TypesOfWard="";
					}
				
					try {
						String Query="insert into DiagnosisDetails values('"+PatientID+"','"+Symptom+"','"+Diagnosis+"','"+Medicines+"','"+WardRequired+"','"+TypesOfWard+"')";
						Connection con=ConnectionProvider.getCon();
						Statement st=con.createStatement();
						st.executeUpdate(Query);
						JOptionPane.showMessageDialog(null,"Successfully Updated");
						new home().setVisible(true);
						setVisible(false);
	
					}
					catch(Exception E)
					{
						JOptionPane.showMessageDialog(null,E);
					}
					}
				else
					JOptionPane.showMessageDialog(null, "PatientID Field is Empty!");
				//Code End
				}
			}
		);
		SaveButton.setBounds(23, 375, 108, 23);
		SaveButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		SaveButton.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\save-icon--1.png"));
		contentPane.add(SaveButton);
		
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
		CloseButton.setBounds(484, 375, 108, 23);
		CloseButton.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\Close.png"));
		CloseButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(CloseButton);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\add new patient background.jpg"));
		lblNewLabel.setBounds(0, 0, 629, 409);
		contentPane.add(lblNewLabel);
	}
}
