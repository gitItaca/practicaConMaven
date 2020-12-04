package JardineriaDAOProyectoMaven.PracticaInterfazMaven.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CreateUser {

	private JFrame frame;
	private JTextField textF_Name;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JLabel lblName;
	private JLabel lblObligatory;
	private JTextField textF_Surname;
	private JLabel lblSurname;
	private JTextField textF_Telephone;
	private JLabel lblTelephone;
	private JTextField textF_Documentation;
	private JLabel lblDocumentation;
	private JLabel lblGender;
	private JButton btnReset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateUser window = new CreateUser();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreateUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(85, 107, 47));
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("User register");
		lblTitle.setForeground(new Color(255, 215, 0));
		lblTitle.setFont(new Font("Dialog", Font.BOLD, 25));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(0, 11, 284, 72);
		frame.getContentPane().add(lblTitle);
		
		lblName = new JLabel("Name");
		lblName.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblName.setForeground(new Color(255, 215, 0));
		lblName.setBounds(74, 76, 85, 22);
		frame.getContentPane().add(lblName);
		
		textF_Name = new JTextField();
		textF_Name.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textF_Name.setBackground(new Color(255, 215, 0));
		textF_Name.setBounds(74, 98, 136, 22);
		frame.getContentPane().add(textF_Name);
		textF_Name.setColumns(10);
		
		lblSurname = new JLabel("Surname");
		lblSurname.setForeground(new Color(255, 215, 0));
		lblSurname.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSurname.setBounds(74, 133, 85, 22);
		frame.getContentPane().add(lblSurname);
		
		textF_Surname = new JTextField();
		textF_Surname.setColumns(10);
		textF_Surname.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textF_Surname.setBackground(new Color(255, 215, 0));
		textF_Surname.setBounds(74, 156, 136, 22);
		frame.getContentPane().add(textF_Surname);
		
		lblTelephone = new JLabel("Telephone");
		lblTelephone.setForeground(new Color(255, 215, 0));
		lblTelephone.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblTelephone.setBounds(74, 189, 85, 22);
		frame.getContentPane().add(lblTelephone);
		
		textF_Telephone = new JTextField();
		textF_Telephone.setColumns(10);
		textF_Telephone.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textF_Telephone.setBackground(new Color(255, 215, 0));
		textF_Telephone.setBounds(74, 212, 136, 22);
		frame.getContentPane().add(textF_Telephone);
		
		lblDocumentation = new JLabel("Documentation");
		lblDocumentation.setForeground(new Color(255, 215, 0));
		lblDocumentation.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDocumentation.setBounds(74, 243, 85, 22);
		frame.getContentPane().add(lblDocumentation);
		
		JComboBox<String> comboBox_documentation = new JComboBox<String>();
		comboBox_documentation.setFocusTraversalKeysEnabled(false);
		comboBox_documentation.setBorder(null);
		comboBox_documentation.setFont(new Font("Dialog", Font.PLAIN, 12));
		comboBox_documentation.setBackground(new Color(255, 215, 0));
		comboBox_documentation.setBounds(74, 266, 136, 22);
		comboBox_documentation.addItem("DNI");
		comboBox_documentation.addItem("NIE");
		frame.getContentPane().add(comboBox_documentation);
		
		lblGender = new JLabel("Gender");
		lblGender.setForeground(new Color(255, 215, 0));
		lblGender.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblGender.setBounds(74, 314, 85, 22);
		frame.getContentPane().add(lblGender);
		
		JButton btnOK = new JButton("OK");
		btnOK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textF_Name.getText().isEmpty()) {
					lblName.setForeground(new Color(255, 69, 0));
				}else {
					lblName.setForeground(new Color(255, 215, 0));
				}
				if(textF_Surname.getText().isEmpty()) {
					lblSurname.setForeground(new Color(255, 69, 0));
				}else {
					lblSurname.setForeground(new Color(255, 215, 0));
				}
				if(textF_Telephone.getText().isEmpty()) {
					lblTelephone.setForeground(new Color(255, 69, 0));
				}else {
					lblTelephone.setForeground(new Color(255, 215, 0));
				}
				if(textF_Documentation.getText().isEmpty()) {
					lblDocumentation.setForeground(new Color(255, 69, 0));
				}else {
					lblDocumentation.setForeground(new Color(255, 215, 0));
				}
				if(!(rdbtnMale.isSelected()) && !(rdbtnFemale.isSelected())) {
					lblGender.setForeground(new Color(255, 69, 0));
				}else {
					lblGender.setForeground(new Color(255, 215, 0));
				}
				if((!(rdbtnMale.isSelected()) && !(rdbtnFemale.isSelected())) || (textF_Documentation.getText().isEmpty())
						|| (textF_Telephone.getText().isEmpty()) || (textF_Surname.getText().isEmpty()) 
						|| (textF_Name.getText().isEmpty())) {
					lblObligatory.setVisible(true);
				}else {
					lblObligatory.setVisible(false);
					RegisterSuccesfully regSucces = new RegisterSuccesfully();
					regSucces.RegisterSuccesWin();
				}
				
			}
		});
		btnOK.setFont(new Font("Dialog", Font.BOLD, 14));
		btnOK.setBorderPainted(false);
		btnOK.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnOK.setBackground(new Color(255, 215, 0));
		btnOK.setBounds(145, 389, 65, 25);
		frame.getContentPane().add(btnOK);
		
		JButton btnClose = new JButton("X");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnClose.setFont(new Font("Dialog", Font.BOLD, 14));
		btnClose.setBorderPainted(false);
		btnClose.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClose.setBackground(new Color(255, 215, 0));
		btnClose.setBounds(255, 11, 20, 20);
		frame.getContentPane().add(btnClose);
		
		textF_Documentation = new JTextField();
		textF_Documentation.setColumns(10);
		textF_Documentation.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textF_Documentation.setBackground(new Color(255, 215, 0));
		textF_Documentation.setBounds(74, 285, 136, 22);
		frame.getContentPane().add(textF_Documentation);
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnMale.isSelected()) {
					rdbtnFemale.setSelected(false);
				}
			}
		});
		rdbtnMale.setFocusPainted(false);
		rdbtnMale.setFont(new Font("Dialog", Font.PLAIN, 12));
		rdbtnMale.setBackground(new Color(255, 215, 0));
		rdbtnMale.setBounds(74, 337, 68, 23);
		frame.getContentPane().add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnFemale.isSelected()) {
					rdbtnMale.setSelected(false);
				}
			}
		});
		rdbtnFemale.setFocusPainted(false);
		rdbtnFemale.setFont(new Font("Dialog", Font.PLAIN, 12));
		rdbtnFemale.setBackground(new Color(255, 215, 0));
		rdbtnFemale.setBounds(145, 337, 65, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		lblObligatory = new JLabel("* Check and fill all the red elements.");
		lblObligatory.setVisible(false);
		lblObligatory.setHorizontalAlignment(SwingConstants.CENTER);
		lblObligatory.setForeground(new Color(255, 69, 0));
		lblObligatory.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblObligatory.setBounds(0, 414, 284, 22);
		frame.getContentPane().add(lblObligatory);
		
		btnReset = new JButton("RESET");
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textF_Name.setText(null);
				textF_Surname.setText(null);
				textF_Telephone.setText(null);
				textF_Documentation.setText(null);
				rdbtnMale.setSelected(false);
				rdbtnFemale.setSelected(false);
			}
		});
		btnReset.setFont(new Font("Dialog", Font.BOLD, 14));
		btnReset.setBorderPainted(false);
		btnReset.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnReset.setBackground(new Color(255, 215, 0));
		btnReset.setBounds(74, 389, 65, 25);
		frame.getContentPane().add(btnReset);
		frame.setUndecorated(true);
		frame.setResizable(false);
		frame.setBounds(450, 150, 284, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
