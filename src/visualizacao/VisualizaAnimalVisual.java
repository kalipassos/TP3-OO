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

public class VisualizaAnimalVisual extends JFrame implements ActionListener {
	private static final long serialVersionUID = -7435614229544076755L;
	private final JLabel mensagemInicial;
	private final JLabel rotuloDono;
	private final JLabel rotuloPet;
	private final JLabel rotuloNome;
	private final JLabel rotuloPorte;
	private final JLabel rotuloSexo;
	private final JLabel rotuloIdade;
	private final JLabel rotuloEspecie;
	private final JLabel rotuloCuidados;
	private final JLabel rotuloBiografia;
	private final JTextField textoNome;
	private final JTextField textoPorte;
	private final JTextField textoSexo;
	private final JTextField textoIdade;
	private final JTextField textoEspecie;
	private final JTextArea textoCuidados;
	private final JTextArea textoBiografia;
	private final JButton botaoReiniciar;
	private final JButton botaoEditar;
	private final JButton botaoDeletar;
	private final JButton botaoVoltar;
	private final JComboBox<String> selecionaDono;
	private final JComboBox<String> selecionaPet;

	public VisualizaAnimalVisual() {
		getContentPane().setLayout(null);

		this.mensagemInicial = new JLabel("Ferramenta de visualizacao");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.rotuloDono = new JLabel("Escolha o dono");
		this.rotuloDono.setBounds(10, 25, 97, 14);
		getContentPane().add(rotuloDono);

		this.selecionaDono = new JComboBox<String>();
		this.selecionaDono.setBounds(194, 25, 87, 22);
		getContentPane().add(selecionaDono);

		this.rotuloPet = new JLabel("Escolha o pet");
		this.rotuloPet.setBounds(10, 70, 97, 14);
		getContentPane().add(rotuloPet);

		this.selecionaPet = new JComboBox<String>();
		this.selecionaPet.setBounds(194, 66, 87, 22);
		getContentPane().add(selecionaPet);

		this.rotuloNome = new JLabel("Nome");
		this.rotuloNome.setBounds(10, 120, 46, 14);
		getContentPane().add(rotuloNome);

		this.rotuloPorte = new JLabel("Porte");
		this.rotuloPorte.setBounds(10, 158, 46, 14);
		getContentPane().add(rotuloPorte);

		this.rotuloSexo = new JLabel("Sexo");// fazer um metodo para pegar o escolhido e transformar em string
		this.rotuloSexo.setBounds(10, 193, 46, 14);
		getContentPane().add(rotuloSexo);

		this.rotuloIdade = new JLabel("Idade");
		this.rotuloIdade.setBounds(236, 120, 46, 14);
		getContentPane().add(rotuloIdade);

		this.textoNome = new JTextField();
		this.textoNome.setBounds(103, 117, 86, 20);
		this.textoNome.setColumns(10);
		getContentPane().add(textoNome);

		this.textoPorte = new JTextField();
		this.textoPorte.setBounds(103, 155, 86, 20);
		this.textoPorte.setColumns(10);
		getContentPane().add(textoPorte);

		this.textoSexo = new JTextField();
		this.textoSexo.setBounds(103, 190, 86, 20);
		this.textoSexo.setColumns(10);
		getContentPane().add(textoSexo);

		this.rotuloEspecie = new JLabel("Especie");
		this.rotuloEspecie.setBounds(236, 158, 46, 14);
		getContentPane().add(rotuloEspecie);

		this.rotuloCuidados = new JLabel("Cuidados");
		this.rotuloCuidados.setBounds(236, 193, 46, 14);
		getContentPane().add(rotuloCuidados);

		this.rotuloBiografia = new JLabel("Biografia");
		this.rotuloBiografia.setBounds(10, 258, 46, 14);
		getContentPane().add(rotuloBiografia);

		this.textoIdade = new JTextField();
		this.textoIdade.setBounds(308, 117, 86, 20);
		this.textoIdade.setColumns(10);
		getContentPane().add(textoIdade);

		this.textoEspecie = new JTextField();
		this.textoEspecie.setBounds(308, 155, 86, 20);
		this.textoEspecie.setColumns(10);
		getContentPane().add(textoEspecie);

		this.textoCuidados = new JTextArea();
		this.textoCuidados.setBounds(308, 193, 86, 57);
		getContentPane().add(textoCuidados);

		this.textoBiografia = new JTextArea();
		this.textoBiografia.setBounds(20, 283, 374, 72);
		getContentPane().add(textoBiografia);

		this.botaoReiniciar = new JButton("Reiniciar");
		this.botaoReiniciar.setBounds(10, 377, 89, 23);
		this.botaoReiniciar.addActionListener(this);
		getContentPane().add(botaoReiniciar);

		this.botaoEditar = new JButton("Editar");
		this.botaoEditar.setBounds(109, 377, 89, 23);
		this.botaoEditar.addActionListener(this);
		getContentPane().add(botaoEditar);

		this.botaoDeletar = new JButton("Deletar");
		this.botaoDeletar.setBounds(208, 377, 89, 23);
		this.botaoDeletar.addActionListener(this);
		getContentPane().add(botaoDeletar);

		this.botaoVoltar = new JButton("Voltar");
		this.botaoVoltar.setBounds(308, 377, 89, 23);
		this.botaoVoltar.addActionListener(this);
		getContentPane().add(botaoVoltar);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(450, 450);
		this.setResizable(false);

	}

	public JTextField getTextoNome() {
		return textoNome;
	}

	public JTextField getTextoPorte() {
		return textoPorte;
	}

	public JTextField getTextoSexo() {
		return textoSexo;
	}

	public JTextField getTextoIdade() {
		return textoIdade;
	}

	public JTextField getTextoEspecie() {
		return textoEspecie;
	}

	public JTextArea getTextoCuidados() {
		return textoCuidados;
	}

	public JTextArea getTextoBiografia() {
		return textoBiografia;
	}

	public JButton getBotaoReiniciar() {
		return botaoReiniciar;
	}

	public JButton getBotaoEditar() {
		return botaoEditar;
	}

	public JButton getBotaoDeletar() {
		return botaoDeletar;
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

	public JComboBox<String> getSelecionaDono() {
		return selecionaDono;
	}

	public JComboBox<String> getSelecionaPet() {
		return selecionaPet;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
