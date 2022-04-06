package controles;

import javax.swing.JButton;

import visualizacao.HospedagemVisual;

public class HospedagemControle {
    private final HospedagemVisual visualizacao;

    public HospedagemControle(HospedagemVisual visualizacao) {
        super();
        this.visualizacao = visualizacao;
    }

    public void executaBotao(JButton botaoSelecionado) {
        if (botaoSelecionado.equals(visualizacao.getBotaoCadastroHospedagem())) {
            new HospedagemVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoBuscarHospedagem())) {
            new HospedagemVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoVisualizarHospedagem())) {
            new HospedagemVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoEditarHospedagem())) {
            new HospedagemVisual().setVisible(true);
        } else if (botaoSelecionado.equals(visualizacao.getBotaoDeletarHospedagem())) {
            new HospedagemVisual().setVisible(true);
        } else if (botaoSelecionado.equals(visualizacao.getBotaoVoltar())) {
            visualizacao.dispose();
        }
    }
}
