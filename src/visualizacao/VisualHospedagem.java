package visualizacao;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VisualHospedagem {
  // Declaração dos componentes da tela.
  private JFrame telaHospedagem;
  private JButton botaoCadastrarAnfitriao;
  private JButton botaoHospedarAnimal;
  private JButton botaoCadastrarHospedagem;
  private JButton botaoBuscarHospedagem;
  private JButton botaoVisualizarHospedagem;
  private JButton botaoEditarHospedagem;
  private JButton botaoDeletarHospedagem;
  private JButton botaoVoltar;
  private JLabel mensagemInicial;

  public VisualHospedagem() {

    // Criando e adicionando a mensagem inicial da tela de Menu.
    mensagemInicial.setText("Bem vindo ao servico de hospedagem de pets, o que deseja fazer?");
    // coloca a mensagem inicial no centro da interface
    mensagemInicial.setHorizontalTextPosition(JLabel.CENTER);
    mensagemInicial.setVerticalTextPosition(JLabel.TOP);
    // mudando o estilo da fonte
    mensagemInicial.setFont(new Font("Bebas Neue", Font.PLAIN, 20));

    telaHospedagem.setTitle("Hospedagem");
    telaHospedagem.setSize(500, 500);
    telaHospedagem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    telaHospedagem.setVisible(true);

  }
}
