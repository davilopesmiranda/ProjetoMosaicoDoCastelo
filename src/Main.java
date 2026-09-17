import java.util.Scanner;
public class Main {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        //n é o tamanho que a matriz terá
        do {
            System.out.println("Diga o tamanho do matriz que seja maior ou igual a 3 e menor ou igual a 20: ");
            n = sc.nextInt();

        } while (n <= 3 || n >= 20);
        int matriz[][] = new int[n][n];

        System.out.println("DIMENSÃO " +  n + " x " + n );
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = i;
                if (    (i == 0 && j == 0) ||
                        (i == 0 && j == n - 1) ||
                        (i == n - 1 && j == 0) ||
                        (i == n - 1 && j == n - 1)  ) {
                    System.out.print("+ ");
                }else if (i == 0 && ( j != 0 || j != n - 1)
                        || i == n - 1 && ( j != 0 || j != n - 1)
                        || j == 0 && ( i != 0 || i != n - 1)
                        || j == n - 1 && ( i != 0 || i != n - 1)){
                    System.out.print("# ");
                } else System.out.print(". ");
            }
            System.out.println();
        }
    }
}
