package controles;

import javax.swing.JButton;

import data.Dados;
import modelos.Hospedagem;
import visualizacao.CadastrarHospedagemVisual;

public class CadastrarHospedagemControle {
    private final CadastrarHospedagemVisual visualizacao;

    public CadastrarHospedagemControle(CadastrarHospedagemVisual visualizacao) {
        super();
        this.visualizacao = visualizacao;
    }

    public void cadastroHospedagem(JButton botaoSelecionado) {

        if (botaoSelecionado.equals(visualizacao.getBotaoCadastrar())) {
          Hospedagem ParaCadastrar = criaHospedagem();
    
          if (ParaCadastrar != null) {
            Dados.getHospedagem().add(ParaCadastrar);
          }
        } else {
          visualizacao.getDataEntrada().setText(null);
          visualizacao.getDataSaida().setText(null);
          visualizacao.getTextoTelefone().setText(null);
          visualizacao.getTextoCPF().setText(null);
    
        }
      }
    
      private Hospedagem criaHospedagem() {
        Hospedagem Hospedagem = new Hospedagem();
        String nome, endereco, telefone, CPF;
    
        nome = visualizacao.getTextoNome().getText();
        Hospedagem.setNome(nome);
    
        CPF = visualizacao.getTextoCPF().getText();
        Hospedagem.setCPF(CPF);
    
        endereco = visualizacao.getTextoEndereco().getText();
        Hospedagem.setEndereco(endereco);
    
        telefone = visualizacao.getTextoTelefone().getText();
        Hospedagem.setTelefone(telefone);
    
        return Hospedagem;
      }
    
    }
    
}