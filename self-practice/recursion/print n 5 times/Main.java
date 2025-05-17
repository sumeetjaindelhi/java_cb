import java.util.*;

class Main{

    public static void print(int n)
    {
        if(n>5)
        {
            return;
        }
        System.out.println(n);
        print(++n);
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        print(n);

    }
}