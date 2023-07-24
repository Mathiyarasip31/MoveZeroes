import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        Move(array, size);
    }

    public static void Move(int array[], int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] != 0) {
                array[count++] = array[i];
            }
        }
            while (count < size) {
                array[count++] = 0;
            }

            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }

    }
}

