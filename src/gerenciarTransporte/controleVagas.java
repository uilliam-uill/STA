package gerenciarTransporte;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

public class controleVagas extends JInternalFrame {
	private JTable tableSegunda;
	private JTable tableTerca;
	private JTable tableQuarta;
	private JTable tableQuinta;
	private JTable tableSexta;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { controleVagas frame = new
	 * controleVagas(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public controleVagas() {
		
		
		setBounds(100, 100, 1041, 537);
		getContentPane().setLayout(new CardLayout(0, 0));

		JPanel panel = new JPanel();
		getContentPane().add(panel, "name_5222394870691800");
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("SEGUNDA FEIRA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(51, 11, 112, 14);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("TERÇA FEIRA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(268, 11, 100, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("QUARTA FEIRA");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(453, 11, 100, 14);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("QUINTA FEIRA");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(669, 11, 91, 14);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("SEXTA FEIRA");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(877, 11, 116, 14);
		panel.add(lblNewLabel_4);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(251, 466, 201, 22);
		panel.add(comboBox);

		JLabel lblSegunda = new JLabel("");
		lblSegunda.setForeground(new Color(255, 0, 0));
		lblSegunda.setBounds(129, 422, 46, 14);
		panel.add(lblSegunda);

		JLabel lblTerca = new JLabel("");
		lblTerca.setForeground(new Color(255, 0, 0));
		lblTerca.setBounds(330, 422, 46, 14);
		panel.add(lblTerca);

		JLabel lblQuarta = new JLabel("");
		lblQuarta.setForeground(new Color(255, 0, 0));
		lblQuarta.setBounds(536, 422, 46, 14);
		panel.add(lblQuarta);

		JLabel lblQuinta = new JLabel("");
		lblQuinta.setForeground(new Color(255, 0, 0));
		lblQuinta.setBounds(739, 422, 46, 14);
		panel.add(lblQuinta);

		JLabel lblSexta = new JLabel("");
		lblSexta.setForeground(new Color(255, 0, 0));
		lblSexta.setBounds(947, 422, 46, 14);
		panel.add(lblSexta);

		String[] colunas = { "NOME", "CIDADE" };

		DefaultTableModel segunda = new DefaultTableModel(colunas, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			} // NAO EDITAR DADOS PELA TABELA
		};

		tableSegunda = new JTable(segunda);
		JScrollPane scrollSegunda = new JScrollPane(tableSegunda);
		scrollSegunda.setBounds(10, 36, 193, 375); // Ajuste as coordenadas e o tamanho conforme necessário
		panel.add(scrollSegunda);

		DefaultTableModel terca = new DefaultTableModel(colunas, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			} // NAO EDITAR DADOS PELA TABELA
		};

		tableTerca = new JTable(terca);
		JScrollPane scroolTerca = new JScrollPane(tableTerca);
		tableTerca.setBounds(180, 38, 156, 376);
		scroolTerca.setBounds(213, 36, 189, 376);
		panel.add(scroolTerca);

		DefaultTableModel quarta = new DefaultTableModel(colunas, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			} // NAO EDITAR DADOS PELA TABELA
		};
		tableQuarta = new JTable(quarta);
		JScrollPane scroolQuarta = new JScrollPane(tableQuarta);
		tableQuarta.setBounds(346, 37, 147, 376);
		scroolQuarta.setBounds(412, 36, 189, 376);
		panel.add(scroolQuarta);

		DefaultTableModel quinta = new DefaultTableModel(colunas, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			} // NAO EDITAR DADOS PELA TABELA
		};

		tableQuinta = new JTable(quinta);
		JScrollPane scroolQuinta = new JScrollPane(tableQuinta);
		tableQuinta.setBounds(570, 39, 160, 367);
		scroolQuinta.setBounds(619, 36, 189, 377);
		panel.add(scroolQuinta);

		DefaultTableModel sexta = new DefaultTableModel(colunas, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			} // NAO EDITAR DADOS PELA TABELA
		};
		tableSexta = new JTable(sexta);
		JScrollPane scroolSexta = new JScrollPane(tableSexta);
		tableSexta.setBounds(753, 36, 171, 377);
		scroolSexta.setBounds(826, 36, 189, 377);
		panel.add(scroolSexta);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/sec_educacao";
			String usuario = "root";
			String senha = "5988";

			Connection conexao = DriverManager.getConnection(url, usuario, senha);

			PreparedStatement stmti = conexao.prepareStatement("SELECT placa, vagas FROM onibus");

			ResultSet rsc = stmti.executeQuery();
			int vagasSegunda = 0;
			while (rsc.next()) {
				String placaOnibus = rsc.getString("onibus.placa");
				comboBox.addItem(placaOnibus);
				vagasSegunda = rsc.getInt("vagas");
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		JButton btnNewButton = new JButton("ACESSAR DADOS");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setIcon(new ImageIcon(controleVagas.class.getResource("/imagens/acesso-de-dados.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.removeAll();
				String placaOnibus = (String) comboBox.getSelectedItem();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					String url = "jdbc:mysql://localhost:3306/sec_educacao";
					String usuario = "root";
					String senha = "5988";

					Connection conexao = DriverManager.getConnection(url, usuario, senha);

					PreparedStatement idOnibus = conexao
							.prepareStatement("SELECT id, vagas FROM onibus WHERE placa = ?");
					idOnibus.setString(1, placaOnibus);
					idOnibus.execute();
					ResultSet rsIdOnibus = idOnibus.executeQuery();
					int onibusId = 0;
					int vagas = 0;
					if (rsIdOnibus.next()) {
						vagas = rsIdOnibus.getInt("vagas");
						onibusId = rsIdOnibus.getInt("id");
					}
					// VAGAS DE SEGUNDA
					PreparedStatement calculoSegunda = conexao
							.prepareStatement("SELECT COUNT(ID) AS total_alunos_segunda FROM alunos WHERE segunda_feira"
									+ " = 1 AND onibus_id = ?");
					calculoSegunda.setInt(1, onibusId);
					calculoSegunda.execute();

					int numeroDeAlunosSegunda = 0;

					ResultSet rsCalculoSegunda = calculoSegunda.executeQuery();

					if (rsCalculoSegunda.next()) {
						numeroDeAlunosSegunda = rsCalculoSegunda.getInt("total_alunos_segunda");
					}

					int resultadoSegunda = vagas - numeroDeAlunosSegunda;
					lblSegunda.setText(Integer.toString(resultadoSegunda));

					// VAGAS DE TERÇA
					PreparedStatement calculoTerca = conexao
							.prepareStatement("SELECT COUNT(ID) AS total_alunos_terca FROM alunos WHERE terca_feira"
									+ " = 1 AND onibus_id = ?");
					calculoTerca.setInt(1, onibusId);
					calculoTerca.execute();
					int numeroDeAlunosTerca = 0;

					ResultSet rsCalculoTerca = calculoTerca.executeQuery();

					if (rsCalculoTerca.next()) {
						numeroDeAlunosTerca = rsCalculoTerca.getInt("total_alunos_terca");
					}

					int resultadoTerca = vagas - numeroDeAlunosTerca;
					lblTerca.setText(Integer.toString(resultadoTerca));

					// VAGAS QUARTA
					PreparedStatement calculoQuarta = conexao
							.prepareStatement("SELECT COUNT(ID) AS total_alunos_quarta FROM alunos WHERE quarta_feira"
									+ " = 1 AND onibus_id = ?");
					calculoQuarta.setInt(1, onibusId);
					calculoQuarta.execute();

					int numeroDeAlunosQuarta = 0;

					ResultSet rsCalculoQuarta = calculoQuarta.executeQuery();

					if (rsCalculoQuarta.next()) {
						numeroDeAlunosQuarta = rsCalculoQuarta.getInt("total_alunos_quarta");
					}

					int resultadoQuarta = vagas - numeroDeAlunosQuarta;
					lblQuarta.setText(Integer.toString(resultadoQuarta));

					// VAGAS QUINTA
					PreparedStatement calculoQuinta = conexao
							.prepareStatement("SELECT COUNT(ID) AS total_alunos_quinta FROM alunos WHERE quinta_Feira"
									+ " = 1 AND onibus_id = ?");
					calculoQuinta.setInt(1, onibusId);
					calculoQuinta.execute();

					int numeroDeAlunosQuinta = 0;

					ResultSet rsCalculoQuinta = calculoQuinta.executeQuery();

					if (rsCalculoQuinta.next()) {
						numeroDeAlunosQuinta = rsCalculoQuinta.getInt("total_alunos_quinta");
					}

					int resultadoQuinta = vagas - numeroDeAlunosQuinta;
					lblQuinta.setText(Integer.toString(resultadoQuinta));
					// VAGAS DE SEXTA
					PreparedStatement calculoSexta = conexao
							.prepareStatement("SELECT COUNT(ID) AS total_alunos_quinta FROM alunos WHERE sexta_feira"
									+ " = 1 AND onibus_id = ?");
					calculoSexta.setInt(1, onibusId);
					calculoSexta.execute();

					int numeroDeAlunosSexta = 0;

					ResultSet rsCalculoSexta = calculoSexta.executeQuery();

					if (rsCalculoSexta.next()) {
						numeroDeAlunosSexta = rsCalculoSexta.getInt("total_alunos_quinta");
					}

					int resultadoSexta = vagas - numeroDeAlunosSexta;
					lblSexta.setText(Integer.toString(resultadoSexta));

					// FIM

					PreparedStatement idOnibus1 = conexao
							.prepareStatement("SELECT cidades.onibus_id, onibus.placa, cidades.nome FROM cidades "
									+ "INNER JOIN onibus ON onibus.id = cidades.onibus_id WHERE onibus.placa = ?");
					idOnibus1.setString(1, placaOnibus);
					idOnibus1.execute();

					int iddOnibus = 0;
					String nomeCity = "";
					ResultSet rsIdOnibus2 = idOnibus1.executeQuery();
					if (rsIdOnibus2.next()) {
						iddOnibus = rsIdOnibus2.getInt("onibus_id");
						nomeCity = rsIdOnibus2.getString("cidades.nome");
					}

					PreparedStatement alunosSegunda = conexao.prepareStatement(
							"SELECT nome, cidadeFaculdade FROM alunos WHERE segunda_feira = 1 AND onibus_id = ?");
					alunosSegunda.setInt(1, iddOnibus);
					alunosSegunda.execute();
					ResultSet rsSegunda = alunosSegunda.executeQuery();

					DefaultTableModel tabela = (DefaultTableModel) tableSegunda.getModel();
					tabela.setRowCount(0); // Limpa a tabela antes de adicionar novas linhas

					while (rsSegunda.next()) {
						String nomeAlunos = rsSegunda.getString("nome");
						String faculdadeS = rsSegunda.getString("cidadeFaculdade");
						Object[] linha = { nomeAlunos, faculdadeS };
						tabela.addRow(linha);
					}
					PreparedStatement alunosTerca = conexao.prepareStatement(
							"SELECT nome, cidadeFaculdade FROM alunos WHERE terca_feira = 1 AND onibus_id = ?");
					alunosTerca.setInt(1, iddOnibus);
					alunosTerca.execute();
					ResultSet rsTerca = alunosTerca.executeQuery();

					DefaultTableModel tabela2 = (DefaultTableModel) tableTerca.getModel();
					tabela2.setRowCount(0); // Limpa a tabela antes de adicionar novas linhas

					while (rsTerca.next()) {
						String nomeAlunoT = rsTerca.getString("nome");
						String faculdadeT = rsTerca.getString("cidadeFaculdade");
						Object[] linha = { nomeAlunoT, faculdadeT };
						tabela2.addRow(linha);
					}

					PreparedStatement alunosQuarta = conexao.prepareStatement(
							"SELECT nome, cidadeFaculdade FROM alunos WHERE quarta_feira = 1 AND onibus_id = ?");
					alunosQuarta.setInt(1, iddOnibus);
					alunosQuarta.execute();

					ResultSet rsQuarta = alunosQuarta.executeQuery();

					DefaultTableModel tabela3 = (DefaultTableModel) tableQuarta.getModel();
					tabela3.setRowCount(0); // Limpa a tabela antes de adicionar novas linhas

					while (rsQuarta.next()) {
						String nomeAlunoT = rsQuarta.getString("nome");
						String faculdadeT = rsQuarta.getString("cidadeFaculdade");
						Object[] linha = { nomeAlunoT, faculdadeT };
						tabela3.addRow(linha);
					}

					PreparedStatement alunosQuinta = conexao.prepareStatement(
							"SELECT nome, cidadeFaculdade FROM alunos WHERE quinta_Feira = 1 AND onibus_id = ?");
					alunosQuinta.setInt(1, iddOnibus);
					alunosQuinta.execute();

					ResultSet rsQuinta = alunosQuinta.executeQuery();

					DefaultTableModel tabela4 = (DefaultTableModel) tableQuinta.getModel();
					tabela4.setRowCount(0); // Limpa a tabela antes de adicionar novas linhas

					while (rsQuinta.next()) {
						String nomeAlunoT = rsQuinta.getString("nome");
						String faculdadeT = rsQuinta.getString("cidadeFaculdade");
						Object[] linha = { nomeAlunoT, faculdadeT };
						tabela4.addRow(linha);
					}

					PreparedStatement alunosSexta = conexao.prepareStatement(
							"SELECT nome, cidadeFaculdade FROM alunos WHERE sexta_feira = 1 AND onibus_id = ?");
					alunosSexta.setInt(1, iddOnibus);
					alunosSexta.execute();

					ResultSet rsSexta = alunosSexta.executeQuery();

					DefaultTableModel tabela5 = (DefaultTableModel) tableSexta.getModel();
					tabela5.setRowCount(0); // Limpa a tabela antes de adicionar novas linhas

					while (rsSexta.next()) {
						String nomeAlunoT = rsSexta.getString("nome");
						String faculdadeT = rsSexta.getString("cidadeFaculdade");
						Object[] linha = { nomeAlunoT, faculdadeT };
						tabela5.addRow(linha);
					}
					
					// ... Código anterior ...

					conexao.close(); // Fechar conexão principal com o banco de dados
					idOnibus.close(); // Fechar PreparedStatement
					rsIdOnibus.close(); // Fechar ResultSet

					calculoSegunda.close(); // Fechar PreparedStatement
					rsCalculoSegunda.close(); // Fechar ResultSet

					calculoTerca.close(); // Fechar PreparedStatement
					rsCalculoTerca.close(); // Fechar ResultSet

					calculoQuarta.close(); // Fechar PreparedStatement
					rsCalculoQuarta.close(); // Fechar ResultSet

					calculoQuinta.close(); // Fechar PreparedStatement
					rsCalculoQuinta.close(); // Fechar ResultSet

					calculoSexta.close(); // Fechar PreparedStatement
					rsCalculoSexta.close(); // Fechar ResultSet

					idOnibus1.close(); // Fechar PreparedStatement
					rsIdOnibus2.close(); // Fechar ResultSet

					alunosSegunda.close(); // Fechar PreparedStatement
					rsSegunda.close(); // Fechar ResultSet

					alunosTerca.close(); // Fechar PreparedStatement
					rsTerca.close(); // Fechar ResultSet

					alunosQuarta.close(); // Fechar PreparedStatement
					rsQuarta.close(); // Fechar ResultSet

					alunosQuinta.close(); // Fechar PreparedStatement
					rsQuinta.close(); // Fechar ResultSet

					alunosSexta.close(); // Fechar PreparedStatement
					rsSexta.close(); // Fechar ResultSet

					// ... Código posterior ...

				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} // Fim do actionPerformed

		}); // Fim do addActionListener

		btnNewButton.setBounds(457, 466, 144, 23);
		panel.add(btnNewButton);

		JLabel lblNewLabel_5 = new JLabel("VAGAS DISPONIVEIS:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(20, 422, 112, 14);
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("VAGAS DISPONIVEIS:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(223, 422, 112, 14);
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("VAGAS DISPONIVEIS:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(422, 422, 104, 14);
		panel.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("VAGAS DISPONIVEIS:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(629, 422, 104, 14);
		panel.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("VAGAS DISPONIVEIS:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_9.setBounds(836, 422, 104, 14);
		panel.add(lblNewLabel_9);
	} // Fim do construtor controleVagas
} // Fim da classe controleVagas