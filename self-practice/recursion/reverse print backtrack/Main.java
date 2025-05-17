import java.util.*;

class Main{

    public static void print(int i,int n)
    {
        if(i>n)
        {
            return;
        }
       
        print(i+1,n);
        System.out.println(i);
        
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        print(1,n);

    }
}