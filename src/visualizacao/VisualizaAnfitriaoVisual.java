package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controles.VisualizaAnfitriaoControle;

public class VisualizaAnfitriaoVisual extends JFrame implements ActionListener {
	private static final long serialVersionUID = 453867455466484883L;
	private final JLabel mensagemInicial;
	private final JLabel rotuloVisualizaAnfitriao;
	private final JLabel rotuloNome;
	private final JLabel rotuloEndereco;
	private final JLabel rotuloTelefone;
	private final JLabel rotuloCPF;
	private final JLabel rotuloHospedagens;
	private final JTextField textoNome;
	private final JTextField textoEndereco;
	private final JTextField textoTelefone;
	private final JTextField textoCPF;
	private final JButton botaoReinicia;// reinicia a tela
	private final JButton botaoEdita;
	private final JButton botaoDeleta;
	private final JButton botaoVolta;
	private JComboBox<String> selecionaAnfitriao;// seleciona um anfitriao para visualizar
	private final JComboBox<String> mostraHospedagens;// lista todas as hospedagens
	private final VisualizaAnfitriaoControle controle;

	public VisualizaAnfitriaoVisual() {
		getContentPane().setLayout(null);

		controle = new VisualizaAnfitriaoControle(this);

		this.mensagemInicial = new JLabel("Ferramenta de Visualizacao");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.rotuloVisualizaAnfitriao = new JLabel("Anfitriao que deseja visualizar");
		this.rotuloVisualizaAnfitriao.setBounds(10, 25, 168, 14);
		getContentPane().add(rotuloVisualizaAnfitriao);

		this.selecionaAnfitriao = new JComboBox<String>();
		this.selecionaAnfitriao.setBounds(252, 25, 91, 22);
		this.selecionaAnfitriao.setModel(controle.getAnfitriao());
		this.selecionaAnfitriao.addActionListener(this);
		getContentPane().add(selecionaAnfitriao);

		this.rotuloNome = new JLabel("Nome");
		this.rotuloNome.setBounds(10, 77, 168, 14);
		getContentPane().add(rotuloNome);

		this.textoNome = new JTextField();

		this.textoNome.setBounds(252, 74, 86, 20);
		this.textoNome.setColumns(10);
		getContentPane().add(textoNome);

		this.rotuloEndereco = new JLabel("Endereco");
		this.rotuloEndereco.setBounds(10, 115, 168, 14);
		getContentPane().add(rotuloEndereco);

		this.textoEndereco = new JTextField();
		this.textoEndereco.setBounds(252, 112, 86, 20);
		this.textoEndereco.setColumns(10);
		getContentPane().add(textoEndereco);

		this.rotuloTelefone = new JLabel("Telefone");
		this.rotuloTelefone.setBounds(10, 154, 46, 14);
		getContentPane().add(rotuloTelefone);

		this.textoTelefone = new JTextField();
		this.textoTelefone.setBounds(252, 151, 86, 20);
		this.textoTelefone.setColumns(10);
		getContentPane().add(textoTelefone);

		this.rotuloCPF = new JLabel("CPF");
		this.rotuloCPF.setBounds(10, 192, 46, 14);
		getContentPane().add(rotuloCPF);

		this.textoCPF = new JTextField();
		this.textoCPF.setBounds(252, 189, 86, 20);
		this.textoCPF.setColumns(10);
		getContentPane().add(textoCPF);

		this.rotuloHospedagens = new JLabel("Hospedagens");
		this.rotuloHospedagens.setBounds(10, 233, 86, 14);
		getContentPane().add(rotuloHospedagens);

		this.mostraHospedagens = new JComboBox<String>();
		this.mostraHospedagens.setBounds(252, 233, 91, 22);
		getContentPane().add(mostraHospedagens);

		this.botaoReinicia = new JButton("Reiniciar");
		this.botaoReinicia.setBounds(29, 307, 89, 23);
		this.botaoReinicia.addActionListener(this);
		getContentPane().add(botaoReinicia);

		this.botaoEdita = new JButton("Editar");
		this.botaoEdita.setBounds(252, 307, 89, 23);
		this.botaoEdita.addActionListener(this);
		getContentPane().add(botaoEdita);

		this.botaoDeleta = new JButton("Deletar");
		this.botaoDeleta.setBounds(29, 361, 89, 23);
		this.botaoDeleta.addActionListener(this);
		getContentPane().add(botaoDeleta);

		this.botaoVolta = new JButton("Voltar");
		this.botaoVolta.setBounds(252, 361, 89, 23);
		this.botaoVolta.addActionListener(this);
		getContentPane().add(botaoVolta);

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

	public JTextField getTextoNome() {
		return textoNome;
	}

	public JTextField getTextoEndereco() {
		return textoEndereco;
	}

	public JTextField getTextoTelefone() {
		return textoTelefone;
	}

	public JTextField getTextoCPF() {
		return textoCPF;
	}

	public JButton getBotaoReinicia() {
		return botaoReinicia;
	}

	public JButton getBotaoEdita() {
		return botaoEdita;
	}

	public JButton getBotaoDeleta() {
		return botaoDeleta;
	}

	public JButton getBotaoVolta() {
		return botaoVolta;
	}

	public JComboBox<String> getMostraHospedagens() {
		return mostraHospedagens;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controle.executarBotao(e.getSource());
		System.out.println(this.selecionaAnfitriao.getSelectedItem());

	}

}
