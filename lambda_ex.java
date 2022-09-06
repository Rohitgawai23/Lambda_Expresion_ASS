package collection_lambda_exprestion;

interface abcd
{
     void disp();
}


public class lambda_ex {

    public static void main(String[] args) {
        abcd ob=()->
        {
            System.out.println("HELLO JAVA");
        };
        ob.disp();
    }
}

/*
Output :
        HELLO JAVA

 */