package controles;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import data.Dados;
import modelos.Anfitriao;
import visualizacao.AnfitriaoVisual;
import visualizacao.EditarAnfitriaoVisual;

public class EditarAnfitriaoControle {

    private final EditarAnfitriaoVisual visualizacao;

    public EditarAnfitriaoControle(EditarAnfitriaoVisual visualizacao) {
        super();
        this.visualizacao = visualizacao;
    }

    // coloca os anfitrioes na combobox
    public DefaultComboBoxModel<String> getAnfitriao(String nomeAnfitriao) {
        Anfitriao anfitriaoEscolhido = null;

        for (Anfitriao anfitriao : Dados.getAnfitriao()) {
            if (anfitriao.getNome().equals(nomeAnfitriao)) {
                anfitriaoEscolhido = anfitriao;
            }
        }
        if (anfitriaoEscolhido == null) {
            return null;
        }

        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();
        for (int i = 0; i < anfitriaoEscolhido.getHospedagem().size(); i++) {
            modelo.addElement(anfitriaoEscolhido.getHospedagem().get(i).getDataEntrada());
        }
        return modelo;
    }

    public void listaHospedagem() {
        visualizacao.getListaHospedagem()
                .setModel(getAnfitriao(visualizacao.getSelecionaAnfitriao().getSelectedItem().toString()));
    }

    public DefaultComboBoxModel<String> getAnfitriao() {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();
        for (Anfitriao anfitriao : Dados.getAnfitriao()) {
            modelo.addElement(anfitriao.getNome());
        }
        return modelo;
    }

    public void executarBotao(Object source) {
        if (source == visualizacao.getSelecionaAnfitriao()) {
            setField(visualizacao.getTextoNome(),
                    getAnfitriaoObj(visualizacao.getSelecionaAnfitriao().getSelectedIndex()).getNome());
            setField(visualizacao.getTextoEndereco(),
                    getAnfitriaoObj(visualizacao.getSelecionaAnfitriao().getSelectedIndex()).getEndereco());
            setField(visualizacao.getTextoTelefone(),
                    getAnfitriaoObj(visualizacao.getSelecionaAnfitriao().getSelectedIndex()).getCPF());
            listaHospedagem();

        } else if (source == visualizacao.getBotaoAlterar()) {
            alterarAnfitriao();
            visualizacao.dispose();
        } else if (source == visualizacao.getBotaoReverter()) {
            new AnfitriaoVisual().setVisible(true);
            visualizacao.dispose();
        }
    }

    private void alterarAnfitriao() {
        Anfitriao anfitriao = getAnfitriaoObj(visualizacao.getSelecionaAnfitriao().getSelectedIndex());
        if (visualizacao.getTextoNome().getText() != null) {
            anfitriao.setNome(visualizacao.getTextoNome().getText());
        } else if (visualizacao.getTextoEndereco().getText() != null) {
            anfitriao.setEndereco(visualizacao.getTextoEndereco().getText());
        } else if (visualizacao.getTextoTelefone().getText() != null) {
            anfitriao.setCPF(visualizacao.getTextoTelefone().getText());

        }
    }

    public static Anfitriao getAnfitriaoObj(int index) {
        return Dados.getAnfitriao().get(index);
    }

    public static void setField(JTextField field, String parametro) {
        field.setText(parametro);

    }

}
