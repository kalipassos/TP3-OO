package visualizacao;

/**
 * Imports para que a interface funcione.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controles.AnimalControle;

public class AnimalVisual extends JFrame implements ActionListener {
	/**
	 * Variaveis para a criacao da Interface de controle das opcoes de animal.
	 */

	private final JLabel mensagemInicial;
	private final JButton botaoCadastrarAnimal;
	private final JButton botaoBuscarPet;
	private final JButton botaoVisualizarPet;
	private final JButton botaoEditarPet;
	private final JButton botaoDeletarPet;
	private final JButton botaoVoltar;
	/**
	 * Criacao do controlador para a Interface.
	 */
	private final AnimalControle controle;

	/**
	 * Construtor da Interface.
	 */
	public AnimalVisual() {
		getContentPane().setLayout(null);
		/**
		 * Criacao da variavel para controle da Interface.
		 */
		controle = new AnimalControle(this);
		/**
		 * Criacao da JLabel principal
		 */
		this.mensagemInicial = new JLabel("O que deseja fazer");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);
		/**
		 * Criacao da JButton que leva para o cadastro do animal.
		 */
		this.botaoCadastrarAnimal = new JButton("Cadastrar Pet");
		this.botaoCadastrarAnimal.setBounds(42, 25, 115, 23);
		this.botaoCadastrarAnimal.addActionListener(this);
		getContentPane().add(botaoCadastrarAnimal);
		/**
		 * Criacao da JButton que leva a tela de buscar do Pet.
		 */
		this.botaoBuscarPet = new JButton("Buscar Pet");
		this.botaoBuscarPet.setBounds(270, 25, 115, 23);
		this.botaoBuscarPet.addActionListener(this);
		getContentPane().add(botaoBuscarPet);
		/**
		 * Criacao do JButton que leva a tela de visualizaacao do Pet.
		 */
		this.botaoVisualizarPet = new JButton("Visualizar Pet");
		this.botaoVisualizarPet.setBounds(42, 95, 115, 23);
		this.botaoVisualizarPet.addActionListener(this);
		getContentPane().add(botaoVisualizarPet);
		/**
		 * Criacao do JButton que leva a tela de edicao de um Pet.
		 */
		this.botaoEditarPet = new JButton("Editar Pet");
		this.botaoEditarPet.setBounds(270, 95, 115, 23);
		this.botaoEditarPet.addActionListener(this);
		getContentPane().add(botaoEditarPet);
		/**
		 * Criacao do JButton de delecao de um Pet.
		 */
		this.botaoDeletarPet = new JButton("Deletar Pet");
		this.botaoDeletarPet.setBounds(42, 164, 115, 23);
		this.botaoDeletarPet.addActionListener(this);
		getContentPane().add(botaoDeletarPet);
		/**
		 * Criacao do JButton que leva a tela de menu.
		 */
		this.botaoVoltar = new JButton("Voltar");
		this.botaoVoltar.setBounds(270, 164, 115, 23);
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

	public JButton getBotaoCadastrarAnimal() {
		return botaoCadastrarAnimal;
	}

	public JButton getBotaoBuscarPet() {
		return botaoBuscarPet;
	}

	public JButton getBotaoVisualizarPet() {
		return botaoVisualizarPet;
	}

	public JButton getBotaoEditarPet() {
		return botaoEditarPet;
	}

	public JButton getBotaoDeletarPet() {
		return botaoDeletarPet;
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
