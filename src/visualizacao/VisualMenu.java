package visualizacao;

import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VisualMenu implements ActionListener {
  // Declarações acima do construtor, para melhor organização
  private JFrame frame;
  private static JButton botaoOpcaoDono = new JButton("Opcoes Dono");
  private static JButton botaoOpcaoAnimal = new JButton("Opcoes Pet");
  private static JButton botaoOpcaoHospedagem = new JButton("Opcoes Hospedagem");
  private static JButton botaoOpcaoAnfitriao = new JButton("Opcoes Anfitriao");
  private static JButton botaoSair = new JButton("Sair");
  private JLabel mensagemInicial;

  public VisualMenu() {

    // Criando e adicionando a mensagem inicial da tela de Menu.
    mensagemInicial.setText("Bem vindo ao servico de hospedagem de pets, o que deseja fazer?");
    // coloca a mensagem inicial no centro da interface
    mensagemInicial.setHorizontalTextPosition(JLabel.CENTER);
    mensagemInicial.setVerticalTextPosition(JLabel.TOP);
    // mudando o estilo da fonte
    mensagemInicial.setFont(new Font("Bebas Neue", Font.PLAIN, 20));

    // criando a GUI do menu, determinando que o X seja o fechamento, o tamanho
    // inicial e que seja visível.
    frame.setTitle("Menu");
    frame.setSize(500, 500);
    frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.add(mensagemInicial);// Adiciona a label(rotulo) a interface.
    // adiciona os botoes existentes
    frame.add(botaoOpcaoDono);
    frame.add(botaoOpcaoAnimal);
    frame.add(botaoOpcaoHospedagem);
    frame.add(botaoOpcaoAnfitriao);
    frame.add(botaoSair);

  }

  public static void main(String[] args) {
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
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

  }

}
