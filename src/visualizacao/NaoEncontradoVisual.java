package visualizacao;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * Interface da visualizacao do Pagamento da Hospedagem.
 * 
 * @author Carlos / Kallyne
 */
public class NaoEncontradoVisual extends JFrame implements ActionListener {

	private final JLabel mensagemFalha;
	private final JButton botaoReiniciar;
	private final JButton botaoOutro;
	private final JButton botaoCadastrar;

	public NaoEncontradoVisual() {
		getContentPane().setLayout(null);

		this.mensagemFalha = new JLabel("Nao existe, cadastre ou escolha outro");
		this.mensagemFalha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.mensagemFalha.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemFalha.setBounds(10, 11, 414, 82);
		getContentPane().add(mensagemFalha);

		this.botaoReiniciar = new JButton("Reiniciar");
		this.botaoReiniciar.setBounds(26, 187, 89, 23);
		this.botaoReiniciar.addActionListener(this);
		getContentPane().add(botaoReiniciar);

		this.botaoOutro = new JButton("Outro");
		this.botaoOutro.addActionListener(this);
		this.botaoOutro.setBounds(320, 187, 89, 23);
		getContentPane().add(botaoOutro);

		this.botaoCadastrar = new JButton("Cadastrar");
		this.botaoCadastrar.setBounds(178, 187, 89, 23);
		this.botaoCadastrar.addActionListener(this);
		getContentPane().add(botaoCadastrar);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(450, 350);
		this.setResizable(false);

	}

	public JButton getBotaoReiniciar() {
		return botaoReiniciar;
	}

	public JButton getBotaoOutro() {
		return botaoOutro;
	}

	public JButton getBotaoCadastrar() {
		return botaoCadastrar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
