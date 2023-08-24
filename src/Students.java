
public class Students {
	 
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
		int [] arr= {1,3,7,9,10};
		
		//int start=0;
		int end=arr.length;
		int k=10;
	    Students obj =new Students();
	    int result=obj.binarrySearch(arr, k, 0, end-1);
	    
	    if (result==-1)
	    System.out.println("does not found");
	    else
	    System.out.println("index number "+result);
	    
		
		
		
		
		
}
	}
