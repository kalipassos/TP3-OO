package hospedagens;

import java.util.Scanner;

public class Menu {

    public static void menu() {
        Animal animal = new Animal();
        animal.preCadastro();

        System.out.println(
                "Opcoes: 1- Cadastrar animal/n 2- Cadastrar novo dono/n 3- Listar animais/n 4- Listar donos/n 5- Cadastrar hospedagem/n 6- Visualizar hospedagem/n 7- Editar hospedagem/n 8- Sair");

        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:

                animal.cadastrarAnimal();
                Controle.listaAnimais();
                break;
            case 2:
                System.out.println("");
                break;
            case 3:

                break;

            default:
                System.out.println("Saindo do programa");
                break;

        }

    }
}