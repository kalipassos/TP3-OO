package controles;

import javax.swing.JButton;

import visualizacao.*;

public class VisualizaDonoControle {
    private final VisualizaDonoVisual visualizacao;

    public VisualizaDonoControle(VisualizaDonoVisual visualizacao) {
        super();
        this.visualizacao = visualizacao;
    }

    public void executaVisualD(JButton botaoSelecionado) {
        if (botaoSelecionado.equals(visualizacao.getBotaoReiniciar())) {
            new VisualizaDonoVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoDeletar())) {
            new DeletaDonoVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoEditar())) {
            new EditarDonoVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoVoltar())) {
            new DonoVisual().setVisible(true);
            visualizacao.dispose();
        }
    }

}
