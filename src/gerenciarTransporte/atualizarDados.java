package gerenciarTransporte;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class atualizarDados extends JInternalFrame {
	private JTextField txtPlacaUp;
	private JTextField txtMotoristaUp;
	private JTextField txtCnhUp;
	private JTextField txtVagasUp;
	private JTable table;
	private JTable tableFaculdade;
	private JTextField nameFaculdade;
	private JTable table_1;
	private JTextField txtNomeAluno;
	private JTextField txtCpf;
	private JTextField dtNascimento;
	private JTextField txtTelefone;
	private JTextField nCurso;
	private JTextField tCurso;
	private JTextField tSemestre;
	private JTextField aSemestre;
	private JTextField rua;
	private JTextField bairro;
	private JTextField numero;
	private JCheckBox chQuarta;
	private JTable table_2;
	private JTextField nameCidade;
	private JComboBox comboBoxf;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { atualizarDados frame = new
	 * atualizarDados(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public atualizarDados() {
		
		

		setBounds(100, 100, 676, 498);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 650, 424);
		getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel.add(panel_2, "name_6082107134925400");
		panel_2.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "name_6024327023509500");
		panel_1.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel.add(panel_3, "name_6090980816140600");
		panel_3.setLayout(null);

		JLabel lblId = new JLabel("");
		lblId.setBounds(302, 31, 59, 14);
		panel_1.add(lblId);

		JLabel lblNewLabel_4 = new JLabel("ID:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(208, 31, 46, 14);
		panel_1.add(lblNewLabel_4);

		JLabel lblNewLabel_8 = new JLabel("Nome:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(10, 11, 46, 14);
		panel_3.add(lblNewLabel_8);

		txtNomeAluno = new JTextField();
		txtNomeAluno.setBounds(56, 8, 234, 20);
		panel_3.add(txtNomeAluno);
		txtNomeAluno.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("CPF:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_9.setBounds(341, 11, 23, 14);
		panel_3.add(lblNewLabel_9);

		txtCpf = new JTextField();
		txtCpf.setBounds(374, 8, 114, 20);
		panel_3.add(txtCpf);
		txtCpf.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("Data Nascimento:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_10.setBounds(10, 38, 99, 14);
		panel_3.add(lblNewLabel_10);

		dtNascimento = new JTextField();
		dtNascimento.setBounds(116, 35, 86, 20);
		panel_3.add(dtNascimento);
		dtNascimento.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("Telefone:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_11.setBounds(314, 38, 46, 14);
		panel_3.add(lblNewLabel_11);

		JLabel lblIdF = new JLabel("");
		lblIdF.setBounds(272, 56, 46, 14);
		panel_2.add(lblIdF);

		JPanel panel_4 = new JPanel();
		panel.add(panel_4, "name_1349904292533900");
		panel_4.setLayout(null);

		txtTelefone = new JTextField();
		txtTelefone.setBounds(374, 35, 114, 20);
		panel_3.add(txtTelefone);
		txtTelefone.setColumns(10);

		comboBoxf = new JComboBox();
		comboBoxf.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBoxf.setBounds(472, 63, 125, 22);
		panel_3.add(comboBoxf);

		JLabel lblNewLabel_12 = new JLabel("Faculdade:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_12.setBounds(404, 67, 70, 14);
		panel_3.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("Nome do Curso:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_13.setBounds(10, 96, 77, 14);
		panel_3.add(lblNewLabel_13);

		nCurso = new JTextField();
		nCurso.setBounds(92, 93, 110, 20);
		panel_3.add(nCurso);
		nCurso.setColumns(10);

		JLabel lblblblb = new JLabel("Tipo Curso:");
		lblblblb.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblblblb.setBounds(220, 96, 70, 14);
		panel_3.add(lblblblb);

		tCurso = new JTextField();
		tCurso.setBounds(278, 93, 86, 20);
		panel_3.add(tCurso);
		tCurso.setColumns(10);

		JComboBox comboBoxPlacas = new JComboBox();
		comboBoxPlacas.setBounds(234, 117, 122, 22);
		panel_4.add(comboBoxPlacas);

		JLabel lblNewLabel_15 = new JLabel("Total de Semestres:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_15.setBounds(10, 122, 99, 14);
		panel_3.add(lblNewLabel_15);

		tSemestre = new JTextField();
		tSemestre.setBounds(116, 124, 46, 20);
		panel_3.add(tSemestre);
		tSemestre.setColumns(10);

		JLabel lblNewLabel_16 = new JLabel("Semestre Atual:");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_16.setBounds(204, 122, 86, 14);
		panel_3.add(lblNewLabel_16);

		aSemestre = new JTextField();
		aSemestre.setBounds(288, 119, 46, 20);
		panel_3.add(aSemestre);
		aSemestre.setColumns(10);

		JLabel lblIdCidade = new JLabel("");
		lblIdCidade.setBounds(234, 23, 46, 14);
		panel_4.add(lblIdCidade);

		JCheckBox chSegunda = new JCheckBox("SEGUNDA FEIRA");
		chSegunda.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chSegunda.setBounds(12, 191, 119, 23);
		panel_3.add(chSegunda);

		JCheckBox chTerca = new JCheckBox("TERÇA FEIRA");
		chTerca.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chTerca.setBounds(150, 191, 97, 23);
		panel_3.add(chTerca);

		chQuarta = new JCheckBox("QUARTA FEIRA");
		chQuarta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chQuarta.setBounds(267, 191, 109, 23);
		panel_3.add(chQuarta);

		JCheckBox chQuinta = new JCheckBox("QUINTA FEIRA");
		chQuinta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chQuinta.setBounds(404, 191, 97, 23);
		panel_3.add(chQuinta);

		nameCidade = new JTextField();
		nameCidade.setBounds(234, 79, 219, 20);
		panel_4.add(nameCidade);
		nameCidade.setColumns(10);

		JCheckBox chSexta = new JCheckBox("SEXTA FEIRA");
		chSexta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chSexta.setBounds(522, 191, 97, 23);
		panel_3.add(chSexta);

		JLabel lblNewLabel_17 = new JLabel("RUA:");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_17.setBounds(10, 157, 31, 14);
		panel_3.add(lblNewLabel_17);

		rua = new JTextField();
		rua.setBounds(47, 155, 200, 20);
		panel_3.add(rua);
		rua.setColumns(10);

		JLabel lblNewLabel_18 = new JLabel("BAIRRO:");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_18.setBounds(258, 157, 46, 14);
		panel_3.add(lblNewLabel_18);

		bairro = new JTextField();
		bairro.setBounds(314, 154, 184, 20);
		panel_3.add(bairro);
		bairro.setColumns(10);

		JLabel lblNewLabel_19 = new JLabel("Nº");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_19.setBounds(521, 157, 23, 14);
		panel_3.add(lblNewLabel_19);

		numero = new JTextField();
		numero.setBounds(554, 154, 86, 20);
		panel_3.add(numero);
		numero.setColumns(10);

		JComboBox comboBoxUp = new JComboBox();
		comboBoxUp.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBoxUp.setBounds(92, 63, 157, 22);
		panel_3.add(comboBoxUp);

		JLabel lblNewLabel_20 = new JLabel("ID:");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_20.setBounds(534, 11, 23, 14);
		panel_3.add(lblNewLabel_20);

		JLabel lblIdAluno = new JLabel("");
		lblIdAluno.setBounds(554, 11, 46, 14);
		panel_3.add(lblIdAluno);
		// TABELA ONIBUS
		String[] colunasOnibus = { "ID", "PLACA", "MOTORISTA", "CNH", "VAGAS" };

		DefaultTableModel model = new DefaultTableModel(colunasOnibus, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			} // NAO EDITAR DADOS PELA TABELA
		};
		table = new JTable(model);
		JScrollPane scrollOnibus = new JScrollPane(table);
		table.setBounds(10, 272, 630, 141);
		scrollOnibus.setBounds(10, 272, 630, 141);
		panel_1.add(scrollOnibus);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/sec_educacao";
			String usuario = "root";
			String senha = "5988";

			Connection conexao = DriverManager.getConnection(url, usuario, senha);

			PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM onibus");
			ResultSet rsOnibus = stmt.executeQuery();

			DefaultTableModel tabela = (DefaultTableModel) table.getModel();

			int idOnibus = 0;
			String placa = "";
			String motorista = "";
			String cnh = "";
			int vagas = 0;
			while (rsOnibus.next()) {
				idOnibus = rsOnibus.getInt("id");
				vagas = rsOnibus.getInt("vagas");
				motorista = rsOnibus.getString("motoristas");
				placa = rsOnibus.getString("placa");
				cnh = rsOnibus.getString("cnh");
				Object[] linha = { idOnibus, placa, motorista, cnh, vagas };
				tabela.addRow(linha);
			}
			final String placaFinal = placa;
			final String cnhFinal = cnh;
			final int vagasFinal = vagas;
			final String motoristaFinal = motorista;
			final int idFinal = idOnibus;

			String[] colunasFaculdade = { "ID", "NOME", "CIDADE" };
			String[] colunasAluno = { "ID", "NOME", "FACULDADE", "CPF", "TELEFONE" };
			String[] colunasCidade = { "ID", "NOME", "ONIBUS" };

			// TABELA FACULDADE
			DefaultTableModel model2 = new DefaultTableModel(colunasFaculdade, 0) {
				@Override
				public boolean isCellEditable(int row, int column) {
					return false;
				}// NAO EDITAR DADOS TABELA FACULDADE
			};
			tableFaculdade = new JTable(model2);
			JScrollPane scrollFaculdades = new JScrollPane(tableFaculdade);
			tableFaculdade.setBounds(10, 286, 640, 127);
			scrollFaculdades.setBounds(10, 286, 640, 127);
			panel_2.add(scrollFaculdades);
			int cidadeId = 0;

			PreparedStatement prencher = conexao.prepareStatement("SELECT * FROM faculdades WHERE id = ?");
			prencher.setInt(1, cidadeId);
			prencher.execute();

			ResultSet rsBox = prencher.executeQuery();
			String nomeFs = "";
			while (rsBox.next()) {
				nomeFs = rsBox.getString("nome");
				comboBoxf.addItem(nomeFs);
			}
			DefaultTableModel modelCiry = new DefaultTableModel(colunasCidade, 0) {
				@Override
				public boolean isCellEditable(int row, int column) {
					return false;
				}// NAO EDITAR DADOS TABELA FACULDADE
			};
			// tabela cidades
			table_2 = new JTable(modelCiry);
			JScrollPane scrollCidade = new JScrollPane(table_2);
			table_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getClickCount() == 2 && table_2.getSelectedColumn() != -1) {
						int rowCidade = table_2.getSelectedRow();
						String idCidade = table_2.getValueAt(rowCidade, 0).toString();
						String nomeCidade = table_2.getValueAt(rowCidade, 1).toString();
						String textPlaca = table_2.getValueAt(rowCidade, 2).toString();
						nameCidade.setText(nomeCidade);
						lblIdCidade.setText(idCidade);
						for (int i = 0; i < comboBoxPlacas.getItemCount(); i++) {
							String itemF = comboBoxPlacas.getItemAt(i).toString();
							if (itemF.equals(textPlaca)) {
								comboBoxPlacas.setSelectedIndex(i);
								break;
							}
						}
					}
				}
			});

			table_2.setBounds(0, 244, 650, 180);
			scrollCidade.setBounds(0, 244, 650, 180);
			panel_4.add(scrollCidade);

			DefaultTableModel tabelaCidade = (DefaultTableModel) table_2.getModel();

			PreparedStatement prencherCityTable = conexao
					.prepareStatement("SELECT cidades.nome, cidades.id, onibus.placa FROM cidades "
							+ "INNER JOIN onibus ON onibus.id = cidades.onibus_id");

			ResultSet rsprencherCityTable = prencherCityTable.executeQuery();

			String nomeCidade = "";
			String placaOnibus = "";
			int idPreencherOnibus = 0;

			while (rsprencherCityTable.next()) {
				nomeCidade = rsprencherCityTable.getString("cidades.nome");
				placaOnibus = rsprencherCityTable.getString("onibus.placa");
				idPreencherOnibus = rsprencherCityTable.getInt("cidades.id");
				Object[] linhas = { idPreencherOnibus, nomeCidade, placaOnibus };
				tabelaCidade.addRow(linhas);
			}
			rsprencherCityTable.close();
			prencherCityTable.close();
			prencherCityTable.close();
			JLabel lblNewLabel_21 = new JLabel("ID:");
			lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNewLabel_21.setBounds(198, 23, 46, 14);
			panel_4.add(lblNewLabel_21);

			JLabel lblNewLabel_22 = new JLabel("Nome");
			lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNewLabel_22.setBounds(185, 82, 29, 14);
			panel_4.add(lblNewLabel_22);

			PreparedStatement preencherCombo = conexao.prepareStatement("SELECT placa FROM onibus");
			ResultSet rsPreencherCombo = preencherCombo.executeQuery();
			String placaCombo = "";
			while (rsPreencherCombo.next()) {
				placaCombo = rsPreencherCombo.getString("placa");
				comboBoxPlacas.addItem(placaCombo);
			}

			JLabel lblNewLabel_23 = new JLabel("Onibus");
			lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNewLabel_23.setBounds(176, 121, 38, 14);
			panel_4.add(lblNewLabel_23);

			JButton btnNewButton_10 = new JButton("ATUALIZAR");
			btnNewButton_10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String nomeCidadeUp = nameCidade.getText();
					String placaUp = (String) comboBoxPlacas.getSelectedItem();
					String idSCidade = lblIdCidade.getText();
					int idCidadeInt = Integer.parseInt(idSCidade);
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");

						String url = "jdbc:mysql://localhost:3306/sec_educacao";
						String usuario = "root";
						String senha = "5988";

						Connection conexao = DriverManager.getConnection(url, usuario, senha);

						PreparedStatement selecionarOnibusId = conexao
								.prepareStatement("SELECT id FROM onibus WHERE placa = ?");
						selecionarOnibusId.setString(1, placaUp);
						selecionarOnibusId.execute();

						ResultSet rsOnibusId = selecionarOnibusId.executeQuery();
						int onibusId = 0;
						while (rsOnibusId.next()) {
							onibusId = rsOnibusId.getInt("id");
						}

						PreparedStatement updateCidade = conexao
								.prepareStatement("UPDATE cidades SET nome = ?, onibus_id = ? WHERE id = ?");
						updateCidade.setString(1, nomeCidadeUp);
						updateCidade.setInt(2, onibusId);
						updateCidade.setInt(3, idCidadeInt);
						updateCidade.executeUpdate(); // Usar executeUpdate() em vez de execute()
						JOptionPane.showMessageDialog(null, "ATUALIZADO COM SUCESSO");
						nameCidade.setText("");
						lblIdCidade.setText("");

						DefaultTableModel tabelaDel = (DefaultTableModel) table_2.getModel();
						tabelaDel.setRowCount(0);

						PreparedStatement atualizarTableCity = conexao.prepareStatement(
								"SELECT cidades.nome, cidades.id, onibus.placa FROM cidades INNER JOIN "
										+ "onibus ON onibus.id = cidades.onibus_id");
						ResultSet rsAtualizarTableCity = atualizarTableCity.executeQuery();
						while (rsAtualizarTableCity.next()) {
							int idCidadeDel = rsAtualizarTableCity.getInt("cidades.id");
							String placaDel = rsAtualizarTableCity.getString("onibus.placa");
							String nomeCidadeDel = rsAtualizarTableCity.getString("cidades.nome");
							Object[] colunasDel = { idCidadeDel, nomeCidadeDel, placaDel };
							tabelaDel.addRow(colunasDel);
						}

						rsAtualizarTableCity.close(); // Fechar o ResultSet
						atualizarTableCity.close(); // Fechar o PreparedStatement
						selecionarOnibusId.close();
						updateCidade.close();
						conexao.close();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnNewButton_10.setIcon(new ImageIcon(atualizarDados.class.getResource("/imagens/atualizar (4).png")));
			btnNewButton_10.setBounds(135, 170, 109, 23);
			panel_4.add(btnNewButton_10);

			JButton btnNewButton_11 = new JButton("DELETAR");
			btnNewButton_11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (lblIdCidade.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "SELECIONE A CIDADE QUE DESEJA APAGAR");
					} else {
						if (JOptionPane.showConfirmDialog(null, "Tem certezar que quer apagar? Ao apagar você está apagando tudo relacionado a cidade", "remover",
								JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
							String idCity = lblIdCidade.getText();
							int idCityInt = Integer.parseInt(idCity);
							try {
								Class.forName("com.mysql.cj.jdbc.Driver");

								String url = "jdbc:mysql://localhost:3306/sec_educacao";
								String usuario = "root";
								String senha = "5988";

								Connection conexao = DriverManager.getConnection(url, usuario, senha);

								PreparedStatement deletarCidade = conexao
										.prepareStatement("DELETE FROM cidades WHERE id = ?");
								deletarCidade.setInt(1, idCityInt);
								deletarCidade.execute();
								
								PreparedStatement deletarCidadeFaculdade = conexao
										.prepareStatement("DELETE FROM faculdades WHERE cidade_id = ?");
								deletarCidadeFaculdade.setInt(1, idCityInt);
								deletarCidadeFaculdade.execute();
								
								PreparedStatement idFaculdade = conexao
										.prepareStatement("SELECT id FROM faculdades WHERE cidade_id = ?");
								idFaculdade.setInt(1, idCityInt);
								deletarCidade.execute();
								ResultSet rsDeeleteAluno = idFaculdade.executeQuery();
								int idFacul = 0;
								while (rsDeeleteAluno.next()){
									idFacul = rsDeeleteAluno.getInt("id");
									PreparedStatement deleAlunoIdFaculdade = conexao
											.prepareStatement("DELETE FROM alunos WHERE faculdade_id = ?");
									deleAlunoIdFaculdade.setInt(1, idFacul);
									deleAlunoIdFaculdade.execute();
									
									deleAlunoIdFaculdade.close();
								}
								
								JOptionPane.showMessageDialog(null, "DELETADO COM SUCESSO");
								nameCidade.setText("");
								lblIdCidade.setText("");

								DefaultTableModel tabelaDel = (DefaultTableModel) table_2.getModel();
								tabelaDel.setRowCount(0);
								PreparedStatement atualizarTableCity = conexao.prepareStatement(
										"SELECT cidades.nome, cidades.id, onibus.placa FROM cidades INNER JOIN "
												+ "onibus ON onibus.id = cidades.onibus_id");
								ResultSet rsAtualizarTableCity = atualizarTableCity.executeQuery();
								String placaDel = "";
								String nomeCidadeDel = "";
								int idCidadeDel = 0;
								while (rsAtualizarTableCity.next()) {
									idCidadeDel = rsAtualizarTableCity.getInt("cidades.id");
									placaDel = rsAtualizarTableCity.getString("onibus.placa");
									nomeCidadeDel = rsAtualizarTableCity.getString("cidades.nome");
									Object[] colunasDel = { idCidadeDel, nomeCidadeDel, placaDel };
									tabelaDel.addRow(colunasDel);
								}
								conexao.close();
								atualizarTableCity.close();
								rsAtualizarTableCity.close();
								rsDeeleteAluno.close();
								deletarCidade.close();
								deletarCidadeFaculdade.close();
							} catch (ClassNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				}
			});
			btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnNewButton_11.setIcon(new ImageIcon(atualizarDados.class.getResource("/imagens/claro (2).png")));
			btnNewButton_11.setBounds(399, 170, 109, 23);
			panel_4.add(btnNewButton_11);

			JButton btnNewButton_14 = new JButton("ATUALIZAR TABELA");
			btnNewButton_14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");

						String url = "jdbc:mysql://localhost:3306/sec_educacao";
						String usuario = "root";
						String senha = "5988";

						Connection conexao = DriverManager.getConnection(url, usuario, senha);
						DefaultTableModel tabelaCidade = (DefaultTableModel) table_2.getModel();
						tabelaCidade.setRowCount(0);
						PreparedStatement prencherCityTable = conexao
								.prepareStatement("SELECT cidades.nome, cidades.id, onibus.placa FROM cidades "
										+ "INNER JOIN onibus ON onibus.id = cidades.onibus_id");

						ResultSet rsprencherCityTable = prencherCityTable.executeQuery();

						String nomeCidade = "";
						String placaOnibus = "";
						int idPreencherOnibus = 0;

						while (rsprencherCityTable.next()) {
							nomeCidade = rsprencherCityTable.getString("cidades.nome");
							placaOnibus = rsprencherCityTable.getString("onibus.placa");
							idPreencherOnibus = rsprencherCityTable.getInt("cidades.id");
							Object[] linhas = { idPreencherOnibus, nomeCidade, placaOnibus };
							tabelaCidade.addRow(linhas);
						}
						conexao.close();
						prencherCityTable.close();
						rsprencherCityTable.close();
						
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnNewButton_14.setIcon(new ImageIcon(atualizarDados.class.getResource("/imagens/atualizar (4).png")));
			btnNewButton_14.setBounds(491, 221, 149, 23);
			panel_4.add(btnNewButton_14);

			DefaultTableModel model3 = new DefaultTableModel(colunasAluno, 0) {
				@Override
				public boolean isCellEditable(int row, int column) {
					return false;
				} // NAO EDITAR DADOS TABELA ALUNO
			};
			table_1 = new JTable(model3);
			JScrollPane scrollAlunos = new JScrollPane(table_1);
			table_1.addMouseListener(new MouseAdapter() {
				@Override // EVENTO CLICAR TABELA ALUNO
				public void mouseClicked(MouseEvent e) {
					if (e.getClickCount() == 2 && table_1.getSelectedColumn() != -1) {
						comboBoxf.removeAllItems();
						chSegunda.setSelected(false);
						chTerca.setSelected(false);
						chQuarta.setSelected(false);
						chQuinta.setSelected(false);
						chSexta.setSelected(false);
						int rowAluno = table_1.getSelectedRow();
						String idAlunoObj = table_1.getValueAt(rowAluno, 0).toString();
						int idAluno = Integer.parseInt(idAlunoObj);
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");

							String url = "jdbc:mysql://localhost:3306/sec_educacao";
							String usuario = "root";
							String senha = "5988";

							Connection conexao = DriverManager.getConnection(url, usuario, senha);

							PreparedStatement stmtal = conexao.prepareStatement("SELECT * FROM alunos WHERE id = ?");
							stmtal.setInt(1, idAluno);
							stmtal.execute();
							ResultSet rsAluno = stmtal.executeQuery();

							lblIdAluno.setText(String.valueOf(idAluno));
							String nomeAluno = "";
							String cpfAluno = "";
							String telefone = "";
							String dataNascimento = "";
							int totalSemestre = 0;
							int semestreAtual = 0;
							String faculdade = "";
							String cidade = "";
							String nomeCurso = "";
							String tipoCurso = "";
							String eRua = "";
							String eBairro = "";
							String eNumero = "";
							int idFaculdade = 0;
							boolean segunda = false;
							boolean terca = false;
							boolean quarta = false;
							boolean quinta = false;
							boolean sexta = false;
							int idOnibus = 0;
							if (rsAluno.next()) {
								nomeAluno = rsAluno.getString("nome");
								cpfAluno = rsAluno.getString("cpf");
								faculdade = rsAluno.getString("faculdade");
								cidade = rsAluno.getString("cidadeFaculdade");
								nomeCurso = rsAluno.getString("nomeCurso");
								tipoCurso = rsAluno.getString("tipoCurso");
								totalSemestre = rsAluno.getInt("totalSemestres");
								semestreAtual = rsAluno.getInt("semestreAtual");
								eRua = rsAluno.getString("enderecoRua");
								eBairro = rsAluno.getString("enderecoBairro");
								eNumero = rsAluno.getString("enderecoNumero");
								telefone = rsAluno.getString("telefone");
								dataNascimento = rsAluno.getString("dataNascimento");
								idOnibus = rsAluno.getInt("onibus_id");
								segunda = rsAluno.getBoolean("segunda_feira");
								terca = rsAluno.getBoolean("terca_feira");
								quarta = rsAluno.getBoolean("quarta_feira");
								quinta = rsAluno.getBoolean("quinta_Feira");
								sexta = rsAluno.getBoolean("sexta_feira");
							}
							if (segunda == true) {
								chSegunda.setSelected(true);
							}
							if (terca == true) {
								chTerca.setSelected(true);
							}
							if (quarta == true) {
								chQuarta.setSelected(true);
							}
							if (quinta == true) {
								chQuinta.setSelected(true);
							}
							if (sexta == true) {
								chSexta.setSelected(true);
							}
							txtNomeAluno.setText(nomeAluno);
							txtCpf.setText(cpfAluno);
							nCurso.setText(nomeCurso);
							tCurso.setText(tipoCurso);
							tSemestre.setText(String.valueOf(totalSemestre));
							aSemestre.setText(String.valueOf(semestreAtual));
							rua.setText(eRua);
							bairro.setText(eBairro);
							numero.setText(eNumero);
							txtTelefone.setText(telefone);
							dtNascimento.setText(dataNascimento);
							PreparedStatement cityiD = conexao
									.prepareStatement("SELECT id FROM cidades WHERE nome = ?");
							cityiD.setString(1, cidade);
							cityiD.execute();
							ResultSet rsIdCity = cityiD.executeQuery();
							int idCidade = 0;
							if (rsIdCity.next()) {
								idCidade = rsIdCity.getInt("id");
							}
							PreparedStatement city = conexao
									.prepareStatement("SELECT * FROM faculdades WHERE cidade_id = ?");
							city.setInt(1, idCidade);
							city.execute();
							String nameFac;
							ResultSet cittyy = city.executeQuery();
							while (cittyy.next()) {
								nameFac = cittyy.getString("nome");
								comboBoxf.addItem(nameFac);
											for (int i = 0; i < comboBoxUp.getItemCount(); i++) {
								String itemF = comboBoxUp.getItemAt(i).toString();
								if (itemF.equals(cidade)) {
									comboBoxUp.setSelectedIndex(i);
									break;
								}
							}
							for (int i = 0; i < comboBoxf.getItemCount(); i++) {
								String itemF = comboBoxf.getItemAt(i).toString();
								if (itemF.equals(faculdade)) {
									comboBoxf.setSelectedIndex(i);
									break;
								}
							}


							}

							conexao.close();
							rsAluno.close();
							cityiD.close();
							rsIdCity.close();
							city .close();
							 city.close();} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			});
			table_1.setBounds(10, 242, 630, 171);
			scrollAlunos.setBounds(10, 242, 630, 171);
			panel_3.add(scrollAlunos);

			PreparedStatement stmt10 = conexao.prepareStatement("SELECT * FROM alunos");
			ResultSet rsAlunos = stmt10.executeQuery();

			DefaultTableModel tabela3 = (DefaultTableModel) table_1.getModel();

			int idA = 0;
			String nomeAluno = "";
			String faculdade = "";
			String cpf = "";
			String telefone = "";
			while (rsAlunos.next()) {
				idA = rsAlunos.getInt("id");
				nomeAluno = rsAlunos.getString("nome");
				faculdade = rsAlunos.getString("faculdade");
				cpf = rsAlunos.getString("cpf");
				telefone = rsAlunos.getString("telefone");
				Object[] linhaA = { idA, nomeAluno, faculdade, cpf, telefone };
				tabela3.addRow(linhaA);
			}
			JLabel lblNewLabel_5 = new JLabel("Nome da Faculdade:");
			lblNewLabel_5.setBounds(159, 126, 98, 14);
			panel_2.add(lblNewLabel_5);

			JComboBox comboBoxCity = new JComboBox();
			comboBoxCity.setFont(new Font("Tahoma", Font.PLAIN, 11));
			comboBoxCity.setBounds(267, 162, 171, 22);
			panel_2.add(comboBoxCity);
			PreparedStatement preencherCity = conexao.prepareStatement("SELECT nome FROM cidades");
			ResultSet rsPreencherCity = preencherCity.executeQuery();
			String cidade = "";
			while (rsPreencherCity.next()) {
				cidade = rsPreencherCity.getString("nome");
				comboBoxCity.addItem(cidade);
				comboBoxUp.addItem(cidade);
			}
			stmt10.close();
			preencherCity.close();
			rsPreencherCity.close();
			nameFaculdade = new JTextField();
			nameFaculdade.setBounds(267, 123, 171, 20);
			panel_2.add(nameFaculdade);
			nameFaculdade.setColumns(10);

			JLabel lblNewLabel_6 = new JLabel("Cidade:");
			lblNewLabel_6.setBounds(161, 166, 46, 14);
			panel_2.add(lblNewLabel_6);
			// ATUALIZANDO FACULDADES
			JButton btnNewButton_5 = new JButton("ATUALIZAR");
			btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnNewButton_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (nameFaculdade.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "PREENCHA TODOS OS CAMPOS");
					} else {
						int idCidade = 0;
						String cidadeUpdate = (String) comboBoxCity.getSelectedItem();
						String nomeFaculd = nameFaculdade.getText();

						int idUp = Integer.parseInt(lblIdF.getText());
						String nomeFaculdade = nameFaculdade.getText();
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");

							String url = "jdbc:mysql://localhost:3306/sec_educacao";
							String usuario = "root";
							String senha = "5988";

							Connection conexao = DriverManager.getConnection(url, usuario, senha);

							PreparedStatement pegarIdCity = conexao
									.prepareStatement("SELECT id FROM cidades WHERE nome = ?");
							pegarIdCity.setString(1, cidadeUpdate);
							pegarIdCity.execute();
							ResultSet rsPegarIdCity = pegarIdCity.executeQuery();
							if (rsPegarIdCity.next()) {
								idCidade = rsPegarIdCity.getInt("id");
							}

							PreparedStatement updateFaculdade = conexao
									.prepareStatement("UPDATE faculdades SET nome = ?, cidade_id = ? WHERE id = ?");
							updateFaculdade.setString(1, nomeFaculd);
							updateFaculdade.setInt(2, idCidade);
							updateFaculdade.setInt(3, idUp);
							updateFaculdade.execute();

							nameFaculdade.setText("");
							lblIdF.setText("");

							PreparedStatement stmtprencher = conexao.prepareStatement(
									"SELECT faculdades.nome, cidades.nome,faculdades.id FROM faculdades INNER JOIN"
											+ " cidades ON faculdades.cidade_id = cidades.id");
							ResultSet rsPreencherF = stmtprencher.executeQuery();

							DefaultTableModel tabelaUpF = (DefaultTableModel) tableFaculdade.getModel();
							tabelaUpF.setRowCount(0);
							String nomeFacul = "";
							String nomeCity = "";
							int id = 0;

							while (rsPreencherF.next()) {
								id = rsPreencherF.getInt("faculdades.id");
								nomeFacul = rsPreencherF.getString("faculdades.nome");
								nomeCity = rsPreencherF.getString("cidades.nome");
								Object[] linhaF = { id, nomeFacul, nomeCity };
								tabelaUpF.addRow(linhaF);
							}

							JOptionPane.showMessageDialog(null, "ATUALIZADO COM SUCESSO");
							
							conexao.close();
							pegarIdCity.close();
							rsPegarIdCity.close();
							updateFaculdade.close();
							
						} catch (ClassNotFoundException e1) {
							JOptionPane.showMessageDialog(null, "ERRO");
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			});
			btnNewButton_5.setIcon(new ImageIcon(atualizarDados.class.getResource("/imagens/atualizar (4).png")));
			btnNewButton_5.setBounds(166, 236, 122, 23);
			panel_2.add(btnNewButton_5);

			JLabel lblNewLabel_7 = new JLabel("ID:");
			lblNewLabel_7.setBounds(211, 56, 46, 14);
			panel_2.add(lblNewLabel_7);

			PreparedStatement stmt2 = conexao
					.prepareStatement("SELECT faculdades.nome, cidades.nome,faculdades.id FROM faculdades INNER JOIN"
							+ " cidades ON faculdades.cidade_id = cidades.id");
			PreparedStatement stmt3 = conexao.prepareStatement("SELECT nome FROM cidades");
			ResultSet ppp = stmt3.executeQuery();
			String cidadescc = "";
			while (ppp.next()) {
				cidadescc = ppp.getString("nome");
			}
			ResultSet city = stmt2.executeQuery();
			String cidadesC = "";
			String faculdadesC = "";
			while (city.next()) {
				cidadesC = city.getString("cidades.nome");
				faculdadesC = city.getString("faculdades.nome");
			}
			final String faculdadesfinsh = faculdadesC;

			ResultSet rsf = stmt2.executeQuery();

			DefaultTableModel tabela2 = (DefaultTableModel) tableFaculdade.getModel();

			String nomeFacul = "";
			String nomeCity = "";
			int id = 0;

			while (rsf.next()) {
				id = rsf.getInt("faculdades.id");
				nomeFacul = rsf.getString("faculdades.nome");
				nomeCity = rsf.getString("cidades.nome");
				Object[] linhaF = { id, nomeFacul, nomeCity };
				tabela2.addRow(linhaF);
			}
			final int idfinalll = id;
			stmt2.close();
			stmt3.close();
			ppp.close();
			city.close();
			rsf.close();
			// EVENTO DE CLICAR TABELA FACULDADES
			tableFaculdade.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getClickCount() == 2 && tableFaculdade.getSelectedColumn() != -1) {
						int row = tableFaculdade.getSelectedRow();
						lblIdF.setText(tableFaculdade.getValueAt(row, 0).toString());
						nameFaculdade.setText(tableFaculdade.getValueAt(row, 1).toString());
						String fimFac = tableFaculdade.getValueAt(row, 2).toString();

						// Verificar e selecionar o item na combobox
						for (int i = 0; i < comboBoxCity.getItemCount(); i++) {
							String itemF = comboBoxCity.getItemAt(i).toString();
							if (itemF.equals(fimFac)) {
								comboBoxCity.setSelectedIndex(i);
								break;
							}
						}
					}
				}
			});
			// DELETAR TABELA FACULDADE
			JButton btnNewButton_6 = new JButton("DELETAR");
			btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnNewButton_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (lblIdF.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Selecione um item para deletar!");
					} else if (JOptionPane.showConfirmDialog(null,
							"Deseja mesmo deletar todas informações do item selecionado?", "remover",
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

						int rowDelete = tableFaculdade.getSelectedRow();
						int idD = Integer.parseInt(lblIdF.getText());
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");

							String url = "jdbc:mysql://localhost:3306/sec_educacao";
							String usuario = "root";
							String senha = "5988";

							Connection conexao = DriverManager.getConnection(url, usuario, senha);

							PreparedStatement stmt4 = conexao.prepareStatement("DELETE FROM faculdades WHERE id = ?");
							stmt4.setInt(1, idD);
							stmt4.execute();
							tabela2.removeRow(rowDelete);
							nameFaculdade.setText("");
							lblIdF.setText("");

							PreparedStatement stmtprencher = conexao.prepareStatement(
									"SELECT faculdades.nome, cidades.nome,faculdades.id FROM faculdades INNER JOIN"
											+ " cidades ON faculdades.cidade_id = cidades.id");
							ResultSet rsPreencherF = stmtprencher.executeQuery();

							DefaultTableModel tabelaUpF = (DefaultTableModel) tableFaculdade.getModel();
							tabelaUpF.setRowCount(0);
							String nomeFacul = "";
							String nomeCity = "";
							int id = 0;

							while (rsPreencherF.next()) {
								id = rsPreencherF.getInt("faculdades.id");
								nomeFacul = rsPreencherF.getString("faculdades.nome");
								nomeCity = rsPreencherF.getString("cidades.nome");
								Object[] linhaF = { id, nomeFacul, nomeCity };
								tabelaUpF.addRow(linhaF);
							}
							conexao.close();
							stmt4.close();
							stmtprencher.close();
							rsPreencherF.close();

						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			});
			btnNewButton_6.setIcon(new ImageIcon(atualizarDados.class.getResource("/imagens/claro (2).png")));
			btnNewButton_6.setBounds(390, 236, 122, 23);
			panel_2.add(btnNewButton_6);

			JButton btnNewButton_12 = new JButton("ATUALIZAR TABELA");
			btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnNewButton_12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");

						String url = "jdbc:mysql://localhost:3306/sec_educacao";
						String usuario = "root";
						String senha = "5988";

						Connection conexao = DriverManager.getConnection(url, usuario, senha);
						PreparedStatement stmtprencher = conexao.prepareStatement(
								"SELECT faculdades.nome, cidades.nome,faculdades.id FROM faculdades INNER JOIN"
										+ " cidades ON faculdades.cidade_id = cidades.id");
						ResultSet rsPreencherF = stmtprencher.executeQuery();

						DefaultTableModel tabelaUpF = (DefaultTableModel) tableFaculdade.getModel();
						tabelaUpF.setRowCount(0);
						String nomeFacul = "";
						String nomeCity = "";
						int id = 0;

						while (rsPreencherF.next()) {
							id = rsPreencherF.getInt("faculdades.id");
							nomeFacul = rsPreencherF.getString("faculdades.nome");
							nomeCity = rsPreencherF.getString("cidades.nome");
							Object[] linhaF = { id, nomeFacul, nomeCity };
							tabelaUpF.addRow(linhaF);
						}
						conexao.close();
						stmtprencher.close();
						rsPreencherF.close();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			});
			btnNewButton_12.setIcon(new ImageIcon(atualizarDados.class.getResource("/imagens/atualizar (4).png")));
			btnNewButton_12.setBounds(501, 264, 149, 23);
			panel_2.add(btnNewButton_12);

			// EVENTO DE CLICAR NA TABELA DE ONIBUS
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getClickCount() == 2 && table.getSelectedColumn() != -1) {
						int row = table.getSelectedRow();
						lblId.setText(table.getValueAt(row, 0).toString());
						txtPlacaUp.setText(table.getValueAt(row, 1).toString());
						txtMotoristaUp.setText(table.getValueAt(row, 2).toString());
						txtCnhUp.setText(table.getValueAt(row, 3).toString());
						txtVagasUp.setText(table.getValueAt(row, 4).toString());
					}
				}
			});
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JLabel lblNewLabel = new JLabel("Placa:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(233, 59, 29, 14);
		panel_1.add(lblNewLabel);

		txtPlacaUp = new JTextField();
		txtPlacaUp.setBounds(283, 56, 86, 20);
		panel_1.add(txtPlacaUp);
		txtPlacaUp.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Motorista:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(213, 90, 49, 14);
		panel_1.add(lblNewLabel_1);

		txtMotoristaUp = new JTextField();
		txtMotoristaUp.setBounds(283, 87, 86, 20);
		panel_1.add(txtMotoristaUp);
		txtMotoristaUp.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("CNH:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(237, 122, 25, 14);
		panel_1.add(lblNewLabel_2);

		txtCnhUp = new JTextField();
		txtCnhUp.setBounds(283, 119, 86, 20);
		panel_1.add(txtCnhUp);
		txtCnhUp.setColumns(10);

		txtVagasUp = new JTextField();
		txtVagasUp.setBounds(283, 150, 86, 20);
		panel_1.add(txtVagasUp);
		txtVagasUp.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Vagas:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(229, 153, 33, 14);
		panel_1.add(lblNewLabel_3);

		// ATUALIZAR TABELA ONIBUS
		JButton btnNewButton = new JButton("ATUALIZAR");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtPlacaUp.getText().isEmpty() || txtMotoristaUp.getText().isEmpty() || txtCnhUp.getText().isEmpty()
						|| txtVagasUp.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "PREENCHA TODOS OS CAMPOS");
				} else {
					String sPlaca = txtPlacaUp.getText();
					String sMotorista = txtMotoristaUp.getText();
					String sCnh = txtCnhUp.getText();
					int sVagas = Integer.parseInt(txtVagasUp.getText());
					int idF = Integer.parseInt(lblId.getText());

					try {
						Class.forName("com.mysql.cj.jdbc.Driver");

						String url = "jdbc:mysql://localhost:3306/sec_educacao";
						String usuario = "root";
						String senha = "5988";

						Connection conexao = DriverManager.getConnection(url, usuario, senha);

						PreparedStatement stmt = conexao.prepareStatement(
								"UPDATE onibus SET placa = ?, motoristas = ?, cnh = ?, vagas = ? WHERE id = ?");
						stmt.setString(1, sPlaca);
						stmt.setString(2, sMotorista);
						stmt.setString(3, sCnh);
						stmt.setInt(4, sVagas);
						stmt.setInt(5, idF);
						stmt.execute();

						JOptionPane.showMessageDialog(null, "Atualizado com sucesso");

						txtPlacaUp.setText("");
						txtMotoristaUp.setText("");
						txtCnhUp.setText("");
						txtVagasUp.setText("");
						lblId.setText("");

						DefaultTableModel tabelaUpO = (DefaultTableModel) table.getModel();
						tabelaUpO.setRowCount(0);

						PreparedStatement preencherUp = conexao.prepareStatement("SELECT * FROM ONIBUS");
						int idOnibus = 0;
						String placaOnibus = "";
						String motoristaOnibus = "";
						String cnhOnibus = "";
						int vagasOnibus = 0;
						ResultSet rsUpOnibus = preencherUp.executeQuery();
						while (rsUpOnibus.next()) {
							idOnibus = rsUpOnibus.getInt("id");
							placaOnibus = rsUpOnibus.getString("placa");
							motoristaOnibus = rsUpOnibus.getString("motoristas");
							cnhOnibus = rsUpOnibus.getString("cnh");
							vagasOnibus = rsUpOnibus.getInt("vagas");
							Object[] linha = { idOnibus, placaOnibus, motoristaOnibus, cnhOnibus, vagasOnibus };
							tabelaUpO.addRow(linha);
						}
						conexao.close();
						stmt.close();
						
						
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(atualizarDados.class.getResource("/imagens/atualizar (4).png")));
		btnNewButton.setBounds(145, 208, 114, 23);
		panel_1.add(btnNewButton);

		// DELETAR TABELA ONIBUS
		JButton btnNewButton_1 = new JButton("DELETAR");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtCnhUp.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Selecione um item para deletar!");
				} else if (JOptionPane.showConfirmDialog(null,
						"Deseja mesmo deletar todas informações do item selecionado?", "remover",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

					int idF2 = Integer.parseInt(lblId.getText());
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");

						String url = "jdbc:mysql://localhost:3306/sec_educacao";
						String usuario = "root";
						String senha = "5988";

						Connection conexao = DriverManager.getConnection(url, usuario, senha);

						PreparedStatement stmtD = conexao.prepareStatement("DELETE FROM onibus where id = ?");
						stmtD.setInt(1, idF2);
						stmtD.execute();
						
						PreparedStatement deleteFaculdadeOnibusId = conexao.prepareStatement("DELETE FROM cidades where onibus_id = ?");
						deleteFaculdadeOnibusId.setInt(1, idF2);
						deleteFaculdadeOnibusId.execute();
						
						PreparedStatement deleteAluno = conexao.prepareStatement("DELETE FROM alunos where onibus_id = ?");
						deleteAluno.setInt(1, idF2);
						deleteAluno.execute();
						
						
						PreparedStatement idFaculdade = conexao
								.prepareStatement("SELECT id FROM cidades WHERE onibus_id = ?");
						idFaculdade.setInt(1, idF2);
						idFaculdade.execute();
						
						ResultSet rsDeeleteFaaulcades = idFaculdade.executeQuery();
						int idCidade = 0;
						while (rsDeeleteFaaulcades.next()){
							idCidade = rsDeeleteFaaulcades.getInt("id");
							PreparedStatement deleAlunoIdFaculdade = conexao
									.prepareStatement("DELETE FROM faculdades WHERE cidade_id = ?");
							deleAlunoIdFaculdade.setInt(1, idCidade);
							deleAlunoIdFaculdade.execute();
							
							deleAlunoIdFaculdade.close();
						}

						JOptionPane.showMessageDialog(null, "Deletado com sucesso");

						txtPlacaUp.setText("");
						txtMotoristaUp.setText("");
						txtCnhUp.setText("");
						txtVagasUp.setText("");
						lblId.setText("");

						int rowSelect = table.getSelectedRow();
						model.removeRow(rowSelect);
						rsDeeleteFaaulcades.close();
						deleteFaculdadeOnibusId.close();
						conexao.close();
						idFaculdade.close();
						stmtD.close();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});

		btnNewButton_1.setIcon(new ImageIcon(atualizarDados.class.getResource("/imagens/claro (2).png")));
		btnNewButton_1.setBounds(384, 208, 114, 23);
		panel_1.add(btnNewButton_1);

		JButton btnNewButton_13 = new JButton("ATUALIZAR TABELA");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					String url = "jdbc:mysql://localhost:3306/sec_educacao";
					String usuario = "root";
					String senha = "5988";

					Connection conexao = DriverManager.getConnection(url, usuario, senha);

					PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM onibus");
					ResultSet rsOnibus = stmt.executeQuery();

					DefaultTableModel tabela = (DefaultTableModel) table.getModel();
					tabela.setRowCount(0);
					int idOnibus = 0;
					String placa = "";
					String motorista = "";
					String cnh = "";
					int vagas = 0;
					while (rsOnibus.next()) {
						idOnibus = rsOnibus.getInt("id");
						vagas = rsOnibus.getInt("vagas");
						motorista = rsOnibus.getString("motoristas");
						placa = rsOnibus.getString("placa");
						cnh = rsOnibus.getString("cnh");
						Object[] linha = { idOnibus, placa, motorista, cnh, vagas };
						tabela.addRow(linha);
					}
					conexao.close();
					stmt.close();
					rsOnibus.close();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_13.setIcon(new ImageIcon(atualizarDados.class.getResource("/imagens/atualizar (4).png")));
		btnNewButton_13.setBounds(491, 245, 149, 23);
		panel_1.add(btnNewButton_13);

		// ATUALIZAR ALUNO
		JButton btnNewButton_7 = new JButton("ATUALIZAR");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtNomeAluno.getText().isEmpty() || txtCpf.getText().isEmpty() || dtNascimento.getText().isEmpty()
						|| txtTelefone.getText().isEmpty() || nCurso.getText().isEmpty() || tCurso.getText().isEmpty()
						|| tSemestre.getText().isEmpty() || aSemestre.getText().isEmpty() || rua.getText().isEmpty()
						|| bairro.getText().isEmpty() || numero.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "PREENCHA TODOS OS DADOS");
				} else {
					String nomeDoAluno = txtNomeAluno.getText();
					String cpfAluno = txtCpf.getText();
					String dataNascimento = dtNascimento.getText();
					String telefoneUp = txtTelefone.getText();
					String txtCursoUp = nCurso.getText();
					String txtTipoCursoUp = tCurso.getText();
					String semestreText = tSemestre.getText();
					int nSemestreUp = Integer.parseInt(semestreText);
					String semestreText2 = aSemestre.getText();
					int atualSemesUp = Integer.parseInt(semestreText2);
					String ruaUp = rua.getText();
					String bairroUp = bairro.getText();
					String numeroUp = numero.getText();
					String textId = lblIdAluno.getText();
					int idUp = Integer.parseInt(textId);
					String nomeCidade = (String) comboBoxUp.getSelectedItem();
					String nomeFaculdade = (String) comboBoxf.getSelectedItem();
					boolean segundaFeira = false;
					boolean tercaFeira = false;
					boolean quartaFeira = false;
					boolean quintaFeira = false;
					boolean sextaFeira = false;
					if (chSegunda.isSelected()) {
						segundaFeira = true;
					}
					if (chTerca.isSelected()) {
						tercaFeira = true;
					}
					if (chQuarta.isSelected()) {
						quartaFeira = true;
					}
					if (chQuinta.isSelected()) {
						quintaFeira = true;
					}
					if (chSexta.isSelected()) {
						sextaFeira = true;
					}
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");

						String url = "jdbc:mysql://localhost:3306/sec_educacao";
						String usuario = "root";
						String senha = "5988";

						Connection conexao = DriverManager.getConnection(url, usuario, senha);
						PreparedStatement selectIdFaculdade = conexao
								.prepareStatement("SELECT faculdades.id, cidades.onibus_id, cidades.id "
										+ "FROM faculdades INNER JOIN cidades ON cidades.id = faculdades.cidade_id WHERE faculdades.nome = ?");
						selectIdFaculdade.setString(1, nomeFaculdade);
						selectIdFaculdade.execute();
						ResultSet rsSelectIdFaculdade = selectIdFaculdade.executeQuery();
						int idFaculdade = 0;
						int onibusId = 0;
						if (rsSelectIdFaculdade.next()) {
							idFaculdade = rsSelectIdFaculdade.getInt("faculdades.id");
							onibusId = rsSelectIdFaculdade.getInt("cidades.onibus_id");
						}

						PreparedStatement UpdateAlunos = conexao
								.prepareStatement("UPDATE alunos SET nome = ?, cpf = ?, faculdade = ?,"
										+ " cidadeFaculdade = ?, nomeCurso = ?, tipoCurso = ?, totalSemestres = ?, "
										+ "semestreAtual = ?, enderecoRua = ?, enderecoBairro = ?, enderecoNumero = ?, telefone = ?, faculdade_id = ?, "
										+ "dataNascimento = ?, segunda_feira = ?, terca_feira = ?, quarta_feira = ?, quinta_feira = ?, sexta_feira = ?, "
										+ "onibus_id = ? WHERE id = ? ");
						UpdateAlunos.setString(1, nomeDoAluno);
						UpdateAlunos.setString(2, cpfAluno);
						UpdateAlunos.setString(3, nomeFaculdade);
						UpdateAlunos.setString(4, nomeCidade);
						UpdateAlunos.setString(5, txtCursoUp);
						UpdateAlunos.setString(6, txtTipoCursoUp);
						UpdateAlunos.setInt(7, nSemestreUp);
						UpdateAlunos.setInt(8, atualSemesUp);
						UpdateAlunos.setString(9, ruaUp);
						UpdateAlunos.setString(10, bairroUp);
						UpdateAlunos.setString(11, numeroUp);
						UpdateAlunos.setString(12, telefoneUp);
						UpdateAlunos.setInt(13, idFaculdade);
						UpdateAlunos.setString(14, dataNascimento);
						UpdateAlunos.setBoolean(15, segundaFeira);
						UpdateAlunos.setBoolean(16, tercaFeira);
						UpdateAlunos.setBoolean(17, quartaFeira);
						UpdateAlunos.setBoolean(18, quintaFeira);
						UpdateAlunos.setBoolean(19, sextaFeira);
						UpdateAlunos.setInt(20, onibusId);
						UpdateAlunos.setInt(21, idUp);
						UpdateAlunos.execute();
						JOptionPane.showMessageDialog(null, "ATUALIZADO COM SUCESSO");

						// PREENCHER TABELA COM DADOS ATUALIZADOS
						PreparedStatement prencherTableAtualizada = conexao.prepareStatement("SELECT * FROM alunos");
						DefaultTableModel tabelaUpAlunos = (DefaultTableModel) table_1.getModel();
						tabelaUpAlunos.setRowCount(0);
						ResultSet rsUpdateAlunos = prencherTableAtualizada.executeQuery();
						int id = 0;
						String nomeUp = "";
						String faculdade = "";
						String cpf = "";
						String telefoneUpd = "";

						while (rsUpdateAlunos.next()) {
							id = rsUpdateAlunos.getInt("id");
							nomeUp = rsUpdateAlunos.getString("nome");
							faculdade = rsUpdateAlunos.getString("faculdade");
							cpf = rsUpdateAlunos.getString("cpf");
							telefoneUpd = rsUpdateAlunos.getString("telefone");
							Object[] rowAdd = { id, nomeUp, faculdade, cpf, telefoneUpd };
							tabelaUpAlunos.addRow(rowAdd);
						}
						conexao.close();
						selectIdFaculdade.close();
						rsSelectIdFaculdade.close();
						UpdateAlunos.close();
						prencherTableAtualizada.close();
						rsUpdateAlunos.close();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_7.setIcon(new ImageIcon(atualizarDados.class.getResource("/imagens/atualizar (4).png")));
		btnNewButton_7.setBounds(66, 218, 114, 23);
		panel_3.add(btnNewButton_7);

		// DELETAR ALUNO
		JButton btnNewButton_8 = new JButton("DELETAR");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblIdAluno.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Selecione um item para deletar!");
				} else if (JOptionPane.showConfirmDialog(null,
						"Deseja mesmo deletar todas informações do item selecionado?", "remover",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					int row = table_1.getSelectedRow();
					int idF2 = Integer.parseInt(lblIdAluno.getText());
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						String url = "jdbc:mysql://localhost:3306/sec_educacao";
						String usuario = "root";
						String senha = "5988";

						Connection conexao = DriverManager.getConnection(url, usuario, senha);

						PreparedStatement stmtD = conexao.prepareStatement("DELETE FROM alunos where id = ?");
						stmtD.setInt(1, idF2);
						stmtD.execute();
						JOptionPane.showMessageDialog(null, "DELETADO COM SUCESSO");
						((DefaultTableModel) table_1.getModel()).removeRow(row);
						lblIdAluno.setText("");
						txtNomeAluno.setText("");
						txtCpf.setText("");
						nCurso.setText("");
						tCurso.setText("");
						tSemestre.setText("");
						aSemestre.setText("");
						rua.setText("");
						bairro.setText("");
						numero.setText("");
						txtTelefone.setText("");
						dtNascimento.setText("");
						comboBoxf.removeAll();
						chSegunda.setSelected(false);
						chTerca.setSelected(false);
						chQuarta.setSelected(false);
						chQuinta.setSelected(false);
						chSexta.setSelected(false);
						conexao.close();
						stmtD.close();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_8.setIcon(new ImageIcon(atualizarDados.class.getResource("/imagens/claro (2).png")));
		btnNewButton_8.setBounds(288, 218, 99, 23);
		panel_3.add(btnNewButton_8);

		JLabel lblNewLabel_14 = new JLabel("Cidade:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_14.setBounds(10, 67, 46, 14);
		panel_3.add(lblNewLabel_14);
		
		JButton btnNewButton_15 = new JButton("ATUALIZAR TABELA");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				
				String url = "jdbc:mysql://localhost:3306/sec_educacao";
				String usuario = "root";
				String senha = "5988";

				Connection conexao = DriverManager.getConnection(url, usuario, senha);
				PreparedStatement stmt10 = conexao.prepareStatement("SELECT * FROM alunos");
				ResultSet rsAlunos = stmt10.executeQuery();

				DefaultTableModel tabela3 = (DefaultTableModel) table_1.getModel();
				tabela3.setRowCount(0);
				int idA = 0;
				String nomeAluno = "";
				String faculdade = "";
				String cpf = "";
				String telefone = "";
				while (rsAlunos.next()) {
					idA = rsAlunos.getInt("id");
					nomeAluno = rsAlunos.getString("nome");
					faculdade = rsAlunos.getString("faculdade");
					cpf = rsAlunos.getString("cpf");
					telefone = rsAlunos.getString("telefone");
					Object[] linhaA = { idA, nomeAluno, faculdade, cpf, telefone };
					tabela3.addRow(linhaA);
				}
				conexao.close();
				stmt10.close();
				rsAlunos.close();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_15.setIcon(new ImageIcon(atualizarDados.class.getResource("/imagens/atualizar (4).png")));
		btnNewButton_15.setBounds(472, 218, 168, 23);
		panel_3.add(btnNewButton_15);

		JButton btnNewButton_2 = new JButton("ALUNOS");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(true);
				panel_4.setVisible(false);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(atualizarDados.class
				.getResource("/imagens/silhueta-masculina-de-graduado-universitario-com-o-bone.png")));
		btnNewButton_2.setBounds(10, 435, 135, 23);
		getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("FACULDADES");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(true);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(atualizarDados.class.getResource("/imagens/faculdade (1).png")));
		btnNewButton_3.setBounds(179, 435, 135, 23);
		getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("ONIBUS");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(atualizarDados.class.getResource("/imagens/onibus-escolar (1).png")));
		btnNewButton_4.setBounds(515, 435, 135, 23);
		getContentPane().add(btnNewButton_4);

		JButton btnNewButton_9 = new JButton("CIDADES");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(true);
			}
		});
		btnNewButton_9.setIcon(new ImageIcon(atualizarDados.class.getResource("/imagens/cidade.png")));
		btnNewButton_9.setBounds(352, 435, 135, 23);
		getContentPane().add(btnNewButton_9);

	}
}
