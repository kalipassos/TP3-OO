package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * Interface da visualizacao de uma hospedagem.
 * 
 * @author Carlos / Kallyne
 */
public class VisualizaHospedagemVisual extends JFrame implements ActionListener {

	private final JLabel mensagemInicial;
	private final JLabel rotuloHospedagem;
	private final JLabel rotuloAnfitriao;
	private final JLabel rotuloPet;
	private final JLabel rotuloEntrada;
	private final JLabel rotuloSaida;
	private final JLabel rotuloValorDiaria;
	private final JLabel rotuloValor;
	private final JLabel rotuloValorFinal;
	private final JTextField textoAnfitriao;
	private final JTextField textoPet;
	private final JTextField textoDataEntrada;
	private final JTextField textoDataSaida;
	private final JTextField textoValorFinal;
	private final JButton botaoReiniciar;
	private final JButton botaoEditar;
	private final JButton botaoDeletar;
	private final JButton botaoVoltar;
	private final JComboBox<String> selecionaHospedagem;

	/**
	 * Construtor para a view
	 */
	public VisualizaHospedagemVisual() {
		getContentPane().setLayout(null);
		/**
		 * Mensagem inicial da ferramenta.
		 */
		this.mensagemInicial = new JLabel("Ferramenta de visualizacao");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);
		/**
		 * Fala quais Hospedagens existem
		 */
		this.rotuloHospedagem = new JLabel("Hospedagem ");
		this.rotuloHospedagem.setBounds(10, 29, 89, 14);
		getContentPane().add(rotuloHospedagem);
		/**
		 * Mostra todas
		 */
		this.selecionaHospedagem = new JComboBox<String>();
		this.selecionaHospedagem.setBounds(173, 25, 96, 22);
		getContentPane().add(selecionaHospedagem);
		/**
		 * Fala a que anfitriao pertence
		 */
		this.rotuloAnfitriao = new JLabel("Anfitriao");
		this.rotuloAnfitriao.setBounds(10, 77, 46, 14);
		getContentPane().add(rotuloAnfitriao);
		/**
		 * Fala o nome do anfitriao
		 */
		this.textoAnfitriao = new JTextField();
		this.textoAnfitriao.setBounds(173, 74, 86, 20);
		textoAnfitriao.setColumns(10);
		getContentPane().add(textoAnfitriao);
		/**
		 * Mostra qual pet existe.
		 */
		this.rotuloPet = new JLabel("Pet");
		this.rotuloPet.setBounds(10, 119, 46, 14);
		getContentPane().add(rotuloPet);
		/**
		 * Nome do pet.
		 */
		this.textoPet = new JTextField();
		this.textoPet.setBounds(173, 116, 86, 20);
		this.textoPet.setColumns(10);
		getContentPane().add(textoPet);
		/**
		 * Data de entrada do pet.
		 */
		this.rotuloEntrada = new JLabel("Data de Entrada");
		this.rotuloEntrada.setBounds(10, 165, 121, 14);
		getContentPane().add(rotuloEntrada);

		this.textoDataEntrada = new JTextField();
		this.textoDataEntrada.setBounds(173, 162, 86, 20);
		this.textoDataEntrada.setColumns(10);
		getContentPane().add(textoDataEntrada);
		/**
		 * Data de saida do pet
		 */
		this.rotuloSaida = new JLabel("Data de Saida");
		this.rotuloSaida.setBounds(10, 209, 89, 14);
		getContentPane().add(rotuloSaida);

		this.textoDataSaida = new JTextField();
		this.textoDataSaida.setBounds(173, 206, 86, 20);
		this.textoDataSaida.setColumns(10);
		getContentPane().add(textoDataSaida);
		/**
		 * Valor base da diaria
		 */
		this.rotuloValorDiaria = new JLabel("Valor diaria");
		this.rotuloValorDiaria.setBounds(10, 248, 89, 14);
		getContentPane().add(rotuloValorDiaria);

		this.rotuloValor = new JLabel("250,00");
		this.rotuloValor.setBounds(173, 248, 46, 14);
		getContentPane().add(rotuloValor);
		/**
		 * Valor final, calculado multiplicando o total de dias pelo preco base.
		 */
		this.rotuloValorFinal = new JLabel("Valor Final");
		this.rotuloValorFinal.setBounds(10, 289, 89, 14);
		getContentPane().add(rotuloValorFinal);

		this.textoValorFinal = new JTextField();
		this.textoValorFinal.setBounds(173, 286, 86, 20);
		this.textoValorFinal.setColumns(10);
		getContentPane().add(textoValorFinal);
		/**
		 * Reinicia a tela
		 */
		this.botaoReiniciar = new JButton("Reiniciar");
		this.botaoReiniciar.addActionListener(this);
		this.botaoReiniciar.setBounds(10, 342, 89, 23);
		getContentPane().add(botaoReiniciar);
		/**
		 * Leva para a edicao
		 */
		this.botaoEditar = new JButton("Editar");
		this.botaoEditar.setBounds(173, 342, 89, 23);
		this.botaoEditar.addActionListener(this);
		getContentPane().add(botaoEditar);
		/**
		 * Leva para a delecao
		 */
		this.botaoDeletar = new JButton("Deletar");
		this.botaoDeletar.setBounds(335, 342, 89, 23);
		this.botaoDeletar.addActionListener(this);
		getContentPane().add(botaoDeletar);
		/**
		 * Leva para o menu principal
		 */
		this.botaoVoltar = new JButton("Voltar");
		this.botaoVoltar.setBounds(173, 377, 89, 23);
		this.botaoReiniciar.addActionListener(this);
		getContentPane().add(botaoVoltar);
		/**
		 * Setup da tela geral
		 */
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(450, 450);
		this.setResizable(false);

	}

	public JTextField getTextoAnfitriao() {
		return textoAnfitriao;
	}

	public JTextField getTextoPet() {
		return textoPet;
	}

	public JTextField getTextoDataEntrada() {
		return textoDataEntrada;
	}

	public JTextField getTextoDataSaida() {
		return textoDataSaida;
	}

	public JTextField getTextoValorFinal() {
		return textoValorFinal;
	}

	public JButton getBotaoReiniciar() {
		return botaoReiniciar;
	}

	public JButton getBotaoEditar() {
		return botaoEditar;
	}

	public JButton getBotaoDeletar() {
		return botaoDeletar;
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

	public JComboBox<String> getSelecionaHospedagem() {
		return selecionaHospedagem;
	}

	/**
	 * Recebe o aperto dos bostoes
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
