package JardineriaDAOProyectoMaven.PracticaInterfazMaven.gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RecoverPasswordWindow {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public void RecoverPassWin() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecoverPasswordWindow window = new RecoverPasswordWindow();
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
	public RecoverPasswordWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(85, 107, 47));
		frame.setUndecorated(true);
		frame.setResizable(false);
		frame.setBounds(500, 150, 273, 197);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(255, 215, 0));
		btnNewButton.setBounds(144, 129, 65, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	//Cerrar ventana al hacer clic en CLOSE
				frame.dispose();
			}
		});
		btnClose.setFont(new Font("Dialog", Font.BOLD, 14));
		btnClose.setBorderPainted(false);
		btnClose.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClose.setBackground(new Color(255, 215, 0));
		btnClose.setBounds(73, 129, 65, 25);
		frame.getContentPane().add(btnClose);
		
		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBackground(new Color(255, 215, 0));
		textField.setBounds(73, 89, 136, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("E-mail");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(73, 72, 49, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblTitle = new JLabel("Recover password");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTitle.setForeground(new Color(255, 215, 0));
		lblTitle.setFont(new Font("Dialog", Font.BOLD, 25));
		lblTitle.setBackground(new Color(176, 196, 222));
		lblTitle.setBounds(0, 11, 273, 44);
		frame.getContentPane().add(lblTitle);
	}

}
