import java.util.Scanner;
class Bank 
{
    double amount;
    Bank(double amount) 
    {
        this.amount = amount;
    }
    void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount)
                ? "Withdrawal successful"
                : "Insufficient balance";

        System.out.println(message);

        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }

        System.out.println("After withdrawal, balance: " + amount);
    }
    void deposit(double depositAmount) 
    {
        amount += depositAmount;
        System.out.println("After deposit, available balance: " + amount);
    }
}

public class BankAccount
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank(10000);

        System.out.print("Enter withdrawal amount: ");
        double w = sc.nextDouble();
        b.withdraw(w);

        System.out.print("Enter deposit amount: ");
        double d = sc.nextDouble();
        b.deposit(d);

        sc.close();
    }
}
