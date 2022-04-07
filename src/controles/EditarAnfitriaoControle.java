package controles;

import javax.swing.JButton;

import data.Dados;
import visualizacao.EditarAnfitriaoVisual;

public class EditarAnfitriaoControle {

    private final EditarAnfitriaoVisual visualizacao;

    public EditarAnfitriaoControle(EditarAnfitriaoVisual visualizacao) {
        super();
        this.visualizacao = visualizacao;
    }

    public void executarBotao(JButton botaoSelecionado) {
        if (visualizacao.getSelecionaAnfitriao() != null) {
            for (int i = 0; i < Dados.getAnfitriao().size(); i++) {
                if (Dados.getAnfitriao().get(i).getNome().equals(visualizacao.getSelecionaAnfitriao())) {
                    visualizacao.getTextoNome().setText(Dados.getAnfitriao().get(i).getNome());
                    visualizacao.getTextoTelefone().setText(Dados.getAnfitriao().get(i).getTelefone());
                    visualizacao.getTextoEndereco().setText(Dados.getAnfitriao().get(i).getEndereco());

                }
            }

        }

    }

}
