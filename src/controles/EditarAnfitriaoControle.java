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
            for (int i = 0; i < Dados.getAnfitrioes().size(); i++) {
                if (Dados.getAnfitrioes().get(i).getNome().equals(visualizacao.getSelecionaAnfitriao())) {
                    visualizacao.getTextoNome().setText(Dados.getAnfitrioes().get(i).getNome());
                    visualizacao.getTextoTelefone().setText(Dados.getAnfitrioes().get(i).getTelefone());
                    visualizacao.getTextoEndereco().setText(Dados.getAnfitrioes().get(i).getEndereco());
                }
            }
        }
    }

}
