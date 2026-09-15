import java.util.Scanner;
public class Main {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int tamanhoMatriz = 0;
        do {
            System.out.println("Diga o tamanho do matriz que seja maior ou igual a 3 e menor ou igual a 20: ");
            tamanhoMatriz = sc.nextInt();

        } while (tamanhoMatriz <= 3 || tamanhoMatriz >= 20);
        int matriz[][] = new int[tamanhoMatriz][tamanhoMatriz];

        System.out.println("DIMENSÃO " +  tamanhoMatriz + " x " + tamanhoMatriz );
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                matriz[i][j] = i;
                if (    (i == 0 && j == 0) ||
                        (i == 0 && j == tamanhoMatriz - 1) ||
                        (i == tamanhoMatriz - 1 && j == 0) ||
                        (i == tamanhoMatriz - 1 && j == tamanhoMatriz - 1)  ) {
                    System.out.print("+ ");
                }else if (i == 0 && ( j != 0 || j != tamanhoMatriz - 1)
                        || i == tamanhoMatriz - 1 && ( j != 0 || j != tamanhoMatriz - 1)
                        || j == 0 && ( i != 0 || i != tamanhoMatriz - 1)
                        || j == tamanhoMatriz - 1 && ( i != 0 || i != tamanhoMatriz - 1)){
                    System.out.printf("# ");
                } else System.out.print(". ");
            }
            System.out.println();
        }
    }
}
