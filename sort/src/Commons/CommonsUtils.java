package Commons;

public class CommonsUtils {
	
	public static void swap(int[]arr,int i,int j) {
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
