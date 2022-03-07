package util;

import java.util.Scanner;

public class Scan {

    private Scan() {

    }

    public static String nextLine() {
        return new Scanner(System.in).nextLine();
    }

    public static int nextInt() {
        return new Scanner(System.in).nextInt();
    }

    public static double nextDouble() {
        return new Scanner(System.in).nextDouble();

    }
}