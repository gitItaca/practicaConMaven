package JardineriaDAOProyectoMaven.PracticaInterfazMaven.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterSuccesfully {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void RegisterSuccesWin() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterSuccesfully window = new RegisterSuccesfully();
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
	public RegisterSuccesfully() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(85, 107, 47));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data are registered succesfully!");
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel.setBounds(0, 25, 370, 80);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		btnClose.setFont(new Font("Dialog", Font.BOLD, 14));
		btnClose.setBorderPainted(false);
		btnClose.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClose.setBackground(new Color(255, 215, 0));
		btnClose.setBounds(149, 102, 65, 25);
		frame.getContentPane().add(btnClose);
		frame.setUndecorated(true);
		frame.setResizable(false);
		frame.setBounds(100, 100, 370, 171);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
