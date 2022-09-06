package Collection_LinkedList_ASS;
// Q16.Wap add two no using lambda expression.

import java.util.Scanner;

interface add
{
    public void disp();
}

public class lambda_ex_add_two_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        add ob=()->
        {
            System.out.println("Enter 1st No :");
            int a= sc.nextInt();
            System.out.println("Enter 2nd No :");
            int b=sc.nextInt();

            int sum=a+b;
            System.out.println("The sum is :"+sum);
        };
        ob.disp();
    }
}
/*
Output :

        Enter 1st No :
        4
        Enter 2nd No :
        6
        The sum is :10

 */