package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controles.BuscaAnfitriaoControle;

public class BuscaAnfitriaoVisual extends JFrame implements ActionListener {
	private static final long serialVersionUID = -4366955214075461314L;
	private final JLabel mensagemInicial;
	private final JLabel rotuloBuscaAnfitriao;
	private final JLabel rotuloNaoEncontrado;
	private final JLabel rotuloEncontrado;
	private final JLabel rotuloProximaAcao;
	private final JButton botaoBuscarAnfitriao;
	private final JButton botaoSim;
	private final JButton botaoNao;
	private final JButton botaoVisualizarAnfitriao;
	private final JButton botaoEditarAnfitriao;
	private final JButton botaoDeletarAnfitriao;
	private final JButton botaoVoltar;
	private final JTextField TextoNomeAnfitriao;
	private final JTextField textoEncontrado;
	private final BuscaAnfitriaoControle controle;

	public BuscaAnfitriaoVisual() {
		getContentPane().setLayout(null);

		controle = new BuscaAnfitriaoControle(this);

		this.mensagemInicial = new JLabel("Ferramenta de Busca");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.rotuloBuscaAnfitriao = new JLabel("Anfitriao a se buscar");
		this.rotuloBuscaAnfitriao.setBounds(10, 36, 154, 14);
		getContentPane().add(rotuloBuscaAnfitriao);

		this.TextoNomeAnfitriao = new JTextField();
		this.TextoNomeAnfitriao.setBounds(195, 33, 86, 20);
		this.TextoNomeAnfitriao.setColumns(10);
		getContentPane().add(TextoNomeAnfitriao);

		this.botaoBuscarAnfitriao = new JButton("Buscar");
		this.botaoBuscarAnfitriao.setBounds(320, 32, 89, 23);
		this.botaoBuscarAnfitriao.addActionListener(this);
		getContentPane().add(botaoBuscarAnfitriao);

		this.rotuloNaoEncontrado = new JLabel("Nao encontrado, deseja cadastrar?");
		this.rotuloNaoEncontrado.setBounds(10, 84, 197, 14);
		getContentPane().add(rotuloNaoEncontrado);

		this.botaoSim = new JButton("Sim");
		this.botaoSim.setBounds(45, 123, 89, 23);
		this.botaoSim.addActionListener(this);
		getContentPane().add(botaoSim);

		this.botaoNao = new JButton("Nao");
		this.botaoNao.setBounds(227, 123, 89, 23);
		this.botaoNao.addActionListener(this);
		getContentPane().add(botaoNao);

		this.rotuloEncontrado = new JLabel("Encontrado ");
		this.rotuloEncontrado.setBounds(10, 178, 101, 14);
		getContentPane().add(rotuloEncontrado);

		this.textoEncontrado = new JTextField();
		this.textoEncontrado.setBounds(227, 175, 86, 20);
		this.textoEncontrado.setColumns(10);
		getContentPane().add(textoEncontrado);

		this.rotuloProximaAcao = new JLabel("O que deseja realizar?");
		this.rotuloProximaAcao.setBounds(10, 227, 197, 14);
		getContentPane().add(rotuloProximaAcao);

		this.botaoVisualizarAnfitriao = new JButton("Visualizar");
		this.botaoVisualizarAnfitriao.setBounds(45, 270, 89, 23);
		this.botaoVisualizarAnfitriao.addActionListener(this);
		getContentPane().add(botaoVisualizarAnfitriao);

		this.botaoEditarAnfitriao = new JButton("Editar");
		this.botaoEditarAnfitriao.setBounds(227, 270, 89, 23);
		this.botaoEditarAnfitriao.addActionListener(this);
		getContentPane().add(botaoEditarAnfitriao);

		this.botaoDeletarAnfitriao = new JButton("Deletar");
		this.botaoDeletarAnfitriao.setBounds(45, 330, 89, 23);
		this.botaoDeletarAnfitriao.addActionListener(this);
		getContentPane().add(botaoDeletarAnfitriao);

		this.botaoVoltar = new JButton("Voltar");
		this.botaoVoltar.setBounds(227, 330, 89, 23);
		this.botaoVoltar.addActionListener(this);
		getContentPane().add(botaoVoltar);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(450, 450);
		this.setResizable(false);

	}

	public JButton getBotaoBuscarAnfitriao() {
		return botaoBuscarAnfitriao;
	}

	public JButton getBotaoSim() {
		return botaoSim;
	}

	public JButton getBotaoNao() {
		return botaoNao;
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

	public JTextField getTextoNomeAnfitriaogetTextoNomeAnfitriao() {
		return TextoNomeAnfitriao;
	}

	public JTextField getTextoEncontrado() {
		return textoEncontrado;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controle.buscador((JButton) e.getSource());

	}

}
