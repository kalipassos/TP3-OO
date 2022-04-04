package visualizacao;

import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VisualAnimal implements ActionListener {
  // Declaração dos componentes da tela.
  private JFrame telaAnimal;
  private static JButton botaoCadastrarAnimal = new JButton("Cadastrar Pet");
  private static JButton botaoBuscarAnimal = new JButton("Buscar Pet");
  private static JButton botaoVisualizarAnimal = new JButton("Visualizar Pets");
  private static JButton botaoEditarAnimal = new JButton("Editar Pet");
  private static JButton botaoDeletarAnimal = new JButton("Deletar Pet");
  private static JButton botaoVoltar = new JButton("Voltar");
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
    telaAnimal.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
    telaAnimal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    telaAnimal.setVisible(true);
    telaAnimal.add(mensagemInicial);// Adiciona a label(rotulo) a interface.

    // adiciona os botoes a interface
    telaAnimal.add(botaoCadastrarAnimal);
    telaAnimal.add(botaoBuscarAnimal);
    telaAnimal.add(botaoVisualizarAnimal);
    telaAnimal.add(botaoEditarAnimal);
    telaAnimal.add(botaoDeletarAnimal);
    telaAnimal.add(botaoVoltar);

  }

  public static void main(String[] args) {
    VisualAnimal menu = new VisualAnimal();
    // criando a recepcao de comando do botoes
    botaoCadastrarAnimal.addActionListener(menu);
    botaoBuscarAnimal.addActionListener(menu);
    botaoVisualizarAnimal.addActionListener(menu);
    botaoEditarAnimal.addActionListener(menu);
    botaoDeletarAnimal.addActionListener(menu);
    botaoVoltar.addActionListener(menu);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object receptor = e.getSource();

    if (receptor == botaoCadastrarAnimal) {

    } else if (receptor == botaoBuscarAnimal) {

    } else if (receptor == botaoVisualizarAnimal) {

    } else if (receptor == botaoEditarAnimal) {

    } else if (receptor == botaoDeletarAnimal) {

    } else if (receptor == botaoVoltar) {
      new VisualMenu();
    }

  }
}
