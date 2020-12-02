package JardineriaDAOProyectoMaven.PracticaInterfazMaven.gui;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CerrarVentanaConfirmar extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CerrarVentanaConfirmar dialog = new CerrarVentanaConfirmar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CerrarVentanaConfirmar() {
		setUndecorated(true);
		setBounds(100, 100, 370, 171);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 370, 171);
		contentPanel.setBackground(new Color(85, 107, 47));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("¿Está seguro de que quiere salir?");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
			lblNewLabel.setForeground(new Color(255, 215, 0));
			lblNewLabel.setBounds(0, 30, 370, 80);
			contentPanel.add(lblNewLabel);
		}
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnClose.setFont(new Font("Dialog", Font.BOLD, 14));
		btnClose.setBorderPainted(false);
		btnClose.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClose.setBackground(new Color(255, 215, 0));
		btnClose.setBounds(188, 105, 65, 25);
		contentPanel.add(btnClose);
		
		JButton btnNewButton = new JButton("CANCEL");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBackground(new Color(255, 215, 0));
		btnNewButton.setBounds(112, 105, 65, 25);
		contentPanel.add(btnNewButton);
	}
}
