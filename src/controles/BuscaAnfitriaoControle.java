package controles;

import javax.swing.JButton;

import data.Dados;
import modelos.Anfitriao;
import visualizacao.BuscaAnfitriaoVisual;

public class BuscaAnfitriaoControle {
    private final BuscaAnfitriaoVisual visualizacao;

    public BuscaAnfitriaoControle(BuscaAnfitriaoVisual visualizacao) {
        super();
        this.visualizacao = visualizacao;
    }

    public void buscador(JButton botaoSelecionado) {
        for (Anfitriao anft : Dados.getAnfitriao()) {
            if (anft.getNome().equals(visualizacao.getTextoNomeAnfitriaogetTextoNomeAnfitriao().getText())) {

            }
        }

    }
}
