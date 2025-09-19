/* input user email. validation if it contains"@".
Input: hii24.com
 Output: invalid email format */
import java.util.Scanner;
public class EmailValidation
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your email : ");
        String email=sc.next();

        if(email.contains("@"))
        {
            System.out.println("valid email format");

        }
        else
        {
            System.out.println("invalid email format");
        }
    }
}
