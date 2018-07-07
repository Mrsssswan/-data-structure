package SelectSort;

import Commons.CommonsUtils;

/**
 * 简单选择排序
 * @author wan
 *
 */
public class SelectSort {
	
	public static void main(String[] args) {
		int min = 0;
		int arr[] = {9,1,5,8,3,7,4};
		for(int i=0; i<arr.length-1; i++) {
			 min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min]>arr[j]) {
					min = j;
				}
			}
			if(min!=i) {
				CommonsUtils.swap(arr, min, i);
			}
		}
		System.out.println("SelectSort:");
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
