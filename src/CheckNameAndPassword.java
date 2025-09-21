import java.util.Scanner;
public class CheckNameAndPassword
{
    public static void main(String[] args)
    {
        String systemGeneratUsername = "admin";
        String systemGeneratPassword = "admin123";

        String username ,password;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your user name :");
        username=sc.nextLine();

        System.out.println("Enter your password : ");
        password=sc.nextLine();


        if(username.equals(systemGeneratUsername) && password.equals(systemGeneratPassword))
        {
            System.out.println("Login Sucessfully !...");
        }
        else
        {
            System.out.println("Invalid userneme | password! Please try again..");
        }
    }
}