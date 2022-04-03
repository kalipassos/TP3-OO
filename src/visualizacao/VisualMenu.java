package visualizacao;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VisualMenu {
  // Declarações acima do construtor, para melhor organização
  private JFrame frame;
  private JButton botaoOpcaoDono;
  private JButton botaoOpcaoAnimal;
  private JButton botaoOpcaoHospedagem;
  private JButton botaoOpcaoAnfitriao;
  private JButton botaoSair;
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
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }

}
