package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class DeletaHospedagemVisual extends JFrame implements ActionListener {
	private static final long serialVersionUID = -5479233636111364606L;
	private final JLabel mensagemInicial;
	private final JLabel mensagemEscolhaHospedagem;
	private final JLabel mensagemConfirmacao;
	private final JLabel mensagemConfirmacaoFinal;
	private final JLabel mensagemRetorno;
	private final JButton botaoSim;
	private final JButton botaoNao;
	private final JComboBox<String> selecionaHospedagem;

	public DeletaHospedagemVisual() {
		getContentPane().setLayout(null);

		this.mensagemInicial = new JLabel("Ferramenta de Delecao");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.mensagemEscolhaHospedagem = new JLabel("Hospedagem a deletar");
		this.mensagemEscolhaHospedagem.setBounds(10, 25, 151, 14);
		getContentPane().add(mensagemEscolhaHospedagem);

		this.selecionaHospedagem = new JComboBox<String>();
		this.selecionaHospedagem.setBounds(234, 25, 89, 22);
		getContentPane().add(selecionaHospedagem);

		this.mensagemConfirmacao = new JLabel("Deseja mesmo deletar?");
		this.mensagemConfirmacao.setBounds(10, 76, 151, 14);
		getContentPane().add(mensagemConfirmacao);

		this.botaoSim = new JButton("Sim");
		this.botaoSim.setBounds(72, 111, 89, 23);
		this.botaoSim.addActionListener(this);
		getContentPane().add(botaoSim);

		this.botaoNao = new JButton("Nao");
		this.botaoNao.setBounds(234, 111, 89, 23);
		this.botaoSim.addActionListener(this);
		getContentPane().add(botaoNao);

		this.mensagemConfirmacaoFinal = new JLabel("Delecao realizada com sucesso!Voltando ao menu de hospedagens.");
		this.mensagemConfirmacaoFinal.setBounds(10, 186, 336, 14);
		getContentPane().add(mensagemConfirmacaoFinal);

		this.mensagemRetorno = new JLabel("Voltando ao menu de hospedagem.");
		this.mensagemRetorno.setBounds(10, 220, 313, 14);
		getContentPane().add(mensagemRetorno);

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

	public JComboBox<String> getSelecionaHospedagem() {
		return selecionaHospedagem;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}