package visualizacao;

import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VisualAnfitriao implements ActionListener {
  // Declaração dos componentes da tela.
  private JFrame telaAnfitriao;
  private static JButton botaoCadastrarAnfitriao = new JButton("Cadastrar Anfitriao");
  private static JButton botaoBuscarNome = new JButton("Buscar por nome");
  private static JButton botaoVisualizarAnfitriao = new JButton("Ver Anfitrioes");
  private static JButton botaoEditarAnfitriao = new JButton("Editar um Anfitriao");
  private static JButton botaoDeletarAnfitriao = new JButton("Deletar um Anfitriao");
  private static JButton botaoVoltar = new JButton("Voltar");
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
    telaAnfitriao.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
    telaAnfitriao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    telaAnfitriao.setVisible(true);
    telaAnfitriao.add(mensagemInicial);// Adiciona a label(rotulo) a interface.

    // adiciona os botoes a interface
    telaAnfitriao.add(botaoCadastrarAnfitriao);
    telaAnfitriao.add(botaoBuscarNome);
    telaAnfitriao.add(botaoVisualizarAnfitriao);
    telaAnfitriao.add(botaoEditarAnfitriao);
    telaAnfitriao.add(botaoDeletarAnfitriao);
    telaAnfitriao.add(botaoVoltar);

  }

  public static void main(String[] args) {
    VisualAnfitriao menu = new VisualAnfitriao();

    // criando a recepcao de comando dos botoes
    botaoCadastrarAnfitriao.addActionListener(menu);
    botaoBuscarNome.addActionListener(menu);
    botaoVisualizarAnfitriao.addActionListener(menu);
    botaoEditarAnfitriao.addActionListener(menu);
    botaoDeletarAnfitriao.addActionListener(menu);
    botaoVoltar.addActionListener(menu);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object receptor = e.getSource();

    if (receptor == botaoCadastrarAnfitriao) {

    } else if (receptor == botaoBuscarNome) {

    } else if (receptor == botaoVisualizarAnfitriao) {

    } else if (receptor == botaoEditarAnfitriao) {

    } else if (receptor == botaoDeletarAnfitriao) {

    } else if (receptor == botaoVoltar) {
      new VisualMenu();
    }

  }
}
