package gerenciarTransporte;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class telaInicial extends JFrame {
	/**
	 * Launch the application.
	 */
	private boolean isCadastroAlunoOpen = false;
	private boolean isAuxilioTransporteOpen = false;
	private boolean isOnibusOpen = false;
	private boolean isVagasOpen = false;
	private boolean isDadosOpen = false;
	private boolean isFinanceiroOpen = false;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaInicial frame = new telaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void abrirJanela() {
		telaInicial telaInicial = new telaInicial();
		telaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public telaInicial() {
		
		


		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(217, 217, 217));

		setTitle("Sistema de Transporte Academico");
		setIconImage(new ImageIcon("src/imagens/logoaparencia.png").getImage());

		JPanel panelMaximoInicial = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 736);

		Dimension tamanhoMaximoPanel = new Dimension(500, 500);
		panelMaximoInicial.setMaximumSize(tamanhoMaximoPanel);
		setExtendedState(JFrame.MAXIMIZED_BOTH);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(239, 154, 29));

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
				.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)));

		JLabel iconCentra = new JLabel(
				new ImageIcon(telaInicial.class.getResource("/imagens/Captura de tela_20230606_114233.png")));
		iconCentra.setBounds(406, 143, 582, 284);
		desktopPane.add(iconCentra);

		cadastroAluno cadastroAluno = new cadastroAluno();
		cadastroAluno.addInternalFrameListener(new InternalFrameAdapter() {
			@Override
			public void internalFrameClosing(InternalFrameEvent e) {
				isCadastroAlunoOpen = false;
			}
		});
		JButton btnNewButton = new JButton("CADASTRAR ALUNO");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setIcon(new ImageIcon(telaInicial.class.getResource("/imagens/adicionar-usuario.png")));
		btnNewButton.setBounds(45, 21, 181, 48);
		btnNewButton.setToolTipText("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isCadastroAlunoOpen) {
					cadastroAluno.setClosable(true);
					cadastroAluno.setVisible(true);
					cadastroAluno.setBounds(300, 120, 800, 500);
					desktopPane.add(cadastroAluno);
					cadastroAluno.toFront();
					cadastroAluno.moveToFront();
					isCadastroAlunoOpen = true;
				}else {
					cadastroAluno.moveToFront();
				}
			}
		});
		panel.setLayout(null);
		JButton btnNewButton_1 = new JButton("FACULDADE/CIDADE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cadastrarFaculdade cadastrarFaculdade = new cadastrarFaculdade();
		cadastrarFaculdade.addInternalFrameListener(new InternalFrameAdapter() {
			@Override
			public void internalFrameClosing(InternalFrameEvent e) {
				isAuxilioTransporteOpen = false;
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isAuxilioTransporteOpen) {
				cadastrarFaculdade.setClosable(true);
				cadastrarFaculdade.setVisible(true);
				cadastrarFaculdade.setBounds(100, 100, 472, 333);
				desktopPane.add(cadastrarFaculdade);
				cadastrarFaculdade.toFront();
				cadastrarFaculdade.moveToFront();
				isAuxilioTransporteOpen = true;
				}else {
					cadastrarFaculdade.moveToFront();
				}
			}
		});
		btnNewButton_1.setToolTipText("");
		btnNewButton_1.setBounds(501, 21, 181, 48);
		btnNewButton_1.setIcon(new ImageIcon(telaInicial.class.getResource("/imagens/universidade-de-oxford.png")));
		panel.add(btnNewButton_1);
		panel.add(btnNewButton);

		JButton btnNewButton_2 = new JButton("NOVO ONIBUS");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_2.setToolTipText("");
		cadastrarOnibus cadastrarOnibus = new cadastrarOnibus();
		cadastrarOnibus.addInternalFrameListener(new InternalFrameAdapter() {
			@Override
			public void internalFrameClosing(InternalFrameEvent e) {
				isOnibusOpen = false;
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isOnibusOpen) {
				cadastrarOnibus.setClosable(true);
				cadastrarOnibus.setVisible(true);
				cadastrarOnibus.setBounds(200, 100, 526, 355);
				desktopPane.add(cadastrarOnibus);
				cadastrarOnibus.toFront();
				cadastrarOnibus.moveToFront();
				isOnibusOpen = true;
				}else {
					cadastrarOnibus.moveToFront();
			}
		}
		});
		btnNewButton_2.setIcon(new ImageIcon(telaInicial.class.getResource("/imagens/ponto-de-onibus.png")));
		btnNewButton_2.setBounds(729, 21, 181, 48);
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("CONSULTAR VAGAS");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_3.setToolTipText("");
		controleVagas controleVagas = new controleVagas();
		controleVagas.addInternalFrameListener(new InternalFrameAdapter() {
			@Override
			public void internalFrameClosing(InternalFrameEvent e) {
				isVagasOpen = false;
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isVagasOpen) {
				controleVagas.setClosable(true);
				controleVagas.setVisible(true);
				controleVagas.setBounds(00, 100, 1041, 578);
				desktopPane.add(controleVagas);
				controleVagas.toFront();
				controleVagas.moveToFront();
				isVagasOpen = true;
				}else {
					controleVagas.moveToFront();
				}
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(telaInicial.class.getResource("/imagens/assento-de-carro.png")));
		btnNewButton_3.setBounds(956, 21, 181, 48);
		panel.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("EDITAR DADOS");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_4.setToolTipText("");
		atualizarDados atualizarDados = new atualizarDados();
		atualizarDados.addInternalFrameListener(new InternalFrameAdapter() {
			@Override
			public void internalFrameClosing(InternalFrameEvent e) {
				isDadosOpen = false;
			}
		});
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isDadosOpen) {
				atualizarDados.setClosable(true);
				atualizarDados.setVisible(true);
				atualizarDados.setBounds(100, 100, 676, 498);
				desktopPane.add(atualizarDados);
				atualizarDados.moveToFront();
				atualizarDados.toFront();
				isDadosOpen = true;
			}else {
				atualizarDados.moveToFront();
			}
		}
		});
		btnNewButton_4.setIcon(new ImageIcon(telaInicial.class.getResource("/imagens/editar (1).png")));
		btnNewButton_4.setBounds(1179, 21, 181, 48);
		panel.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("AUXILIO TRANSPORTE");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		auxilioTransporte auxilioTransporte = new auxilioTransporte();
		auxilioTransporte.addInternalFrameListener(new InternalFrameAdapter() {
			@Override
			public void internalFrameClosing(InternalFrameEvent e) {
				isFinanceiroOpen = false;
			}
		});
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isFinanceiroOpen) {
				auxilioTransporte.setClosable(true);
				auxilioTransporte.setVisible(true);
				auxilioTransporte.setBounds(100, 100, 853, 570);
				desktopPane.add(auxilioTransporte);
				auxilioTransporte.toFront();
				auxilioTransporte.moveToFront();
				isFinanceiroOpen = true;
				}else {
					auxilioTransporte.moveToFront();
				}
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(telaInicial.class.getResource("/imagens/dolar.png")));
		btnNewButton_5.setBounds(273, 21, 181, 48);
		panel.add(btnNewButton_5);
		getContentPane().setLayout(groupLayout);

	}
}