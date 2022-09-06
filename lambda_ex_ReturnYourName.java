package Collection_LinkedList_ASS;
// Q15.Wap return your name using lambda expression.

interface name
{
    public String logic();
}

public class lambda_ex_ReturnYourName {
    public static void main(String[] args) {
        name ob=()->
        {
            String s="Rohit";
            return s;
        };
        System.out.println(ob.logic());
    }
}
/*
Output :

        Rohit

 */