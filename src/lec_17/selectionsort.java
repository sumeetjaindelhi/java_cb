package lec_17;

public class selectionsort {
	public static int minvalue(int [] arr,int l,int r) {
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
	public static void selectionsort(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			int index=minvalue(arr,i,arr.length-1);
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int [] arr= {1,2,-1,4,7,10,2};
          selectionsort(arr);
          for(int i=0;i<arr.length;i++) {
        	  System.out.print(arr[i]+" ");
          }
	}

}
