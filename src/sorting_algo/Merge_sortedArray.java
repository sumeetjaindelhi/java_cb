package sorting_algo;

public class Merge_sortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {1,2,3,4,6};
		int arr1[]= {2,4,5,10,12,15};
		
		int ans[]=merge(arr,arr1);
		
		for(int i:ans)
		{
			System.out.print(i+" ");
		}

	}
	
	public static int [] merge(int arr[],int arr1[])
	{
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
