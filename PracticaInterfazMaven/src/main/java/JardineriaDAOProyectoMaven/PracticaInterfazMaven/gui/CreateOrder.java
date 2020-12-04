 package JardineriaDAOProyectoMaven.PracticaInterfazMaven.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JTextPane;

public class CreateOrder {

	private JFrame frame;
	private JTextField textF_FechaActual;
	private JLabel lblFechaActual;
	private JLabel lblObligatory;
	private JTextField textF_FechaEsperada;
	private JLabel lblFechaEsperada;
	private JTextField textF_FechaDeEntrega;
	private JLabel lblFechaDeEntrega;
	private JLabel lblComments;
	private JButton btnReset;
	private JTextPane textPane_Comments;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateOrder window = new CreateOrder();
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
	public CreateOrder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(85, 107, 47));
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Order register");
		lblTitle.setForeground(new Color(255, 215, 0));
		lblTitle.setFont(new Font("Dialog", Font.BOLD, 25));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(0, 11, 284, 72);
		frame.getContentPane().add(lblTitle);
		
		lblFechaActual = new JLabel("Fecha actual");
		lblFechaActual.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblFechaActual.setForeground(new Color(255, 215, 0));
		lblFechaActual.setBounds(74, 76, 85, 22);
		frame.getContentPane().add(lblFechaActual);
		
		textF_FechaActual = new JTextField();
		textF_FechaActual.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textF_FechaActual.setBackground(new Color(255, 215, 0));
		textF_FechaActual.setBounds(74, 98, 136, 22);
		frame.getContentPane().add(textF_FechaActual);
		textF_FechaActual.setColumns(10);
		
		lblFechaEsperada = new JLabel("Fecha esperada");
		lblFechaEsperada.setForeground(new Color(255, 215, 0));
		lblFechaEsperada.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblFechaEsperada.setBounds(74, 133, 136, 22);
		frame.getContentPane().add(lblFechaEsperada);
		
		textF_FechaEsperada = new JTextField();
		textF_FechaEsperada.setColumns(10);
		textF_FechaEsperada.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textF_FechaEsperada.setBackground(new Color(255, 215, 0));
		textF_FechaEsperada.setBounds(74, 156, 136, 22);
		frame.getContentPane().add(textF_FechaEsperada);
		
		lblFechaDeEntrega = new JLabel("Fecha de entrega");
		lblFechaDeEntrega.setForeground(new Color(255, 215, 0));
		lblFechaDeEntrega.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblFechaDeEntrega.setBounds(74, 189, 136, 22);
		frame.getContentPane().add(lblFechaDeEntrega);
		
		textF_FechaDeEntrega = new JTextField();
		textF_FechaDeEntrega.setColumns(10);
		textF_FechaDeEntrega.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textF_FechaDeEntrega.setBackground(new Color(255, 215, 0));
		textF_FechaDeEntrega.setBounds(74, 212, 136, 22);
		frame.getContentPane().add(textF_FechaDeEntrega);
		
		lblComments = new JLabel("Comments");
		lblComments.setForeground(new Color(255, 215, 0));
		lblComments.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblComments.setBounds(74, 243, 85, 22);
		frame.getContentPane().add(lblComments);
		
		JButton btnOK = new JButton("OK");
		btnOK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textF_FechaActual.getText().isEmpty()) {
					lblFechaActual.setForeground(new Color(255, 69, 0));
				}else {
					lblFechaActual.setForeground(new Color(255, 215, 0));
				}
				if(textF_FechaEsperada.getText().isEmpty()) {
					lblFechaEsperada.setForeground(new Color(255, 69, 0));
				}else {
					lblFechaEsperada.setForeground(new Color(255, 215, 0));
				}
				if(textF_FechaDeEntrega.getText().isEmpty()) {
					lblFechaDeEntrega.setForeground(new Color(255, 69, 0));
				}else {
					lblFechaDeEntrega.setForeground(new Color(255, 215, 0));
				}
				if(textPane_Comments.getText().isEmpty()) {
					lblComments.setForeground(new Color(255, 69, 0));
				}else {
					lblComments.setForeground(new Color(255, 215, 0));
				}
				
				if((textF_FechaDeEntrega.getText().isEmpty()) || (textF_FechaEsperada.getText().isEmpty()) 
						|| (textF_FechaActual.getText().isEmpty())) {
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
				textF_FechaActual.setText(null);
				textF_FechaEsperada.setText(null);
				textF_FechaDeEntrega.setText(null);
				textPane_Comments.setText(null);
			}
		});
		btnReset.setFont(new Font("Dialog", Font.BOLD, 14));
		btnReset.setBorderPainted(false);
		btnReset.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnReset.setBackground(new Color(255, 215, 0));
		btnReset.setBounds(74, 389, 65, 25);
		frame.getContentPane().add(btnReset);
		
		textPane_Comments = new JTextPane();
		textPane_Comments.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textPane_Comments.setFont(new Font("Dialog", Font.PLAIN, 12));
		textPane_Comments.setBackground(new Color(255, 215, 0));
		textPane_Comments.setBounds(74, 268, 136, 89);
		frame.getContentPane().add(textPane_Comments);
		frame.setUndecorated(true);
		frame.setResizable(false);
		frame.setBounds(450, 150, 284, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
