import java.util.Scanner;

public class IT24104176Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the price of 1kg of rice: ");
        double pricePerKilogram = scanner.nextDouble();

    
        System.out.println("Enter the number of kilograms you want to buy: ");
        double numberOfKilograms = scanner.nextDouble();


        double totalAmount = pricePerKilogram * numberOfKilograms;


        System.out.println("The amount you have to pay is: " + totalAmount);
    }
}
