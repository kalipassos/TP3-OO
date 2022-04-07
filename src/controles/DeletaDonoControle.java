package controles;

import javax.swing.DefaultComboBoxModel;

import data.Dados;
import modelos.Dono;
import visualizacao.DeletaDonoVisual;
import visualizacao.DonoVisual;

public class DeletaDonoControle {

    private final DeletaDonoVisual visualizacao;

    public DeletaDonoControle(DeletaDonoVisual visualizacao) {
        super();
        this.visualizacao = visualizacao;
    }

    public DefaultComboBoxModel<String> getAnimais(String nomeDono) {
        Dono donoEscolhido = null;

        for (Dono dono : Dados.getDono()) {
            if (dono.getNome().equals(nomeDono)) {
                donoEscolhido = dono;
            }
        }

        if (donoEscolhido == null) {
            return null;
        }

        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();
        for (int i = 0; i < donoEscolhido.size(); i++) {
            modelo.addElement(donoEscolhido.get(i).getNome());
        }
        return modelo;
    }

    public void atualizarListaAnimais() {
        visualizacao.getSelecionaAnimal()
                .setModel(getAnimais(visualizacao.getSelecaoDono().getSelectedItem().toString()));
    }

    public void atualizarListaDonos() {
        visualizacao.getSelecaoDono()
                .setModel(getDono());
    }

    public DefaultComboBoxModel<String> getDono() {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();
        for (Dono dono : Dados.getDono()) {
            modelo.addElement(dono.getNome());
        }
        return modelo;
    }

    public void executarBotao(Object source) {
        if (source == visualizacao.getSelecaoDono()) {
            atualizarListaAnimais();
            atualizarListaDonos();
        } else if (source == visualizacao.getBotaoSim()) {
            deletarDono(visualizacao.getSelecaoDono().getSelectedIndex());
        } else if (source == visualizacao.getBotaoNao()) {
            new DonoVisual().setVisible(true);
            visualizacao.dispose();
        }

    }

    private void deletarDono(int donoSelecionado) {
        Dados.getDono().remove(donoSelecionado);
    }
}
