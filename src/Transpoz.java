import java.util.Arrays;

public class Transpoz {
    static void transpoze(int[][] a) {
        int[][] transpoz = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                transpoz[j][i] = a[i][j];
            }
        }
        for (int i = 0; i < transpoz.length; i++) {
            for (int j = 0; j < transpoz[i].length; j++) {
                System.out.print(transpoz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();

        }
        System.out.println("Array");
        System.out.println("==============================");
        System.out.println("Transpoze Array");
        transpoze(array);
    }
}