
import java.util.Arrays;
import java.util.Scanner;

public class Problema4{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada;

        while(true){
            entrada = sc.nextInt();
            if(entrada > 0)break;
        }


        String[] vector1 = new String[entrada];

        boolean[][] vector2 = new boolean[entrada][entrada];

        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = sc.next();
        }

        for (int i = 0; i < vector1.length; i++) {
            for (int j = 0; j < vector1.length; j++) {
                vector2[i][j] = vector1[i].contains(vector1[j]);

            }
        }

        for (int i = 0; i < vector2.length; i++) {
            System.out.println(Arrays.toString(vector2[i]));
        }

        sc.close();
    }

}
