package visualizacao;

import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VisualAnfitriao {
  // Declaração dos componentes da tela.
  private JFrame telaAnfitriao;
  private JButton botaoCadastrarCPF;
  private JButton botaoCadastrarNome;
  private JButton botaoBuscarNome;
  private JButton botaoVisualizarAnfitriao;
  private JButton botaoEditarAnfitriao;
  private JButton botaoDeletarAnfitriao;
  private JButton botaoVoltar;
  private JLabel mensagemInicial;

  public VisualAnfitriao() {

    // Criando e adicionando a mensagem inicial da tela de Menu.
    mensagemInicial.setText("Bem vindo a pagina dos Anfitrioes, o que deseja fazer?");
    // coloca a mensagem inicial no centro da interface
    mensagemInicial.setHorizontalTextPosition(JLabel.CENTER);
    mensagemInicial.setVerticalTextPosition(JLabel.TOP);
    // mudando o estilo da fonte
    mensagemInicial.setFont(new Font("Bebas Neue", Font.PLAIN, 20));

    telaAnfitriao.setTitle("Anfitriao");
    telaAnfitriao.setSize(500, 500);
    telaAnfitriao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    telaAnfitriao.setVisible(true);

  }
}
