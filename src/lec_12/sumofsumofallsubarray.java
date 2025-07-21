package lec_12;

public class sumofsumofallsubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5};
		int [] a= new int [15];
        int n =arr.length;
       int ans=0;
        
                for(int i=0;i<n;i++) {
                	 int sum=0; 
                	 
           	for(int j=i;j<n;j++) {
          		sum=sum+arr[j];
               ans=ans+sum;
             	System.out.print(sum);
            
            	
             
               	 System.out.println();
           	}
           }
                System.out.println(ans);
	}

}
