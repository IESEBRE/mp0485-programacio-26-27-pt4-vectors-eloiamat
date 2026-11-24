
import java.util.Arrays;
import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entrada;

        while(true){
            entrada = sc.nextInt();
            if(entrada > 0)break;
        }


        String[] vector1 = new String[entrada];
        int[] vector2 = new int[entrada];

        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = sc.next();
        }
        System.out.printf(Arrays.toString(vector1));

        for (int i = 0; i < vector2.length; i++) {
            for (int j = 0; j < vector1[i].length(); j++) {
                vector2[i] = vector2[i]+1 ;
            }
        }

        System.out.print(" -> ");
        System.out.printf(Arrays.toString(vector2));

        sc.close();
    }
}
