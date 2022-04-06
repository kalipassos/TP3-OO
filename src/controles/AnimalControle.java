package controles;

import javax.swing.JButton;

import visualizacao.*;

public class AnimalControle {
    private final AnimalVisual visualizacao;

    public AnimalControle(AnimalVisual visualizacao) {
        super();
        this.visualizacao = visualizacao;
    }

    public void executaBotao(JButton botaoSelecionado) {
        if (botaoSelecionado.equals(visualizacao.getBotaoCadastrarAnimal())) {
            new CadastrarAnimalVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoBuscarPet())) {
            new BuscaAnimalVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoVisualizarPet())) {
            new VisualizaAnimalVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoEditarPet())) {
            new EditarAnimalVisual().setVisible(true);
        } else if (botaoSelecionado.equals(visualizacao.getBotaoVoltar())) {
            visualizacao.dispose();
        }
    }

}
