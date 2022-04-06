package controles;

import javax.swing.JButton;

import visualizacao.*;

public class AnfitriaoControle {
    private final AnfitriaoVisual visualizacao;

    public AnfitriaoControle(AnfitriaoVisual visualizacao) {
        this.visualizacao = visualizacao;
    }

    public void executaBotao(JButton botaoSelecionado) {
        if (botaoSelecionado.equals(visualizacao.getBotaoCadastrarAnfitriao())) {
            new CadastrarAnfitriaoVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoBuscarAnfitriao())) {
            new BuscaAnfitriaoVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoVisualizarAnfitriao())) {
            new VisualizaAnfitriaoVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoEditarAnfitriao())) {
            new EditarAnfitriaoVisual().setVisible(true);
        } else if (botaoSelecionado.equals(visualizacao.getBotaoVoltar())) {
            visualizacao.dispose();
        }
    }

}
