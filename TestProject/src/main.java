import java.util.Scanner;

// ADDED

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        var age = scanner.nextInt();
        System.out.println("Name of person is " + name);
        System.out.println("Age person is " + age);
    }
}
