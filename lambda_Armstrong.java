package collection_lambda_exprestion;

import java.util.Scanner;

interface A
{
    void disp();
}


public class lambda_Armstrong {
    Scanner sc=new Scanner(System.in);
    static int i,rev=0,rem,no;

    public void Input()
    {
        System.out.println("Enter the no :");
        no=sc.nextInt();
    }


    public static void main(String[] args) {
        lambda_Armstrong la=new lambda_Armstrong();
        la.Input();
        A ob=()->
        {
            for(i=0; i!=0; i=i/10)
            {
                rem = i % 10;
                rev = rev + (rem * rem * rem);
            }

            if(no==rev)
            {
                System.out.println("It is Armstrong number");
            }
            else
                System.out.println("It is not Armstrong number");
        };
        ob.disp();



    }
}
