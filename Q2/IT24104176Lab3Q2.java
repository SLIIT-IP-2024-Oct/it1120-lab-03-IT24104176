import java.util.Scanner;

public class IT24104176Lab3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        System.out.println("Enter the number of OT hours: ");
        int otHours = scanner.nextInt();

        System.out.println("Enter the OT hourly rate: ");
        double otRate = scanner.nextDouble();

        double otAmount = otHours * otRate;

        double totalSalary = monthlySalary + otAmount;

        System.out.println("Total Salary = " + totalSalary);
    }
}
