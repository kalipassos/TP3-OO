package visualizacao;

import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VisualDono implements ActionListener {
  // Declaração dos componentes da tela.
  private JFrame telaDono;
  private static JButton botaoCadastrarDono = new JButton("Cadastrar Dono");
  private static JButton botaoBuscarDonoNome = new JButton("Buscar por Nome");
  private static JButton botaoBuscarDonoCPF = new JButton("Buscar por CPF");
  private static JButton botaoVisualizarDono = new JButton("Visualizar Dono");
  private static JButton botaoEditarDono = new JButton("Editar Dono");
  private static JButton botaoDeletarDono = new JButton("Deletar Dono");
  private static JButton botaoVoltar = new JButton("Voltar");
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
    telaDono.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
    telaDono.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    telaDono.setVisible(true);
    telaDono.add(mensagemInicial);// Adiciona a label(rotulo) a interface.

    // adiciona os botoes a interface
    telaDono.add(botaoCadastrarDono);
    telaDono.add(botaoBuscarDonoNome);
    telaDono.add(botaoBuscarDonoCPF);
    telaDono.add(botaoVisualizarDono);
    telaDono.add(botaoEditarDono);
    telaDono.add(botaoDeletarDono);
    telaDono.add(botaoVoltar);

  }

  public static void main(String[] args) {
    VisualDono menu = new VisualDono();

    // criando a recepcao de comando dos botoes
    botaoCadastrarDono.addActionListener(menu);
    botaoBuscarDonoNome.addActionListener(menu);
    botaoBuscarDonoCPF.addActionListener(menu);
    botaoVisualizarDono.addActionListener(menu);
    botaoEditarDono.addActionListener(menu);
    botaoDeletarDono.addActionListener(menu);
    botaoVoltar.addActionListener(menu);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object receptor = e.getSource();

    if (receptor == botaoCadastrarDono) {

    } else if (receptor == botaoBuscarDonoNome) {

    } else if (receptor == botaoBuscarDonoCPF) {

    } else if (receptor == botaoVisualizarDono) {

    } else if (receptor == botaoEditarDono) {

    } else if (receptor == botaoDeletarDono) {

    } else if (receptor == botaoVoltar) {
      new VisualMenu();
    }
  }
}
