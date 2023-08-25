
public class BinarySearch1 {
	 
	int binarrySearch(int []arr,int k,int start,int end 	)
	{
		
		while(start<=end) {
			int mid = start+ (end-start)/2;
			 
			
		
			if(arr[mid]==k)
			
				return mid;
				
			
			else if(arr[mid]>k)
		
				end=mid-1;
			
			else 
				start=mid+1;}
			//int mid = start+ (end-start)/2;
		
		return -1;
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {1,3,7,9,10};
		
		//int start=0;
		int end=array.length;
		int k=3;
		BinarySearch1 obj =new BinarySearch1();
	    int result=obj.binarrySearch(array, k, 0, end-1);
	    
	    if (result==-1)
	    System.out.println("does not found");
	    else
	    System.out.println("index number "+result);
	  
}
	}
