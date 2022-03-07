package hospedagens;

import java.text.ParseException;

public class App {
    public static void main(String[] args) {
        try {
            new Menu().inicio();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}