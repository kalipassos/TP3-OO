package controllers;

import model.Dono;
import data.Dados;
import util.Scan; //* classe criada com base na usual Scanner, afim de evitar ter de colocar .nextLine() toda vez após uma leitura(evitar buffer).

public class DonoController {

  public void cadastrarDono() {
    String nome, endereco, telefone, CPF;

    System.out.println("Nome:");
    nome = Scan.nextLine();

    System.out.println("Endereco:");
    endereco = Scan.nextLine();

    System.out.println("Telefone:");
    telefone = Scan.nextLine();

    System.out.println("CPF:");
    CPF = Scan.nextLine();

    Dono dono = new Dono(nome, endereco, telefone, CPF);
    Dados.getDono().add(dono);

  }

  /*
   * public void visualizarDonoNome() {
   * String nomePesquisado;
   * System.out.println("Nome a ser pesquisado:");
   * nomePesquisado = Scan.nextLine();
   * 
   * for()
   * 
   * }
   */

}
