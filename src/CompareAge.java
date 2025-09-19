/* compare user's age with friend age's.show who is older.
Input: you=21,friend=23
 Output: your friend is older */

import java.util.Scanner;
public class CompareAge
{
    public static void main(String[]args)
    {
        int youAge,friendAge;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age : ");
        youAge=sc.nextInt();
        System.out.println("entre your friend age : ");
        friendAge=sc.nextInt();

        if(youAge < friendAge)
        {
            System.out.println("your friend is older");
        }
        else
        {
            System.out.println("you older");
        }

    }
}