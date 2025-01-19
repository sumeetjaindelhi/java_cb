import java.util.*;

class Main{
public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int ans=0;

        while(n>0)
        {
          int ld=n%10;
          ans=ans*10+ld;
          n/=10;
        }

      
        System.out.println(ans);

    }
}