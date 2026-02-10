import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int count, min, max;

        System.out.print("Enter the number of random numbers to generate: ");
        count = scanner.nextInt();

        System.out.print("Enter the minimum value: ");
        min = scanner.nextInt();

        System.out.print("Enter the maximum value: ");
        max = scanner.nextInt();

        System.out.println("Pseudorandom numbers:");

        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            System.out.println(randomNumber);
        }

        scanner.close();
    }
}

