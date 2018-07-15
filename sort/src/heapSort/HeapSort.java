package heapSort;

import Commons.CommonsUtils;

/**
 * 堆排序
 * @author wan
 *
 */
public class HeapSort {
	
	public static void main(String[] args) {
		int arr[] = {50,10,90,30,70,40,80,60,20};
		//构造大顶堆
		Heap.createMaxHeap(arr);
		//堆排序
		for(int i=arr.length-1; i>0; i--) {
			CommonsUtils.swap(arr, 0, i);
			Heap.headAjust(arr, 0,i-1);
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
    
}
