package visualizacao;

/**
 * Imports necessarios para que a Interface funcione
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controles.AnfitriaoControle;

public class AnfitriaoVisual extends JFrame implements ActionListener {
	/**
	 * Variaveis feitas para a construcao da Interface principal de Anfitriao, sendo
	 * elas uma JLabel com a mensagem inicial e 5 JButtons para as opcoes.
	 */

	private final JLabel mensagemInicial;
	private final JButton botaoCadastrarAnfitriao;
	private final JButton botaoBuscarAnfitriao;
	private final JButton botaoVisualizarAnfitriao;
	private final JButton botaoEditarAnfitriao;
	private final JButton botaoDeletarAnfitriao;
	private final JButton botaoVoltar;
	/**
	 * Liga a Interface ao backend, ao criar um controlador da mesma e receber seus
	 * sinais.
	 */
	private final AnfitriaoControle controle;

	public AnfitriaoVisual() {
		getContentPane().setLayout(null);
		/**
		 * Iniciacao do controlador.
		 */
		controle = new AnfitriaoControle(this);

		/**
		 * Criacao do estilo da JLabel que sera a principal do programa
		 */
		this.mensagemInicial = new JLabel("O que deseja fazer");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);
		/**
		 * Criacao do botao que leva ao cadastro de um Anfitriao.
		 */
		this.botaoCadastrarAnfitriao = new JButton("Cadastrar Anfitriao");
		this.botaoCadastrarAnfitriao.setBounds(37, 25, 132, 23);
		this.botaoCadastrarAnfitriao.addActionListener(this);
		getContentPane().add(botaoCadastrarAnfitriao);
		/**
		 * Criacao do botao que leva a interface de busca para Anfitriao.
		 */
		this.botaoBuscarAnfitriao = new JButton("Buscar Anfitriao");
		this.botaoBuscarAnfitriao.setBounds(271, 25, 132, 23);
		this.botaoBuscarAnfitriao.addActionListener(this);
		getContentPane().add(botaoBuscarAnfitriao);
		/**
		 * Criacao do botao que leva a interface de visualizar um Anfitriao.
		 */
		this.botaoVisualizarAnfitriao = new JButton("Visualizar Anfitriao");
		this.botaoVisualizarAnfitriao.setBounds(37, 91, 132, 23);
		this.botaoVisualizarAnfitriao.addActionListener(this);
		getContentPane().add(botaoVisualizarAnfitriao);
		/**
		 * Criacao do botao que leva a interface de editar um Anfitriao.
		 */
		this.botaoEditarAnfitriao = new JButton("Editar Anfitriao");
		this.botaoEditarAnfitriao.setBounds(271, 91, 132, 23);
		this.botaoEditarAnfitriao.addActionListener(this);
		getContentPane().add(botaoEditarAnfitriao);
		/**
		 * Criacao de um botao que leva a interface de delecao de um Anfitriao.
		 */
		this.botaoDeletarAnfitriao = new JButton("Deletar Anfitriao");
		this.botaoDeletarAnfitriao.setBounds(37, 162, 132, 23);
		this.botaoDeletarAnfitriao.addActionListener(this);
		getContentPane().add(botaoDeletarAnfitriao);
		/**
		 * Criacao de um botao que retorna para a interface Menu principal.
		 */
		this.botaoVoltar = new JButton("Voltar");
		this.botaoVoltar.setBounds(271, 162, 132, 23);
		this.botaoVoltar.addActionListener(this);
		getContentPane().add(botaoVoltar);
		/**
		 * Coloca a tela como nao redimensionavel, que termine a tela ao fecha-la e seu
		 * tamanho.
		 */
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 400);
		this.setResizable(false);
	}

	public JButton getBotaoCadastrarAnfitriao() {
		return botaoCadastrarAnfitriao;
	}

	public JButton getBotaoBuscarAnfitriao() {
		return botaoBuscarAnfitriao;
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

	/**
	 * Metodo para pegar a acao de clicar em um botao.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		controle.executaBotao((JButton) e.getSource());
	}
}
