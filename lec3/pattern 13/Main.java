import java.util.*;

class Main{
    public static void main(String Args[])
    {
        Scanner obj=new Scanner(System.in);
       
        int nst=1;

        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=nst;j++)
            {
                System.out.print("* ");
            }

            if(i<5)
            {
                nst++;
            } else{
                nst--;
            }

            System.out.println();
        }

    }
}