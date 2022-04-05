package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CadastrarHospedagemVisual extends JFrame implements ActionListener {
	private static final long serialVersionUID = -523021390532064386L;
	private final JLabel mensagemInicial;
	private final JLabel rotuloAnfitriao;
	private final JLabel rotuloAnimal;
	private final JLabel rotuloEntrada;
	private final JLabel rotuloSaida;
	private final JTextField textoEntrada;
	private final JTextField textoSaida;
	private final JButton botaoCadastrar;
	private final JButton botaoCancelar;
	private final JComboBox<String> selecionaAnfitriao;
	private final JComboBox<String> selecionaAnimal;
	private final DefaultComboBoxModel<String> lista = new DefaultComboBoxModel<>();

	public CadastrarHospedagemVisual() {
		getContentPane().setLayout(null);

		this.mensagemInicial = new JLabel("Preencha os Campos");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.rotuloAnfitriao = new JLabel("Anfitriao");
		this.rotuloAnfitriao.setBounds(66, 29, 86, 14);
		getContentPane().add(rotuloAnfitriao);

		this.selecionaAnfitriao = new JComboBox<String>();
		this.selecionaAnfitriao.setBounds(279, 25, 94, 22);
		this.selecionaAnfitriao.setModel(lista);
		getContentPane().add(selecionaAnfitriao);

		this.rotuloAnimal = new JLabel("Animal");
		this.rotuloAnimal.setBounds(66, 76, 86, 14);
		getContentPane().add(rotuloAnimal);

		this.selecionaAnimal = new JComboBox<String>();
		this.selecionaAnimal.setBounds(279, 76, 94, 22);
		this.selecionaAnimal.setModel(lista);
		getContentPane().add(selecionaAnimal);

		this.rotuloEntrada = new JLabel("Data de Entrada");
		this.rotuloEntrada.setBounds(66, 139, 86, 14);
		getContentPane().add(rotuloEntrada);

		this.textoEntrada = new JTextField();
		this.textoEntrada.setBounds(279, 136, 94, 20);
		this.textoEntrada.setColumns(10);
		getContentPane().add(textoEntrada);

		this.rotuloSaida = new JLabel("Data de Saidada");
		this.rotuloSaida.setBounds(66, 192, 86, 14);
		getContentPane().add(rotuloSaida);

		this.textoSaida = new JTextField();
		this.textoSaida.setBounds(279, 189, 94, 20);
		this.textoSaida.setColumns(10);
		getContentPane().add(textoSaida);

		this.botaoCadastrar = new JButton("Cadastrar");
		this.botaoCadastrar.setBounds(66, 357, 89, 23);
		this.botaoCadastrar.addActionListener(this);
		getContentPane().add(botaoCadastrar);

		this.botaoCancelar = new JButton("Cancelar");
		this.botaoCancelar.setBounds(284, 357, 89, 23);
		this.botaoCancelar.addActionListener(this);
		getContentPane().add(botaoCancelar);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(450, 450);
		this.setResizable(false);

	}

	public JTextField getTextoEntrada() {
		return textoEntrada;
	}

	public JTextField getTextoSaida() {
		return textoSaida;
	}

	public JButton getBotaoCadastrar() {
		return botaoCadastrar;
	}

	public JButton getBotaoCancelar() {
		return botaoCancelar;
	}

	public JComboBox<String> getSelecionaAnfitriao() {
		return selecionaAnfitriao;
	}

	public JComboBox<String> getSelecionaAnimal() {
		return selecionaAnimal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
