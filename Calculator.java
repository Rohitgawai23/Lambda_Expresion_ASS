package collection_lambda_exprestion;

import java.util.Scanner;


interface lambda_exp
{
   void disp();
}

public class Calculator {
    static Scanner sc=new Scanner(System.in);
    static int ob;
    static int ch;

    public Calculator()
    {
        System.out.println("calculator :");
        System.out.println("1.ADD\t2.SUB\t3.multi\t4.div");
        System.out.println("ENTER YOUR CHOICE");
        ch = sc.nextInt();

    }
    public static void main(String[] args) {
        Calculator cl=new Calculator();
        lambda_exp xy=()->
        {

               if(ch==1)
               {
                   System.out.println("\t\tAddition");
                   System.out.println("================================================");
                   System.out.print("\tEnter first value : ");
                   int a = sc.nextInt();
                   System.out.print("\tEnter second value : ");
                   int b = sc.nextInt();
                   int c = a+b;
                   System.out.println("\tYour Addition is : "+c);
                   System.out.println();
               }

               else if(ch==2)
               {
                   System.out.println("\t\tSubtraction");
                   System.out.println("================================================");
                   System.out.print("\tEnter first value : ");
                   int a = sc.nextInt();
                   System.out.print("\tEnter second value : ");
                   int b = sc.nextInt();
                   int c = a-b;
                   System.out.println("\tYour Subtraction is : "+c);
                   System.out.println();
               }

               else if(ch==3)
               {
                   System.out.println("\t\tDivision");
                   System.out.println("================================================");
                   System.out.print("\tEnter first value : ");
                   int  e = sc.nextInt();
                   System.out.print("\tEnter second value : ");
                   int f = sc.nextInt();
                   int g = e-f;
                   System.out.println("\tYour Division is : "+f);
                   System.out.println();
               }

               else if(ch==4)
               {
                   System.out.println("\t\tMultiplication");
                   System.out.println("================================================");
                   System.out.print("\tEnter first value : ");
                   int a = sc.nextInt();
                   System.out.print("\tEnter second value : ");
                   int b = sc.nextInt();
                   int c = a*b;
                   System.out.println("\tYour Multiplication is : "+c);
                   System.out.println();
               }

        };
        xy.disp();


    }
}
