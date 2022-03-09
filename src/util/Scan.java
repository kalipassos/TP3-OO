package util;

import java.util.Scanner;

public class Scan { // * classe criada com base na usual Scanner, afim de evitar ter de
    // colocar .nextLine() toda vez após uma leitura(evitar buffer).

    private Scan() {

    }

    // Leitura de strings
    public static String nextLine() {
        return new Scanner(System.in).nextLine();
    }

    // Leitura de numeros inteiros
    public static int nextInt() {
        return new Scanner(System.in).nextInt();
    }

    // Leitura de numeros reais
    public static double nextDouble() {
        return new Scanner(System.in).nextDouble();

    }
}
