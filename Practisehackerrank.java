import java.util.Scanner;

public class Practisehackerrank {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0; i <= 10; i++) {
            int result = n * i;
            System.out.printf("%d x %d = %d%n", n, i, result);
        }
    }
}