package gerenciarTransporte;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.awt.Window;


import javax.swing.GroupLayout;
import javax.swing.ImageIcon;

import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Image;


public class telaLogin extends JFrame {

	
	private JPanel contentPane;
	private JFormattedTextField cpf;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					telaLogin frame = new telaLogin();
					frame.setVisible(true);
					frame.setResizable(false); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public telaLogin() {
		

		
		setTitle("LOGIN");
		setIconImage(new ImageIcon ("src/imagens/logoaparencia.png").getImage());		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 321);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(217, 217, 217));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		try {
			MaskFormatter cpfformato = new MaskFormatter("###.###.###-##");
			cpf = new JFormattedTextField(cpfformato);
			cpf.setBounds(95, 72, 190, 28);
			cpf.setFont(new Font("Arial", Font.PLAIN, 15));
			cpf.setBackground(new Color(192, 192, 192));
			cpf.setColumns(10);
		  } catch (ParseException ex) {
	            ex.printStackTrace();
	        }
		JPasswordField senha = new JPasswordField();
		senha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		senha.setBounds(95, 152, 190, 28);
		senha.setBackground(new Color(192, 192, 192));
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.setBounds(133, 214, 118, 29);
		btnNewButton.setFont(new Font("Dubai Medium", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(cpf == null || senha == null) {
					JOptionPane.showMessageDialog(null, "PREENCHA TODOS OS CAMPOS");
				}
				else {
			
					try {
					    Class.forName("com.mysql.cj.jdbc.Driver");
					 
					    String url = "jdbc:mysql://localhost:3306/sec_educacao";
					    String usuario = "root";
					    String senhaBanco = "5988";

					    String getCpf = cpf.getText();
					    char [] getSenha = senha.getPassword();
					    String senhastring = new String(getSenha);

					    
					    Connection conexao = DriverManager.getConnection(url, usuario, senhaBanco);
					    PreparedStatement con = conexao.prepareStatement("select cpf, senha from usuarios where cpf = ? and senha = ?");
					    con.setString(1, getCpf);
					    con.setString(2, senhastring);

					    ResultSet rs = con.executeQuery();

					    if (rs.next()) {
					        telaInicial abrir = new telaInicial();
					        abrir.abrirJanela();
					        dispose();
					    } else {
					        JOptionPane.showMessageDialog(null, "CPF E/OU SENHA INCORRETO");
					    }
		            
					    conexao.close();
					    rs.close();
					    con.close();
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
		ImageIcon logo = new ImageIcon("src/imagens/logologin.png");
		contentPane.setLayout(null);
		contentPane.add(senha);
		contentPane.add(cpf);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(351, 0, 251, 349);
		panel.setBackground(new Color(255, 193, 7));
		contentPane.add(panel);
		panel.setLayout(null);
		JLabel lblNewLabel = new JLabel(logo);
		lblNewLabel.setBounds(55, 70, 128, 128);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setIcon(new ImageIcon(telaLogin.class.getResource("/imagens/perfil-de-usuario (1).png")));
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(170, 33, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SENHA");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(158, 127, 58, 14);
		contentPane.add(lblNewLabel_2);
	}
}