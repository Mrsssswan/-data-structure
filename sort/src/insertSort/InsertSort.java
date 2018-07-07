package insertSort;

/**
 * 插入排序
 * 该排序需要设置一个“哨兵”
 * @author wan
 *
 */
public class InsertSort {
	
	public static void main(String[] args) {
		int arr[] = {9,1,5,8,3,7,4};
		//假设arr[0]已经放置好位置，从arr[1]开始决定是插入arr[0]的左边还是右边，后面同理
		for(int i=1; i<=arr.length-1; i++) {
			int j = 0;
			if(arr[i]<arr[i-1]) {
				//设置“哨兵”，将较小的值赋予temp
				int temp = arr[i];
				//将较大的值插入右边
				for(j=i-1; j>=0&&arr[j]>temp; j--) {
					arr[j+1] = arr[j];
				}
				arr[j+1] = temp;
			}
		}
		System.out.println("InsertSort:");
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
