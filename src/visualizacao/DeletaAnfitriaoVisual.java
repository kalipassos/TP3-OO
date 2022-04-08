package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controles.DeletaAnfitriaoControle;

public class DeletaAnfitriaoVisual extends JFrame implements ActionListener {
	private static final long serialVersionUID = 5461923270645343339L;
	private final JLabel mensagemInicial;
	private final JLabel confirmacao;
	private final JLabel confirmacaoDelecao;
	private final JLabel confirmacaoFinalDelecao;
	private final JLabel naoEncontrado;
	private final JButton botaoSim;
	private final JButton botaoNao;
	private JComboBox<String> selecionaAnfitriao;
	private final DeletaAnfitriaoControle controle;

	public DeletaAnfitriaoVisual() {
		getContentPane().setLayout(null);

		controle = new DeletaAnfitriaoControle(this);

		this.mensagemInicial = new JLabel("Tela de delecao");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.confirmacao = new JLabel("Anfitriao que deseja deletar");
		this.confirmacao.setBounds(10, 42, 163, 14);
		getContentPane().add(confirmacao);

		this.selecionaAnfitriao = new JComboBox<String>();
		this.selecionaAnfitriao.setBounds(221, 38, 96, 22);
		this.selecionaAnfitriao.setModel(controle.getAnfitrioes());
		getContentPane().add(selecionaAnfitriao);

		this.confirmacaoDelecao = new JLabel("Deseja mesmo deletar?");
		this.confirmacaoDelecao.setBounds(10, 88, 163, 14);
		getContentPane().add(confirmacaoDelecao);

		this.botaoSim = new JButton("Sim");
		this.botaoSim.setBounds(73, 127, 89, 23);
		this.botaoSim.addActionListener(this);
		getContentPane().add(botaoSim);

		this.botaoNao = new JButton("Nao");
		this.botaoNao.setBounds(221, 127, 89, 23);
		this.botaoNao.addActionListener(this);
		getContentPane().add(botaoNao);

		confirmacaoFinalDelecao = new JLabel("Delecao feita com sucesso!Voltando para o menu anfitriao.");
		confirmacaoFinalDelecao.setBounds(10, 218, 300, 14);
		getContentPane().add(confirmacaoFinalDelecao);

		naoEncontrado = new JLabel("Anfitriao nao encontrado, voltando para o menu anfitriao.");
		naoEncontrado.setBounds(10, 260, 307, 14);
		getContentPane().add(naoEncontrado);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(450, 450);
		this.setResizable(false);

	}

	public JButton getBotaoSim() {
		return botaoSim;
	}

	public JButton getBotaoNao() {
		return botaoNao;
	}

	public JComboBox<String> getSelecionaAnfitriao() {
		return selecionaAnfitriao;
	}

	public void setSelecionaAnfitriao(JComboBox<String> selecionaAnfitriao) {
		this.selecionaAnfitriao = selecionaAnfitriao;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controle.executarBotao(e.getSource());
	}

}
