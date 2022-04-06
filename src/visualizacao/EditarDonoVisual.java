package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class EditarDonoVisual extends JFrame implements ActionListener {

	private static final long serialVersionUID = 5032313266242852314L;
	private final JLabel mensagemInicial;
	private final JLabel rotuloDono;
	private final JLabel rotuloNome;
	private final JLabel rotuloEndereco;
	private final JLabel rotuloTelefone;
	private final JLabel rotuloAviso;
	private final JTextField textoNome;
	private final JTextField textoEndereco;
	private final JTextField textoTelefone;
	private final JButton botaoAlterar;
	private final JButton botaoReverter;
	private JComboBox<String> selecionaDono;

	public EditarDonoVisual() {
		getContentPane().setLayout(null);

		this.mensagemInicial = new JLabel("Ferramenta de Edicao");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.rotuloDono = new JLabel("Dono a alterar");
		this.rotuloDono.setBounds(20, 36, 104, 14);
		getContentPane().add(rotuloDono);

		this.selecionaDono = new JComboBox<String>();
		this.selecionaDono.setBounds(179, 36, 86, 22);
		getContentPane().add(selecionaDono);

		this.rotuloNome = new JLabel("Nome");
		this.rotuloNome.setBounds(20, 138, 64, 14);
		getContentPane().add(rotuloNome);

		this.rotuloEndereco = new JLabel("Endereco");
		this.rotuloEndereco.setBounds(20, 177, 64, 14);
		getContentPane().add(rotuloEndereco);

		this.rotuloTelefone = new JLabel("Telefone");
		this.rotuloTelefone.setBounds(20, 220, 64, 14);
		getContentPane().add(rotuloTelefone);

		this.rotuloAviso = new JLabel("CPF nao e editavel");
		this.rotuloAviso.setHorizontalAlignment(SwingConstants.CENTER);
		this.rotuloAviso.setBounds(0, 260, 434, 14);
		getContentPane().add(rotuloAviso);

		this.textoNome = new JTextField();
		this.textoNome.setBounds(179, 135, 86, 20);
		this.textoNome.setColumns(10);
		getContentPane().add(textoNome);

		this.textoEndereco = new JTextField();
		this.textoEndereco.setBounds(179, 217, 86, 20);
		this.textoEndereco.setColumns(10);
		getContentPane().add(textoEndereco);

		this.textoTelefone = new JTextField();
		this.textoTelefone.setBounds(179, 174, 86, 20);
		this.textoTelefone.setColumns(10);
		getContentPane().add(textoTelefone);

		this.botaoAlterar = new JButton("Alterar");
		this.botaoAlterar.setBounds(35, 330, 89, 23);
		this.botaoAlterar.addActionListener(this);
		getContentPane().add(botaoAlterar);

		this.botaoReverter = new JButton("Reverter");
		this.botaoReverter.setBounds(299, 330, 89, 23);
		this.botaoReverter.addActionListener(this);
		getContentPane().add(botaoReverter);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(450, 450);
		this.setResizable(false);

	}

	public JComboBox<String> getSelecionaDono() {
		return selecionaDono;
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

	public JButton getBotaoAlterar() {
		return botaoAlterar;
	}

	public JButton getBotaoReverter() {
		return botaoReverter;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
