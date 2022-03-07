package dados;

import java.util.ArrayList;
import model.*;

public class Dados {

    private static final ArrayList<Dono> dono = new ArrayList<>();

    private static final ArrayList<Anfitriao> anfitriao = new ArrayList<>();

    private Dados() {

    }

    public static ArrayList<Dono> getDono() {
        return dono;
    }

    public static ArrayList<Anfitriao> getAnfitriao() {
        return anfitriao;
    }

}
