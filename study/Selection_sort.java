package coding_test;

public class Selection_sort {

	public static void main(String[] args) {
		
		int n = 10;
		int[] arr = {7,5,9,0,3,1,6,2,4,8};
		
		for(int i=0; i<10;i++) {
			int min_idx = i;
			for(int j=i+1; j<n; j++) {
				if(arr[min_idx]>arr[j])
					min_idx = j;
			}
			
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;	
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
