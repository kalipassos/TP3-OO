package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controles.BuscaAnfitriaoControle;

public class BuscaAnfitriaoVisual extends JFrame implements ActionListener {
	/**
	 * Aparecem sempre
	 */
	private final JLabel mensagemInicial; // Aparece sempre
	private final JLabel rotuloBuscaAnfitriao; // Aparece sempre
	private final JButton botaoBuscarAnfitriao;
	private final JButton botaoVoltar; // Aparece sempre
	private final JTextField TextoNomeAnfitriao; // Aparece sempre;
	/**
	 * Aparece quando nao encontrado
	 */
	private final JLabel rotuloNaoEncontrado;
	private final JLabel rotuloEncontrado;
	private final JLabel rotuloProximaAcao;
	private final JButton botaoSim; // Aparece quando nao encontrado
	private final JButton botaoNao; // Aparece quando nao encontrado
	/**
	 * Aparece quando encontrado
	 */
	private final JButton botaoVisualizarAnfitriao; // Aparece quando encontrado
	private final JButton botaoEditarAnfitriao; // Aparece quando encontrado
	private final JButton botaoDeletarAnfitriao; // Aparece quando encontrado
	private final JLabel textoEncontrado; // Aparece quando encontrado
	/**
	 * Criacao da variavel de controle dessa interface
	 */
	private final BuscaAnfitriaoControle controle;

	public BuscaAnfitriaoVisual() {
		getContentPane().setLayout(null);
		/**
		 * Iniciacao da variavel de controle dessa interface.
		 */
		controle = new BuscaAnfitriaoControle(this);
		/**
		 * JLabel de titulo da interface
		 */
		this.mensagemInicial = new JLabel("Ferramenta de Busca");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);
		/**
		 * JLabel que diz para que serve o campo de texto: pesquiar o anfitriao
		 */
		this.rotuloBuscaAnfitriao = new JLabel("Anfitriao a se buscar");
		this.rotuloBuscaAnfitriao.setBounds(10, 36, 154, 14);
		getContentPane().add(rotuloBuscaAnfitriao);
		/**
		 * Campo para digitar o nome a ser pesquisado.
		 */
		this.TextoNomeAnfitriao = new JTextField();
		this.TextoNomeAnfitriao.setBounds(195, 33, 86, 20);
		this.TextoNomeAnfitriao.setColumns(10);
		getContentPane().add(TextoNomeAnfitriao);
		/**
		 * Botao que faz a busca
		 */
		this.botaoBuscarAnfitriao = new JButton("Buscar");
		this.botaoBuscarAnfitriao.setBounds(320, 32, 89, 23);
		this.botaoBuscarAnfitriao.addActionListener(this);
		getContentPane().add(botaoBuscarAnfitriao);
		/**
		 * Avisa se nao for encontrado.
		 */
		this.rotuloNaoEncontrado = new JLabel("Nao encontrado, deseja cadastrar?");
		this.rotuloNaoEncontrado.setBounds(10, 84, 197, 14);
		this.rotuloNaoEncontrado.setVisible(false);
		getContentPane().add(rotuloNaoEncontrado);
		/**
		 * Leva para a tela de cadastro caso queira cadastrar um nao encontrado.
		 */
		this.botaoSim = new JButton("Sim");
		this.botaoSim.setBounds(45, 123, 89, 23);
		this.botaoSim.addActionListener(this);
		this.botaoSim.setVisible(false);
		getContentPane().add(botaoSim);
		/**
		 * Volta para o menu principal de Anfitriao.
		 */
		this.botaoNao = new JButton("Nao");
		this.botaoNao.setBounds(227, 123, 89, 23);
		this.botaoNao.addActionListener(this);
		this.botaoNao.setVisible(false);
		getContentPane().add(botaoNao);
		/**
		 * Avisa se foi encontrado.
		 */
		this.rotuloEncontrado = new JLabel("Encontrado ");
		this.rotuloEncontrado.setBounds(10, 178, 101, 14);
		this.rotuloEncontrado.setVisible(false);
		getContentPane().add(rotuloEncontrado);
		/**
		 * Texto de confirmacao da existencia do nome e retorna o nome.
		 */
		this.textoEncontrado = new JLabel();
		this.textoEncontrado.setBounds(227, 175, 86, 20);
		this.textoEncontrado.setVisible(false);
		getContentPane().add(textoEncontrado);
		/**
		 * JLabel que pergunta a sua proxima acao.
		 */
		this.rotuloProximaAcao = new JLabel("O que deseja realizar?");
		this.rotuloProximaAcao.setBounds(10, 227, 197, 14);
		this.rotuloProximaAcao.setVisible(false);
		getContentPane().add(rotuloProximaAcao);
		/**
		 * Leva para a tela de visualizacao de um anfitriao.
		 */
		this.botaoVisualizarAnfitriao = new JButton("Visualizar");
		this.botaoVisualizarAnfitriao.setBounds(45, 270, 89, 23);
		this.botaoVisualizarAnfitriao.addActionListener(this);
		this.botaoVisualizarAnfitriao.setVisible(false);
		getContentPane().add(botaoVisualizarAnfitriao);
		/**
		 * Leva para a tela de edicao de um Anfitriao.
		 */
		this.botaoEditarAnfitriao = new JButton("Editar");
		this.botaoEditarAnfitriao.setBounds(227, 270, 89, 23);
		this.botaoEditarAnfitriao.addActionListener(this);
		this.botaoEditarAnfitriao.setVisible(false);
		getContentPane().add(botaoEditarAnfitriao);
		/**
		 * Leva para a tela de delecao de um Anfitriao.
		 */
		this.botaoDeletarAnfitriao = new JButton("Deletar");
		this.botaoDeletarAnfitriao.setBounds(45, 330, 89, 23);
		this.botaoDeletarAnfitriao.addActionListener(this);
		this.botaoDeletarAnfitriao.setVisible(false);
		getContentPane().add(botaoDeletarAnfitriao);
		/**
		 * Leva para a tela de menu principal.
		 */
		this.botaoVoltar = new JButton("Voltar");
		this.botaoVoltar.setBounds(227, 330, 89, 23);
		this.botaoVoltar.addActionListener(this);
		this.botaoVoltar.setVisible(false);
		getContentPane().add(botaoVoltar);
		/**
		 * Coloca a tela como nao redimensionavel, que termine a tela ao fecha-la e seu
		 * tamanho.
		 */
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(450, 450);
		this.setResizable(false);

	}

	public JLabel getRotuloNaoEncontrado() {
		return rotuloNaoEncontrado;
	}

	public JLabel getRotuloEncontrado() {
		return rotuloEncontrado;
	}

	public JLabel getRotuloProximaAcao() {
		return rotuloProximaAcao;
	}

	public JButton getBotaoBuscarAnfitriao() {
		return botaoBuscarAnfitriao;
	}

	public JButton getBotaoSim() {
		return botaoSim;
	}

	public JButton getBotaoNao() {
		return botaoNao;
	}

	public JButton getBotaoVisualizarAnfitriao() {
		return botaoVisualizarAnfitriao;
	}

	public JButton getBotaoEditarAnfitriao() {
		return botaoEditarAnfitriao;
	}

	public JButton getBotaoDeletarAnfitriao() {
		return botaoDeletarAnfitriao;
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

	public JTextField getTextoNomeAnfitriao() {
		return TextoNomeAnfitriao;
	}

	public JLabel getTextoEncontrado() {
		return textoEncontrado;
	}

	/**
	 * Metodo para pegar a acao de clicar em um botao.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		controle.executarBotao(e.getSource());
	}
}
