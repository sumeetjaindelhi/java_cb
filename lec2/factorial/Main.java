import java.util.*;

class Main{
    public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int p=1;
        int i=1;
        while(i<=n)
        {
            p*=i;
            i++;
        }
        System.out.println("product is "+p);

    }
}