package hospedagens;

import java.text.ParseException;

public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        try {
            menu.inicio();
            menu.menu();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}