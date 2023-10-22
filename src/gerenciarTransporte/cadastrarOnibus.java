package gerenciarTransporte;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class cadastrarOnibus extends JInternalFrame {
	private JTextField txtPlaca;
	private JTextField txtMotorista;
	private JTextField txtCnh;
	private JTextField txtVagas;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastrarOnibus frame = new cadastrarOnibus();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public cadastrarOnibus() {
		
		
		
		setBounds(100, 100, 526, 355);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color (217, 217, 217));
		
		JLabel lblNewLabel = new JLabel("PLACA DO ONIBUS:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(126, 69, 158, 14);
		getContentPane().add(lblNewLabel);
		
		txtPlaca = new JTextField();
		txtPlaca.setBounds(247, 67, 191, 20);
		getContentPane().add(txtPlaca);
		txtPlaca.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("MOTORISTA:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(157, 114, 99, 14);
		getContentPane().add(lblNewLabel_1);
		
		txtMotorista = new JTextField();
		txtMotorista.setBounds(247, 112, 191, 20);
		getContentPane().add(txtMotorista);
		txtMotorista.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("CNH:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(204, 161, 33, 14);
		getContentPane().add(lblNewLabel_2);
		
		txtCnh = new JTextField();
		txtCnh.setBounds(247, 159, 191, 20);
		getContentPane().add(txtCnh);
		txtCnh.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("NÚMERO DE VAGAS:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(119, 216, 125, 14);
		getContentPane().add(lblNewLabel_3);
		
		txtVagas = new JTextField();
		txtVagas.setBounds(247, 214, 86, 20);
		getContentPane().add(txtVagas);
		txtVagas.setColumns(10);
		
		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.setIcon(new ImageIcon(cadastrarOnibus.class.getResource("/imagens/salve-.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVagas.getText().isEmpty() || txtCnh.getText().isEmpty() || txtVagas.getText().isEmpty() ||
						txtMotorista.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "PREENCHA TODOS OS DADOS");
				} else {
					String sPlaca = txtPlaca.getText();
					String sMotorista = txtMotorista.getText();
					String sCnh = txtCnh.getText();
					int nVagas = Integer.parseInt(txtVagas.getText());
					
						try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						
						String url = "jdbc:mysql://localhost:3306/sec_educacao";
						String usuario = "root";
						String senha = "5988";
	                 
						Connection conexao = DriverManager.getConnection(url, usuario, senha);

						PreparedStatement con = conexao.prepareStatement("INSERT INTO onibus(placa,motoristas,cnh, vagas)"
								+ " VALUES (?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
	                 			con.setString(1, sPlaca);
	                 			con.setString(2, sMotorista);
	                 			con.setString(3, sCnh);
	                 			con.setInt(4, nVagas);
	                 			con.executeUpdate();
	                 				JOptionPane.showMessageDialog(null, "CADASTRADO COM SUCESSO");
	                 			con.close();
	                 			
	                 			txtCnh.setText("");
	                 			txtMotorista.setText("");
	                 			txtPlaca.setText("");
	                 			txtVagas.setText("");
	                 			
	                 			conexao.close();
	                 			con.close();
						} catch (ClassNotFoundException | SQLException e1) {
							JOptionPane.showMessageDialog(null, "ERRO AO SALVAR");
							e1.printStackTrace();
						}
						}
			}
		});
		btnNewButton.setBounds(270, 277, 109, 23);
		getContentPane().add(btnNewButton);
		
		ImageIcon logo = new ImageIcon("src/imagens/logofim.png");
		JLabel lblNewLabel_4 = new JLabel(logo);
		lblNewLabel_4.setBounds(10, 11, 86, 94);
		getContentPane().add(lblNewLabel_4);

	}
}
