import java.util.Scanner;

public class IT24104176Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
       
        int notes5000 = amount / 5000;
        amount %= 5000;
       
        int notes1000 = amount / 1000;
        amount %= 1000;
       
        int notes500 = amount / 500;
        amount %= 500;
       
        int notes200 = amount / 200;
        amount %= 200;
       
        int notes100 = amount / 100;
        amount %= 100;
       
        int notes50 = amount / 50;
        amount %= 50;
       
        int notes20 = amount / 20;
        amount %= 20;
       
        int notes10 = amount / 10;
        amount %= 10;
       
        int coins5 = amount / 5;
        amount %= 5;
       
        int coins2 = amount / 2;
        amount %= 2;
       
        int coins1 = amount;
       
        System.out.println("5000 Notes - " + notes5000);
        System.out.println("1000 Notes - " + notes1000);
        System.out.println("500 Notes - " + notes500);
        System.out.println("200 Notes - " + notes200);
        System.out.println("100 Notes - " + notes100);
        System.out.println("50 Notes - " + notes50);
        System.out.println("20 Notes - " + notes20);
        System.out.println("10 Notes - " + notes10);
        System.out.println("5 Coins - " + coins5);
        System.out.println("2 Coins - " + coins2);
        System.out.println("1 Coins - " + coins1);
       
        scanner.close();
    }
}
