import java.util.*;

class Main{
public static void main(String Args[])
    {
    //    ncr
        Scanner obj=new Scanner(System.in);

        int n=obj.nextInt();
        int r=obj.nextInt();

        int nsubtractr=n-r;
        int nfact=1;
        int nminusr=1;
        int rfact=1;
        while(n!=0)
        {
            nfact*=n;
            n--;
            }
        
        while(nsubtractr!=0)
        {
            nminusr*=nsubtractr;
            nsubtractr--;
        }

        while(r!=0)
        {
            rfact*=r;
            r--;
        }

        int res=nfact/(nminusr*rfact);
        System.out.println(res);


    }
}