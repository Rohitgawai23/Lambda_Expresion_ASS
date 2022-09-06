package Collection_LinkedList_ASS;

import java.util.Scanner;

// Q14.Wap find the area of rectangle using lambda expression with return type.
interface rectangle
{
    public int disp(int length,int width);
}


public class lambda_AreaOfRectangle_returnType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        rectangle ob=(int l, int w)->
        {
            System.out.println("Enter the length :");
            int  length=sc.nextInt();
            System.out.println("Enter the length :");
            int  width=sc.nextInt();
            int area =length*width;
            return (area);
        };
        System.out.println("Area of rectangle is "+ob.disp(0,0));
    }
}
