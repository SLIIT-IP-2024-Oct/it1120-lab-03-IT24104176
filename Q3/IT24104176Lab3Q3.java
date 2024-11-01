import java.util.Scanner;

public class IT24104176Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the amount in rupees: ");
        int amount = scanner.nextInt();
        
   
        calculateDenominations(amount);
    }

    public static void calculateDenominations(int amount) {
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        String[] labels = {"5000 Notes", "1000 Notes", "500 Notes", "200 Notes", "100 Notes", 
                           "50 Notes", "20 Notes", "10 Notes", "5 Notes", "2 Notes", "1 Notes"};
        
        for (int i = 0; i < denominations.length; i++) {
            int count = getCount(amount, denominations[i]);
            amount = reduceAmount(amount, denominations[i], count);
            System.out.println(labels[i] + " = " + count);
        }
    }

    public static int getCount(int amount, int denomination) {
        return amount / denomination;
    }

    public static int reduceAmount(int amount, int denomination, int count) {
        return amount % denomination;
    }
}
