/* compare two mobile number entered by user and friend.
show if they are same .
 input: "1234567890","1234567890"
 output: both number are the same.
 */
import java.util.Scanner;
import java.lang.*;
public class Compare
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your number : ");
        String userNumber=sc.next();

        System.out.print("enter your friend number : ");
        String friendNumber=sc.next();

        if(userNumber.equals(friendNumber))
        {
            System.out.println("Both number are same.");
        }
        else
        {
            System.out.println("both number are different.");
        }
    }
}
