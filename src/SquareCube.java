/* W.A.P. to find square of the number if the n is above 100 or find cube.
input:353        output:353^2
input:4          output;4^3   */

import java.util.Scanner;
public class SquareCube
{
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        n=sc.nextInt();

        if(n >= 100)
        {
            int square = n * n;
            System.out.println("the given number square is:" + square);
        }
        else
        {
            int cube = n * n * n ;
            System.out.print("the given cube is : " + cube);
        }
    }
}
