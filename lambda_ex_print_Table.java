package Collection_LinkedList_ASS;

import java.util.Scanner;

interface Table
{
    public void disp();
}

public class lambda_ex_print_Table {
    public static void main(String[] args) {

        Table ob=()->
        {

            int i=1;
            while(i<=10)
            {
                int j=5;
                while(j<=5)
                {

                    System.out.print((i*j)+"\t");
                    j++;
                }
                System.out.println();
                i++;

            }

        };
        ob.disp();
    }
}
