package controles;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import data.Dados;
import modelos.Dono;
import visualizacao.DonoVisual;
import visualizacao.EditarDonoVisual;

public class EditarDonoControle {

    private final EditarDonoVisual visualizacao;

    public EditarDonoControle(EditarDonoVisual visualizacao) {
        super();
        this.visualizacao = visualizacao;
    }

    // coloca os anfitrioes na combobox
    public DefaultComboBoxModel<String> getDono(String nomeDono) {
        Dono DonoEscolhido = null;

        for (Dono Dono : Dados.getDono()) {
            if (Dono.getNome().equals(nomeDono)) {
                DonoEscolhido = Dono;
            }
        }
        if (DonoEscolhido == null) {
            return null;
        }

        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();
        for (int i = 0; i < DonoEscolhido.getAnimais().size(); i++) {
            modelo.addElement(DonoEscolhido.getAnimais().get(i).getNome());
        }
        return modelo;
    }

    public DefaultComboBoxModel<String> getDono() {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();
        for (Dono Dono : Dados.getDono()) {
            modelo.addElement(Dono.getNome());
        }
        return modelo;
    }

    public void executarBotao(Object source) {
        if (source == visualizacao.getSelecionaDono()) {
            setField(visualizacao.getTextoNome(),
                    getDonoObj(visualizacao.getSelecionaDono().getSelectedIndex()).getNome());
            setField(visualizacao.getTextoEndereco(),
                    getDonoObj(visualizacao.getSelecionaDono().getSelectedIndex()).getEndereco());
            setField(visualizacao.getTextoTelefone(),
                    getDonoObj(visualizacao.getSelecionaDono().getSelectedIndex()).getTelefone());

        } else if (source == visualizacao.getBotaoAlterar()) {
            alterarDono();
            visualizacao.dispose();
        } else if (source == visualizacao.getBotaoReverter()) {
            new DonoVisual().setVisible(true);
            visualizacao.dispose();
        }
    }

    private void alterarDono() {
        Dono Dono = getDonoObj(visualizacao.getSelecionaDono().getSelectedIndex());
        if (visualizacao.getTextoNome().getText() != null) {
            Dono.setNome(visualizacao.getTextoNome().getText());
        } else if (visualizacao.getTextoEndereco().getText() != null) {
            Dono.setEndereco(visualizacao.getTextoEndereco().getText());
        } else if (visualizacao.getTextoTelefone().getText() != null) {
            Dono.setCPF(visualizacao.getTextoTelefone().getText());

        }
    }

    public static Dono getDonoObj(int index) {
        return Dados.getDono().get(index);
    }

    public static void setField(JTextField field, String parametro) {
        field.setText(parametro);

    }

}
