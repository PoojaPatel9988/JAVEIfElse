/*ask user for age . check if they are eligible to vote(18+).
input: age=17
output: not eligible to vote  */

import java.util.Scanner;
public class EligibleOfVote
{
    public static void main(String[] args) {
        int age;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age:");
        age = sc.nextInt();

        if (age >=18)
        {
            System.out.println("you are eligible to vote.");
        }
        else
        {
            System.out.println("you are not eligible to vote.");
        }
    }
}