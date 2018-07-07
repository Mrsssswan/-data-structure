package quickSort;

import Commons.CommonsUtils;

/**
 * 快排
 * @author wan
 *
 */
public class QuickSort {
	
	private static int arr[] = {9,1,5,8,3,7,4};
	public static void main(String[] args) {
		int start = 0;
		int end = arr.length-1;
		//快排开始
		qksort(arr,start,end);
		//快排结束
		System.out.println("QuickSort:");
		for (int i : arr) {
			System.out.println(i);
		}
	}

	/**
	 * 实现排序
	 * @param arr
	 * @param start
	 * @param end
	 */
	private static void qksort(int[] arr, int start, int end) {
		int flag = 0; //用于找出排序后key值所在的下标
		if(start<end) {
			//快排开始
			flag = sort(arr,start,end);
			qksort(arr,start,flag-1);
			qksort(arr,flag+1,end);
		}
	}

	/**
	 * 选择一个关键数据key
     * 然后将所有比它小的数都放到它前面，所有比它大的数都放到它后面
	 * @param arr
	 * @param start 起点
	 * @param end  终点
	 * @return 返回key值所在下标 
	 */
	private static int sort(int arr[],int start,int end){
		int key = arr[start];
		while(start<end) {
			while(start<end && arr[end] >= key) {
				end --;
			}
			CommonsUtils.swap(arr, start, end);
			while(start<end && arr[start] <= key) {
				start ++;
			}
			CommonsUtils.swap(arr, start, end);
		}
				return start; //返回key值所在下标 end也是一样的
	}
}
