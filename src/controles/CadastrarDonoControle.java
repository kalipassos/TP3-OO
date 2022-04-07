package controles;

import javax.swing.JButton;

import data.Dados;
import modelos.Dono;
import visualizacao.CadastrarDonoVisual;
import visualizacao.DonoVisual;
import visualizacao.MenuVisual;

public class CadastrarDonoControle {

    private final CadastrarDonoVisual visualizacao;

    public CadastrarDonoControle(CadastrarDonoVisual visualizacao) {
        this.visualizacao = visualizacao;

    }

    public void executaCadastroD(JButton botaoSelecionado) {
        if (botaoSelecionado.equals(visualizacao.getBotaoCadastrar())) {
            new DonoVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoCancelar())) {
            new DonoVisual().setVisible(true);
            visualizacao.dispose();
        }
    }

    public void cadastroDono(JButton botaoSelecionado) {
        if (botaoSelecionado.equals(visualizacao.getBotaoCadastrar())) {
            Dono ParaCadastrar = criaDono();

            if (ParaCadastrar != null) {
                Dados.getDono().add(ParaCadastrar);
                visualizacao.dispose();
            }
        } else {
            visualizacao.getTextoNome().setText(null);
            visualizacao.getTextoEndereco().setText(null);
            visualizacao.getTextoTelefone().setText(null);
            visualizacao.getTextoCPF().setText(null);
            visualizacao.dispose();

        }
    }

    public Dono criaDono() {
        Dono dono = new Dono();
        String nome, endereco, telefone, CPF;

        nome = visualizacao.getTextoNome().getText();
        dono.setNome(nome);

        CPF = visualizacao.getTextoCPF().getText();
        dono.setCPF(CPF);

        endereco = visualizacao.getTextoEndereco().getText();
        dono.setEndereco(endereco);

        telefone = visualizacao.getTextoTelefone().getText();
        dono.setTelefone(telefone);

        return dono;
    }
}
