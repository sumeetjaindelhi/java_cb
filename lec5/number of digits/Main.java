import java.util.*;

class Main{
    public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int count =0;
        if(a==0)
        {
            count=1;
        }
        else{
        while(a>0)
        {
           a=a/10;
           count++;
        }
        }
    System.out.println("count: "+count);
    }
}