package controles;

import javax.swing.DefaultComboBoxModel;

import data.Dados;
import modelos.Animal;
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
        Dono donoEscolhido = Dados.getDonoPeloNome(nomeDono);

        if (donoEscolhido == null) {
            return null;
        }

        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();
        for (Animal animal : donoEscolhido.getAnimais()) {
            modelo.addElement(animal.getNome());
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
        for (Dono dono : Dados.getDonos()) {
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
        Dados.getDonos().remove(donoSelecionado);
        atualizarListaDonos();
    }
}
