package JardineriaDAOProyectoMaven.PracticaInterfazMaven.gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import java.awt.Rectangle;

public class Login {

	private JFrame frame;
	private JTextField txtFieldUsername;
	private int clicksShowPass = 0;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame("Jardineria app");
		frame.setTitle("");
		frame.getContentPane().setBackground(new Color(85, 107, 47));
		frame.setResizable(false);
		frame.setUndecorated(true); //Quito el menu superior que hay por defecto
	
		frame.setBounds(450, 150, 284, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  Login");
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel.setBounds(0, 11, 284, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(255, 215, 0));
		lblUsername.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername.setBounds(74, 69, 68, 22);
		lblUsername.setFont(new Font("Dialog", Font.PLAIN, 12));
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 215, 0));
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setBounds(74, 117, 68, 22);
		lblPassword.setFont(new Font("Dialog", Font.PLAIN, 12));
		frame.getContentPane().add(lblPassword);
		
		txtFieldUsername = new JTextField();
		txtFieldUsername.setForeground(Color.BLACK);
		txtFieldUsername.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtFieldUsername.setBounds(74, 91, 136, 22);
		txtFieldUsername.setBackground(new Color(255, 215, 0));
		frame.getContentPane().add(txtFieldUsername);
		txtFieldUsername.setColumns(10);
		
		JButton btnOK = new JButton("OK");
		btnOK.setFont(new Font("Dialog", Font.BOLD, 14));
		btnOK.setBackground(new Color(255, 215, 0));
		btnOK.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnOK.setBorderPainted(false);
		btnOK.setBounds(145, 194, 65, 25);
		frame.getContentPane().add(btnOK);
		
		JButton btnShowPassword = new JButton("");
		btnShowPassword.setIcon(new ImageIcon(Login.class.getResource("/eye.png")));
		btnShowPassword.setBorder(null);
		btnShowPassword.setBackground(new Color(85, 107, 47));
		btnShowPassword.setBorderPainted(false);
		
		btnShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //Ensenhar contrasenha si le das al boton
				clicksShowPass++;
				if(clicksShowPass%2 == 0) {
					passwordField.setEchoChar('\u26AB');
				} else {
					passwordField.setEchoChar((char)0);
				}
				
			}
		});
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setFont(new Font("Dialog", Font.BOLD, 14));
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { //Cierro si hace clic
				frame.dispose();
			}
		});
		btnClose.setBackground(new Color(255, 215, 0));
		btnClose.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClose.setBorderPainted(false);
		btnClose.setBounds(74, 194, 65, 25);
		frame.getContentPane().add(btnClose);
		btnShowPassword.setBounds(220, 139, 20, 22);
		frame.getContentPane().add(btnShowPassword);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.BLACK);
		passwordField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField.setBackground(new Color(255, 215, 0));
		passwordField.setBounds(74, 139, 136, 22);
		frame.getContentPane().add(passwordField);
		
		JLabel lblForgotPassword = new JLabel("Forgot password");
		lblForgotPassword.setFont(new Font("Dialog", Font.ITALIC, 11));
		lblForgotPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblForgotPassword.addMouseListener(new MouseAdapter() {
			@Override //Cuando se hace click en el texto, salta la ventana.
			public void mouseClicked(MouseEvent e) {
				RecoverPasswordWindow rPassW = new RecoverPasswordWindow();
				rPassW.RecoverPassWin();
			}
		});
		lblForgotPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblForgotPassword.setForeground(new Color(255, 69, 0));
		lblForgotPassword.setBounds(74, 161, 136, 22);
		frame.getContentPane().add(lblForgotPassword);
	}
}
