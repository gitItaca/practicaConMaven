package JardineriaDAOProyectoMaven.PracticaInterfazMaven.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JTable tableClientes;
	private JTable tablePedidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(85, 107, 47));
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setDoubleBuffered(true);
		menuBar.setBorderPainted(false);
		menuBar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		menuBar.setBorder(null);
		menuBar.setMargin(new Insets(10, 20, 10, 50));
		menuBar.setBackground(new Color(105, 105, 105));
		menuBar.setBounds(0, 0, 800, 20);
		frame.getContentPane().add(menuBar);
		
		JButton btnClose = new JButton("X");
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] options = {"Close", "Cancel"};
                int m = JOptionPane.showOptionDialog(frame, "¿Está seguro de que quiere salir?", "Salir del programa", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
                if (m == 0) {
                    System.exit(0);
                }
				//CerrarVentanaConfirmar.main(null);
			}
		});
		btnClose.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnClose.setHorizontalTextPosition(SwingConstants.CENTER);
		btnClose.setFont(new Font("Dialog", Font.BOLD, 14));
		btnClose.setBorderPainted(false);
		btnClose.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClose.setBackground(new Color(255, 215, 0));
		menuBar.add(btnClose);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setAlignmentY(0.5f);
		menuBar_1.setAlignmentX(0.0f);
		menuBar_1.setBackground(new Color(160, 82, 45));
		menuBar_1.setBorder(null);
		menuBar_1.setBounds(0, 20, 800, 40);
		frame.getContentPane().add(menuBar_1);
		
		JMenu mnNewMenu_1 = new JMenu("Clientes");
		mnNewMenu_1.setMargin(new Insets(10, 20, 10, 20));
		mnNewMenu_1.setForeground(new Color(255, 215, 0));
		mnNewMenu_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		mnNewMenu_1.setBackground(new Color(160, 82, 45));
		menuBar_1.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Crear");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CreateUser creaUser = new CreateUser();
				creaUser.createUser();
				//CreateUser.
			}
		});
		mntmNewMenuItem_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CreateUser CreateU = new CreateUser();
				CreateU.createUser();
			}
		});
		mntmNewMenuItem_3.setForeground(new Color(255, 215, 0));
		mntmNewMenuItem_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		mntmNewMenuItem_3.setBackground(new Color(160, 82, 45));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_1_1 = new JMenuItem("Modificar");
		mntmNewMenuItem_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tableClientes.setEnabled(true);
			}
		});
		mntmNewMenuItem_1_1.setForeground(new Color(255, 215, 0));
		mntmNewMenuItem_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		mntmNewMenuItem_1_1.setBackground(new Color(160, 82, 45));
		mnNewMenu_1.add(mntmNewMenuItem_1_1);
		
		JMenuItem mntmNewMenuItem_2_1 = new JMenuItem("Borrar");
		mntmNewMenuItem_2_1.setForeground(new Color(255, 215, 0));
		mntmNewMenuItem_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		mntmNewMenuItem_2_1.setBackground(new Color(160, 82, 45));
		mnNewMenu_1.add(mntmNewMenuItem_2_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBackground(new Color(128, 128, 128));
		tabbedPane.setFont(new Font("Dialog", Font.PLAIN, 14));
		tabbedPane.setBounds(10, 84, 780, 483);
		frame.getContentPane().add(tabbedPane);
		
		String[] columnNamesClient = {"ID", "Name", "Surname", "Telephone", "DNI/NIE", "Num documentation", "E-mail", "Password"};
		Object[][] dataClient = {
			    {"1","Rupaul", "Smith", "986242424", "DNI", "65490362H", "RupaulFantasy@gmail.com", "alcoholDepu56"},
			    {"2", "Adela", "Doe", "678919191", "DNI", "69099062H", "adelina56@gmail.com", "MesaRosaTe"},
			    {"3", "Margarita", "Black", "900828282", "NIE", "P5490362H", "Marmarmar@hotmail.com", "cespedFrio"},			   
			};
		
		String[] columnNamesPedidos = {"ID", "Fecha pedido", "Fecha esperada", "Fecha entrega", "Codigo cliente"};
		Object[][] dataPedidos = {
			    {"20","02/12/2020", "05/12/2020", "10/12/2020", "1"},
			    {"32","16/11/2020", "19/11/2020", "22/11/2020", "2"},
			    {"98", "02/12/2020", "06/12/2020", "20/12/2020", "1"},			   
			};
		
		tableClientes = new JTable(dataClient, columnNamesClient);
		tableClientes.setEnabled(false); //Bloqueo la tabla de clientes
		tableClientes.getTableHeader().setReorderingAllowed(false);
		tableClientes.setRowHeight(25);
		tableClientes.setAutoscrolls(false);
		tableClientes.setAutoCreateColumnsFromModel(false);
		tableClientes.setRowMargin(0);
		tableClientes.setBackground(Color.WHITE);
		tableClientes.setFont(new Font("Dialog", Font.PLAIN, 12));
		tableClientes.getTableHeader().setFont(new Font("Dialog", Font.PLAIN, 14));
		JScrollPane scrollPaneCli = new JScrollPane(tableClientes);
		scrollPaneCli.setFont(new Font("Dialog", Font.PLAIN, 12));
		tabbedPane.addTab("Clientes", null, scrollPaneCli, null);
		
		tablePedidos = new JTable(dataPedidos, columnNamesPedidos);
		tablePedidos.setEnabled(false); //Bloqueo la tabla de pedidos
		tablePedidos.setRowHeight(25);
		JScrollPane scrollPanePed = new JScrollPane(tablePedidos);
		tabbedPane.addTab("Pedidos", null, scrollPanePed, null);
		
		frame.setUndecorated(true);
		frame.setResizable(false);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
