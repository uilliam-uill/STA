package gerenciarTransporte;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
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
import javax.swing.text.MaskFormatter;
import javax.swing.JCheckBox;

public class cadastroAluno extends JInternalFrame {
	private JTextField txtCpf;
	private JTextField txtTotalSemestres;
	private JTextField txtSemestreAtual;
	private JTextField txtCidadeCurso;
	private JTextField txtRua;
	private JTextField txtTelefone;
	private JTextField txtNome;
	private JTextField txtDataNascimento;
	private JTextField txtDataNascimentoo;
	private JTextField txtBairro;
	private JTextField txtNumero;
	private JTextField txtCurso;
	private JTextField txtTipoCurso;
	private JTable table;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { cadastroAluno frame = new
	 * cadastroAluno(); frame.setVisible(true); frame.setClosable(true);
	 * frame.setVisible(true);
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } }
	 * 
	 * });
	 */

	/**
	 * Create the frame.
	 * 
	 * @throws SQLException
	 */

	public cadastroAluno() {
		
		


		ImageIcon lateral = new ImageIcon("src/imagens/logofim.png");

		getContentPane().setBackground(new Color(217, 217, 217));

		setBounds(100, 100, 755, 470);
		/*
		 * try { MaskFormatter cpfformato = new MaskFormatter("###.###.###-##"); } catch
		 * (ParseException ex) { ex.printStackTrace(); }
		 * 
		 * txtCidadeCurso= new JTextField(); txtCidadeCurso.setColumns(10);
		 * 
		 * try { MaskFormatter cpfformato = new MaskFormatter("##/##/####"); } catch
		 * (ParseException ex) { ex.printStackTrace(); }
		 */

		JPanel panel = new JPanel();

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 719, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup()
						.addContainerGap().addComponent(panel, GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)));
		panel.setLayout(new CardLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(217, 217, 217));
		panel.add(panel_1, "name_4900761920276800");
		JLabel icon = new JLabel(lateral);
		icon.setBounds(1175, 326, 169, 82);

		JLabel lblNewLabel = new JLabel("NOME: ");
		lblNewLabel.setBounds(78, 29, 48, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel placaOnibus = new JLabel("                 ");
		placaOnibus.setBounds(423, 191, 68, 14);
		panel_1.add(placaOnibus);

		JLabel lblNewLabel_14 = new JLabel("Nº");
		lblNewLabel_14.setBounds(919, 427, 12, 13);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JLabel lblNewLabel_5 = new JLabel("CURSO:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(97, 220, 51, 14);

		JLabel lblNewLabel_7 = new JLabel("INSTITUIÇÃO:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(28, 191, 80, 14);

		JLabel lblNewLabel_12 = new JLabel("RUA");
		lblNewLabel_12.setBounds(239, 93, 20, 13);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JLabel lblNewLabel_11 = new JLabel("ENDEREÇO:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_11.setBounds(28, 115, 94, 14);

		txtRua = new JTextField();
		txtRua.setBounds(129, 112, 261, 20);
		txtRua.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("TOTAL DE SEMESTRES:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(10, 338, 138, 14);

		JLabel lblNewLabel_9 = new JLabel("SEMESTRE ATUAL:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_9.setBounds(330, 338, 123, 14);

		txtTotalSemestres = new JTextField();
		txtTotalSemestres.setBounds(158, 335, 101, 20);
		txtTotalSemestres.setColumns(10);

		txtSemestreAtual = new JTextField();
		txtSemestreAtual.setBounds(463, 335, 86, 20);
		txtSemestreAtual.setColumns(10);

		MaskFormatter cpfFormato = null, dataFormato = null;
		try {
			cpfFormato = new MaskFormatter("###.###.###-##");
			dataFormato = new MaskFormatter("##/##/####");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		txtTelefone = new JTextField();
		txtTelefone.setBounds(478, 26, 125, 20);
		txtTelefone.setColumns(10);
		txtCpf = new JFormattedTextField(cpfFormato);
		txtCpf.setBounds(130, 59, 131, 23);
		txtCpf.setFont(new Font("Arial", Font.PLAIN, 14));
		txtCpf.setBackground(Color.WHITE);
		txtCpf.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("DATA DE NASCIMENTO:");
		lblNewLabel_2.setBounds(352, 64, 116, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(98, 64, 23, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));

		txtNome = new JTextField();
		txtNome.setBounds(130, 26, 231, 22);
		txtNome.setColumns(10);

		JComboBox comboBoxFaculdades = new JComboBox();
		comboBoxFaculdades.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBoxFaculdades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		txtDataNascimentoo = new JFormattedTextField(dataFormato);
		txtDataNascimentoo.setBounds(478, 61, 91, 20);

		txtBairro = new JTextField();
		txtBairro.setBounds(400, 112, 104, 20);
		txtBairro.setColumns(10);

		JComboBox comboBoxCity = new JComboBox();
		comboBoxCity.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBoxCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					String url = "jdbc:mysql://localhost:3306/sec_educacao";
					String usuario = "root";
					String senha = "5988";

					Connection conexao = DriverManager.getConnection(url, usuario, senha);

					String nomeCidades = (String) comboBoxCity.getSelectedItem();
					PreparedStatement selectIdCity = conexao
							.prepareStatement("SELECT cidades.id, cidades.onibus_id, onibus.placa "
									+ " FROM cidades INNER JOIN onibus ON cidades.onibus_id = onibus.id WHERE cidades.nome = ?");
					selectIdCity.setString(1, nomeCidades);
					selectIdCity.execute();
					int idCity = 0;
					String placaLbl = "";
					ResultSet rsSelectCity = selectIdCity.executeQuery();

					while (rsSelectCity.next()) {
						idCity = rsSelectCity.getInt("cidades.id");
						placaLbl = rsSelectCity.getString("onibus.placa");
					}
					placaOnibus.setText(placaLbl);

					PreparedStatement selectNomeFaculdade = conexao
							.prepareStatement("SELECT nome FROM faculdades WHERE cidade_id = ?");
					selectNomeFaculdade.setInt(1, idCity);
					selectNomeFaculdade.execute();
					String nomeFaculdade = "";
					ResultSet rsInsertFaculdade = selectNomeFaculdade.executeQuery();
					comboBoxFaculdades.removeAllItems();
					while (rsInsertFaculdade.next()) {
						nomeFaculdade = rsInsertFaculdade.getString("nome");
						comboBoxFaculdades.addItem(nomeFaculdade);
					}
					
					conexao.close();
					selectNomeFaculdade.close();
					rsInsertFaculdade.close();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		comboBoxCity.setBounds(129, 148, 174, 22);
		panel_1.add(comboBoxCity);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/sec_educacao";
			String usuario = "root";
			String senha = "5988";

			Connection conexao = DriverManager.getConnection(url, usuario, senha);

			PreparedStatement inserirCidades = conexao.prepareStatement("SELECT nome FROM cidades");
			ResultSet rsInserirCity = inserirCidades.executeQuery();
			String nomeCidades = "";
			while (rsInserirCity.next()) {
				nomeCidades = rsInserirCity.getString("nome");
				comboBoxCity.addItem(nomeCidades);
			}
			conexao.close();
			inserirCidades.close();
			rsInserirCity.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		JLabel lblNewLabel_10 = new JLabel("BAIRRO");
		lblNewLabel_10.setBounds(431, 93, 37, 13);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JCheckBox checkSegunda = new JCheckBox("SEGUNDA FEIRA");
		checkSegunda.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkSegunda.setBounds(50, 277, 125, 23);
		panel_1.add(checkSegunda);

		JCheckBox checkTerca = new JCheckBox("TERÇA FEIRA");
		checkTerca.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkTerca.setBounds(192, 277, 111, 23);
		panel_1.add(checkTerca);

		JCheckBox checkQuarta = new JCheckBox("QUARTA FEIRA");
		checkQuarta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkQuarta.setBounds(330, 277, 111, 23);
		panel_1.add(checkQuarta);

		JCheckBox checkQuinta = new JCheckBox("QUINTA FEIRA");
		checkQuinta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkQuinta.setBounds(463, 277, 101, 23);
		panel_1.add(checkQuinta);

		JCheckBox checkSexta = new JCheckBox("SEXTA FEIRA");
		checkSexta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkSexta.setBounds(583, 277, 111, 23);
		panel_1.add(checkSexta);

		JLabel lblNewLabel_13 = new JLabel("Nº");
		lblNewLabel_13.setBounds(532, 93, 12, 13);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 10));

		txtNumero = new JTextField();
		txtNumero.setBounds(514, 112, 39, 20);
		txtNumero.setColumns(10);

		txtCurso = new JTextField();
		txtCurso.setBounds(159, 220, 164, 20);
		txtCurso.setColumns(10);

		JLabel lblNewLabel_15 = new JLabel("TELEFONE:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_15.setBounds(414, 29, 54, 14);

		JLabel lblNewLabel_6 = new JLabel("TIPO CURSO:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(478, 226, 82, 14);

		txtTipoCurso = new JTextField();
		txtTipoCurso.setBounds(563, 223, 131, 20);
		txtTipoCurso.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("CIDADE DO CURSO:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(28, 152, 98, 14);

		JPanel panel_2 = new JPanel();
		panel.add(panel_2, "name_5652425139218300");
		panel_2.setLayout(null);

		ButtonGroup cidades = new ButtonGroup();

		comboBoxFaculdades.setBounds(129, 187, 174, 22);
		panel_1.add(comboBoxFaculdades);
		getContentPane().setLayout(groupLayout);

		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.setBounds(305, 391, 136, 27);
		btnNewButton.setIcon(new ImageIcon(cadastroAluno.class.getResource("/imagens/salve-.png")));

		String getDataNascimento = txtDataNascimentoo.getText();
		java.util.Date dataAtual = new java.util.Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		try {
			Date dataNascimento = (Date) dateFormat.parse(getDataNascimento);
		} catch (ParseException e1) {
		}

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (txtNome.getText().isEmpty() || txtCpf.getText().isEmpty() || txtDataNascimentoo.getText().isEmpty()
						|| txtTipoCurso.getText().isEmpty() || txtCurso.getText().isEmpty()
						|| comboBoxFaculdades.getSelectedItem() == null || txtTotalSemestres.getText().isEmpty()
						|| txtSemestreAtual.getText().isEmpty() || txtRua.getText().isEmpty()
						|| txtBairro.getText().isEmpty() || txtNumero.getText().isEmpty()
						|| txtTelefone.getText().isEmpty()|| txtDataNascimentoo.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "PREENCHA TODOS OS CAMPOS");

				} else {
					Object selectedObject = comboBoxFaculdades.getSelectedItem();
					String selectedFaculdade = selectedObject.toString();
					String getNome = txtNome.getText();
					String getCpf = txtCpf.getText();
					String getTipoCurso = txtTipoCurso.getText();
					String getNomeCurso = txtCurso.getText();
					String getCidadeCurso = (String) comboBoxCity.getSelectedItem();
					String nomeCidadeInsert = (String) comboBoxCity.getSelectedItem();
					int getTotalSemestres = Integer.parseInt(txtTotalSemestres.getText());
					int getSemestreAtual = Integer.parseInt(txtSemestreAtual.getText());
					String endRua = txtRua.getText();
					String endBairro = txtBairro.getText();
					String endNumero = txtNumero.getText();
					String getTelefone = txtTelefone.getText();
					String getDataNasc = txtDataNascimentoo.getText();

					try {
						Class.forName("com.mysql.cj.jdbc.Driver");

						String url = "jdbc:mysql://localhost:3306/sec_educacao";
						String usuario = "root";
						String senha = "5988";

						Connection conexao = DriverManager.getConnection(url, usuario, senha);

						boolean segundaFeira;
						if (checkSegunda.isSelected()) {
							segundaFeira = true;
						} else {
							segundaFeira = false;
						}
						boolean tercaFeira;
						if (checkTerca.isSelected()) {
							tercaFeira = true;
						} else {
							tercaFeira = false;
						}
						boolean quartaFeira;
						if (checkQuarta.isSelected()) {
							quartaFeira = true;
						} else {
							quartaFeira = false;
						}
						boolean quintaFeira;
						if (checkQuinta.isSelected()) {
							quintaFeira = true;
						} else {
							quintaFeira = false;
						}
						boolean sextaFeira;
						if (checkSexta.isSelected()) {
							sextaFeira = true;
						} else {
							sextaFeira = false;
						}
						PreparedStatement stmt = conexao.prepareStatement(
								"SELECT faculdades.id, faculdades.cidade_id, cidades.onibus_id FROM faculdades\r\n"
										+ "INNER JOIN cidades ON faculdades.cidade_id = cidades.id where faculdades.nome = ?");
						stmt.setString(1, selectedFaculdade);

						ResultSet rs = stmt.executeQuery();

						int faculdadeId = 0;
						int onibusId = 0;

						if (rs.next()) {
							onibusId = rs.getInt("onibus_id");
							faculdadeId = rs.getInt("id");
						}

						PreparedStatement consultarVagas = conexao
								.prepareStatement("SELECT vagas FROM onibus WHERE id = ?");
						consultarVagas.setInt(1, onibusId);
						consultarVagas.execute();

						ResultSet vg = consultarVagas.executeQuery();
						int numeroVagas = 0;

						if (vg.next()) {
							numeroVagas = vg.getInt("vagas");
						}
						boolean vagasEsgotadas = false;

						if (checkSegunda.isSelected()) {
							PreparedStatement vSegunda = conexao
									.prepareStatement("SELECT count(*) AS alunos_segunda FROM alunos "
											+ "WHERE segunda_feira = 1 AND onibus_id = ?");
							vSegunda.setInt(1, onibusId);
							ResultSet rsSegunda = vSegunda.executeQuery();
							int alunosCadastrados = 0;
							if (rsSegunda.next()) {
								alunosCadastrados = rsSegunda.getInt("alunos_segunda");
								if (alunosCadastrados >= numeroVagas) {
									JOptionPane.showMessageDialog(null, "VAGAS NA SEGUNDA ESGOTADAS, DESMARQUE");
									vagasEsgotadas = true;
								}
								rsSegunda.close();
								vSegunda.close();
							}
						}
						if (checkTerca.isSelected()) {
							PreparedStatement vTerca = conexao.prepareStatement(
									"SELECT count(*) AS alunos_terca FROM alunos WHERE terca_feira = 1 AND onibus_id = ?;");
							vTerca.setInt(1, onibusId);
							ResultSet rsTerca = vTerca.executeQuery();
							int alunosCadastrados = 0;
							if (rsTerca.next()) {
								alunosCadastrados = rsTerca.getInt("alunos_terca");
								if (alunosCadastrados >= numeroVagas) {
									JOptionPane.showMessageDialog(null, "VAGAS NA TERÇA ESGOTADAS, DESMARQUE");
									vagasEsgotadas = true;
								}
								rsTerca.close();
								vTerca.close();
							}
						}
						if (checkQuarta.isSelected()) {
							PreparedStatement vQuarta = conexao.prepareStatement(
									"SELECT count(*) AS alunos_quarta FROM alunos WHERE quarta_feira = 1 AND onibus_id = ?;");
							vQuarta.setInt(1, onibusId);
							ResultSet rsQuarta = vQuarta.executeQuery();
							int alunosCadastrados = 0;
							if (rsQuarta.next()) {
								alunosCadastrados = rsQuarta.getInt("alunos_quarta");
								if (alunosCadastrados >= numeroVagas) {
									JOptionPane.showMessageDialog(null, "VAGAS NA QUARTA ESGOTADAS, DESMARQUE");
									vagasEsgotadas = true;
								}
								rsQuarta.close();
								vQuarta.close();
							}
						}
						if (checkQuinta.isSelected()) {
							PreparedStatement vQuinta = conexao.prepareStatement(
									"SELECT count(*) AS alunos_quinta FROM alunos WHERE quinta_feira = 1 AND onibus_id = ?;");
							vQuinta.setInt(1, onibusId);
							ResultSet rsQuinta = vQuinta.executeQuery();
							int alunosCadastrados = 0;
							if (rsQuinta.next()) {
								alunosCadastrados = rsQuinta.getInt("alunos_quinta");
								if (alunosCadastrados >= numeroVagas) {
									JOptionPane.showMessageDialog(null, "VAGAS NA QUINTA ESGOTADAS, DESMARQUE");
									vagasEsgotadas = true;
								}
								rsQuinta.close();
								vQuinta.close();
							}
						}
						if (checkSexta.isSelected()) {
							PreparedStatement vSexta = conexao.prepareStatement(
									"SELECT count(*) AS alunos_sexta FROM alunos WHERE sexta_feira = 1 AND onibus_id = ?;");
							vSexta.setInt(1, onibusId);
							ResultSet rsSexta = vSexta.executeQuery();
							int alunosCadastrados = 0;
							if (rsSexta.next()) {
								alunosCadastrados = rsSexta.getInt("alunos_sexta");
								if (alunosCadastrados >= numeroVagas) {
									JOptionPane.showMessageDialog(null, "VAGAS NA SEXTA ESGOTADAS, DESMARQUE");
									vagasEsgotadas = true;
								}
								rsSexta.close();
								vSexta.close();
							}
						}
						
						if (!vagasEsgotadas) {
							PreparedStatement con = conexao.prepareStatement(
									"Insert into alunos (nome, cpf, faculdade, cidadeFaculdade, nomeCurso, tipoCurso,"
											+ " totalSemestres, semestreAtual, enderecoRua,enderecoBairro ,enderecoNumero, telefone"
											+ ", faculdade_id, dataNascimento,segunda_feira, terca_feira,quarta_feira"
											+ ", quinta_Feira, sexta_feira, onibus_id)"
											+ " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
							con.setString(1, getNome);
							con.setString(2, getCpf);
							con.setString(3, selectedFaculdade);
							con.setString(4, getCidadeCurso);
							con.setString(5, getNomeCurso);
							con.setString(6, getTipoCurso);
							con.setInt(7, getTotalSemestres);
							con.setInt(8, getSemestreAtual);
							con.setString(9, endRua);
							con.setString(10, endBairro);
							con.setString(11, endNumero);
							con.setString(12, getTelefone);
							con.setInt(13, faculdadeId);
							con.setString(14, getDataNasc);
							con.setBoolean(15, segundaFeira);
							con.setBoolean(16, tercaFeira);
							con.setBoolean(17, quartaFeira);
							con.setBoolean(18, quintaFeira);
							con.setBoolean(19, sextaFeira);
							con.setInt(20, onibusId);
							con.execute();
							con.close();

							JOptionPane.showMessageDialog(null, "ALUNO REGISTRADO COM SUCESSO!!");

							txtNome.setText("");
							txtCpf.setText("");
							txtDataNascimentoo.setText("");
							txtCurso.setText("");
							txtTipoCurso.setText("");
							// txtInstituicao.setText("");
							txtTotalSemestres.setText("");
							txtSemestreAtual.setText("");
							txtRua.setText("");
							txtNumero.setText("");
							txtBairro.setText("");
							txtTelefone.setText("");
							checkSegunda.setSelected(false);
							checkTerca.setSelected(false);
							checkQuarta.setSelected(false);
							checkQuinta.setSelected(false);
							checkSexta.setSelected(false);
						}
						rs.close();
						stmt.close();
						vg.close();
						consultarVagas.close();
						conexao.close();
						

						// Closing ResultSets, PreparedStatements, and Connection for the additional queries
					
					} catch (ClassNotFoundException e1) {
						JOptionPane.showMessageDialog(null, "ERRO AO REGISTRAR ALUNO!");
						e1.printStackTrace();
					} // conectando ao banco
					catch (SQLException e1) {
						JOptionPane.showMessageDialog(null, "ERRO AO REGISTRAR ALUNO!");
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}
		});
		panel_1.setLayout(null);
		panel_1.add(lblNewLabel_8);
		panel_1.add(txtTotalSemestres);
		panel_1.add(lblNewLabel_9);
		panel_1.add(txtSemestreAtual);
		panel_1.add(lblNewLabel);
		panel_1.add(lblNewLabel_5);
		panel_1.add(lblNewLabel_7);
		panel_1.add(lblNewLabel_11);
		panel_1.add(lblNewLabel_12);
		panel_1.add(lblNewLabel_4);
		panel_1.add(lblNewLabel_1);
		panel_1.add(lblNewLabel_2);
		panel_1.add(txtDataNascimentoo);
		panel_1.add(txtNome);
		panel_1.add(txtCpf);
		panel_1.add(btnNewButton);
		panel_1.add(lblNewLabel_14);
		panel_1.add(icon);
		panel_1.add(txtCurso);
		panel_1.add(lblNewLabel_15);
		panel_1.add(lblNewLabel_6);
		panel_1.add(txtRua);
		panel_1.add(lblNewLabel_10);
		panel_1.add(txtBairro);
		panel_1.add(lblNewLabel_13);
		panel_1.add(txtNumero);
		panel_1.add(txtTipoCurso);
		panel_1.add(txtTelefone);

		JLabel lblNewLabel_16 = new JLabel("PLACA DO ONIBUS:");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_16.setBounds(324, 191, 117, 14);
		panel_1.add(lblNewLabel_16);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxCity.removeAllItems();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					String url = "jdbc:mysql://localhost:3306/sec_educacao";
					String usuario = "root";
					String senha = "5988";

					Connection conexao = DriverManager.getConnection(url, usuario, senha);

					PreparedStatement inserirCidades = conexao.prepareStatement("SELECT nome FROM cidades");
					ResultSet rsInserirCity = inserirCidades.executeQuery();
					String nomeCidades = "";
					while (rsInserirCity.next()) {
						nomeCidades = rsInserirCity.getString("nome");
						comboBoxCity.addItem(nomeCidades);
					}
					conexao.close();
					inserirCidades.close();
					rsInserirCity.close();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(cadastroAluno.class.getResource("/imagens/atualizar.png")));
		btnNewButton_1.setBounds(305, 147, 54, 23);
		panel_1.add(btnNewButton_1);

		/*
		 * table = new JTable(); table.setBounds(10, 264, 699, 112); JScrollPane scroll
		 * = new JScrollPane(); scroll.setViewportView(table); panel_2.add(scroll);
		 * String colunas[] = { "Nome", "Cpf" }; DefaultTableModel model = new
		 * DefaultTableModel(colunas, 0); table.setModel(model)
		 */

	}
}