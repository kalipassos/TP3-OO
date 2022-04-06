package controles;

import javax.swing.JButton;

import data.Dados;
import modelos.Animal;
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
            visualizacao.dispose();
        }
    }

    public void cadastroAnimal(JButton botaoSelecionado) {
        if (botaoSelecionado.equals(visualizacao.getBotaoCadastrar())) {
            Animal ParaCadastrar = criaAnimal();

            if (ParaCadastrar != null) {
                Dados.getAnimal().add(ParaCadastrar);
            }
        } else {
            visualizacao.getSelecionaDono().setToolTipText(null);
            visualizacao.getCadastrarNome().setText(null);
            visualizacao.getCadastrarPorte().setText(null);
            // visualizacao.getCadastrarSexo().setText(null); botao feminino e masculino
            visualizacao.getTextoBiografia().setText(null);
            visualizacao.getCadastrarIdade().setText(null);
            visualizacao.getCadastrarEspecie().setText(null);
            visualizacao.getTextoCuidados().setText(null);

        }
    }

    public Animal criaAnimal() {
        Animal Animal = new Animal();
        String nome, porte, biografia, especie, cuidados, idade;

        nome = visualizacao.getCadastrarNome().getText();
        Animal.setNome(nome);

        porte = visualizacao.getCadastrarPorte().getText();
        Animal.setPorte(porte);

        biografia = visualizacao.getTextoBiografia().getText();
        Animal.setBiografia(biografia);

        idade = visualizacao.getCadastrarIdade().getText();
        Animal.setIdade(idade);

        especie = visualizacao.getCadastrarEspecie().getText();
        Animal.setEspecie(especie);

        cuidados = visualizacao.getTextoCuidados().getText();
        Animal.setCuidados(cuidados);

        return Animal;
    }
}