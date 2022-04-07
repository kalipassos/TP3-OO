package controles;

import javax.swing.JButton;

import visualizacao.BuscaHospedagemVisual;
import visualizacao.CadastrarHospedagemVisual;
import visualizacao.DeletaHospedagemVisual;
import visualizacao.EditarHospedagemVisual;
import visualizacao.HospedagemVisual;
import visualizacao.MenuVisual;
import visualizacao.VisualizaHospedagemVisual;

public class HospedagemControle {
    private final HospedagemVisual visualizacao;

    public HospedagemControle(HospedagemVisual visualizacao) {
        super();
        this.visualizacao = visualizacao;
    }

    public void executaBotao(JButton botaoSelecionado) {
        if (botaoSelecionado.equals(visualizacao.getBotaoCadastroHospedagem())) {
            new CadastrarHospedagemVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoBuscarHospedagem())) {
            new BuscaHospedagemVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoVisualizarHospedagem())) {
            new VisualizaHospedagemVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoEditarHospedagem())) {
            new EditarHospedagemVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoDeletarHospedagem())) {
            new DeletaHospedagemVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoVoltar())) {
            new MenuVisual().setVisible(true);
            visualizacao.dispose();
        }
    }
}
