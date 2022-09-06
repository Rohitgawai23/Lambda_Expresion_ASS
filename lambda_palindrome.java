package collection_lambda_exprestion;

import java.util.Scanner;

interface P
{
    void disp();
}


public class lambda_palindrome {
    Scanner sc=new Scanner(System.in);
    static int rev=0,no;
    static int rem;

    public void Input()
    {
        System.out.println("Enter the number :");
        int no=sc.nextInt();
    }
    public static void main(String[] args) {
        lambda_palindrome l=new lambda_palindrome();
        l.Input();

        P ob=()->
        {
            for(int i=no; i!=0; i=i/10)
            {
                rem=i%10;
                rev=rev*10+rem;
            }

            if(no==rev)
                System.out.println("It is palindrome number ");
            else
                System.out.println("It is not palindrome number ");
        };

        ob.disp();

    }
}
