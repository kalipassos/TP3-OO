package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controles.AnfitriaoControle;

public class AnfitriaoVisual extends JFrame implements ActionListener {
	private static final long serialVersionUID = 2172162849981673065L;
	private final JLabel mensagemInicial;
	private final JButton botaoCadastrarAnfitriao;
	private final JButton botaoBuscarAnfitriao;
	private final JButton botaoVisualizarAnfitriao;
	private final JButton botaoEditarAnfitriao;
	private final JButton botaoDeletarAnfitriao;
	private final JButton botaoVoltar;
	private final AnfitriaoControle controle;

	public AnfitriaoVisual() {
		getContentPane().setLayout(null);
		controle = new AnfitriaoControle(this);

		this.mensagemInicial = new JLabel("O que deseja fazer");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.botaoCadastrarAnfitriao = new JButton("Cadastrar Anfitriao");
		this.botaoCadastrarAnfitriao.setBounds(37, 25, 132, 23);
		this.botaoCadastrarAnfitriao.addActionListener(this);
		getContentPane().add(botaoCadastrarAnfitriao);

		this.botaoBuscarAnfitriao = new JButton("Buscar Anfitriao");
		this.botaoBuscarAnfitriao.setBounds(271, 25, 132, 23);
		this.botaoBuscarAnfitriao.addActionListener(this);
		getContentPane().add(botaoBuscarAnfitriao);

		this.botaoVisualizarAnfitriao = new JButton("Visualizar Anfitriao");
		this.botaoVisualizarAnfitriao.setBounds(37, 91, 132, 23);
		this.botaoVisualizarAnfitriao.addActionListener(this);
		getContentPane().add(botaoVisualizarAnfitriao);

		this.botaoEditarAnfitriao = new JButton("Editar Anfitriao");
		this.botaoEditarAnfitriao.setBounds(271, 91, 132, 23);
		this.botaoEditarAnfitriao.addActionListener(this);
		getContentPane().add(botaoEditarAnfitriao);

		this.botaoDeletarAnfitriao = new JButton("Deletar Anfitriao");
		this.botaoDeletarAnfitriao.setBounds(37, 162, 132, 23);
		this.botaoDeletarAnfitriao.addActionListener(this);
		getContentPane().add(botaoDeletarAnfitriao);

		this.botaoVoltar = new JButton("Voltar");
		this.botaoVoltar.setBounds(271, 162, 132, 23);
		this.botaoVoltar.addActionListener(this);
		getContentPane().add(botaoVoltar);

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

	@Override
	public void actionPerformed(ActionEvent e) {
		controle.executaBotao((JButton) e.getSource());
	}
}
