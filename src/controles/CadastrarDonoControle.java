package controles;

import javax.swing.JButton;

import data.Dados;
import modelos.Dono;
import visualizacao.CadastrarDonoVisual;

public class CadastrarDonoControle {

    private final CadastrarDonoVisual visualizacao;

    public CadastrarDonoControle(CadastrarDonoVisual visualizacao) {
        this.visualizacao = visualizacao;

    }

    public void executaBotao(JButton botaoSelecionado) {
        if (botaoSelecionado.equals(visualizacao.getBotaoCadastrar())) {
            new CadastrarDonoVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoCancelar())) {
            visualizacao.dispose();
        }
    }

    public void cadastroDono(JButton botaoSelecionado) {
        if (botaoSelecionado.equals(visualizacao.getBotaoCadastrar())) {
            Dono ParaCadastrar = criaDono();

            if (ParaCadastrar != null) {
                Dados.getDono().add(ParaCadastrar);
            }
        } else {
            visualizacao.getTextoNome().setText(null);
            visualizacao.getTextoEndereco().setText(null);
            visualizacao.getTextoTelefone().setText(null);
            visualizacao.getTextoCPF().setText(null);

        }
    }

    public Dono criaDono() {
        Dono dono = new Dono();
        String nome, endereco, telefone, CPF;

        nome = dono.getNome().getTextoNome();
        dono.setNome(nome);

        CPF = dono.getCPF().getText();
        dono.setCPF(CPF);
    }
}
