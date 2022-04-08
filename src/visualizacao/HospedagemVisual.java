package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controles.HospedagemControle;

public class HospedagemVisual extends JFrame implements ActionListener {

	private final JLabel mensagemInicial;
	private final JButton botaoCadastroHospedagem;
	private final JButton botaoBuscarHospedagem;
	private final JButton botaoVisualizarHospedagem;
	private final JButton botaoEditarHospedagem;
	private final JButton botaoDeletarHospedagem;
	private final JButton botaoVoltar;
	private final HospedagemControle controle;

	public HospedagemVisual() {
		getContentPane().setLayout(null);
		controle = new HospedagemControle(this);

		this.mensagemInicial = new JLabel("O que deseja fazer");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.botaoCadastroHospedagem = new JButton("Cadastrar Hospedagem");
		this.botaoCadastroHospedagem.setBounds(23, 25, 158, 23);
		this.botaoCadastroHospedagem.addActionListener(this);
		getContentPane().add(botaoCadastroHospedagem);

		this.botaoBuscarHospedagem = new JButton("Buscar Hospedagem");
		this.botaoBuscarHospedagem.setBounds(243, 25, 158, 23);
		this.botaoBuscarHospedagem.addActionListener(this);
		getContentPane().add(botaoBuscarHospedagem);

		this.botaoVisualizarHospedagem = new JButton("Visualizar Hospedagem");
		this.botaoVisualizarHospedagem.setBounds(23, 75, 158, 23);
		this.botaoVisualizarHospedagem.addActionListener(this);
		getContentPane().add(botaoVisualizarHospedagem);

		this.botaoEditarHospedagem = new JButton("Editar Hospedagem");
		this.botaoEditarHospedagem.setBounds(243, 75, 158, 23);
		this.botaoEditarHospedagem.addActionListener(this);
		getContentPane().add(botaoEditarHospedagem);

		this.botaoDeletarHospedagem = new JButton("Deletar Hospedagem");
		this.botaoDeletarHospedagem.setBounds(23, 129, 158, 23);
		this.botaoDeletarHospedagem.addActionListener(this);
		getContentPane().add(botaoDeletarHospedagem);

		this.botaoVoltar = new JButton("Voltar");
		this.botaoVoltar.setBounds(243, 129, 158, 23);
		this.botaoVoltar.addActionListener(this);
		getContentPane().add(botaoVoltar);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 400);
		this.setResizable(false);

	}

	public JButton getBotaoCadastroHospedagem() {
		return botaoCadastroHospedagem;
	}

	public JButton getBotaoBuscarHospedagem() {
		return botaoBuscarHospedagem;
	}

	public JButton getBotaoVisualizarHospedagem() {
		return botaoVisualizarHospedagem;
	}

	public JButton getBotaoEditarHospedagem() {
		return botaoEditarHospedagem;
	}

	public JButton getBotaoDeletarHospedagem() {
		return botaoDeletarHospedagem;
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controle.executaBotao((JButton) e.getSource());
	}
}
