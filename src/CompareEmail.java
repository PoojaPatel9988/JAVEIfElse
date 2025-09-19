/*  Compare two email for exact match.ignore case .
Input : "Test@Mail.com","class@mail.com"
Output:same email
 */
import java.util.Scanner;

public class CompareEmail
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String emailOne,emailTwo;
        System.out.println("Enter your first Email address: ");
        emailOne=sc.next();
        System.out.println("Enter your second Email address: ");
        emailTwo=sc.next();

        if(emailOne.equals(emailTwo))
        {
            System.out.println("both Email are same");
        }
        else
        {
            System.out.println("both Email are different");
        }
    }
}