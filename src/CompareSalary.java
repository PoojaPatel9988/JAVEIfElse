/* input salary .check if it's above 20000.
input:18000
output:salary below industry standard.
 */
import java.util.Scanner;
import java.lang.*;
public class CompareSalary
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter salary : ");
        int salary=sc.nextInt();

        if(salary >= 20000)
        {
            System.out.println("salary above in industry standard.");
        }
        else
        {
            System.out.println("salary below in industry standard.");
        }
    }
}