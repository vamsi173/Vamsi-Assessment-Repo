import java.util.Scanner;

class Matrimony {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter gender (Male/Female): ");
        String gender = sc.nextLine().toLowerCase();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print(name + ", ");
        
        if (gender.equals("Female")) {
            if (age >= 18)
                System.out.println("you are eligible for marriage");
            else
                System.out.println("you are not eligible for marriage");
        } else if (gender.equals("Male")) {
            if (age >= 21)
                System.out.println("you are eligible for marriage");
            else
                System.out.println("you are not eligible for marriage");
        } else {
            System.out.println("Invalid gender");
        }
        
        sc.close();
    }
}