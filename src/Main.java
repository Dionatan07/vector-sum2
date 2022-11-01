import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many values you'll type? ");
        int n = input.nextInt();

        int[] vectorA = new int[n];
        int[] vectorB = new int[n];
        int[] vectorC = new int[n];

        System.out.println("Enter the numbers of vector A: ");
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = input.nextInt();
        }

        System.out.println("Enter the numbers of vector B: ");
        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i] = input.nextInt();
        }

        System.out.println();
        System.out.println("Final Sum: ");

        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
            System.out.println(vectorC[i]);
        }


    }
}