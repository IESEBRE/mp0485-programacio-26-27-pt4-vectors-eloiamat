
import java.util.Arrays;
import java.util.Scanner;

public class Problema5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada;

        while (true) {
            entrada = sc.nextInt();
            if (entrada > 0) break;
        }

        String[][] llista = new String[entrada][entrada];

        for (int i = 0; i < llista.length; i++) {
            for (int j = 0; j < llista.length; j++) {
                llista[i][j] = sc.next();
            }
        }

        int[][] resultat = new int[entrada][2];

        for (int i = 0; i < llista.length; i++) {

            int menor = 0;

            for (int j = 1; j < llista.length; j++) {
                if (llista[i][j].compareTo(llista[i][menor]) < 0) {
                    menor = j;
                }
            }

            resultat[i][0] = i;
            resultat[i][1] = menor;
        }

        for (int i = 0; i < resultat.length; i++) {
            System.out.println(Arrays.toString(resultat[i]));
        }

        sc.close();
    }
}
