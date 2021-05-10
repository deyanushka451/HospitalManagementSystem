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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Window.Type;

public class FullHistoryOfThePatient extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JScrollPane TablescrollPane;
	private JButton ViewAllRecordsButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FullHistoryOfThePatient frame = new FullHistoryOfThePatient();
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
	public FullHistoryOfThePatient() {
		setType(Type.UTILITY);
		setTitle("Full History Of The Patient");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TablescrollPane = new JScrollPane();
		TablescrollPane.setBounds(10, 11, 724, 402);
		contentPane.add(TablescrollPane);
		
		table = new JTable();
		TablescrollPane.setViewportView(table);
		table.setFont(new Font("Tahoma", Font.BOLD, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		
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
		CloseButton.setBounds(544, 431, 113, 23);
		contentPane.add(CloseButton);
		
		ViewAllRecordsButton = new JButton("View All Records");
		//View All Records Button
		ViewAllRecordsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code Start
				String Query="select PatientDetails.ID,PatientDetails.Name,PatientDetails.ContactNumber,PatientDetails.Age,PatientDetails.Gender,PatientDetails.BloodGroup,PatientDetails.Address,PatientDetails.AnyMajorDisease,DiagnosisDetails.Symptom,DiagnosisDetails.Diagnosis,DiagnosisDetails.Medicines,DiagnosisDetails.WardRequired,DiagnosisDetails.TypesOfWard from PatientDetails inner join DiagnosisDetails where PatientDetails.ID=DiagnosisDetails.PatientID;";
				try
				{
					Connection con=ConnectionProvider.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(Query);
					table.setAutoResizeMode(table.AUTO_RESIZE_OFF);
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch(Exception E)
				{
					JOptionPane.showMessageDialog(null,"Connection Error");
				}
				//Code End
			}
		});
		ViewAllRecordsButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		ViewAllRecordsButton.setBounds(23, 431, 175, 23);
		contentPane.add(ViewAllRecordsButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Eclipse Project\\MyProject\\Icon and Images\\HMS ICON\\add new patient background.jpg"));
		lblNewLabel.setBounds(0, 0, 755, 479);
		contentPane.add(lblNewLabel);
	}
}
