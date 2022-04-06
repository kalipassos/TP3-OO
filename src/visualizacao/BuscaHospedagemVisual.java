package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class BuscaHospedagemVisual extends JFrame implements ActionListener {
	private static final long serialVersionUID = -2221844709514605871L;
	private final JLabel mensagemInicial;
	private final JLabel rotuloHospedagemBuscada;
	private final JLabel rotuloHospedagemEncontrada;
	private final JLabel rotuloHospedagemNaoEncontrada;
	private final JLabel rotuloProximaAcao;
	private final JButton botaoBuscaHospedagem;
	private final JButton botaoVisualizaHospedagem;
	private final JButton botaoEditaHospedagem;
	private final JButton botaoDeletaHospedagem;
	private final JButton botaoVoltar;
	private final JButton botaoSim;
	private final JButton botaoNao;
	private final JTextField textoBuscaHospedagem;
	private final JTextField textoHospedagemEncontrada;

	public BuscaHospedagemVisual() {
		getContentPane().setLayout(null);

		this.mensagemInicial = new JLabel("Ferramenta de Busca");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.rotuloHospedagemBuscada = new JLabel("Hospedagem a se buscar");
		this.rotuloHospedagemBuscada.setBounds(10, 35, 135, 14);
		getContentPane().add(rotuloHospedagemBuscada);

		this.textoBuscaHospedagem = new JTextField();
		this.textoBuscaHospedagem.setBounds(193, 32, 86, 20);
		this.textoBuscaHospedagem.setColumns(10);
		getContentPane().add(textoBuscaHospedagem);

		this.botaoBuscaHospedagem = new JButton("Buscar");
		this.botaoBuscaHospedagem.setBounds(313, 31, 89, 23);
		this.botaoBuscaHospedagem.addActionListener(this);
		getContentPane().add(botaoBuscaHospedagem);

		this.rotuloHospedagemEncontrada = new JLabel("Hospedagem Encontrada");
		this.rotuloHospedagemEncontrada.setBounds(10, 82, 135, 14);
		getContentPane().add(rotuloHospedagemEncontrada);

		this.textoHospedagemEncontrada = new JTextField();
		this.textoHospedagemEncontrada.setBounds(193, 79, 86, 20);
		this.textoHospedagemEncontrada.setColumns(10);
		getContentPane().add(textoHospedagemEncontrada);

		this.rotuloProximaAcao = new JLabel("O que deseja executar");
		this.rotuloProximaAcao.setBounds(0, 198, 135, 14);
		getContentPane().add(rotuloProximaAcao);

		this.botaoVisualizaHospedagem = new JButton("Visualizar");
		this.botaoVisualizaHospedagem.setBounds(56, 239, 89, 23);
		this.botaoVisualizaHospedagem.addActionListener(this);
		getContentPane().add(botaoVisualizaHospedagem);

		this.botaoEditaHospedagem = new JButton("Editar");
		this.botaoEditaHospedagem.setBounds(272, 239, 89, 23);
		this.botaoEditaHospedagem.addActionListener(this);
		getContentPane().add(botaoEditaHospedagem);

		this.botaoDeletaHospedagem = new JButton("Deletar");
		this.botaoDeletaHospedagem.setBounds(56, 310, 89, 23);
		this.botaoDeletaHospedagem.addActionListener(this);
		getContentPane().add(botaoDeletaHospedagem);

		this.botaoVoltar = new JButton("Voltar");
		this.botaoVoltar.setBounds(272, 310, 89, 23);
		this.botaoVoltar.addActionListener(this);
		getContentPane().add(botaoVoltar);

		rotuloHospedagemNaoEncontrada = new JLabel("Hospedagem nao encontrada, deseja cadastrar?");
		rotuloHospedagemNaoEncontrada.setBounds(10, 137, 392, 14);
		getContentPane().add(rotuloHospedagemNaoEncontrada);

		this.botaoSim = new JButton("Sim");
		this.botaoSim.setBounds(56, 164, 89, 23);
		this.botaoSim.addActionListener(this);
		getContentPane().add(botaoSim);

		this.botaoNao = new JButton("Nao");
		this.botaoNao.setBounds(272, 162, 89, 23);
		this.botaoNao.addActionListener(this);
		getContentPane().add(botaoNao);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(450, 450);
		this.setResizable(false);

	}

	public JButton getBotaoBuscaHospedagem() {
		return botaoBuscaHospedagem;
	}

	public JButton getBotaoVisualizaHospedagem() {
		return botaoVisualizaHospedagem;
	}

	public JButton getBotaoEditaHospedagem() {
		return botaoEditaHospedagem;
	}

	public JButton getBotaoDeletaHospedagem() {
		return botaoDeletaHospedagem;
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

	public JButton getBotaoSim() {
		return botaoSim;
	}

	public JButton getBotaoNao() {
		return botaoNao;
	}

	public JTextField getTextoBuscaHospedagem() {
		return textoBuscaHospedagem;
	}

	public JTextField getTextoHospedagemEncontrada() {
		return textoHospedagemEncontrada;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
