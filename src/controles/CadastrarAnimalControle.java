package controles;

import javax.swing.JButton;

import data.Dados;
import modelos.Animal;
import visualizacao.AnimalVisual;
import visualizacao.CadastrarAnimalVisual;

public class CadastrarAnimalControle {
    private final CadastrarAnimalVisual visualizacao;

    public CadastrarAnimalControle(CadastrarAnimalVisual visualizacao) {
        this.visualizacao = visualizacao;
    }

    public void executaBotao(JButton botaoSelecionado) {
        if (botaoSelecionado.equals(visualizacao.getBotaoCadastrar())) {
            new CadastrarAnimalVisual().setVisible(true);
            visualizacao.dispose();
        } else if (botaoSelecionado.equals(visualizacao.getBotaoCancelar())) {
            new AnimalVisual().setVisible(true);
            visualizacao.dispose();
        }
    }

    public void cadastroAnimal(JButton botaoSelecionado) {
        if (botaoSelecionado.equals(visualizacao.getBotaoCadastrar())) {
            Animal ParaCadastrar = criaAnimal();

            if (ParaCadastrar != null) {
                Dados.getDonos().get(0).getAnimais().add(ParaCadastrar);
            }
        } else {
            visualizacao.getSelecionaDono().setToolTipText(null);
            visualizacao.getCadastrarNome().setText(null);
            visualizacao.getCadastrarPorte().setText(null);
            visualizacao.getBotaoMasculino().setSelected(false);
            visualizacao.getBotaoFeminino().setSelected(false);
            visualizacao.getCadastrarIdade().setText(null);
            visualizacao.getCadastrarEspecie().setText(null);
            visualizacao.getTextoCuidados().setText(null);

        }
    }

    public Animal criaAnimal() {
        Animal animal = new Animal();
        String nome, porte, especie, cuidados, idade, sexo;

        nome = visualizacao.getCadastrarNome().getText();
        animal.setNome(nome);

        porte = visualizacao.getCadastrarPorte().getText();
        animal.setPorte(porte);

        idade = visualizacao.getCadastrarIdade().getText();
        try {
            animal.setIdade(Integer.parseInt(idade));
        } catch (NumberFormatException error) {
            return null;
        }

        especie = visualizacao.getCadastrarEspecie().getText();
        animal.setEspecie(especie);

        cuidados = visualizacao.getTextoCuidados().getText();
        animal.setCuidados(cuidados);

        if (visualizacao.getBotaoMasculino().isSelected()) {
            sexo = "Masculino";
        } else if (visualizacao.getBotaoFeminino().isSelected()) {
            sexo = "Feminino";
        } else {
            return null;
        }
        animal.setSexo(sexo);

        return animal;
    }
}