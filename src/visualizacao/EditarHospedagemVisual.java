package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class EditarHospedagemVisual extends JFrame implements ActionListener {
	private static final long serialVersionUID = 7811394565241448588L;
	private final JLabel mensagemInicial;
	private final JLabel rotuloHospedagem;
	private final JLabel mensagemAviso;
	private final JLabel rotuloAlterarHospedagem;
	private final JLabel rotuloRemoverHospedagem;
	private final JLabel rotuloAlterarEntrada;
	private final JLabel rotuloAlterarSaida;
	private final JTextField textoEntrada;
	private final JTextField textoSaida;
	private final JButton botaoAlterar;
	private final JButton botaoReverter;
	private final JComboBox<String> alteraHospedagem;
	private final JComboBox<String> alteraHospedagemAnfitriao;

	public EditarHospedagemVisual() {
		getContentPane().setLayout(null);

		this.mensagemInicial = new JLabel("Ferramenta de edicao");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.rotuloHospedagem = new JLabel("Hospedagem a editar");
		this.rotuloHospedagem.setBounds(10, 25, 135, 14);
		getContentPane().add(rotuloHospedagem);

		this.alteraHospedagem = new JComboBox<String>();
		this.alteraHospedagem.setBounds(173, 25, 105, 22);
		getContentPane().add(alteraHospedagem);

		this.mensagemAviso = new JLabel("Alteracoes possiveis");
		this.mensagemAviso.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemAviso.setBounds(0, 76, 434, 14);
		getContentPane().add(mensagemAviso);

		this.rotuloAlterarHospedagem = new JLabel("Alterar Hospedagem(Anfitriao)");
		this.rotuloAlterarHospedagem.setBounds(10, 113, 155, 14);
		getContentPane().add(rotuloAlterarHospedagem);

		this.alteraHospedagemAnfitriao = new JComboBox<String>();
		this.alteraHospedagemAnfitriao.setBounds(271, 109, 105, 22);
		getContentPane().add(alteraHospedagemAnfitriao);

		this.rotuloRemoverHospedagem = new JLabel("Remover Hospedagem");
		this.rotuloRemoverHospedagem.setBounds(10, 160, 155, 14);
		getContentPane().add(rotuloRemoverHospedagem);

		this.rotuloAlterarEntrada = new JLabel("Alterar Entrada");
		this.rotuloAlterarEntrada.setBounds(10, 202, 155, 14);
		getContentPane().add(rotuloAlterarEntrada);

		this.textoEntrada = new JTextField();
		this.textoEntrada.setBounds(271, 199, 105, 20);
		this.textoEntrada.setColumns(10);
		getContentPane().add(textoEntrada);

		this.rotuloAlterarSaida = new JLabel("Alterar Saida");
		this.rotuloAlterarSaida.setBounds(10, 249, 155, 14);
		getContentPane().add(rotuloAlterarSaida);

		this.textoSaida = new JTextField();
		this.textoSaida.setBounds(271, 246, 105, 20);
		this.textoSaida.setColumns(10);
		getContentPane().add(textoSaida);

		this.botaoAlterar = new JButton("Alterar");
		this.botaoAlterar.setBounds(56, 358, 89, 23);
		this.botaoAlterar.addActionListener(this);
		getContentPane().add(botaoAlterar);

		this.botaoReverter = new JButton("Reverter");
		this.botaoReverter.setBounds(271, 358, 89, 23);
		this.botaoReverter.addActionListener(this);
		getContentPane().add(botaoReverter);

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

	public JButton getBotaoAlterar() {
		return botaoAlterar;
	}

	public JButton getBotaoReverter() {
		return botaoReverter;
	}

	public JComboBox<String> getAlteraHospedagem() {
		return alteraHospedagem;
	}

	public JComboBox<String> getAlteraHospedagemAnfitriao() {
		return alteraHospedagemAnfitriao;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
