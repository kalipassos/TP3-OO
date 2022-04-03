package visualizacao;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VisualDono {
  // Declaração dos componentes da tela.
  private JFrame telaDono;
  private JButton botaoCadastrarDono;
  private JButton botaoBuscarDonoNome;
  private JButton botaoBuscarDonoCPF;
  private JButton botaoVisualizarDono;
  private JButton botaoEditarDono;
  private JButton botaoDeletarDono;
  private JButton botaoVoltar;
  private JLabel mensagemInicial;

  public VisualDono() {

    // Criando e adicionando a mensagem inicial da tela de Menu.
    mensagemInicial.setText("Bem vindo a pagina dos donos, o que deseja fazer?");
    // coloca a mensagem inicial no centro da interface
    mensagemInicial.setHorizontalTextPosition(JLabel.CENTER);
    mensagemInicial.setVerticalTextPosition(JLabel.TOP);
    // mudando o estilo da fonte
    mensagemInicial.setFont(new Font("Bebas Neue", Font.PLAIN, 20));

    telaDono.setTitle("Dono");
    telaDono.setSize(500, 500);
    telaDono.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    telaDono.setVisible(true);

  }
}
