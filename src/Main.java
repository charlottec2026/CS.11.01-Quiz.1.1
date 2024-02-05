import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your favourite food: ");
        String favouriteFood = scanner.nextLine();
        System.out.println("First name: " + firstName + "\nAge: " + age + "\nFavourite food: " + favouriteFood);
    }
    }

