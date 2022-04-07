package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controles.DeletaAnimalControle;

public class DeletaAnimalVisual extends JFrame implements ActionListener {
	private static final long serialVersionUID = 3327073071322275876L;
	private final JLabel mensagemInicial;
	private final JLabel dono;
	private final JLabel confirmacao;
	private final JLabel confirmacaoDelecao;
	private final JLabel confirmacaoFinalDelecao;
	private final JLabel naoEncontrado;
	private final JButton botaoSim;
	private final JButton botaoNao;
	private JComboBox<String> selecionaDono;
	private final JComboBox<String> selecionaAnimal;
	private final DeletaAnimalControle controller;

	public DeletaAnimalVisual() {
		getContentPane().setLayout(null);

		controller = new DeletaAnimalControle(this);

		this.mensagemInicial = new JLabel("Tela de delecao");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.dono = new JLabel("Dono ");
		this.dono.setBounds(10, 35, 46, 14);
		getContentPane().add(dono);

		this.selecionaDono = new JComboBox<String>();
		this.selecionaDono.setBounds(221, 31, 96, 22);
		this.selecionaDono.addActionListener(this);
		this.selecionaDono.setModel(controller.getDono());
		getContentPane().add(selecionaDono);

		this.confirmacao = new JLabel("Animal que deseja deletar");
		this.confirmacao.setBounds(10, 105, 163, 14);
		getContentPane().add(confirmacao);

		this.selecionaAnimal = new JComboBox<String>();
		this.selecionaAnimal.setBounds(221, 101, 96, 22);
		getContentPane().add(selecionaAnimal);

		this.confirmacaoDelecao = new JLabel("Deseja mesmo deletar?");
		this.confirmacaoDelecao.setBounds(10, 163, 163, 14);
		getContentPane().add(confirmacaoDelecao);

		this.botaoSim = new JButton("Sim");
		this.botaoSim.setBounds(62, 205, 89, 23);
		this.botaoSim.addActionListener(this);
		getContentPane().add(botaoSim);

		this.botaoNao = new JButton("Voltar");
		this.botaoNao.setBounds(221, 205, 89, 23);
		this.botaoNao.addActionListener(this);
		getContentPane().add(botaoNao);

		confirmacaoFinalDelecao = new JLabel("Delecao feita com sucesso!Voltando para o menu Animal.");
		confirmacaoFinalDelecao.setBounds(10, 273, 300, 14);
		getContentPane().add(confirmacaoFinalDelecao);

		naoEncontrado = new JLabel("Anfitriao nao encontrado, voltando para o menu Animal.");
		naoEncontrado.setBounds(10, 304, 307, 14);
		getContentPane().add(naoEncontrado);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(450, 450);
		this.setResizable(false);
	}

	public JComboBox<String> getSelecionaDono() {
		return selecionaDono;
	}

	public void setSelecionaDono(JComboBox<String> selecionaDono) {
		this.selecionaDono = selecionaDono;
	}

	public JButton getBotaoSim() {
		return botaoSim;
	}

	public JButton getBotaoNao() {
		return botaoNao;
	}

	public JComboBox<String> getSelecionaAnimal() {
		return selecionaAnimal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controller.executarBotao(e.getSource());

	}
}
