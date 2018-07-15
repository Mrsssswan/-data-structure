package heapSort;

/**
 * 构建堆 包括对堆的插入，删除元素
 * @author wan
 *
 */
public class Heap {
	
	/**
	 * 构造大顶堆
	 * @param arr
	 */
	public static void createMaxHeap(int arr[]) {
		for(int i=(arr.length-1)/2-1;i>=0; i--) { //根据二叉树的性质算出度的数量(arr.length-1)/2-1
			headAjust(arr,i,arr.length-1);
		}
	}
	/**
	 * 堆调整
	 * @param arr 根据堆建立的数组
	 * @param root  堆调整的根节点
	 */
	public static void headAjust(int[] arr, int root,int num) {
		int temp = arr[root]; //保存可能需要交换的根节点值
		for(int i=2*root+1; i<=num; i=2*i+1) {
			//根节点值需要比子节点都大，取其最大值
			if(i<num && arr[i]<arr[i+1]) { //i<arr.length-1保证不是最后一个结点
				++i;
			}
			//根节点值为最大值时，循环终止
			if(temp>=arr[i]) {
				break;
			}
			arr[root] = arr[i]; //根节点值跟孩子最大值交换，此时根节点值为最大值
			root = i;  //将根节点赋值给与其交换的孩子结点，进行下一轮循环交换
		}
		arr[root] = temp; //完成最后的交换
	}

}
