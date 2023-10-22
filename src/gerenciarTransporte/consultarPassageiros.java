package gerenciarTransporte;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class consultarPassageiros extends JInternalFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					consultarPassageiros frame = new consultarPassageiros();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public consultarPassageiros() throws SQLException {
		
		

		setBounds(100, 100, 653, 409);
		
		String [] colunas = {"NOME", "CIDADE CURSO","INSTITUIÇÃO","TELEFONE", "CPF", "ID"};
		DefaultTableModel consultando = new DefaultTableModel(colunas,0);
		table = new JTable(consultando);
		JScrollPane scrollPane = new JScrollPane(table);

		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 
         String url = "jdbc:mysql://localhost:3306/sec_educacao";
         String usuario = "root";
         String senha = "5988";
         
         Connection conexao = DriverManager.getConnection(url, usuario, senha);
         Statement con = conexao.createStatement();
         ResultSet resultado = con.executeQuery("SELECT id, nome, cidadeCurso, instituicao, telefone, cpf "
         		+ "FROM sec_educacao.alunos");
         
     	DefaultTableModel tabela = (DefaultTableModel) table.getModel();
     		while(resultado.next()) {
     			int bdId = resultado.getInt("id");
     			String bdNome = resultado.getString("nome");
     			String bdCidade = resultado.getString("cidadeCurso");
     			String bdInstituicao = resultado.getString("instituicao");
     			String bdTelefone = resultado.getString("telefone");
     			String bdCpf = resultado.getString("cpf");
     			Object [] linha = {bdId,bdNome,bdCidade,bdInstituicao, bdTelefone,bdCpf};
     			tabela.addRow(linha);
     		}
     		conexao.close();
     		con.close();
     		resultado.close();
        
		 } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 621, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
}
