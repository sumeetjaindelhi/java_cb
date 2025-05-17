package sorting_algo;

public class Quick_sort {
	
	public static void main(String args[])
	{
		int arr[]= {8,9,6,1,2,8,3,2,4,2};
		quicksortalgo(arr,0,arr.length-1);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	public static int  partition(int arr[],int s, int e)
	{
		int index=s;
		int piv=arr[e];
		
		for(int i=s;i<e;i++)
		{
			if(arr[i]<piv)
			{
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
	
	public static void quicksortalgo(int arr[], int s, int e)
	{
		if(s>=e)
		{
			return;
		}
		
		int p=partition(arr,s,e);
		quicksortalgo(arr,s,p-1);
		quicksortalgo(arr,p+1,e);
		
		
	}

}
