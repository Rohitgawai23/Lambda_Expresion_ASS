package collection_lambda_exprestion;

import java.util.Scanner;

interface ab
{
    public int disp();
}


public class _2method_lambda {
    static Scanner sc=new Scanner(System.in);
    static int a,b;

    public void input()
    {
        System.out.println("Enter your no");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    public static void main(String[] args) {
        _2method_lambda t=new _2method_lambda();
        t.input();

        ab ob=()->
        {
            return a+b;
        };
        System.out.println("Addition");
        System.out.println(ob.disp());
    }
}

/*
Output :

        Enter your no
        2
        3
        Addition
        5

 */