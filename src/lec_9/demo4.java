  package lec_9;

public class demo4 {
// public static void swap(int [] a,int [] b) {
//	  int [] temp =a;
//	  a=b;
//	  b=temp;
// }
 public static void swap(int [] a,int [] b) {
	  int  temp =a[0];
	  a[0]=b[0];
	  b[0]=temp;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
   int [] a= {1,2,3,4};
   int [] b= {10,20,30,40};
   System.out.println("before Swap"+a[0]+" "+b[0]);
   swap(a,b);
   System.out.println(" after swap"+a[0]+" "+b[0]);
	}

}
