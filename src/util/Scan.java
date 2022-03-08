package util;

import java.util.Scanner;

public class Scan {

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