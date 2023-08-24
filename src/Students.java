
public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,3,7,9,10};
		int k=9;
		int start=0;
		int end=arr.length;
		
		for(int i=0;i<end;i++) {
		//while(start<=end){
			int mid= start+(end-start)/2;
			if(arr[mid]==k)
			{
				System.out.println(mid);
			}
			else if(k>arr[mid])
			{
				start=mid+1;
			}
			else {
				end=mid-1;}
			
		}
		
		
		System.out.println("data not found !");

	}

}
