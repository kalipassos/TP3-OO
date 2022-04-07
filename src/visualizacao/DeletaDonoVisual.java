package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controles.DeletaDonoControle;

public class DeletaDonoVisual extends JFrame implements ActionListener {
	private static final long serialVersionUID = 6869271595133138466L;
	private final JLabel mensagemInicial;
	private final JLabel mensagemEscolhaDono;
	private final JLabel avisoDelecaoPet;
	private final JLabel avisoDelecao;
	private final JButton botaoSim;
	private final JButton botaoNao;
	private JComboBox<String> selecaoDono;
	private final DeletaDonoControle controle;

	public DeletaDonoVisual() {
		getContentPane().setLayout(null);

		controle = new DeletaDonoControle(this);

		this.mensagemInicial = new JLabel("Ferramenta de Delecao");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.mensagemEscolhaDono = new JLabel("Escolha o dono");
		this.mensagemEscolhaDono.setBounds(21, 40, 118, 14);
		getContentPane().add(mensagemEscolhaDono);

		this.selecaoDono = new JComboBox<String>();
		this.selecaoDono.setBounds(218, 36, 92, 22);
		this.selecaoDono.setModel(controle.getDono());
		getContentPane().add(selecaoDono);

		this.avisoDelecaoPet = new JLabel("AVISO!Os pets serao deletados.");
		this.avisoDelecaoPet.setBounds(21, 128, 284, 14);
		getContentPane().add(avisoDelecaoPet);

		this.avisoDelecao = new JLabel("Deseja mesmo deletar?");
		this.avisoDelecao.setBounds(21, 153, 289, 14);
		getContentPane().add(avisoDelecao);

		this.botaoSim = new JButton("Sim");
		this.botaoSim.addActionListener(this);
		this.botaoSim.setBounds(21, 197, 89, 23);
		getContentPane().add(botaoSim);

		this.botaoNao = new JButton("Voltar");
		this.botaoNao.setBounds(218, 197, 89, 23);
		this.botaoNao.addActionListener(this);
		getContentPane().add(botaoNao);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(450, 450);
		this.setResizable(false);

		this.setVisible(true);
	}

	public JButton getBotaoSim() {
		return botaoSim;
	}

	public JButton getBotaoNao() {
		return botaoNao;
	}

	public JComboBox<String> getSelecaoDono() {
		return selecaoDono;
	}

	public void setSelecionaDono(JComboBox<String> selecionaDono) {
		this.selecaoDono = selecionaDono;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controle.executarBotao(e.getSource());

	}

	public JComboBox<String> getSelecionaAnimal() {
		return null;
	}

}
