package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controles.DeletaHospedagemControle;

public class DeletaHospedagemVisual extends JFrame implements ActionListener {
	private static final long serialVersionUID = -5479233636111364606L;
	private final JLabel mensagemInicial;
	private final JLabel mensagemEscolhaAnfitriao;
	private final JLabel mensagemEscolhaHospedagem;
	private final JLabel mensagemConfirmacao;
	private final JLabel mensagemConfirmacaoFinal;
	private final JLabel mensagemRetorno;
	private final JButton botaoSim;
	private final JButton botaoNao;
	private JComboBox<String> selecionaAnfitriao;
	private final JComboBox<String> selecionaHospedagem;
	private final DeletaHospedagemControle controle;

	public DeletaHospedagemVisual() {
		getContentPane().setLayout(null);

		controle = new DeletaHospedagemControle(this);

		this.mensagemInicial = new JLabel("Ferramenta de Delecao");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.mensagemEscolhaAnfitriao = new JLabel("Escolha o anfitriao");
		this.mensagemEscolhaAnfitriao.setBounds(10, 37, 137, 14);
		getContentPane().add(mensagemEscolhaAnfitriao);

		this.selecionaAnfitriao = new JComboBox<String>();
		this.selecionaAnfitriao.setBounds(234, 33, 89, 22);
		this.selecionaAnfitriao.setModel(controle.getAnfitriao());
		getContentPane().add(selecionaAnfitriao);

		this.mensagemEscolhaHospedagem = new JLabel("Hospedagens ");
		this.mensagemEscolhaHospedagem.setBounds(10, 80, 151, 14);
		getContentPane().add(mensagemEscolhaHospedagem);

		this.selecionaHospedagem = new JComboBox<String>();
		this.selecionaHospedagem.setBounds(234, 76, 89, 22);
		getContentPane().add(selecionaHospedagem);

		this.mensagemConfirmacao = new JLabel("Deseja mesmo deletar?");
		this.mensagemConfirmacao.setBounds(10, 127, 151, 14);
		getContentPane().add(mensagemConfirmacao);

		this.botaoSim = new JButton("Sim");
		this.botaoSim.setBounds(72, 170, 89, 23);
		this.botaoSim.addActionListener(this);
		getContentPane().add(botaoSim);

		this.botaoNao = new JButton("Nao");
		this.botaoNao.setBounds(234, 170, 89, 23);
		this.botaoNao.addActionListener(this);
		getContentPane().add(botaoNao);

		this.mensagemConfirmacaoFinal = new JLabel("Delecao realizada com sucesso!Voltando ao menu de hospedagens.");
		this.mensagemConfirmacaoFinal.setBounds(10, 248, 336, 14);
		getContentPane().add(mensagemConfirmacaoFinal);

		this.mensagemRetorno = new JLabel("Voltando ao menu de hospedagem.");
		this.mensagemRetorno.setBounds(10, 287, 313, 14);
		getContentPane().add(mensagemRetorno);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(450, 450);
		this.setResizable(false);

	}

	public JComboBox<String> getSelecionaAnfitriao() {
		return selecionaAnfitriao;
	}

	public void setSelecionaAnfitriao(JComboBox<String> selecionaAnfitriao) {
		this.selecionaAnfitriao = selecionaAnfitriao;
	}

	public JButton getBotaoSim() {
		return botaoSim;
	}

	public JButton getBotaoNao() {
		return botaoNao;
	}

	public JComboBox<String> getSelecionaHospedagem() {
		return selecionaHospedagem;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
