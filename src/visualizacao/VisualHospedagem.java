package visualizacao;

import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VisualHospedagem implements ActionListener {
  // Declaração dos componentes da tela.
  private JFrame telaHospedagem;
  private static JButton botaoCadastrarAnfitriao = new JButton("Ver Anfitrioes com hospedagens");
  private static JButton botaoHospedarAnimal = new JButton("Hospedar Pet");
  private static JButton botaoCadastrarHospedagem = new JButton("Cadastrar Hospedagem");
  private static JButton botaoBuscarHospedagem = new JButton("Buscar Hospedagem");
  private static JButton botaoVisualizarHospedagem = new JButton("Visualizar Hospedagem");
  private static JButton botaoEditarHospedagem = new JButton("Editar Hospedagem");
  private static JButton botaoDeletarHospedagem = new JButton("Deletar Hospedagem");
  private static JButton botaoVoltar = new JButton("Voltar");
  private JLabel mensagemInicial;

  public VisualHospedagem() {

    // Criando e adicionando a mensagem inicial da tela de Menu.
    mensagemInicial.setText("Bem vindo ao servico de hospedagem de pets, escolha o que quer fazer:");

    // coloca a mensagem inicial no centro da interface
    mensagemInicial.setHorizontalTextPosition(JLabel.CENTER);
    mensagemInicial.setVerticalTextPosition(JLabel.TOP);

    // mudando o estilo da fonte
    mensagemInicial.setFont(new Font("Bebas Neue", Font.PLAIN, 20));

    telaHospedagem.setTitle("Hospedagem");
    telaHospedagem.setSize(500, 500);
    telaHospedagem.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
    telaHospedagem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    telaHospedagem.setVisible(true);
    telaHospedagem.add(mensagemInicial);// Adiciona a label(rotulo) a interface.

    // adicionando os botoes a interface
    telaHospedagem.add(botaoCadastrarAnfitriao);
    telaHospedagem.add(botaoHospedarAnimal);
    telaHospedagem.add(botaoCadastrarHospedagem);
    telaHospedagem.add(botaoBuscarHospedagem);
    telaHospedagem.add(botaoVisualizarHospedagem);
    telaHospedagem.add(botaoEditarHospedagem);
    telaHospedagem.add(botaoDeletarHospedagem);
    telaHospedagem.add(botaoVoltar);

  }

  public static void main(String[] args) {
    VisualHospedagem menu = new VisualHospedagem();

    // criando a recepcao de comando dos botoes
    botaoCadastrarAnfitriao.addActionListener(menu);
    botaoHospedarAnimal.addActionListener(menu);
    botaoCadastrarHospedagem.addActionListener(menu);
    botaoBuscarHospedagem.addActionListener(menu);
    botaoVisualizarHospedagem.addActionListener(menu);
    botaoEditarHospedagem.addActionListener(menu);
    botaoDeletarHospedagem.addActionListener(menu);
    botaoVoltar.addActionListener(menu);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object receptor = e.getSource();
    if (receptor == botaoCadastrarAnfitriao) {

    } else if (receptor == botaoHospedarAnimal) {

    } else if (receptor == botaoCadastrarHospedagem) {

    } else if (receptor == botaoBuscarHospedagem) {

    } else if (receptor == botaoVisualizarHospedagem) {

    } else if (receptor == botaoEditarHospedagem) {

    } else if (receptor == botaoDeletarHospedagem) {

    } else if (receptor == botaoVoltar) {

    }
  }
}
