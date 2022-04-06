package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controles.MenuControle;

public class MenuVisual extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private final JLabel mensagemInicialMenu;
	private final JButton botaoOpcaoDono;
	private final JButton botaoOpcaoAnimal;
	private final JButton botaoOpcaoAnfitriao;
	private final JButton botaoOpcaoHospedagem;
	private final JButton botaoSair;
	private final MenuControle controle;

	public MenuVisual() {
		super();
		getContentPane().setLayout(null);

		controle = new MenuControle(this);

		this.mensagemInicialMenu = new JLabel("Bem vindo ao aplicativo de reservas");
		this.mensagemInicialMenu.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicialMenu.setBounds(0, 0, 484, 14);
		getContentPane().add(mensagemInicialMenu);

		this.botaoOpcaoDono = new JButton("Opcao Dono");
		this.botaoOpcaoDono.setBounds(53, 51, 172, 23);
		this.botaoOpcaoDono.addActionListener(this);
		getContentPane().add(botaoOpcaoDono);

		this.botaoOpcaoAnimal = new JButton("Opcao Animal");
		this.botaoOpcaoAnimal.setBounds(286, 51, 172, 23);
		this.botaoOpcaoAnimal.addActionListener(this);
		getContentPane().add(botaoOpcaoAnimal);

		this.botaoOpcaoAnfitriao = new JButton("Opcao Anfitriao");
		this.botaoOpcaoAnfitriao.setBounds(53, 122, 172, 23);
		this.botaoOpcaoAnfitriao.addActionListener(this);
		getContentPane().add(botaoOpcaoAnfitriao);

		this.botaoOpcaoHospedagem = new JButton("Opcao Hospedagem");
		this.botaoOpcaoHospedagem.setBounds(286, 122, 172, 23);
		this.botaoOpcaoHospedagem.addActionListener(this);
		getContentPane().add(botaoOpcaoHospedagem);

		this.botaoSair = new JButton("Sair");
		this.botaoSair.setBounds(209, 190, 89, 23);
		this.botaoSair.addActionListener(this);
		getContentPane().add(botaoSair);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 400);
		this.setResizable(false);

	}

	public static void main(String[] args) {
		new MenuVisual().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controle.executarBotao((JButton) e.getSource());
	}

	public JButton getBotaoOpcaoDono() {
		return botaoOpcaoDono;
	}

	public JButton getBotaoOpcaoAnimal() {
		return botaoOpcaoAnimal;
	}

	public JButton getBotaoOpcaoAnfitriao() {
		return botaoOpcaoAnfitriao;
	}

	public JButton getBotaoOpcaoHospedagem() {
		return botaoOpcaoHospedagem;
	}

	public JButton getBotaoSair() {
		return botaoSair;
	}
}
