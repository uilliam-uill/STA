package gerenciarTransporte;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JInternalFrame;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class cadastrarFaculdade extends JInternalFrame {
	private JTextField txtNomeFaculdade;
	private JTextField txtNewCity;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { cadastrarFaculdade frame = new
	 * cadastrarFaculdade(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public cadastrarFaculdade() {
		
		
		setBounds(100, 100, 472, 333);
		getContentPane().setLayout(new CardLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(217, 217, 217));
		getContentPane().add(panel, "name_4962759646622700");
		panel.setLayout(null);
		JComboBox cidadesCombox = new JComboBox();
		cidadesCombox.setFont(new Font("Tahoma", Font.PLAIN, 11));

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/sec_educacao";
			String usuario = "root";
			String senha = "5988";

			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			Statement stmt = conexao.createStatement();
			ResultSet rsCidades = stmt.executeQuery("select id, nome from cidades");
			String nomeCidade = null;
			while (rsCidades.next()) {
				nomeCidade = rsCidades.getString("nome");
				cidadesCombox.addItem(nomeCidade);
			}

			/*PreparedStatement placas = conexao.prepareStatement("SELECT placa FROM onibus");
			ResultSet rsPlacas = placas.executeQuery();
			String placaBox = "";
			while (rsPlacas.next()) {
				placaBox = rsPlacas.getString("placa");
				cidadesCombox.addItem(placaBox);
			}*/
			conexao.close();
			stmt.close();
			rsCidades.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JPanel panelFaculdade = new JPanel();
		panelFaculdade.setForeground(new Color(217, 217, 217));
		panel.setForeground(new Color(217, 217, 217));
		panelFaculdade.setBounds(40, 0, 378, 263);
		panel.add(panelFaculdade);
		panelFaculdade.setLayout(new CardLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(217, 217, 217));
		panelFaculdade.add(panel_1, "name_1210546134404600");
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("NOME DA INSTITUIÇÃO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(134, 57, 123, 14);
		panel_1.add(lblNewLabel);

		txtNomeFaculdade = new JTextField();
		txtNomeFaculdade.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNomeFaculdade.setBounds(67, 87, 245, 20);
		panel_1.add(txtNomeFaculdade);
		txtNomeFaculdade.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("CIDADE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(168, 118, 38, 14);
		panel_1.add(lblNewLabel_1);

		cidadesCombox.setBounds(95, 142, 184, 22);
		panel_1.add(cidadesCombox);
		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setIcon(new ImageIcon(cadastrarFaculdade.class.getResource("/imagens/salve-.png")));
		btnNewButton.setBounds(130, 175, 105, 23);
		panel_1.add(btnNewButton);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(217, 217, 217));
		panelFaculdade.add(panel_2, "name_1210552307951900");
		panel_2.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("NOME DA CIDADE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(143, 34, 87, 14);
		panel_2.add(lblNewLabel_2);

		txtNewCity = new JTextField();
		txtNewCity.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNewCity.setBounds(88, 59, 193, 20);
		panel_2.add(txtNewCity);
		txtNewCity.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("PLACA DO ONIBUS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(139, 106, 91, 14);
		panel_2.add(lblNewLabel_3);

		JComboBox comboBoxPlacas = new JComboBox();
		comboBoxPlacas.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBoxPlacas.setBounds(118, 140, 129, 22);
		panel_2.add(comboBoxPlacas);

		JButton btnNewButton_1 = new JButton("SALVAR");
		btnNewButton_1.setIcon(new ImageIcon(cadastrarFaculdade.class.getResource("/imagens/salve-.png")));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nameCity = txtNewCity.getText();
				String placaTransporte = (String) comboBoxPlacas.getSelectedItem();

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					String url = "jdbc:mysql://localhost:3306/sec_educacao";
					String usuario = "root";
					String senha = "5988";

					Connection conexao = DriverManager.getConnection(url, usuario, senha);

					PreparedStatement SelectidOnibus = conexao.prepareStatement("SELECT id FROM onibus WHERE placa = ?");
					SelectidOnibus.setString(1, placaTransporte);
					ResultSet rsSelectId = SelectidOnibus.executeQuery();
					int idOnibus = 0;
					if(rsSelectId.next()) {
						idOnibus = rsSelectId.getInt("id");
					}
					PreparedStatement insertCidade = conexao.prepareStatement("INSERT INTO cidades (nome, onibus_id) VALUES (?,?)");
					insertCidade.setString(1, nameCity);
					insertCidade.setInt(2, idOnibus);
					insertCidade.execute();
					JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO");
					txtNewCity.setText("");
					
					conexao.close();
					SelectidOnibus.close();
					rsSelectId.close();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton_1.setBounds(130, 199, 100, 23);
		panel_2.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("CIDADE");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(true);
				panel_1.setVisible(false);
				comboBoxPlacas.removeAllItems();
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					String url = "jdbc:mysql://localhost:3306/sec_educacao";
					String usuario = "root";
					String senha = "5988";

					Connection conexao = DriverManager.getConnection(url, usuario, senha);

					PreparedStatement stmt = conexao.prepareStatement("SELECT placa FROM onibus");

					ResultSet rs = stmt.executeQuery();
					while (rs.next()) {
						String sPlaca = rs.getString("placa");
						comboBoxPlacas.addItem(sPlaca);
					}

				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(cadastrarFaculdade.class.getResource("/imagens/cidade.png")));
		btnNewButton_2.setBounds(64, 267, 119, 23);
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("FACULDADE");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel_1.setVisible(true);
				cidadesCombox.removeAll();
				cidadesCombox.removeAllItems();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					String url = "jdbc:mysql://localhost:3306/sec_educacao";
					String usuario = "root";
					String senha = "5988";

					Connection conexao = DriverManager.getConnection(url, usuario, senha);
					Statement stmt = conexao.createStatement();
					ResultSet rsCidades = stmt.executeQuery("select id, nome from cidades");
					String nomeCidade = null;
					while (rsCidades.next()) {
						nomeCidade = rsCidades.getString("nome");
						cidadesCombox.addItem(nomeCidade);
					}

					/*PreparedStatement placas = conexao.prepareStatement("SELECT placa FROM onibus");
					ResultSet rsPlacas = placas.executeQuery();
					String placaBox = "";
					while (rsPlacas.next()) {
						placaBox = rsPlacas.getString("placa");
						cidadesCombox.addItem(placaBox);
					}*/
					conexao.close();
					stmt.close();
					rsCidades.close();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(cadastrarFaculdade.class.getResource("/imagens/faculdade (2).png")));
		btnNewButton_3.setBounds(297, 267, 119, 23);
		panel.add(btnNewButton_3);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/sec_educacao";
			String usuario = "root";
			String senha = "5988";

			Connection conexao = DriverManager.getConnection(url, usuario, senha);

			PreparedStatement stmt = conexao.prepareStatement("SELECT placa FROM onibus");

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String sPlaca = rs.getString("placa");
				comboBoxPlacas.addItem(sPlaca);
			}

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String stringNomeFaculdade = txtNomeFaculdade.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					String url = "jdbc:mysql://localhost:3306/sec_educacao";
					String usuario = "root";
					String senha = "5988";

					Connection conexao = DriverManager.getConnection(url, usuario, senha);

					String cidadeNome = cidadesCombox.getSelectedItem().toString();
					PreparedStatement stmt = conexao.prepareStatement("SELECT id FROM cidades WHERE nome = ?");
					stmt.setString(1, cidadeNome);
					ResultSet rs = stmt.executeQuery();
					int cidadeId = 0;
					if (rs.next()) {
						cidadeId = rs.getInt("id");
					}
					PreparedStatement con = conexao
							.prepareStatement("insert into faculdades (nome, cidade_id) values (?,?)");

					con.setString(1, stringNomeFaculdade);
					con.setInt(2, cidadeId);
					con.executeUpdate();
					
					JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO");
					txtNomeFaculdade.setText("");
					
					con.close();
					conexao.close();
					rs.close();
					
				} catch (ClassNotFoundException e1) {
					JOptionPane.showMessageDialog(null, "ERRO AO SALVAR");
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

	}
}
