package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CadastrarAnimalVisual extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1555595178665863290L;
	private final JLabel mensagemInicial;
	private final JLabel donoAnimal;
	private final JLabel nomeAnimal;
	private final JLabel porteAnimal;
	private final JLabel sexoAnimal;
	private final JLabel biografiaAnimal;
	private final JLabel idadeAnimal;
	private final JLabel especieAnimal;
	private final JLabel cuidadosAnimal;
	private final JTextField cadastrarNome;
	private final JTextField cadastrarPorte;
	private final JTextField cadastrarIdade;
	private final JTextField cadastrarEspecie;
	private final JTextArea textoBiografia;
	private final JTextArea textoCuidados;
	private final JButton botaoCadastrar;
	private final JButton botaoCancelar;
	private final JRadioButton botaoMasculino;
	private final JRadioButton botaoFeminino;
	private final ButtonGroup grupoBotaoRadio;
	private final JComboBox<String> selecionaDono;
	private DefaultComboBoxModel<String> lista = new DefaultComboBoxModel<>();

	public CadastrarAnimalVisual() {
		getContentPane().setLayout(null);

		this.mensagemInicial = new JLabel("Cadastrar Pet");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setEnabled(true);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.selecionaDono = new JComboBox<String>();
		this.selecionaDono.setBounds(244, 37, 136, 22);
		this.selecionaDono.setModel(lista);
		getContentPane().add(selecionaDono);

		this.donoAnimal = new JLabel("Selecione o dono");
		this.donoAnimal.setBounds(26, 41, 108, 14);
		getContentPane().add(donoAnimal);

		this.nomeAnimal = new JLabel("Nome");
		this.nomeAnimal.setBounds(26, 81, 46, 14);
		getContentPane().add(nomeAnimal);

		this.porteAnimal = new JLabel("Porte");
		this.porteAnimal.setBounds(26, 117, 46, 14);
		getContentPane().add(porteAnimal);

		this.sexoAnimal = new JLabel("Sexo");
		this.sexoAnimal.setBounds(26, 153, 46, 14);
		getContentPane().add(sexoAnimal);

		this.biografiaAnimal = new JLabel("Biografia");
		this.biografiaAnimal.setBounds(26, 219, 46, 14);
		getContentPane().add(biografiaAnimal);

		this.cadastrarNome = new JTextField();
		this.cadastrarNome.setBounds(117, 78, 86, 20);
		this.cadastrarNome.setColumns(10);
		getContentPane().add(cadastrarNome);

		this.cadastrarPorte = new JTextField();
		this.cadastrarPorte.setBounds(117, 114, 86, 20);
		this.cadastrarPorte.setColumns(10);
		getContentPane().add(cadastrarPorte);

		this.textoBiografia = new JTextArea();
		this.textoBiografia.setBounds(26, 252, 362, 84);
		getContentPane().add(textoBiografia);

		this.idadeAnimal = new JLabel("Idade");
		this.idadeAnimal.setBounds(244, 81, 46, 14);
		getContentPane().add(idadeAnimal);

		this.especieAnimal = new JLabel("Especie");
		this.especieAnimal.setBounds(244, 117, 46, 14);
		getContentPane().add(especieAnimal);

		this.cuidadosAnimal = new JLabel("Cuidados");
		this.cuidadosAnimal.setBounds(244, 153, 46, 14);
		getContentPane().add(cuidadosAnimal);

		this.cadastrarIdade = new JTextField();
		this.cadastrarIdade.setBounds(300, 78, 86, 20);
		this.cadastrarIdade.setColumns(10);
		getContentPane().add(cadastrarIdade);

		this.cadastrarEspecie = new JTextField();
		this.cadastrarEspecie.setBounds(300, 114, 86, 20);
		this.cadastrarEspecie.setColumns(10);
		getContentPane().add(cadastrarEspecie);

		this.textoCuidados = new JTextArea();
		this.textoCuidados.setBounds(300, 153, 86, 55);
		getContentPane().add(textoCuidados);

		this.botaoCadastrar = new JButton("Salvar");
		this.botaoCadastrar.setBounds(75, 365, 89, 23);
		this.botaoCadastrar.addActionListener(this);
		getContentPane().add(botaoCadastrar);

		this.botaoCancelar = new JButton("Cancelar");
		this.botaoCancelar.setBounds(244, 365, 89, 23);
		this.botaoCancelar.addActionListener(this);
		getContentPane().add(botaoCancelar);

		this.botaoMasculino = new JRadioButton("Masculino");
		this.botaoMasculino.setBounds(75, 149, 109, 23);
		this.botaoMasculino.addActionListener(this);
		getContentPane().add(botaoMasculino);

		this.botaoFeminino = new JRadioButton("Feminino");
		this.botaoFeminino.setBounds(75, 175, 109, 23);
		this.botaoFeminino.addActionListener(this);
		getContentPane().add(botaoFeminino);

		this.grupoBotaoRadio = new ButtonGroup();
		this.grupoBotaoRadio.add(botaoMasculino);
		this.grupoBotaoRadio.add(botaoFeminino);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(450, 450);
		this.setResizable(false);

	}

	public JLabel getDonoAnimal() {
		return donoAnimal;
	}

	public JLabel getNomeAnimal() {
		return nomeAnimal;
	}

	public JLabel getPorteAnimal() {
		return porteAnimal;
	}

	public JLabel getSexoAnimal() {
		return sexoAnimal;
	}

	public JLabel getBiografiaAnimal() {
		return biografiaAnimal;
	}

	public JLabel getIdadeAnimal() {
		return idadeAnimal;
	}

	public JLabel getEspecieAnimal() {
		return especieAnimal;
	}

	public JLabel getCuidadosAnimal() {
		return cuidadosAnimal;
	}

	public JTextField getCadastrarNome() {
		return cadastrarNome;
	}

	public JTextField getCadastrarPorte() {
		return cadastrarPorte;
	}

	public JTextField getCadastrarIdade() {
		return cadastrarIdade;
	}

	public JTextField getCadastrarEspecie() {
		return cadastrarEspecie;
	}

	public JTextArea getTextoBiografia() {
		return textoBiografia;
	}

	public JTextArea getTextoCuidados() {
		return textoCuidados;
	}

	public JButton getBotaoCadastrar() {
		return botaoCadastrar;
	}

	public JButton getBotaoCancelar() {
		return botaoCancelar;
	}

	public JRadioButton getBotaoMasculino() {
		return botaoMasculino;
	}

	public JRadioButton getBotaoFeminino() {
		return botaoFeminino;
	}

	public ButtonGroup getGrupoBotaoRadio() {
		return grupoBotaoRadio;
	}

	public JComboBox<String> getSelecionaDono() {
		return selecionaDono;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
