import java.util.Scanner;

public class LoginApp {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (password != null && password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 8 characters!");
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginApp user = new LoginApp();

        System.out.print("Enter Username: ");
        String uname = sc.nextLine();
        user.setUsername(uname);

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();
        user.setPassword(pass);

        System.out.println("\n--- User Details ---");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());

        sc.close();
    }
}
