package visualizacao;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VisualAnimal {
  // Declaração dos componentes da tela.
  private JFrame telaAnimal;
  private JButton botaoCadastrarAnimal;
  private JButton botaoBuscarAnimal;
  private JButton botaoVisualizarAnimal;
  private JButton botaoEditarAnimal;
  private JButton botaoDeletarAnimal;
  private JButton botaoVoltar;
  private JLabel mensagemInicial;

  public VisualAnimal() {

    // Criando e adicionando a mensagem inicial da tela de Menu.
    mensagemInicial.setText("Bem vindo a pagina dos pets, o que deseja fazer?");
    // coloca a mensagem inicial no centro da interface
    mensagemInicial.setHorizontalTextPosition(JLabel.CENTER);
    mensagemInicial.setVerticalTextPosition(JLabel.TOP);
    // mudando o estilo da fonte
    mensagemInicial.setFont(new Font("Bebas Neue", Font.PLAIN, 20));

    telaAnimal.setTitle("Animal");
    telaAnimal.setSize(500, 500);
    telaAnimal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    telaAnimal.setVisible(true);

  }
}
