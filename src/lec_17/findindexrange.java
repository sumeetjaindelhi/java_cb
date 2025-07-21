package lec_17;

public class findindexrange {
   public static int findindex(int [] arr,int l,int r) {
	   int i=l;
	   int j=r;
	   int min =arr[l];
	   int index=l;
	   for(i=l;i<=j;i++) {
		   if(arr[i]<min) {
			   min=arr[i];
			   index=i;
		   }
		   
	   }
	   return index;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] arr= {1,2,-1,4,7,10,2};
         int l=3;
         int r=5;
         System.out.println(findindex(arr,l,r));
	}

}
