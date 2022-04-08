package controles;

import data.Dados;
import modelos.Anfitriao;
import visualizacao.AnfitriaoVisual;
import visualizacao.CadastrarAnfitriaoVisual;

public class CadastrarAnfitriaoControle {

  private final CadastrarAnfitriaoVisual visualizacao;

  public CadastrarAnfitriaoControle(CadastrarAnfitriaoVisual visualizacao) {
    super();
    this.visualizacao = visualizacao;
  }

  public void executaCadastroD(Object source) {
    if (source == visualizacao.getBotaoCadastrar()) {
      Anfitriao anfitriao = new Anfitriao();
      anfitriao.setNome(visualizacao.getTextoNome().getText());
      anfitriao.setEndereco(visualizacao.getTextoEndereco().getText());
      anfitriao.setTelefone(visualizacao.getTextoTelefone().getText());
      anfitriao.setCPF(visualizacao.getTextoCPF().getText());
      Dados.getAnfitriao().add(anfitriao);
      visualizacao.dispose();
      if (visualizacao.getTextoNome().getText().equals("") || visualizacao.getTextoEndereco().getText().equals("")
          || visualizacao.getTextoTelefone().getText().equals("") || visualizacao.getTextoCPF().getText().equals("")) {
        visualizacao.getMensagemInicial().setText("Preencha os campos");

      } else if (source == visualizacao.getBotaoCadastrar()) {
        new AnfitriaoVisual().setVisible(true);
        visualizacao.dispose();
      }

    }
  }
}
