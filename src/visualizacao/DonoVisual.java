package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class DonoVisual extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private final JLabel mensagemInicial;
	private final JButton botaoCadastrarDono;
	private final JButton botaoCadastrarAnimal;
	private final JButton botaoBuscarDono;
	private final JButton botaoVisualizarDono;
	private final JButton botaoEditarDono;
	private final JButton botaoDeletarDono;
	private final JButton botaoVoltar;

	public DonoVisual() {
		getContentPane().setLayout(null);

		this.mensagemInicial = new JLabel("O que deseja fazer");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 484, 14);
		getContentPane().add(mensagemInicial);

		this.botaoCadastrarDono = new JButton("Cadastrar Dono");
		this.botaoCadastrarDono.setBounds(48, 43, 137, 23);
		this.botaoCadastrarDono.addActionListener(this);
		getContentPane().add(botaoCadastrarDono);

		this.botaoCadastrarAnimal = new JButton("Cadastrar Pet");
		this.botaoCadastrarAnimal.setBounds(293, 43, 153, 23);
		this.botaoCadastrarAnimal.addActionListener(this);
		getContentPane().add(botaoCadastrarAnimal);

		this.botaoBuscarDono = new JButton("Buscar Dono");
		this.botaoBuscarDono.setBounds(48, 115, 137, 23);
		this.botaoBuscarDono.addActionListener(this);
		getContentPane().add(botaoBuscarDono);

		this.botaoVisualizarDono = new JButton("Visualizar Dono");
		this.botaoVisualizarDono.setBounds(293, 115, 153, 23);
		this.botaoVisualizarDono.addActionListener(this);
		getContentPane().add(botaoVisualizarDono);

		this.botaoEditarDono = new JButton("Editar Dono");
		this.botaoEditarDono.setBounds(48, 196, 137, 23);
		this.botaoEditarDono.addActionListener(this);
		getContentPane().add(botaoEditarDono);

		this.botaoDeletarDono = new JButton("Deletar Dono");
		this.botaoDeletarDono.setBounds(293, 196, 153, 23);
		this.botaoDeletarDono.addActionListener(this);
		getContentPane().add(botaoDeletarDono);

		this.botaoVoltar = new JButton("Voltar");
		this.botaoVoltar.setBounds(174, 290, 137, 23);
		this.botaoVoltar.addActionListener(this);
		getContentPane().add(botaoVoltar);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 400);
		this.setResizable(false);

	}

	public JButton getBotaoCadastrarDono() {
		return botaoCadastrarDono;
	}

	public JButton getBotaoCadastrarAnimal() {
		return botaoCadastrarAnimal;
	}

	public JButton getBotaoBuscarDono() {
		return botaoBuscarDono;
	}

	public JButton getBotaoVisualizarDono() {
		return botaoVisualizarDono;
	}

	public JButton getBotaoEditarDono() {
		return botaoEditarDono;
	}

	public JButton getBotaoDeletarDono() {
		return botaoDeletarDono;
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
