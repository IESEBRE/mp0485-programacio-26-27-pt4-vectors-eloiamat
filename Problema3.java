
import java.util.Arrays;
import java.util.Scanner;

public class Problema3{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada;

        while(true){
            entrada = sc.nextInt();
            if(entrada >= 0)break;
        }

        String[] vector1 = new String[entrada];
        boolean[] vector2 = new boolean[entrada];

        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = sc.next();
        }

        for (int i = 0; i < vector1.length; i++) {
                if(vector1[i].endsWith(Character.toString(vector1[i].charAt(0)))){
                    vector2[i] = true;
                }else vector2[i] = false;
        }


        System.out.printf(Arrays.toString(vector2));

        sc.close();
    }

}
