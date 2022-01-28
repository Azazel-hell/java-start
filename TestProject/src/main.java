import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfPerson = scanner.nextLine();
        var age = scanner.nextInt();
        System.out.println("Name of person is " + nameOfPerson);
        System.out.println("Age person is " + age);
    }
}
