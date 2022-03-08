package hospedagens;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import data.Dados;
import model.Anfitriao;
import model.Animal;
import model.Dono;
import model.Hospedagem;
import model.Pagamento;
////import model.Pessoa;
import util.Scan;
import controllers.DonoController;

public class Menu {
        private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        private final DonoController donoController = new DonoController();

        public void menu() {
                int opcao;
                do {
                        System.out.println("Escolha a opcao que deseja executar:");
                        System.out.println("1-Opcoes Dono:");
                        System.out.println("2-Opcoes Anfitriao:");
                        System.out.println("3-Opcoes Animal:");
                        System.out.println("4-Opcoes Hospedagem:");
                        System.out.println("5-Sair:");
                        opcao = Scan.nextInt();
                        switch (opcao) {
                                case 1:

                                        opcaoDono();
                                        break;
                                case 2:

                                        // opcaoAnfitriao;
                                        break;
                                case 3:

                                        // opcaoAnimal;
                                        break;
                                case 4:

                                        // opcaoHospedagem();
                                        break;
                                case 5:

                                        System.out.println("Saindo...");

                                        break;
                                default:
                                        System.out.println(
                                                        "Numero invalido para uma opcao, escolha algum que leve a uma existente.");
                                        break;
                        }
                } while (opcao != 5);
        }

        public void opcaoDono() {
                int opcaoDono;
                do {
                        System.out.println("Opcoes para Dono sao:");
                        System.out.println("1-Cadastrar Dono:");
                        System.out.println("2-Visualizar Dono:");
                        System.out.println("3-Editar Dono:");
                        System.out.println("4-Deletar Dono:");
                        System.out.println("5-Escolher outra opcao...");
                        opcaoDono = Scan.nextInt();
                        switch (opcaoDono) {
                                case 1:
                                        donoController.cadastrarDono();
                                        break;
                                case 2:
                                        // visualizarDono();
                                        break;
                                case 3:
                                        // editarDono();
                                        break;
                                case 4:
                                        // deletarDono();
                                        break;
                                case 5:

                                        break;
                                default:
                                        System.out.println(
                                                        "Numero invalido para uma opcao, escolha algum que leve a uma existente.");
                                        break;
                        }
                } while (opcaoDono != 5);
        }

        public void opcaoAnfitriao() {
                int opcaoAnfitriao;
                do {
                        System.out.println("Opcoes para Anfitriao sao:");
                        System.out.println("1-Cadastrar Anfitriao:");
                        System.out.println("2-Visualizar Anfitriao:");
                        System.out.println("3-Editar Anfitriao:");
                        System.out.println("4-Deletar Anfitriao:");
                        System.out.println("5-Escolher outra opcao...");
                        opcaoAnfitriao = Scan.nextInt();
                        switch (opcaoAnfitriao) {
                                case 1:
                                        // cadastrarAnfitriao();
                                        break;
                                case 2:
                                        // visualizarAnfitriao();
                                        break;
                                case 3:
                                        // editarAnfitriao();
                                        break;
                                case 4:
                                        // deletarAnfitriao();
                                        break;
                                case 5:

                                        break;
                                default:
                                        System.out.println(
                                                        "Numero invalido para uma opcao, escolha algum que leve a uma existente.");
                                        break;
                        }
                } while (opcaoAnfitriao != 5);
        }

        public void opcaoAnimal() {
                int opcaoAnimal;

                do {
                        System.out.println("Opcoes para Animal:");
                        System.out.println("1-Cadastrar Animal:");
                        System.out.println("2-Visualizar Animal:");
                        System.out.println("3-Editar Animal:");
                        System.out.println("4-Deletar Animal:");
                        System.out.println("5-Escolher outra opcao...");
                        opcaoAnimal = Scan.nextInt();
                        switch (opcaoAnimal) {
                                case 1:
                                        // cadastrarAnimal;
                                        break;
                                case 2:
                                        // visualizarAnimal;
                                        break;
                                case 3:
                                        // editarAnimal;
                                        break;
                                case 4:
                                        // deletarAnimal;
                                        break;
                                case 5:

                                        break;
                                default:
                                        System.out.println(
                                                        "Numero invalido para uma opcao, escolha algum que leve a uma existente.");
                                        break;
                        }
                } while (opcaoAnimal != 5);
        }

        public void opcaoHospedagem() {
                int opcaoHospedagem;

                do {
                        System.out.println("Opcoes para Hospedagem:");
                        System.out.println("1-Cadastrar Hospedagem:");
                        System.out.println("2-Visualizar Hospedagem:");
                        System.out.println("3-Editar Hospedagem:");
                        System.out.println("4-Deletar Hospedagem:");
                        System.out.println("5-Escolher outra opcao...");
                        opcaoHospedagem = Scan.nextInt();
                        switch (opcaoHospedagem) {
                                case 1:
                                        // cadastrarHospedagem;
                                        break;
                                case 2:
                                        // visualizarHospedagem;
                                        break;
                                case 3:
                                        // editarHospedagem;
                                        break;
                                case 4:
                                        // deletarHospedagem;
                                        break;
                                case 5:

                                        break;
                                default:
                                        System.out.println(
                                                        "Numero invalido para uma opcao, escolha algum que leve a uma existente.");
                                        break;
                        }
                } while (opcaoHospedagem != 5);
        }

        public void inicio() throws ParseException {
                // var string = Scan.nextLine();

                var dono = new Dono("Zezinho", "Rua dos animais, 123", "123456789", "123.456.789-00");
                dono.getAnimais()
                                .add(new Animal("Bolinha", "Cachorro", "Bolinha é um cachorro muito fofo", "Pequeno", 3,
                                                "M", "Nada"));

                dono.getAnimais()
                                .add(new Animal("Zeca", "Gato", "Zeca é um gato muito fofo", "Grande", 3, "M",
                                                "Banho e tosa"));
                Dados.getDono().add(dono);

                dono = new Dono("Paula", "rua hohoho", "124653532", "444632524-23");
                dono.getAnimais()
                                .add(new Animal("Bibizinha", "Cachorro", "Bibizinha e gentil", "M", 3,
                                                "F", "Nada"));

                var anfitriao = new Anfitriao("Ana", "Rua dos bobos", "123456789", "124.456.789-00",
                                new Hospedagem(this.sdf.parse("01/01/2020"), this.sdf.parse("01/02/2020"),
                                                "Banho e tosa",
                                                new Pagamento("dinheiro", 245.23), dono.getAnimais().get(0)));

                Dados.getAnfitriao().add(anfitriao);
                System.out.println(dono);

        }

        public void buscaDono() {
                System.out.println("Digite o nome do Dono que quer buscar");
                var nomeDono = Scan.nextLine();

                if (Dados.getDono().get(0).getNome().equals(nomeDono)) {
                        System.out.println("O Dono " + nomeDono + " e o nome de seus animais são: "
                                        + Dados.getDono().get(0).getAnimais());
                } else {
                        System.out.println("Não encontramos o dono " + nomeDono);
                }

                System.out.println("Digite o CPF do Dono que quer buscar");
                var cpfDono = Scan.nextLine();
                if (Dados.getDono().get(0).getCPF().equals(cpfDono)) {
                        System.out.println(
                                        "O Dono" + nomeDono + "de cPF" + cpfDono + "e o nome de seus animais são: "
                                                        + Dados.getDono().get(0).getAnimais());
                } else {
                        System.out.println("Não encontramos o dono " + nomeDono);
                }
        }
}