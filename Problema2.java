
import java.util.Arrays;
import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada;

        while(true){
            entrada = sc.nextInt();
            if(entrada > 0)break;
        }

        String[] vector1 = new String[entrada+1];
        int[] vector2 = new int[entrada];

        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = sc.next();
        }
        char caracter = vector1[vector1.length - 1].charAt(0);

        for (int i = 0; i < vector1.length-1; i++) {
            for (int j = 0; j < vector1[i].length(); j++) {
                if (vector1[i].charAt(j) == caracter) vector2[i] = vector2[i] + 1;
            }
        }

        System.out.printf(Arrays.toString(vector2));

        sc.close();

    }
}
