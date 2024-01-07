import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukan bilangan bulat: ");
            int bilangan = input.nextInt();

            if (bilangan % 2 == 0) {
                System.out.println(bilangan + " adalah bilangan genap.");
            } else {
                System.out.println(bilangan + " adalah bilangan ganjil.");
            }
        }
    }
}