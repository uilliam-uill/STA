package gerenciarTransporte;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class auxilioTransporte extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JFormattedTextField txtCpf;
	private JFormattedTextField txtDataNascimen;
	private JTextField enderecoRua;
	private JTextField enderecoBairro;
	private JTextField enderecoNumero;
	private JTextField txtCidadeCurso;
	private JTextField txtInstituicao;
	private JTextField txtTipoCurso;
	private JTextField txtSemestre;
	private JTextField txtSemestreAtual;
	private JTextField txtValor;
	private JTable table;
	private JTextField txtBuscar;
	private JTextField txtCurso;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { auxilioTransporte frame = new
	 * auxilioTransporte(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public auxilioTransporte() {
	
		
		setBounds(100, 100, 853, 570);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("NOME:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(107, 28, 33, 14);
		getContentPane().add(lblNewLabel);

		txtNome = new JTextField();
		txtNome.setBounds(155, 25, 267, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("TELEFONE:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(574, 28, 54, 14);
		getContentPane().add(lblNewLabel_1);

		txtTelefone = new JTextField();
		txtTelefone.setBounds(638, 25, 136, 20);
		getContentPane().add(txtTelefone);
		txtTelefone.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("CPF:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(117, 73, 23, 14);
		getContentPane().add(lblNewLabel_2);

		MaskFormatter dataFormato = null;
		MaskFormatter cpfformato = null;
		DecimalFormat dinheiro = new DecimalFormat("#,##0.##");
		try {
			dataFormato = new MaskFormatter("##/##/####");
			cpfformato = new MaskFormatter("###.###.###-##");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		txtCpf = new JFormattedTextField(cpfformato);
		txtCpf.setBounds(155, 70, 148, 20);
		getContentPane().add(txtCpf);
		txtCpf.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("DATA DE NASCIMENTO:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(512, 73, 116, 14);
		getContentPane().add(lblNewLabel_3);

		txtDataNascimen = new JFormattedTextField(dataFormato);
		txtDataNascimen.setBounds(638, 70, 101, 20);
		getContentPane().add(txtDataNascimen);
		txtDataNascimen.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("ENDEREÇO:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(53, 127, 58, 14);
		getContentPane().add(lblNewLabel_4);

		enderecoRua = new JTextField();
		enderecoRua.setBounds(154, 124, 267, 20);
		getContentPane().add(enderecoRua);
		enderecoRua.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("RUA");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_5.setBounds(268, 101, 23, 14);
		getContentPane().add(lblNewLabel_5);

		enderecoBairro = new JTextField();
		enderecoBairro.setBounds(450, 124, 116, 20);
		getContentPane().add(enderecoBairro);
		enderecoBairro.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("BAIRRO");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_6.setBounds(486, 101, 37, 14);
		getContentPane().add(lblNewLabel_6);

		enderecoNumero = new JTextField();
		enderecoNumero.setBounds(591, 124, 54, 20);
		getContentPane().add(enderecoNumero);
		enderecoNumero.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Nº");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_7.setBounds(609, 98, 12, 14);
		getContentPane().add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("CIDADE DO CURSO:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(39, 166, 101, 14);
		getContentPane().add(lblNewLabel_8);

		txtCidadeCurso = new JTextField();
		txtCidadeCurso.setBounds(155, 163, 215, 20);
		getContentPane().add(txtCidadeCurso);
		txtCidadeCurso.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("INSTITUIÇÃO:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_9.setBounds(506, 197, 70, 14);
		getContentPane().add(lblNewLabel_9);

		JLabel txtValorTotal = new JLabel("0");
		txtValorTotal.setForeground(new Color(255, 0, 0));
		txtValorTotal.setBounds(746, 342, 81, 14);
		getContentPane().add(txtValorTotal);

		txtInstituicao = new JTextField();
		txtInstituicao.setBounds(591, 194, 215, 20);
		getContentPane().add(txtInstituicao);
		txtInstituicao.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("TIPO DE CURSO:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_10.setBounds(496, 166, 82, 14);
		getContentPane().add(lblNewLabel_10);

		txtTipoCurso = new JTextField();
		txtTipoCurso.setBounds(590, 163, 116, 20);
		getContentPane().add(txtTipoCurso);
		txtTipoCurso.setColumns(10);

		JCheckBox chSegunda = new JCheckBox("SEGUNDA FEIRA");
		chSegunda.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chSegunda.setBounds(107, 231, 116, 23);
		getContentPane().add(chSegunda);

		JCheckBox chTerca = new JCheckBox("TERÇA FEIRA");
		chTerca.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chTerca.setBounds(241, 231, 97, 23);
		getContentPane().add(chTerca);

		JCheckBox chQuarta = new JCheckBox("QUARTA FEIRA");
		chQuarta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chQuarta.setBounds(366, 231, 116, 23);
		getContentPane().add(chQuarta);

		JCheckBox chQuinta = new JCheckBox("QUINTA FEIRA");
		chQuinta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chQuinta.setBounds(503, 231, 97, 23);
		getContentPane().add(chQuinta);

		JLabel lblId = new JLabel("");
		lblId.setBounds(24, 11, 46, 14);
		getContentPane().add(lblId);

		JCheckBox chSexta = new JCheckBox("SEXTA FEIRA");
		chSexta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chSexta.setBounds(623, 231, 97, 23);
		getContentPane().add(chSexta);

		JLabel lblNewLabel_11 = new JLabel("TOTAL SEMESTRE:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_11.setBounds(53, 285, 90, 14);
		getContentPane().add(lblNewLabel_11);

		txtSemestre = new JTextField();
		txtSemestre.setBounds(155, 282, 86, 20);
		getContentPane().add(txtSemestre);
		txtSemestre.setColumns(10);

		txtCurso = new JTextField();
		txtCurso.setBounds(155, 197, 214, 20);
		getContentPane().add(txtCurso);
		txtCurso.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("SEMESTRE ATUAL:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_12.setBounds(268, 285, 90, 14);
		getContentPane().add(lblNewLabel_12);

		txtSemestreAtual = new JTextField();
		txtSemestreAtual.setBounds(366, 282, 86, 20);
		getContentPane().add(txtSemestreAtual);
		txtSemestreAtual.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("VALOR:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_13.setBounds(498, 285, 37, 14);
		getContentPane().add(lblNewLabel_13);

		txtValor = new JTextField();
		txtValor.setBounds(545, 282, 86, 20);
		getContentPane().add(txtValor);
		txtValor.setColumns(10);

		JButton btnNewButton = new JButton("    SALVAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtNome.getText().isEmpty() || txtTelefone.getText().isEmpty() || txtCpf.getText().isEmpty()
				        || txtDataNascimen.getText().isEmpty() || enderecoRua.getText().isEmpty() || enderecoNumero.getText().isEmpty()
				        || enderecoBairro.getText().isEmpty() || txtTipoCurso.getText().isEmpty() || txtCidadeCurso.getText().isEmpty()
				        || txtInstituicao.getText().isEmpty() || txtSemestre.getText().isEmpty() || txtSemestreAtual.getText().isEmpty()
				        || txtValor.getText().isEmpty()) {
				    JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
				}else {
				String nome = txtNome.getText();
				String cpfString = txtCpf.getText();
				String dataNascimento = txtDataNascimen.getText();
				String SenderecoRua = enderecoNumero.getText();
				String SendecoNumero = enderecoNumero.getText();
				String SenderecoBairro = enderecoBairro.getText();
				String telefone = txtTelefone.getText();
				String tipoCurso = txtTipoCurso.getText();
				String cidadeCurso = txtCidadeCurso.getText();
				String instituicao = txtInstituicao.getText();
				String totalSemestres = txtSemestre.getText();
				String semestreAtual = txtSemestreAtual.getText();
				String valor = txtValor.getText();
				valor = valor.replaceAll("[^0-9]", "");
				double dValor = Double.parseDouble(valor);
				String valorFormato = dinheiro.format(dValor);
				double valorOriginal = Double.parseDouble(valorFormato);
				String curso = txtCurso.getText();
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

					PreparedStatement insertAuxilio = conexao.prepareStatement(
							"INSERT INTO auxiliotransporte (nome, cpf, faculdade, cidadeFaculdade, nomeCurso, tipoCurso,"
									+ " totalSemestres, semestreAtual, enderecoRua, enderecoBairro, enderecoNumero, telefone, dataNascimento"
									+ ", segunda_feira, terca_feira, quarta_feira, quinta_feira, sexta_feira, valor)"
									+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					insertAuxilio.setString(1, nome);
					insertAuxilio.setString(2, cpfString);
					insertAuxilio.setString(3, instituicao);
					insertAuxilio.setString(4, cidadeCurso);
					insertAuxilio.setString(5, curso);
					insertAuxilio.setString(6, tipoCurso);
					insertAuxilio.setString(7, totalSemestres);
					insertAuxilio.setString(8, semestreAtual);
					insertAuxilio.setString(9, SenderecoRua);
					insertAuxilio.setString(10, SenderecoBairro);
					insertAuxilio.setString(11, SendecoNumero);
					insertAuxilio.setString(12, telefone);
					insertAuxilio.setString(13, dataNascimento);
					insertAuxilio.setBoolean(14, segundaFeira);
					insertAuxilio.setBoolean(15, tercaFeira);
					insertAuxilio.setBoolean(16, quartaFeira);
					insertAuxilio.setBoolean(17, quintaFeira);
					insertAuxilio.setBoolean(18, sextaFeira);
					insertAuxilio.setDouble(19, valorOriginal);
					insertAuxilio.execute();
					JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO");

					txtNome.setText("");
					txtCpf.setText("");
					txtDataNascimen.setText("");
					enderecoBairro.setText("");
					enderecoNumero.setText("");
					enderecoRua.setText("");
					txtTelefone.setText("");
					txtTipoCurso.setText("");
					txtCidadeCurso.setText("");
					txtInstituicao.setText("");
					txtSemestre.setText("");
					txtSemestreAtual.setText("");
					txtValor.setText("");
					chSegunda.setSelected(false);
					chTerca.setSelected(false);
					chQuarta.setSelected(false);
					chQuinta.setSelected(false);
					chSexta.setSelected(false);

					PreparedStatement preencherTabela = conexao.prepareStatement("SELECT * FROM auxiliotransporte");
					ResultSet rsTabela = preencherTabela.executeQuery();

					DefaultTableModel tabelaModel = (DefaultTableModel) table.getModel();
					tabelaModel.setRowCount(0);

					int idP = 0;
					String nomeP = "";
					String cpfP = "";
					String telefoneP = "";
					double valorP = 0;
					double valorTotal = 0;
					while (rsTabela.next()) {
						idP = rsTabela.getInt("id");
						nomeP = rsTabela.getString("nome");
						cpfP = rsTabela.getString("cpf");
						telefoneP = rsTabela.getString("telefone");
						valorP = rsTabela.getDouble("valor");
						valorTotal = valorTotal + valorP;
						Object[] adicionarColunas = { idP, nomeP, cpfP, telefoneP, valorP };
						tabelaModel.addRow(adicionarColunas);
					}
					String valorString = String.format("%.2f", valorTotal);
					txtValorTotal.setText(valorString);
				
					conexao.close();
					insertAuxilio.close();
					preencherTabela.close();
					rsTabela.close();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setIcon(new ImageIcon(auxilioTransporte.class.getResource("/imagens/salve-.png")));
		btnNewButton.setBounds(322, 310, 130, 23);
		getContentPane().add(btnNewButton);

		Object[] colunas = { "ID", "NOME", "CPF", "TELEFONE", "VALOR" };
		DefaultTableModel model = new DefaultTableModel(colunas, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			} // NAO EDITAR DADOS PELA TABELA
		};
		table = new JTable(model);
		JScrollPane tabela = new JScrollPane(table);
		table.addMouseListener(new MouseAdapter() { // EVENTO DOIS CLIQUES NA TABELA
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2 && table.getSelectedColumn() != -1) {
					int rowCidade = table.getSelectedRow();
					String idS = table.getValueAt(rowCidade, 0).toString();
					String nomeCidade = table.getValueAt(rowCidade, 1).toString();
					String textPlaca = table.getValueAt(rowCidade, 2).toString();
					lblId.setText(idS);
					int id = Integer.parseInt(idS);

					try {
						Class.forName("com.mysql.cj.jdbc.Driver");

						String url = "jdbc:mysql://localhost:3306/sec_educacao";
						String usuario = "root";
						String senha = "5988";

						Connection conexao = DriverManager.getConnection(url, usuario, senha);

						PreparedStatement preencherText = conexao
								.prepareStatement("SELECT * FROM auxiliotransporte WHERE id = ?");
						preencherText.setInt(1, id);
						preencherText.execute();

						DefaultTableModel tabelaModel = (DefaultTableModel) table.getModel();

						ResultSet resultSet = preencherText.executeQuery();

						String nome = "";
						String cpf = "";
						String faculdade = "";
						String cidadeFaculdade = "";
						String nomeCurso = "";
						String tipoCurso = "";
						int totalSemestres = 0;
						int semestreAtual = 0;
						String SenderecoRua = "";
						String SenderecoBairro = "";
						String SenderecoNumero = "";
						String telefone = "";
						String dataNascimento = "";
						boolean segunda_feira = false;
						boolean terca_feira = false;
						boolean quarta_feira = false;
						boolean quinta_feira = false;
						boolean sexta_feira = false;
						double valor = 0.0;
						while (resultSet.next()) {
							nome = resultSet.getString("nome");
							cpf = resultSet.getString("cpf");
							faculdade = resultSet.getString("faculdade");
							cidadeFaculdade = resultSet.getString("cidadeFaculdade");
							nomeCurso = resultSet.getString("nomeCurso");
							tipoCurso = resultSet.getString("tipoCurso");
							totalSemestres = resultSet.getInt("totalSemestres");
							semestreAtual = resultSet.getInt("semestreAtual");
							SenderecoRua = resultSet.getString("enderecoRua");
							SenderecoBairro = resultSet.getString("enderecoBairro");
							SenderecoNumero = resultSet.getString("enderecoNumero");
							telefone = resultSet.getString("telefone");
							dataNascimento = resultSet.getString("dataNascimento");
							segunda_feira = resultSet.getBoolean("segunda_feira");
							terca_feira = resultSet.getBoolean("terca_feira");
							quarta_feira = resultSet.getBoolean("quarta_feira");
							quinta_feira = resultSet.getBoolean("quinta_feira");
							sexta_feira = resultSet.getBoolean("sexta_feira");
							valor = resultSet.getDouble("valor");
						}
						txtNome.setText(nome);
						txtCpf.setText(cpf);
						txtDataNascimen.setText(dataNascimento);
						enderecoBairro.setText(SenderecoBairro);
						enderecoNumero.setText(SenderecoNumero);
						enderecoRua.setText(SenderecoRua);
						txtTelefone.setText(telefone);
						txtTipoCurso.setText(tipoCurso);
						txtCidadeCurso.setText(cidadeFaculdade);
						txtInstituicao.setText(faculdade);
						txtSemestre.setText(Integer.toString(totalSemestres));
						txtSemestreAtual.setText(Integer.toString(semestreAtual));
						txtValor.setText(Double.toString(valor));
						txtCurso.setText(nomeCurso);
						chSegunda.setSelected(segunda_feira);
						chTerca.setSelected(terca_feira);
						chQuarta.setSelected(quarta_feira);
						chQuinta.setSelected(quinta_feira);
						chSexta.setSelected(sexta_feira);
					
						conexao.close();
						preencherText.close();
						resultSet.close();
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
		table.setBounds(0, 367, 837, 173);
		tabela.setBounds(0, 367, 837, 173);
		getContentPane().add(tabela);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/sec_educacao";
			String usuario = "root";
			String senha = "5988";

			Connection conexao = DriverManager.getConnection(url, usuario, senha);

			PreparedStatement preencherTabela = conexao.prepareStatement("SELECT * FROM auxiliotransporte");
			ResultSet rsTabela = preencherTabela.executeQuery();

			DefaultTableModel tabelaModel = (DefaultTableModel) table.getModel();
			tabelaModel.setRowCount(0);

			int id = 0;
			String nome = "";
			String cpf = "";
			String telefone = "";
			double valor = 0;
			double valorTotalP = 0;
			while (rsTabela.next()) {
				id = rsTabela.getInt("id");
				nome = rsTabela.getString("nome");
				cpf = rsTabela.getString("cpf");
				telefone = rsTabela.getString("telefone");
				valor = rsTabela.getDouble("valor");
				valorTotalP = valorTotalP + valor;
				Object[] adicionarColunas = { id, nome, cpf, telefone, valor };
				tabelaModel.addRow(adicionarColunas);
			}
			String valorStringP = String.format("%.2f", valorTotalP);
			txtValorTotal.setText(valorStringP);
		
			conexao.close();
			preencherTabela.close();
			rsTabela.close();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		txtBuscar = new JTextField();
		txtBuscar.setBounds(0, 343, 124, 20);
		getContentPane().add(txtBuscar);
		txtBuscar.setColumns(10);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String buscar = txtBuscar.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					String url = "jdbc:mysql://localhost:3306/sec_educacao";
					String usuario = "root";
					String senha = "5988";

					Connection conexao = DriverManager.getConnection(url, usuario, senha);

					PreparedStatement buscarTabela = conexao.prepareStatement(
							"SELECT * FROM auxiliotransporte WHERE nome LIKE ? OR" + " cpf LIKE ? OR telefone LIKE ? ");
					buscarTabela.setString(1, "%" + buscar + "%");
					buscarTabela.setString(2, "%" + buscar + "%");
					buscarTabela.setString(3, "%" + buscar + "%");
					DefaultTableModel tabelaModel = (DefaultTableModel) table.getModel();
					tabelaModel.setRowCount(0);

					ResultSet rsBuscarTabela = buscarTabela.executeQuery();

					int id = 0;
					String nome = "";
					String cpf = "";
					String telefone = "";
					double valor = 0;
					double valorTotalP = 0;
					while (rsBuscarTabela.next()) {
						id = rsBuscarTabela.getInt("id");
						nome = rsBuscarTabela.getString("nome");
						cpf = rsBuscarTabela.getString("cpf");
						telefone = rsBuscarTabela.getString("telefone");
						valor = rsBuscarTabela.getDouble("valor");
						valorTotalP = valorTotalP + valor;
						Object[] adicionarColunas = { id, nome, cpf, telefone, valor };
						tabelaModel.addRow(adicionarColunas);
					}
					conexao.close();
					buscarTabela.close();
					rsBuscarTabela.close();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(auxilioTransporte.class.getResource("/imagens/lupa.png")));
		btnNewButton_1.setBounds(134, 342, 37, 23);
		getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel_14 = new JLabel("CURSO:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_14.setBounds(97, 200, 46, 14);
		getContentPane().add(lblNewLabel_14);

		JLabel lblNewLabel_15 = new JLabel("VALOR TOTAL:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_15.setBounds(656, 342, 83, 14);
		getContentPane().add(lblNewLabel_15);

		JLabel lblNewLabel_16 = new JLabel("ID:");
		lblNewLabel_16.setBounds(0, 11, 23, 14);
		getContentPane().add(lblNewLabel_16);

		JButton btnNewButton_2 = new JButton("ATUALIZAR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblId.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "SELECIONE A CIDADE QUE DESEJA APAGAR");
				} else {
					if (JOptionPane.showConfirmDialog(null, "Tem certezar que quer atualizar?", "remover",
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				String idString = lblId.getText();
				int id = Integer.parseInt(idString);
				String nome = txtNome.getText();
				String cpf = txtCpf.getText();
				String faculdade = txtInstituicao.getText();
				String cidadeFaculdade = txtCidadeCurso.getText();
				String nomeCurso = txtCurso.getText();
				String tipoCurso = txtTipoCurso.getText();
				int totalSemestres = Integer.parseInt(txtSemestre.getText());
				int semestreAtual = Integer.parseInt(txtSemestreAtual.getText());
				String SenderecoRua = enderecoRua.getText();
				String SenderecoBairro = enderecoBairro.getText();
				String SenderecoNumero = enderecoNumero.getText();
				String telefone = txtTelefone.getText();
				String dataNascimento = txtDataNascimen.getText();
				boolean segunda_feira = chSegunda.isSelected();
				boolean terca_feira = chTerca.isSelected();
				boolean quarta_feira = chQuarta.isSelected();
				boolean quinta_feira = chQuinta.isSelected();
				boolean sexta_feira = chSexta.isSelected();
				double valor = Double.parseDouble(txtValor.getText());

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					String url = "jdbc:mysql://localhost:3306/sec_educacao";
					String usuario = "root";
					String senha = "5988";

					Connection conexao = DriverManager.getConnection(url, usuario, senha);

					PreparedStatement update = conexao.prepareStatement(
							"UPDATE auxiliotransporte SET cpf = ?, faculdade = ?, cidadeFaculdade = ?,"
									+ " nomeCurso = ?, tipoCurso = ?,totalSemestres = ?, semestreAtual = ?, enderecoRua = ?, enderecoBairro = ?,"
									+ " enderecoNumero = ?,telefone = ?, dataNascimento = ?, segunda_feira = ?, terca_feira = ?,"
									+ " quarta_feira = ?, quinta_feira = ?, sexta_feira = ?, valor = ?, nome = ? WHERE id = ?");
					update.setString(1, cpf);
					update.setString(2, faculdade);
					update.setString(3, cidadeFaculdade);
					update.setString(4, nomeCurso);
					update.setString(5, tipoCurso);
					update.setInt(6, totalSemestres);
					update.setInt(7, semestreAtual);
					update.setString(8, SenderecoRua);
					update.setString(9, SenderecoBairro);
					update.setString(10, SenderecoNumero);
					update.setString(11, telefone);
					update.setString(12, dataNascimento);
					update.setBoolean(13, segunda_feira);
					update.setBoolean(14, terca_feira);
					update.setBoolean(15, quarta_feira);
					update.setBoolean(16, quinta_feira);
					update.setBoolean(17, sexta_feira);
					update.setDouble(18, valor);
					update.setString(19, nome);
					update.setInt(20, id);
					update.executeUpdate();
					
					JOptionPane.showMessageDialog(null, "ATUALIZADO COM SUCESSO");
					
					txtNome.setText("");
					txtCpf.setText("");
					txtDataNascimen.setText("");
					enderecoBairro.setText("");
					enderecoNumero.setText("");
					enderecoRua.setText("");
					txtTelefone.setText("");
					txtTipoCurso.setText("");
					txtCidadeCurso.setText("");
					txtInstituicao.setText("");
					txtSemestre.setText("");
					txtSemestreAtual.setText("");
					txtValor.setText("");
					txtCurso.setText("");
					chSegunda.setSelected(false);
					chTerca.setSelected(false);
					chQuarta.setSelected(false);
					chQuinta.setSelected(false);
					chSexta.setSelected(false);
					lblId.setText("");
					PreparedStatement preencherTabela = conexao
							.prepareStatement("SELECT * FROM auxiliotransporte");
					ResultSet rsTabela = preencherTabela.executeQuery();

					DefaultTableModel tabelaModel = (DefaultTableModel) table.getModel();
					tabelaModel.setRowCount(0);

					int idD = 0;
					String nomeP = "";
					String cpfP = "";
					String telefoneP = "";
					double valorP = 0;
					double valorTotalP = 0;
					while (rsTabela.next()) {
						idD = rsTabela.getInt("id");
						nomeP = rsTabela.getString("nome");
						cpfP = rsTabela.getString("cpf");
						telefoneP = rsTabela.getString("telefone");
						valorP = rsTabela.getDouble("valor");
						valorTotalP = valorTotalP + valorP;
						Object[] adicionarColunas = { idD, nomeP, cpfP, telefoneP, valorP };
						tabelaModel.addRow(adicionarColunas);
					}
					String valorStringP = String.format("%.2f", valorTotalP);
					txtValorTotal.setText(valorStringP);
					
					conexao.close();
					update.close();
					preencherTabela.close();
					rsTabela.close();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}}}
					
					}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_2.setIcon(new ImageIcon(auxilioTransporte.class.getResource("/imagens/atualizar (4).png")));
		btnNewButton_2.setBounds(209, 342, 116, 23);
		getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("DELETAR");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblId.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "SELECIONE A CIDADE QUE DESEJA APAGAR");
				} else {
					if (JOptionPane.showConfirmDialog(null, "Tem certezar que quer remover?", "remover",
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						String idString = lblId.getText();
						int id = Integer.parseInt(idString);
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");

							String url = "jdbc:mysql://localhost:3306/sec_educacao";
							String usuario = "root";
							String senha = "5988";

							Connection conexao = DriverManager.getConnection(url, usuario, senha);

							PreparedStatement delete = conexao
									.prepareStatement("DELETE FROM auxiliotransporte WHERE id = ?");
							delete.setInt(1, id);
							delete.execute();
							JOptionPane.showMessageDialog(null, "DELETADO COM SUCESSO");

							PreparedStatement preencherTabela = conexao
									.prepareStatement("SELECT * FROM auxiliotransporte");
							ResultSet rsTabela = preencherTabela.executeQuery();

							DefaultTableModel tabelaModel = (DefaultTableModel) table.getModel();
							tabelaModel.setRowCount(0);

							int idD = 0;
							String nome = "";
							String cpf = "";
							String telefone = "";
							double valor = 0;
							double valorTotalP = 0;
							while (rsTabela.next()) {
								idD = rsTabela.getInt("id");
								nome = rsTabela.getString("nome");
								cpf = rsTabela.getString("cpf");
								telefone = rsTabela.getString("telefone");
								valor = rsTabela.getDouble("valor");
								valorTotalP = valorTotalP + valor;
								Object[] adicionarColunas = { idD, nome, cpf, telefone, valor };
								tabelaModel.addRow(adicionarColunas);
							}

							txtNome.setText("");
							txtCpf.setText("");
							txtDataNascimen.setText("");
							enderecoBairro.setText("");
							enderecoNumero.setText("");
							enderecoRua.setText("");
							txtTelefone.setText("");
							txtTipoCurso.setText("");
							txtCidadeCurso.setText("");
							txtInstituicao.setText("");
							txtSemestre.setText("");
							txtSemestreAtual.setText("");
							txtValor.setText("");
							txtCurso.setText("");
							chSegunda.setSelected(false);
							chTerca.setSelected(false);
							chQuarta.setSelected(false);
							chQuinta.setSelected(false);
							chSexta.setSelected(false);
							lblId.setText("");
							String valorStringP = String.format("%.2f", valorTotalP);
							txtValorTotal.setText(valorStringP);
							
							conexao.close();
							delete.close();
							preencherTabela.close();
							rsTabela.close();
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
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_3.setIcon(new ImageIcon(auxilioTransporte.class.getResource("/imagens/claro (2).png")));
		btnNewButton_3.setBounds(512, 342, 101, 23);
		getContentPane().add(btnNewButton_3);
	}
}