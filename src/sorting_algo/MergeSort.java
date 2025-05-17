package sorting_algo;

public class MergeSort {
	
	public static void main(String []args)
	{
		int arr[]= {2,5,3,12,82,9,49,8,6,4};
		int ans[]=mergeSort(arr,0,arr.length-1);
		for(int i:ans)
		{
			System.out.print(i+" ");
		}
	}
	  public static int [] mergeSort(int a[], int s, int e)
	  {
		  if(s==e)
		  {
			  int ans[]=new int [1];
			  ans[0]=a[s];
			  return ans;
		  }
		  
		  
		  int mid=(s+e)/2;
		  
		  int arr[]=mergeSort(a,s,mid);
		  int arr1[]=mergeSort(a,mid+1,e);
		  
		  int ans[]=new int[arr.length+arr1.length];
			
			int i=0;
			int j=0;
			int k=0;
			
			while(i<arr.length && j<arr1.length)
			{
				if(arr[i]<arr1[j])
				{
					ans[k]=arr[i];
					i++;
					k++;
				}
				else
				{
					ans[k]=arr1[j];
					j++;
					k++;
				}
			}
			
			while(i<arr.length)
			{
				ans[k]=arr[i];
				k++;
				i++;
			}
			
			while(j<arr1.length)
			{
				ans[k]=arr1[j];
				k++;
				j++;
			}
			
			return ans;
		  
	  }
}
