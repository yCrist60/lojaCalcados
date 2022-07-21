package br.com.lojacalcados.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField$AbstractFormatter;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class TelaFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFuncionario frame = new TelaFuncionario();
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
	public TelaFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1075, 894);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlEndereco = new JPanel();
		pnlEndereco.setLayout(null);
		pnlEndereco.setBounds(10, 354, 1013, 173);
		contentPane.add(pnlEndereco);
		
		JLabel lblTipo = new JLabel("Tipo de Logradouro:");
		lblTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipo.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblTipo.setBounds(10, 23, 148, 16);
		pnlEndereco.add(lblTipo);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLogradouro.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblLogradouro.setBounds(10, 60, 148, 16);
		pnlEndereco.add(lblLogradouro);
		
		JLabel lblNumero = new JLabel("N\u00FAmero:");
		lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumero.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNumero.setBounds(10, 97, 148, 14);
		pnlEndereco.add(lblNumero);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblComplemento.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblComplemento.setBounds(10, 134, 148, 16);
		pnlEndereco.add(lblComplemento);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCep.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblCep.setBounds(446, 23, 148, 14);
		pnlEndereco.add(lblCep);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBairro.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblBairro.setBounds(446, 60, 148, 14);
		pnlEndereco.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCidade.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblCidade.setBounds(446, 97, 148, 14);
		pnlEndereco.add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstado.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblEstado.setBounds(446, 134, 148, 14);
		pnlEndereco.add(lblEstado);
		
		JComboBox cboTipo = new JComboBox();
		cboTipo.setBounds(168, 17, 148, 30);
		pnlEndereco.add(cboTipo);
		
		JFormattedTextField txtCEP = new JFormattedTextField((AbstractFormatter) null);
		txtCEP.setBounds(604, 17, 162, 30);
		pnlEndereco.add(txtCEP);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(168, 54, 345, 30);
		pnlEndereco.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(168, 90, 148, 30);
		pnlEndereco.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(168, 128, 339, 30);
		pnlEndereco.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(604, 54, 387, 30);
		pnlEndereco.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(604, 90, 387, 30);
		pnlEndereco.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(604, 128, 178, 30);
		pnlEndereco.add(textField_5);
		
		JPanel pnlDP = new JPanel();
		pnlDP.setLayout(null);
		pnlDP.setBounds(10, 168, 551, 168);
		contentPane.add(pnlDP);
		
		JLabel lblNomeFuncionario = new JLabel("Nome do Funcion\u00E1rio");
		lblNomeFuncionario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNomeFuncionario.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNomeFuncionario.setBounds(10, 22, 176, 14);
		pnlDP.add(lblNomeFuncionario);
		
		JLabel lblCpfDoFuncionrio = new JLabel("CPF do Funcion\u00E1rio");
		lblCpfDoFuncionrio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCpfDoFuncionrio.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblCpfDoFuncionrio.setBounds(10, 58, 176, 14);
		pnlDP.add(lblCpfDoFuncionrio);
		
		JLabel lblDataNascimento = new JLabel("Data de Nascimento:");
		lblDataNascimento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDataNascimento.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblDataNascimento.setBounds(10, 94, 176, 14);
		pnlDP.add(lblDataNascimento);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSexo.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSexo.setBounds(10, 130, 176, 14);
		pnlDP.add(lblSexo);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_6.setColumns(10);
		textField_6.setBounds(196, 15, 345, 30);
		pnlDP.add(textField_6);
		
		JFormattedTextField txtCPF = new JFormattedTextField((AbstractFormatter) null);
		txtCPF.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtCPF.setBounds(196, 51, 144, 30);
		pnlDP.add(txtCPF);
		
		JFormattedTextField txtDataNascimento = new JFormattedTextField((AbstractFormatter) null);
		txtDataNascimento.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtDataNascimento.setBounds(196, 87, 144, 30);
		pnlDP.add(txtDataNascimento);
		
		JComboBox cboSexo = new JComboBox();
		cboSexo.setFont(new Font("Dialog", Font.PLAIN, 14));
		cboSexo.setBounds(196, 123, 144, 30);
		pnlDP.add(cboSexo);
		
		JPanel pnlContato = new JPanel();
		pnlContato.setLayout(null);
		pnlContato.setBounds(571, 168, 452, 168);
		contentPane.add(pnlContato);
		
		JLabel lblTelefoneResidencial = new JLabel("Telefone Residencial:");
		lblTelefoneResidencial.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefoneResidencial.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblTelefoneResidencial.setBounds(10, 19, 157, 14);
		pnlContato.add(lblTelefoneResidencial);
		
		JLabel lblTelefoneCelular = new JLabel("Telefone Celular:");
		lblTelefoneCelular.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefoneCelular.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblTelefoneCelular.setBounds(10, 55, 157, 14);
		pnlContato.add(lblTelefoneCelular);
		
		JLabel lblTelefoneComercial = new JLabel("Telefone Comercial:");
		lblTelefoneComercial.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefoneComercial.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblTelefoneComercial.setBounds(10, 91, 157, 14);
		pnlContato.add(lblTelefoneComercial);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblEmail.setBounds(10, 126, 157, 14);
		pnlContato.add(lblEmail);
		
		JFormattedTextField txtResidencial = new JFormattedTextField((AbstractFormatter) null);
		txtResidencial.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtResidencial.setBounds(177, 11, 253, 30);
		pnlContato.add(txtResidencial);
		
		JFormattedTextField txtCelular = new JFormattedTextField((AbstractFormatter) null);
		txtCelular.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtCelular.setBounds(177, 47, 253, 30);
		pnlContato.add(txtCelular);
		
		JFormattedTextField txtComercial = new JFormattedTextField((AbstractFormatter) null);
		txtComercial.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtComercial.setBounds(177, 83, 253, 30);
		pnlContato.add(txtComercial);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(177, 120, 253, 30);
		pnlContato.add(textField_7);
		
		JLabel lblicone = new JLabel("");
		lblicone.setIcon(new ImageIcon("C:\\Users\\cristian.vmjurado\\Documents\\LojaCalcados\\imagens\\user.png"));
		lblicone.setBounds(20, 11, 174, 110);
		contentPane.add(lblicone);
		
		JLabel lblGerenciarFuncionrios = new JLabel("Gerenciar Funcion\u00E1rios");
		lblGerenciarFuncionrios.setFont(new Font("Dialog", Font.PLAIN, 29));
		lblGerenciarFuncionrios.setBounds(204, 11, 329, 99);
		contentPane.add(lblGerenciarFuncionrios);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon("C:\\Users\\cristian.vmjurado\\Documents\\LojaCalcados\\imagens\\disquete.png"));
		btnSalvar.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnSalvar.setBounds(696, 30, 160, 80);
		contentPane.add(btnSalvar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\cristian.vmjurado\\Documents\\LojaCalcados\\imagens\\lupa.png"));
		btnConsultar.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnConsultar.setBounds(863, 30, 160, 80);
		contentPane.add(btnConsultar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 538, 993, 254);
		contentPane.add(scrollPane);
	}
}
