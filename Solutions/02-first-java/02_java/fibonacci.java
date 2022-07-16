import java.util.Scanner;

/**
 * fibonacci
 */
public class fibonacci {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int num = s.nextInt();

            int a = 0;
            int b = 1;
            int count = 2;
            while (count <= num) {
                int temp = b;
                b = a + b;
                a = temp;
                count++;
            }

            System.out.println(b);
        }
    }
}