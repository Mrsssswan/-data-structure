package bullesort;

import Commons.CommonsUtils;

/**
 * 改进的正宗的冒泡排序
 * @author wan
 *
 */
public class BulleSort3 {
	public static void main(String[] args) {
		//int arr[] = {9,1,5,8,3,7,4};
		int arr[] = {1,2,3,4,5,6,8,9};
		boolean flag = true; //flag为标记，初始化为true，表示为有数据交换
		for(int i=0; i<arr.length-1 && flag; i++) { //flag为false退出循环
			flag = false;  //假设没有数据交换
			for(int j=arr.length-1; j>i; j--) {
				if(arr[j-1]>arr[j]) {
					CommonsUtils.swap(arr, j-1, j);
					flag = true;
				}
			}
		}
		System.out.println("BulleSort3:");
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
