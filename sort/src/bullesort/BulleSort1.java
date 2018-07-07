package bullesort;

import Commons.CommonsUtils;

/**
 * 效率最低最入门的排序
 * @author wan
 *
 */
public class BulleSort1 {
	public static void main(String[] args) {
		int arr[] = {9,1,5,8,3,7,4};
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<=arr.length-1; j++) {
				if(arr[i]>arr[j]) {
					CommonsUtils.swap(arr, i, j);
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
