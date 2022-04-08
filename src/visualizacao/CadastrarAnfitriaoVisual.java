package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controles.CadastrarAnfitriaoControle;

public class CadastrarAnfitriaoVisual extends JFrame implements ActionListener {

	private static final long serialVersionUID = -3412887469811763103L;
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
	private final CadastrarAnfitriaoControle controle;

	public CadastrarAnfitriaoVisual() {
		getContentPane().setLayout(null);

		controle = new CadastrarAnfitriaoControle(this);

		this.mensagemInicial = new JLabel("Preencha os campos");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.rotuloNome = new JLabel("Nome");
		this.rotuloNome.setBounds(29, 25, 46, 14);
		getContentPane().add(rotuloNome);

		this.textoNome = new JTextField();
		this.textoNome.setBounds(144, 25, 86, 20);
		this.textoNome.setColumns(10);
		getContentPane().add(textoNome);

		this.rotuloEndereco = new JLabel("Endereco");
		this.rotuloEndereco.setBounds(29, 72, 46, 14);
		getContentPane().add(rotuloEndereco);

		this.textoEndereco = new JTextField();
		this.textoEndereco.setBounds(144, 69, 86, 20);
		this.textoEndereco.setColumns(10);
		getContentPane().add(textoEndereco);

		this.rotuloTelefone = new JLabel("Telefone");
		this.rotuloTelefone.setBounds(29, 121, 46, 14);
		getContentPane().add(rotuloTelefone);

		this.textoTelefone = new JTextField();
		this.textoTelefone.setBounds(144, 118, 86, 20);
		this.textoTelefone.setColumns(10);
		getContentPane().add(textoTelefone);

		this.rotuloCPF = new JLabel("CPF");
		this.rotuloCPF.setBounds(29, 167, 46, 14);
		getContentPane().add(rotuloCPF);

		this.textoCPF = new JTextField();
		this.textoCPF.setBounds(144, 164, 86, 20);
		this.textoCPF.setColumns(10);
		getContentPane().add(textoCPF);

		this.botaoCadastrar = new JButton("Cadastrar");
		this.botaoCadastrar.setBounds(66, 377, 89, 23);
		this.botaoCadastrar.addActionListener(this);
		getContentPane().add(botaoCadastrar);

		this.botaoCancelar = new JButton("Cancelar");
		this.botaoCancelar.setBounds(276, 377, 89, 23);
		this.botaoCancelar.addActionListener(this);
		getContentPane().add(botaoCancelar);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(450, 450);
		this.setResizable(false);
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
		controle.cadastroAnfitriao((JButton) e.getSource());
	}
}
