package lec_25;

public class quicksort {
	public static int partition(int [] arr,int s,int e) {
		int n=arr.length;
		int pivot=arr[e];
		int index =s;
		
		for (int i=s;i<e;i++) {
			if(arr[i]<pivot) {
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
			}
		}
		int temp=arr[index];
		arr[index]=arr[e];
		arr[e]=temp;
		return index;
	}
  public static void quicksort( int [] arr,int s,int e) {
	  
	  if(s>=e) {
		  return;
	  }
	  int pi=partition(arr,s,e);
	  quicksort(arr,s,pi-1);
	  quicksort(arr,pi+1,e);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int [] arr= {3,2,1,5,6,4};
             quicksort(arr,0,arr.length-1);
             for(int val: arr) {
            	 System.out.print(val+" ");
             }
	}

}
