package data;

import java.util.ArrayList;
import modelos.*;

public class Dados {

    private static final ArrayList<Dono> dono = new ArrayList<>();

    private static final ArrayList<Anfitriao> anfitriao = new ArrayList<>();

    private static final ArrayList<Animal> animais = new ArrayList<>();

    private Dados() {

    }

    public static ArrayList<Dono> getDono() {
        return dono;
    }

    public static ArrayList<Anfitriao> getAnfitriao() {
        return anfitriao;
    }

    public static ArrayList<Animal> getAnimal() {
        return animais;
    }

}
