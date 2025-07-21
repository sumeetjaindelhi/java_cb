package lec_22;

public class sumarrayrecursion {                                
  public static int getsum(int [] arr) {
	  if(arr.length==0) {
		  return 0;
	  }
	  
	  
	  int [] smallerarr=new int[arr.length-1];
	  for(int i=1;i<arr.length;i++) {
		  smallerarr[i-1]=arr[i];
		  
	  }
	  int chotaans=getsum(smallerarr);
	  int meraans=arr[0]+chotaans;
	  return meraans;
  }
  
  public static int getsum(int [] arr,int i) {
	  if(i==arr.length) {
		  return 0;
	  }
	  int chhotaans=getsum(arr,i+1);
	  int meraans=arr[i]+chhotaans;
	  return meraans;
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,3,4,5,10};
       System.out.println(getsum(arr,0));
	}

}
