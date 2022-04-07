package data;

import java.util.ArrayList;
import modelos.*;
import visualizacao.HospedagemVisual;

public class Dados {

    private static final ArrayList<Dono> dono = new ArrayList<>();
    private static final ArrayList<Anfitriao> anfitriao = new ArrayList<>();

    private Dados() {

    }

    public static void adicionarDono() {
        Dono dono = new Dono("João", "2323", "434", "3434");

        Dados.dono.add(dono);

        Dono dono2 = new Dono("Maria", "2323434", "42234", "343114");

        Dados.dono.add(dono2);

        dono.getAnimais().add(new Animal("bolinha", "wef", "eijfioe", "FDIJFIOD", 2, "M", "Cachorro"));
        dono.getAnimais().add(new Animal("bRTGRTR", "wef", "eijfioe", "FDIJFIOD", 2, "M", "Cachorro"));

        dono2.getAnimais().add(new Animal("bRTGRTR", "wef", "eijfioe", "FDIJFIOD", 2, "M", "Cachorro"));
        dono2.getAnimais().add(new Animal("bolinha", "wef", "eijfioe", "FDIJFIOD", 2, "M", "Cachorro"));

    }

    public static ArrayList<Dono> getDono() {
        return dono;
    }

    public static ArrayList<Anfitriao> getAnfitriao() {
        return anfitriao;
    }

}
