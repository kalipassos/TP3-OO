package controles;

import data.Dados;
import modelos.Anfitriao;
import modelos.Animal;
import modelos.Dono;
import modelos.Hospedagem;
import modelos.Pagamento;
import util.Scan;

public class HospedagemControle {

    public void cadastraHospedagem() {
        String dataEntrada, dataSaida, adicionalHospedagem;
        Animal animal;
        Pagamento pagamento;
        double valorPagamento;
        System.out.println("Se identifique como dono, digite seu nome:");
        var nomeDono = Scan.nextLine();
        for (Dono dono : Dados.getDono()) {
            if (dono.getNome().equals(nomeDono)) {
                System.out.println(dono + " tem em seu cadastro: " + dono.getAnimais()
                        + "\n Digite o nome do animal que deseja hospedar:");
                animal = Scan.nextLine();
                System.out.println("Anfitrioes disponiveis para hospedar o animal:");
                for (Anfitriao anfitriao : Dados.getAnfitriao()) {
                    System.out.println(anfitriao);
                }
                System.out.println("Digite o nome do anfitriao:");
                var anf = Scan.nextLine();
                for (Anfitriao anfitriao : Dados.getAnfitriao()) {
                    if (anfitriao.getNome().equals(anf)) {
                        System.out.println("Digite a data de entrada:");
                        dataEntrada = Scan.nextLine();
                        System.out.println("Digite a data de saida:");
                        dataSaida = Scan.nextLine();
                        System.out.println("Digite uma informacao sobre o animal:");
                        adicionalHospedagem = Scan.nextLine();
                        System.out.println("Digite o valor do pagamento:");
                        pagamento = Scan.nextLine();
                        System.out.println("O pagamento foi efetuado? (sim/nao)");
                        if (Scan.nextLine().equals("sim")) {

                            for (Anfitriao anfi : Dados.getAnfitriao()) {
                                anfi.getHospedagem()
                                        .add(new Hospedagem(dataEntrada, dataSaida, adicionalHospedagem, pagamento,
                                                animal)); // adicao do animal cadastrando na lista do dono referente
                                Dados.getAnfitriao().add(anfitriao); // adicao do dono na lista de donos
                                anfi.getHospedagem().add(
                                        new Hospedagem(dataEntrada, dataSaida, adicionalHospedagem, pagamento, animal)); // adicao
                                                                                                                         // do
                                                                                                                         // animal
                                                                                                                         // na
                                                                                                                         // lista
                                                                                                                         // de
                                                                                                                         // animais

                                System.out.println("Pago. Hospedagem cadastrada com sucesso!");

                                System.out.println(
                                        dono + " hospedou o animal " + animal + " no anfitriao " + anfitriao + ".");
                                System.out.println("Data de entrada: " + dataEntrada);
                            }
                        } else {
                            System.out.println(
                                    "A hospedagem precisa ser paga para ser confirmada. Retorne ao pagamento.");

                        }

                    } else {
                        System.out.println("Não encontramos o dono " + nomeDono);
                    }
                }

            }

        }

    }

}
