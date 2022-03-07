package hospedagens;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import dados.Dados;
import model.Anfitriao;
import model.Animal;
import model.Dono;
import model.Hospedagem;
import model.Pagamento;
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

                var anfitriao = new Anfitriao("Ana", "Rua dos bobos", "123456789", "123.456.789-00",
                                new Hospedagem(this.sdf.parse("01/01/2020"), this.sdf.parse("01/02/2020"),
                                                "Banho e tosa",
                                                new Pagamento("dinheiro", 245.23), dono.getAnimais().get(0)));

                Dados.getDono().add(dono);
                Dados.getAnfitriao().add(anfitriao);
                System.out.println(dono.getAnimais());
        }
}