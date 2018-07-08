package binarySearch;

import java.util.Scanner;

/**
 * 二分查找
 * @author wan
 *
 */
public class BinarySearch {
	private final static int NotFound = -1;
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		Scanner read = new Scanner(System.in);
	  while(true) {
			System.out.println("请输入要查找的数字");
			int num = read.nextInt();
			int position = binarySearch(arr,num);
			if(position == NotFound) {
				System.out.println("查找的数字不存在");
				return ;
			}
		    System.out.println("数字所在的数组下标是："+position);
	  }
		
	}
	/**
	 * 二分查找，递归查找，跟快排差不多
	 * @param arr
	 * @param num
	 * @return
	 */
	private static int binarySearch(int[] arr, int num) {
		int start=0,end=arr.length-1;
		int middle = 0;
		while(start<=end) {
			middle = (end+start)/2;
			if(num<arr[middle]) {
				end = middle-1;
			}
			else if(num>arr[middle]) {
				start = middle+1;
			}
			else if(num == arr[middle]) {
				return middle;
			}
				
		}
		return NotFound;
	}

	
	
	
	


	
	
}
