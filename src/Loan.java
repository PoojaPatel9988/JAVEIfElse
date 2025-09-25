/* WAP for a bank.based on the following criteria, check is a person is eligible for a loan:
 age >=18
 monthlyIncome >=25000
 CIBIL Score >=700

 if all three condition are meet,print"Eligible for Loan"  Otherwise ,print a person why not Eligible
 (e.g:,"Low CIBIL Score","Low Income",etc.)!
 */

import java.util.Scanner;
import java.lang.*;
public class Loan
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int age, monthlyIncome,cibilScore;

        System.out.println("Enter your age:");
        age=sc.nextInt();
        System.out.println("Enter your monthly income:");
        monthlyIncome=sc.nextInt();
        System.out.println("Enter your CIBIL Score:");
        cibilScore=sc.nextInt();

        if( age >= 18 && monthlyIncome >= 25000 && cibilScore >=700)
        {
            System.out.println("Eligible for Loan.");
        }
        else
        {
            System.out.println("your not eligible for loan.");
        }
    }
}
