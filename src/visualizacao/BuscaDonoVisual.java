package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class BuscaDonoVisual extends JFrame implements ActionListener {
	/**
	 * Variaveis para a criacao da Interface.
	 */
	private final JLabel mensagemInicial;
	private final JLabel rotuloBusca;
	private final JLabel rotuloEncontrado;
	private final JLabel rotuloNaoEncontrado;
	private final JLabel rotuloProximaAcao;
	private final JTextField donoBuscado;
	private final JButton botaoBuscar;
	private final JButton botaoSim;
	private final JButton botaoNao;
	private final JButton botaoVisualizarAnimal;
	private final JButton botaoVisualizarDono;
	private final JButton botaoEditar;
	private final JButton botaoDeletar;
	private final JButton botaoVoltar;
	private final JComboBox<String> selecionaDono;

	public BuscaDonoVisual() {
		getContentPane().setLayout(null);
		/**
		 * Titulo da ferramenta.
		 */
		this.mensagemInicial = new JLabel("Ferramenta de busca");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);
		/**
		 * Afirma o nome a ser buscado.
		 */
		this.rotuloBusca = new JLabel("Dono a ser buscado");
		this.rotuloBusca.setBounds(10, 40, 110, 14);
		getContentPane().add(rotuloBusca);
		/**
		 * Campo de texto para digitar o nome a ser buscado.
		 */
		this.donoBuscado = new JTextField();
		this.donoBuscado.setBounds(212, 37, 86, 20);
		this.donoBuscado.setColumns(10);
		getContentPane().add(donoBuscado);
		/**
		 * Botao para buscar o nome digitado
		 */
		this.botaoBuscar = new JButton("Buscar");
		this.botaoBuscar.setBounds(335, 36, 89, 23);
		getContentPane().add(botaoBuscar);
		/**
		 * Titulo que diz que e a ferramenta encontrou algum dono
		 */
		this.rotuloEncontrado = new JLabel("Encotrado os seguintes donos");
		this.rotuloEncontrado.setBounds(0, 177, 156, 14);
		getContentPane().add(rotuloEncontrado);
		/**
		 * Avisa um dono nao encontrado
		 */
		this.rotuloNaoEncontrado = new JLabel("Dono nao encontrado, deseja cadastrar?");
		this.rotuloNaoEncontrado.setBounds(0, 83, 434, 14);
		getContentPane().add(rotuloNaoEncontrado);
		/**
		 * Botao que leva ao cadastro
		 */
		this.botaoSim = new JButton("Sim");
		this.botaoSim.addActionListener(this);
		this.botaoSim.setBounds(50, 117, 89, 23);
		getContentPane().add(botaoSim);
		/**
		 * Volta para a interface principal de Dono.
		 */
		this.botaoNao = new JButton("Nao");
		this.botaoNao.addActionListener(this);
		this.botaoNao.setBounds(212, 117, 89, 23);
		getContentPane().add(botaoNao);
		/**
		 * Mostra os donos com esse nome.
		 */
		this.selecionaDono = new JComboBox<String>();
		this.selecionaDono.setBounds(212, 173, 86, 22);
		getContentPane().add(selecionaDono);
		/**
		 * Pergunta a proxima acao.
		 */
		this.rotuloProximaAcao = new JLabel("O que deseja executar");
		this.rotuloProximaAcao.setBounds(0, 238, 139, 14);
		getContentPane().add(rotuloProximaAcao);
		/**
		 * Leva para a visualizacao de um Animal.
		 */
		this.botaoVisualizarAnimal = new JButton("Visualizar Animais ");
		this.botaoVisualizarAnimal.addActionListener(this);
		this.botaoVisualizarAnimal.setBounds(254, 263, 139, 23);
		getContentPane().add(botaoVisualizarAnimal);
		/**
		 * Leva para a visualizacao dos dados de um dono
		 */
		this.botaoVisualizarDono = new JButton("Visualizar Dados");
		this.botaoVisualizarDono.setBounds(50, 263, 139, 23);
		this.botaoVisualizarDono.addActionListener(this);
		getContentPane().add(botaoVisualizarDono);
		/**
		 * Leva para a edicao de um dono
		 */
		this.botaoEditar = new JButton("Editar Dono");
		this.botaoEditar.setBounds(50, 310, 139, 23);
		this.botaoEditar.addActionListener(this);
		getContentPane().add(botaoEditar);
		/**
		 * Leva para a delecao.
		 */
		this.botaoDeletar = new JButton("Deletar ");
		this.botaoDeletar.setBounds(254, 310, 139, 23);
		this.botaoDeletar.addActionListener(this);
		getContentPane().add(botaoDeletar);
		/**
		 * Volta para o menu de Dono.
		 */
		this.botaoVoltar = new JButton("Voltar");
		this.botaoVoltar.setBounds(50, 357, 139, 23);
		this.botaoVoltar.addActionListener(this);
		getContentPane().add(botaoVoltar);
		/**
		 * Cria a formatacao da tela.
		 */
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(450, 450);
		this.setResizable(false);

	}

	public JTextField getDonoBuscado() {
		return donoBuscado;
	}

	public JButton getBotaoBuscar() {
		return botaoBuscar;
	}

	public JButton getBotaoSim() {
		return botaoSim;
	}

	public JButton getBotaoNao() {
		return botaoNao;
	}

	public JButton getBotaoVisualizarAnimal() {
		return botaoVisualizarAnimal;
	}

	public JButton getBotaoVisualizarDono() {
		return botaoVisualizarDono;
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

	public JComboBox<String> getSelecionaDono() {
		return selecionaDono;
	}

	/**
	 * Recebe o chamado dos cliques no botao.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
