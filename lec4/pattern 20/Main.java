import java.util.*;

class Main{
public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);

        
        int nsp1=3;
        int nsp2=-1;
        for(int i=1;i<=7;i++)
        {
           for(int j=1;j<=nsp1;j++)
           {
            System.out.print("\t");
           }
           System.out.print("*\t");
           
           for(int j=1;j<=nsp2;j++)
           {
            System.out.print("\t");
           }
           if(!(i==1 || i==7))
           {
                System.out.print("*\t");
           }
           System.out.println();

           if(i<4)
           {
            nsp1--;
            nsp2+=2;
           }
           else{
            nsp1++;
            nsp2-=2;
           }
        }
    }
}