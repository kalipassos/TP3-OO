package controles;

import javax.swing.JButton;

import visualizacao.AnfitriaoVisual;
import visualizacao.CadastrarAnfitriaoVisual;

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
            new CadastrarAnfitriaoVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoVisualizarAnfitriao())) {
            new CadastrarAnfitriaoVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoEditarAnfitriao())) {
            new CadastrarAnfitriaoVisual().setVisible(true);
        } else if (botaoSelecionado.equals(visualizacao.getBotaoVoltar())) {
            visualizacao.dispose();
        }
    }

}
