package controles;

import javax.swing.JButton;

import data.Dados;
import modelos.Dono;
import visualizacao.CadastrarDonoVisual;
import visualizacao.DonoVisual;

public class CadastrarDonoControle {

    private final CadastrarDonoVisual visualizacao;

    public CadastrarDonoControle(CadastrarDonoVisual visualizacao) {
        this.visualizacao = visualizacao;

    }

    public void executaCadastroD(Object source) {
        if (source == visualizacao.getBotaoCadastrar()) {
            Dono dono = new Dono();
            dono.setNome(visualizacao.getTextoNome().getText());
            dono.setEndereco(visualizacao.getTextoEndereco().getText());
            dono.setTelefone(visualizacao.getTextoTelefone().getText());
            dono.setCPF(visualizacao.getTextoCPF().getText());
            Dados.getDono().add(dono);
            visualizacao.dispose();
            if (visualizacao.getTextoNome().getText().equals("")) {
                visualizacao.getMensagemInicial().setText("Preencha os campos");

            } else if (source == visualizacao.getBotaoCadastrar()) {
                new DonoVisual().setVisible(true);
                visualizacao.dispose();
            }
        }

    }
}

/*
 * public void cadastroDono() {
 * if (botaoSelecionado.equals(visualizacao.getBotaoCadastrar())) {
 * Dono ParaCadastrar = criaDono();
 * 
 * if (ParaCadastrar != null) {
 * criaDono();
 * Dados.getDono().add(ParaCadastrar);
 * visualizacao.dispose();
 * }
 * } else {
 * visualizacao.getTextoNome().setText(null);
 * visualizacao.getTextoEndereco().setText(null);
 * visualizacao.getTextoTelefone().setText(null);
 * visualizacao.getTextoCPF().setText(null);
 * visualizacao.dispose();
 * 
 * }
 * }
 * 
 * public Dono criaDono() {
 * Dono dono = new Dono();
 * String nome, endereco, telefone, CPF;
 * 
 * nome = visualizacao.getTextoNome().getText();
 * dono.setNome(nome);
 * 
 * CPF = visualizacao.getTextoCPF().getText();
 * dono.setCPF(CPF);
 * 
 * endereco = visualizacao.getTextoEndereco().getText();
 * dono.setEndereco(endereco);
 * 
 * telefone = visualizacao.getTextoTelefone().getText();
 * dono.setTelefone(telefone);
 * 
 * return dono;
 * }
 * }
 */
