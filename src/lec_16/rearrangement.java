package lec_16;

public class rearrangement {
	public static boolean ispossible(String str) {
		int [] arr=new int [256];
		  for(int i=0;i<str.length();i++) {
			  char ch =str.charAt(i);
			  int ascii=ch;
			  arr[ascii]++;	  
		  }
		  int count=0;// how many characters are there whose frequency is odd
		  for(int i=0;i<256;i++) {
			  if(arr[i]%2!=0) {
				  count++;
			  }
		  }
		  if(count==0||count==1) {
			  return true;
		  }else {
			  return false;
		  }
	}
			
			public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="aabb";
		System.out.println(ispossible(str));
	}

}