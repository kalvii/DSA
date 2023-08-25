
public class Teachers {
	
	int firstoccurrence(int []arr,int k,int l,int h)
	{
		int ans=-1;
		while(l<=h)
			
		{
			int mid=l+(h-l)/2;
			if(k==arr[mid]) {
				ans=mid;
			h=mid-1;}
			else if(k>arr[mid])
				{l=mid+1;}
			else
				h=mid-1;
		}
		return ans;

	}
	
	int lastoccurrence(int []arr,int k,int l,int h)
	{
		int ans=-1;
		while(l<=h)
			
		{
			int mid=l+(h-l)/2;
			if(k==arr[mid]) {
				ans=mid;
			l=mid+1;
			}
			else if(k>arr[mid])
				{l=mid+1;}
			else
				h=mid-1;
		}
		return ans;

	}
	
	

	public static void main(String[] args) {
		int []array= {1,9,9,9,9,15};
		int k=9;
		int s=0;
		int e=array.length;
		//testing
		
		
		Teachers obj=new Teachers();
		int result=obj.firstoccurrence(array, k, s, e-1);
		int result2=obj.lastoccurrence(array, k, s, e-1);
		System.out.println("First occurence index :"+result);
		System.out.println("Last occurence index :"+result2);
	}

}
