package controles;

import javax.swing.DefaultComboBoxModel;

import data.Dados;
import modelos.Dono;
import visualizacao.AnimalVisual;
import visualizacao.DeletaAnimalVisual;

public class DeletaAnimalControle {

    private final DeletaAnimalVisual visualizacao;

    /**
     * Pega a Inte
     * face
     * 
     * @param visualizacao
     */
    public DeletaAnimalControle(DeletaAnimalVisual visualizacao) {
        super();
        this.visualizacao = visualizacao;
    }

    /**
     * Pega a String com o nome do animal
     * 
     * @param nomeDono
     * @return
     */
    public DefaultComboBoxModel<String> getAnimais(String nomeDono) {
        Dono donoEscolhido = null;
        /**
         * Pega o nome
         */
        for (Dono dono : Dados.getDonos()) {
            if (dono.getNome().equals(nomeDono)) {
                donoEscolhido = dono;
            }
        }
        /**
         * Retorna null se nao existir um dono
         */
        if (donoEscolhido == null) {
            return null;
        }
        /**
         * Pega todos os nomes de animal desse dono
         */
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();
        for (int i = 0; i < donoEscolhido.getAnimais().size(); i++) {
            modelo.addElement(donoEscolhido.getAnimais().get(i).getNome());
        }
        return modelo;
    }

    /**
     * Atualiza a lista de pets
     */
    public void atualizarListaAnimais() {
        visualizacao.getSelecionaAnimal()
                .setModel(getAnimais(visualizacao.getSelecionaDono().getSelectedItem().toString()));
    }

    /**
     * Coloca todos os donos existentes em uma caixa de selecao
     * 
     * @return
     */
    public DefaultComboBoxModel<String> getDono() {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();
        for (Dono dono : Dados.getDonos()) {
            modelo.addElement(dono.getNome());
        }
        return modelo;
    }

    /**
     * Pega o botao pressionado.
     * 
     * @param source
     */
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

    /**
     * Deleta o animal selecionado.
     * 
     * @param animalSelecionado
     * @param donoSelecionado
     */
    private void deletarAnimal(int animalSelecionado, int donoSelecionado) {
        Dono donoEscolhido = Dados.getDonos().get(donoSelecionado);
        donoEscolhido.getAnimais().remove(animalSelecionado);
        atualizarListaAnimais();
    }
}
