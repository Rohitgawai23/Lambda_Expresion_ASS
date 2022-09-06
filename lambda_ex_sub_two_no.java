package Collection_LinkedList_ASS;
// Q17.Wap subtract two no using lambda expression.

import java.util.Scanner;

interface sub
{
    public void disp();
}
public class lambda_ex_sub_two_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        sub ob=()->
        {
            System.out.println("Enter 1st No :");
            int a= sc.nextInt();
            System.out.println("Enter 2nd No :");
            int b=sc.nextInt();

            int sub=a-b;
            System.out.println("The sum is :"+sub);
        };
        ob.disp();
    }
}
/*
Output :

        Enter 1st No :
        6
        Enter 2nd No :
        4
        The sum is :2

 */
