package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controles.VisualizaDonoControle;

/**
 * Interface da visualizacao de um Dono.
 * 
 * @author Carlos / Kallyne
 */
public class VisualizaDonoVisual extends JFrame implements ActionListener {
	private static final long serialVersionUID = 4015662900789725098L;
	private final JLabel mensagemInicial;
	private final JLabel rotuloDono;
	private final JLabel rotuloNome;
	private final JLabel rotuloEndereco;
	private final JLabel rotuloTelefone;
	private final JLabel rotuloCPF;
	private final JLabel rotuloPet;
	private final JTextField textoNome;
	private final JTextField textoEndereco;
	private final JTextField textoTelefone;
	private final JTextField textoCPF;
	private final JButton botaoReiniciar;
	private final JButton botaoDeletar;
	private final JButton botaoEditar;
	private final JButton botaoVoltar;
	private JComboBox<String> escolhaDono;
	private final JComboBox<String> verPet;
	private final VisualizaDonoControle controle;

	/**
	 * Construtor para a view
	 */
	public VisualizaDonoVisual() {
		getContentPane().setLayout(null);

		controle = new VisualizaDonoControle(this);

		this.mensagemInicial = new JLabel("Ferramenta de visualizacao");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.rotuloDono = new JLabel("Dono que deseja visualizar");
		this.rotuloDono.setBounds(10, 25, 146, 14);
		getContentPane().add(rotuloDono);

		this.escolhaDono = new JComboBox<String>();
		this.escolhaDono.setBounds(247, 25, 83, 22);
		this.escolhaDono.setModel(controle.getDono());
		this.escolhaDono.addActionListener(this);
		getContentPane().add(escolhaDono);

		this.rotuloNome = new JLabel("Nome");
		this.rotuloNome.setBounds(10, 61, 46, 14);
		getContentPane().add(rotuloNome);

		this.textoNome = new JTextField();
		this.textoNome.setBounds(247, 58, 86, 20);
		this.textoNome.setColumns(10);
		getContentPane().add(textoNome);

		this.rotuloEndereco = new JLabel("Endereco");
		this.rotuloEndereco.setBounds(10, 94, 46, 14);
		getContentPane().add(rotuloEndereco);

		this.textoEndereco = new JTextField();
		this.textoEndereco.setBounds(247, 91, 86, 20);
		this.textoEndereco.setColumns(10);
		getContentPane().add(textoEndereco);

		this.rotuloTelefone = new JLabel("Telefone");
		this.rotuloTelefone.setBounds(10, 127, 46, 14);
		getContentPane().add(rotuloTelefone);

		this.textoTelefone = new JTextField();
		this.textoTelefone.setBounds(247, 124, 86, 20);
		this.textoTelefone.setColumns(10);
		getContentPane().add(textoTelefone);

		this.rotuloCPF = new JLabel("CPF");
		this.rotuloCPF.setBounds(10, 160, 46, 14);
		getContentPane().add(rotuloCPF);

		this.textoCPF = new JTextField();
		this.textoCPF.setBounds(247, 157, 86, 20);
		this.textoCPF.setColumns(10);
		getContentPane().add(textoCPF);

		this.rotuloPet = new JLabel("Pets");
		this.rotuloPet.setBounds(10, 195, 46, 14);
		getContentPane().add(rotuloPet);

		this.verPet = new JComboBox<String>();
		this.verPet.setBounds(247, 191, 83, 22);
		getContentPane().add(verPet);

		this.botaoReiniciar = new JButton("Reiniciar");
		this.botaoReiniciar.setBounds(10, 265, 89, 23);
		this.botaoReiniciar.addActionListener(this);
		getContentPane().add(botaoReiniciar);

		this.botaoDeletar = new JButton("Deletar");
		this.botaoDeletar.setBounds(315, 265, 89, 23);
		this.botaoDeletar.addActionListener(this);
		getContentPane().add(botaoDeletar);

		this.botaoEditar = new JButton("Editar");
		this.botaoEditar.setBounds(159, 265, 89, 23);
		this.botaoEditar.addActionListener(this);
		getContentPane().add(botaoEditar);

		this.botaoVoltar = new JButton("Voltar");
		this.botaoVoltar.setBounds(159, 339, 89, 23);
		this.botaoVoltar.addActionListener(this);
		getContentPane().add(botaoVoltar);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(450, 450);
		this.setResizable(false);

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

	public JButton getBotaoReiniciar() {
		return botaoReiniciar;
	}

	public JButton getBotaoDeletar() {
		return botaoDeletar;
	}

	public JButton getBotaoEditar() {
		return botaoEditar;
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

	public JComboBox<String> getEscolhaDono() {
		return escolhaDono;
	}

	public JComboBox<String> getVerPet() {
		return verPet;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controle.executarBotao(e.getSource());

	}
}
