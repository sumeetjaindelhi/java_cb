package lec_10;

public class returnmaxminsumtogether {
public static int [] maxminsum(int [] arr) {
	int n=arr.length;
	int [] a= new int[3];
	int sum=0;
	for(int i=0;i<n;i++) {
		sum=sum+arr[i];	
	}
	a[0]=sum;
	int min=arr[0];
    for(int i=0;i<n;i++) {
  	  if(arr[i]<min) {
  		  min=arr[i];
           }
    }
    a[1]=min;
    int max=arr[0];
    for(int i=0;i<n;i++) {
  	  if(arr[i]>max) {
  		  max=arr[i];
           }
    }
    a[2]=max;
    
    return a ;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5};
		  int [] result=maxminsum(arr);
		int n=result.length;
     
      for(int i=0;i<n;i++) {
    	  System.out.println(result[i]);
      }
	}

}
