package hospedagens;

import java.text.ParseException;

public class App {
    public static void main(String[] args) { // main para teste de metodos via menu
        Menu menu = new Menu();
        try {
            menu.inicio();
            menu.menu();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}