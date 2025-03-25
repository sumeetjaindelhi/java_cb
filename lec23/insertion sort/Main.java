import java.util.*;

class Main{

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        int [] arr={1,2,4,5,6,7,8,3};

        for(int i=0;i<arr.length-1;i++)
        {
            int temp=arr[i+1];
            while(i>=0 && arr[i]>temp) // arr[i]>temp && i>=0 toh arr[i] check hoga and voh -ve hai toh error marega but
            //  but i>=0 pahele denege toh pahele first false hoke aage check nahi karega and voh seedha looop se bahar
            {// first condition hamesha priority jada hoti hai
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=temp;

        }
        

       
    }
    }