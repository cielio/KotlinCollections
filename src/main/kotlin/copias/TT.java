package copias;

import java.util.Scanner;

public class TT {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double raio, area;

        System.out.println("Escreva o valor do raio:");
        raio = scan.nextDouble();

        area = 3.1416 * (Math.pow(raio, 2));

        System.out.println("O valor da area eh:" + area);

    }
}