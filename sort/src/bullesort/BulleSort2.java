package bullesort;

import Commons.CommonsUtils;

/**
 * 正宗的冒泡排序
 * @author wan
 *
 */
public class BulleSort2 {
	public static void main(String[] args) {
		int arr[] = {9,1,5,8,3,7,4};
		for(int i=0; i<arr.length; i++) {
			for(int j=arr.length-1; j>i; j--) {
				if(arr[j-1]>arr[j]) {
					CommonsUtils.swap(arr, j-1, j);
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
