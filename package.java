import java.util.Arrays;
import java.util.Scanner;

class SystemPackageDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Sorted numbers:");
        for (int n : numbers) {
            System.out.println(n);
        }

        sc.close();
    }
}