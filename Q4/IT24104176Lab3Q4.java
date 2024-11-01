import java.util.Scanner;

public class IT24104176Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a five-digit number: ");
        int number = scanner.nextInt();

        if (number >= 10000 && number <= 99999) {
            String numberString = Integer.toString(number);
            for (int i = 0; i < numberString.length(); i++) {
                System.out.print(numberString.charAt(i) + " ");
            }
        }
        
    }
}
