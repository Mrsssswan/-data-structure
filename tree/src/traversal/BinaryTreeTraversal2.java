package traversal;

/**
 * 二叉树非递归遍历实现
 * @author wan
 *
 */
public class BinaryTreeTraversal2 {

	public static void main(String[] args) {
		 Tree C =new Tree('C',null,null);
		 Tree D =new Tree('D',null,null);
		 Tree B =new Tree('B',null,D);
		 Tree A =new Tree('A',B,C);
		 System.out.println("前序非递归遍历的结果：");
		 PreOrderTraversal(A);
		 System.out.println("中序非递归遍历的结果：");
		 InOrderTraversal(A);
		 System.out.println("后序非递归遍历的结果：");
		 InOrderTraversal(A);
		
	}
	


	/**
	 * 后序非递归遍历 用#号表示为空的结点
	 * @param tree
	 */
	private static void lastOrderTraversal(Tree tree) {
		
	}
	/**
	 * 中序非递归遍历 用#号表示为空的结点
	 * @param tree
	 */
	private static void InOrderTraversal(Tree tree) {
		
	}

	/**
	 * 前序非递归遍历 用#号表示为空的结点
	 * @param tree
	 */
	private static void PreOrderTraversal(Tree tree) {
		
	}


}
