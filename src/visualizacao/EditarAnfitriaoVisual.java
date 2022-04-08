package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controles.EditarAnfitriaoControle;

public class EditarAnfitriaoVisual extends JFrame implements ActionListener {

	private final JLabel mensagemInicial;
	private final JLabel rotuloAnfitriao;
	private final JLabel aviso;
	private final JLabel rotuloNome;
	private final JLabel rotuloEndereco;
	private final JLabel rotuloTelefone;
	private final JLabel avisoAlteracaoHospedagens;
	private final JTextField textoNome;
	private final JTextField textoEndereco;
	private final JTextField textoTelefone;
	private final JComboBox<String> selecionaAnfitriao;
	private final JComboBox<String> listaHospedagem;
	private final JButton botaoAlterar;
	private final JButton botaoReverter;
	private final EditarAnfitriaoControle controle;

	public EditarAnfitriaoVisual() {
		getContentPane().setLayout(null);

		controle = new EditarAnfitriaoControle(this);

		this.mensagemInicial = new JLabel("Ferramenta de Edicao");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.rotuloAnfitriao = new JLabel("Anfitriao a editar");
		this.rotuloAnfitriao.setBounds(10, 50, 160, 14);
		getContentPane().add(rotuloAnfitriao);

		this.selecionaAnfitriao = new JComboBox<String>();
		this.selecionaAnfitriao.setBounds(180, 46, 108, 22);
		getContentPane().add(selecionaAnfitriao);

		this.aviso = new JLabel("Preencha os campos a alterar(CPF NAO E ALTERAVEL)");
		this.aviso.setHorizontalAlignment(SwingConstants.CENTER);
		this.aviso.setBounds(0, 97, 434, 14);
		getContentPane().add(aviso);

		this.rotuloNome = new JLabel("Nome");
		this.rotuloNome.setBounds(10, 122, 46, 14);
		getContentPane().add(rotuloNome);

		this.textoNome = new JTextField();
		this.textoNome.setBounds(180, 119, 86, 20);
		this.textoNome.setColumns(10);
		getContentPane().add(textoNome);

		this.rotuloEndereco = new JLabel("Endereco");
		this.rotuloEndereco.setBounds(10, 157, 46, 14);
		getContentPane().add(rotuloEndereco);

		this.textoEndereco = new JTextField();
		this.textoEndereco.setBounds(180, 154, 86, 20);
		this.textoEndereco.setColumns(10);
		getContentPane().add(textoEndereco);

		this.rotuloTelefone = new JLabel("Telefone");
		this.rotuloTelefone.setBounds(10, 193, 46, 14);
		getContentPane().add(rotuloTelefone);

		this.textoTelefone = new JTextField();
		this.textoTelefone.setBounds(180, 190, 86, 20);
		this.textoTelefone.setColumns(10);
		getContentPane().add(textoTelefone);

		this.avisoAlteracaoHospedagens = new JLabel("Hospedagens afetadas:");
		this.avisoAlteracaoHospedagens.setBounds(10, 232, 363, 14);
		getContentPane().add(avisoAlteracaoHospedagens);

		this.listaHospedagem = new JComboBox<String>();
		this.listaHospedagem.setBounds(180, 272, 108, 22);
		getContentPane().add(listaHospedagem);

		this.botaoAlterar = new JButton("Alterar");
		this.botaoAlterar.setBounds(69, 348, 89, 23);
		this.botaoAlterar.addActionListener(this);
		getContentPane().add(botaoAlterar);

		this.botaoReverter = new JButton("Reverter");
		this.botaoReverter.setBounds(284, 348, 89, 23);
		this.botaoReverter.addActionListener(this);
		getContentPane().add(botaoReverter);

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

	public JComboBox<String> getSelecionaAnfitriao() {
		return selecionaAnfitriao;
	}

	public JComboBox<String> getListaHospedagem() {
		return listaHospedagem;
	}

	public JButton getBotaoAlterar() {
		return botaoAlterar;
	}

	public JButton getBotaoReverter() {
		return botaoReverter;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controle.executarBotao((JButton) e.getSource());

	}

}
