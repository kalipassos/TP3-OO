package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CadastrarDonoVisual extends JFrame implements ActionListener {
	private static final long serialVersionUID = -5948886401444271227L;
	private final JLabel mensagemInicial;
	private final JLabel rotuloNome;
	private final JLabel rotuloEndereco;
	private final JLabel rotuloTelefone;
	private final JLabel rotuloCPF;
	private final JTextField textoNome;
	private final JTextField textoEndereco;
	private final JTextField textoTelefone;
	private final JTextField textoCPF;
	private final JButton botaoCadastrar;
	private final JButton botaoCancelar;

	public CadastrarDonoVisual() {

		this.mensagemInicial = new JLabel("Preencha os campos");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.rotuloNome = new JLabel("Nome");
		this.rotuloNome.setBounds(57, 25, 46, 14);
		getContentPane().add(rotuloNome);

		this.textoNome = new JTextField();
		this.textoNome.setBounds(293, 22, 86, 20);
		this.textoNome.setColumns(10);
		getContentPane().add(textoNome);

		this.rotuloEndereco = new JLabel("Endereco");
		this.rotuloEndereco.setBounds(57, 61, 46, 14);
		getContentPane().add(rotuloEndereco);

		this.textoEndereco = new JTextField();
		this.textoEndereco.setBounds(293, 58, 86, 20);
		this.textoEndereco.setColumns(10);
		getContentPane().add(textoEndereco);

		this.rotuloTelefone = new JLabel("Telefone");
		this.rotuloTelefone.setBounds(57, 96, 46, 14);
		getContentPane().add(rotuloTelefone);

		this.textoTelefone = new JTextField();
		this.textoTelefone.setBounds(293, 93, 86, 20);
		this.textoTelefone.setColumns(10);
		getContentPane().add(textoTelefone);

		this.rotuloCPF = new JLabel("CPF");
		this.rotuloCPF.setBounds(57, 131, 46, 14);
		getContentPane().add(rotuloCPF);

		this.textoCPF = new JTextField();
		this.textoCPF.setBounds(293, 128, 86, 20);
		this.textoCPF.setColumns(10);
		getContentPane().add(textoCPF);

		this.botaoCadastrar = new JButton("Cadastrar");
		this.botaoCadastrar.setBounds(78, 377, 89, 23);
		this.botaoCadastrar.addActionListener(this);
		getContentPane().add(botaoCadastrar);

		this.botaoCancelar = new JButton("Cancelar");
		this.botaoCancelar.setBounds(263, 377, 89, 23);
		this.botaoCancelar.addActionListener(this);
		getContentPane().add(botaoCancelar);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(450, 450);
		this.setResizable(false);
		getContentPane().setLayout(null);

	}

	public JTextField getTextoNome() {
		return textoNome;
	}

	public JTextField getTextoEndereco() {
		return textoEndereco;
	}

	public JTextField getTextoTelefone() {
		return textoTelefone;
	}

	public JTextField getTextoCPF() {
		return textoCPF;
	}

	public JButton getBotaoCadastrar() {
		return botaoCadastrar;
	}

	public JButton getBotaoCancelar() {
		return botaoCancelar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
