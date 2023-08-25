
public class Peak_Mountain {
	
	int peakvalue(int []arr,int s,int e)
	{
		while(s<e) {
			int mid=s+(e-s)/2;
			if(arr[mid]<arr[mid+1]) {
				s=mid+1;
			}
			else
				e=mid;
		}
		return s;
			
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {5,14,20,25,24,18,19};
		int s=0;
		int e=array.length;
		Peak_Mountain obj=new Peak_Mountain();
		int result=obj.peakvalue(array, s,e-1);
		System.out.println("Peak value index : "+ result);
		

	}

}
