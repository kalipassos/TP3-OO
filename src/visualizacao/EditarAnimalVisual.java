package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class EditarAnimalVisual extends JFrame implements ActionListener {

	private final JLabel mensagemInicial;
	private final JLabel buscaPet;
	private final JLabel retornaPets;
	private final JLabel aviso;
	private final JTextField textoNome;
	private final JTextArea textoCuidados;
	private final JButton botaoBuscar;
	private final JButton botaoSalvar;
	private final JButton botaoReverter;
	private final JComboBox<String> selecionaPet;

	public EditarAnimalVisual() {
		getContentPane().setLayout(null);

		this.mensagemInicial = new JLabel("Ferramenta de Edicao");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.buscaPet = new JLabel("Pet a ser editado");
		this.buscaPet.setBounds(24, 25, 169, 14);
		getContentPane().add(buscaPet);

		this.textoNome = new JTextField();
		this.textoNome.setBounds(203, 25, 86, 20);
		this.textoNome.setColumns(10);
		getContentPane().add(textoNome);

		this.botaoBuscar = new JButton("Buscar");
		this.botaoBuscar.setBounds(324, 24, 89, 23);
		this.botaoBuscar.addActionListener(this);
		getContentPane().add(botaoBuscar);

		this.retornaPets = new JLabel("Pets com esse nome");
		this.retornaPets.setBounds(24, 65, 169, 14);
		getContentPane().add(retornaPets);

		this.selecionaPet = new JComboBox<String>();
		selecionaPet.setBounds(203, 61, 86, 22);
		getContentPane().add(selecionaPet);

		this.aviso = new JLabel("Somente possivel editar cuidados");
		this.aviso.setBounds(24, 112, 389, 14);
		getContentPane().add(aviso);

		this.textoCuidados = new JTextArea();
		this.textoCuidados.setBounds(24, 154, 389, 142);
		getContentPane().add(textoCuidados);

		botaoSalvar = new JButton("Salvar");
		botaoSalvar.setBounds(24, 355, 89, 23);
		this.botaoSalvar.addActionListener(this);
		getContentPane().add(botaoSalvar);

		this.botaoReverter = new JButton("Reverter");
		this.botaoReverter.setBounds(324, 355, 89, 23);
		this.botaoReverter.addActionListener(this);
		getContentPane().add(botaoReverter);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(450, 450);
		this.setResizable(false);

	}

	public JTextField getTextoNome() {
		return textoNome;
	}

	public JTextArea getTextoCuidados() {
		return textoCuidados;
	}

	public JButton getBotaoBuscar() {
		return botaoBuscar;
	}

	public JButton getBotaoSalvar() {
		return botaoSalvar;
	}

	public JButton getBotaoReverter() {
		return botaoReverter;
	}

	public JComboBox<String> getSelecionaPet() {
		return selecionaPet;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
