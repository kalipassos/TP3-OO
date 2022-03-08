package hospedagens;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import dados.Dados;
import model.Anfitriao;
import model.Animal;
import model.Dono;
import model.Hospedagem;
import model.Pagamento;
import model.Pessoa;
import util.Scan;

public class Menu {
        private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

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