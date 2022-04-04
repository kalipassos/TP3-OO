package visualizacao;

import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VisualMenu extends JFrame implements ActionListener {
  // Declarações acima do construtor, para melhor organização

  private final JButton botaoOpcaoDono = new JButton("Opcoes Dono");
  private final JButton botaoOpcaoAnimal = new JButton("Opcoes Pet");
  private final JButton botaoOpcaoHospedagem = new JButton("Opcoes Hospedagem");
  private final JButton botaoOpcaoAnfitriao = new JButton("Opcoes Anfitriao");
  private final JButton botaoSair = new JButton("Sair");
  private JLabel mensagemInicial;

  public VisualMenu() {
    this.mensagemInicial = new JLabel("Bem vindo ao servico de hospedagem de pets, o que deseja fazer?");
    this.add(mensagemInicial);
    // Criando e adicionando a mensagem inicial da tela de Menu.
    // coloca a mensagem inicial no centro da interface
    mensagemInicial.setHorizontalTextPosition(JLabel.CENTER);
    mensagemInicial.setVerticalTextPosition(JLabel.TOP);
    // mudando o estilo da fonte
    mensagemInicial.setFont(new Font("Bebas Neue", Font.PLAIN, 20));

    // criando a GUI do menu, determinando que o X seja o fechamento, o tamanho
    // inicial e que seja visível.

    this.setTitle("Menu");
    this.setSize(500, 500);
    this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // this.setResizable(false);
    this.setVisible(true);
    this.add(mensagemInicial); // Adiciona a label(rotulo) a interface.

    // adiciona os botoes existentes

    this.add(botaoOpcaoDono);
    this.add(botaoOpcaoAnimal);
    this.add(botaoOpcaoHospedagem);
    this.add(botaoOpcaoAnfitriao);
    this.add(botaoSair);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // adiciona os listeners aos botoes

    VisualMenu menu = new VisualMenu();

    // criando a recepcao de comando dos botoes
    botaoOpcaoDono.addActionListener(menu);
    botaoOpcaoAnimal.addActionListener(menu);
    botaoOpcaoHospedagem.addActionListener(menu);
    botaoOpcaoAnfitriao.addActionListener(menu);
    botaoSair.addActionListener(menu);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object receptor = e.getSource();
    if (receptor == botaoOpcaoDono) {
      new VisualDono();
    } else if (receptor == botaoOpcaoAnimal) {
      new VisualAnimal();
    } else if (receptor == botaoOpcaoHospedagem) {
      new VisualHospedagem();
    } else if (receptor == botaoOpcaoAnfitriao) {
      new VisualAnfitriao();
    } else if (receptor == botaoSair) {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

  }

}
