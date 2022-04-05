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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PagamentoVisual extends JFrame implements ActionListener {
	private static final long serialVersionUID = -4260562776542972419L;
	private final JLabel mensagemInicial;
	private final JLabel rotuloPagamento;
	private final JLabel rotuloHospedagem;
	private final JLabel rotuloDiaria;
	private final JLabel rotuloDiasHospedagem;
	private final JTextField textoDiasHospedado;
	private final JRadioButton botaoCredito;
	private final JRadioButton botaoDebito;
	private final JRadioButton botaoDinheiro;
	private final ButtonGroup grupoBotaoRadio;
	private final JButton botaoConfirmar;
	private final JButton botaoApagar;
	private final JComboBox<String> selecionaHospedagem;
	private DefaultComboBoxModel<String> lista = new DefaultComboBoxModel<>();

	public PagamentoVisual() {
		getContentPane().setLayout(null);

		this.mensagemInicial = new JLabel("Pagamento");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.rotuloPagamento = new JLabel("Forma de Pagamento");
		this.rotuloPagamento.setBounds(35, 86, 110, 14);
		getContentPane().add(rotuloPagamento);

		this.botaoCredito = new JRadioButton("Credito");
		this.botaoCredito.setBounds(35, 117, 70, 23);
		getContentPane().add(botaoCredito);

		this.botaoDebito = new JRadioButton("Debito");
		this.botaoDebito.setBounds(159, 117, 65, 23);
		getContentPane().add(botaoDebito);

		this.botaoDinheiro = new JRadioButton("Dinheiro");
		this.botaoDinheiro.setBounds(281, 117, 70, 23);
		getContentPane().add(botaoDinheiro);

		this.grupoBotaoRadio = new ButtonGroup();
		this.grupoBotaoRadio.add(botaoCredito);
		this.grupoBotaoRadio.add(botaoDebito);
		this.grupoBotaoRadio.add(botaoDinheiro);

		this.rotuloDiaria = new JLabel("Valor da Diaria: 250,00");
		this.rotuloDiaria.setBounds(35, 158, 134, 14);
		getContentPane().add(rotuloDiaria);

		this.rotuloDiasHospedagem = new JLabel("Dias de hospedagem");
		this.rotuloDiasHospedagem.setBounds(35, 194, 110, 14);
		getContentPane().add(rotuloDiasHospedagem);

		this.textoDiasHospedado = new JTextField();
		this.textoDiasHospedado.setBounds(191, 191, 86, 20);
		this.textoDiasHospedado.setColumns(10);
		getContentPane().add(textoDiasHospedado);

		this.rotuloHospedagem = new JLabel("Hospedagem");
		this.rotuloHospedagem.setBounds(35, 43, 91, 14);
		getContentPane().add(rotuloHospedagem);

		this.selecionaHospedagem = new JComboBox<String>();
		this.selecionaHospedagem.setBounds(191, 39, 86, 22);
		this.selecionaHospedagem.setModel(lista);
		getContentPane().add(selecionaHospedagem);

		this.botaoConfirmar = new JButton("Confirmar");
		this.botaoConfirmar.setBounds(56, 317, 89, 23);
		getContentPane().add(botaoConfirmar);

		this.botaoApagar = new JButton("Apagar");
		this.botaoApagar.setBounds(262, 317, 89, 23);
		getContentPane().add(botaoApagar);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 400);
		this.setResizable(false);
	}

	public JRadioButton getBotaoCredito() {
		return botaoCredito;
	}

	public JRadioButton getBotaoDebito() {
		return botaoDebito;
	}

	public JRadioButton getBotaoDinheiro() {
		return botaoDinheiro;
	}

	public ButtonGroup getGrupoBotaoRadio() {
		return grupoBotaoRadio;
	}

	public JButton getBotaoConfirmar() {
		return botaoConfirmar;
	}

	public JButton getBotaoApagar() {
		return botaoApagar;
	}

	public JComboBox<String> getSelecionaHospedagem() {
		return selecionaHospedagem;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
