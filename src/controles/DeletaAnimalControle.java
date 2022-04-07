package controles;

import javax.swing.DefaultComboBoxModel;

import data.Dados;
import modelos.Dono;
import visualizacao.AnimalVisual;
import visualizacao.DeletaAnimalVisual;

public class DeletaAnimalControle {

    private final DeletaAnimalVisual visualizacao;

    public DeletaAnimalControle(DeletaAnimalVisual visualizacao) {
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
        for (int i = 0; i < donoEscolhido.getAnimais().size(); i++) {
            modelo.addElement(donoEscolhido.getAnimais().get(i).getNome());
        }
        return modelo;
    }

    public void atualizarListaAnimais() {
        visualizacao.getSelecionaAnimal()
                .setModel(getAnimais(visualizacao.getSelecionaDono().getSelectedItem().toString()));
    }

    public DefaultComboBoxModel<String> getDono() {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();
        for (Dono dono : Dados.getDono()) {
            modelo.addElement(dono.getNome());
        }
        return modelo;
    }

    public void executarBotao(Object source) {
        if (source == visualizacao.getSelecionaDono()) {
            atualizarListaAnimais();
        } else if (source == visualizacao.getBotaoSim()) {
            deletarAnimal(visualizacao.getSelecionaAnimal().getSelectedIndex(),
                    visualizacao.getSelecionaDono().getSelectedIndex());
        } else if (source == visualizacao.getBotaoNao()) {
            new AnimalVisual().setVisible(true);
            visualizacao.dispose();
        }

    }

    private void deletarAnimal(int animalSelecionado, int donoSelecionado) {
        Dono donoEscolhido = Dados.getDono().get(donoSelecionado);
        donoEscolhido.getAnimais().remove(animalSelecionado);
        atualizarListaAnimais();
    }
}
