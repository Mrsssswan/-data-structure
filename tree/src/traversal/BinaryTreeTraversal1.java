package traversal;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树递归遍历实现
 * @author wan
 *
 */
public class BinaryTreeTraversal1 {

	public static void main(String[] args) {
		 Tree C =new Tree('C',null,null);
		 Tree D =new Tree('D',null,null);
		 Tree B =new Tree('B',null,D);
		 Tree A =new Tree('A',B,C);
		 System.out.println("前序遍历的结果：");
		 PreOrderTraversal(A);
		 System.out.println("中序遍历的结果：");
		 InOrderTraversal(A);
		 System.out.println("后序遍历的结果：");
		 InOrderTraversal(A);
		 System.out.println("层序遍历的结果：");
		 LeverOrderTraversal(A);
	}
	

	/**
	 * 层序遍历 
	 * @param tree
	 */
	private static void LeverOrderTraversal(Tree root) {
		if(root == null) {
			System.out.println("该树为空树");
			return ;
		}
	    Queue<Tree> queue = new LinkedList<>();
	    Tree temp = null;
	    //将根节点入队
	    queue.offer(root);
	    //此循环条件保证了所有结点入队后都能被遍历
	    while(!queue.isEmpty()) {
	    	//先遍历根节点
	    	temp = queue.poll();
	    	System.out.println(temp.getData());
	    	//如果左孩子不为空，将其入队
	    	if(null != temp.getLeft()) {
	    		queue.offer(temp.getLeft());
	    	}
	    	//如果右孩子不为空，将其入队
	    	if(null != temp.getRight()) {
	    		queue.offer(temp.getRight());
	    	}
	    }
	}


	/**
	 * 后序遍历 用#号表示为空的结点
	 * @param tree
	 */
	private static void lastOrderTraversal(Tree tree) {
		 if(tree==null) {
		    	System.out.println("#");
		    	return;
		    }
		 lastOrderTraversal(tree.getLeft());
		 lastOrderTraversal(tree.getRight());
		 System.out.println(tree.getData());
	}
	/**
	 * 中序遍历 用#号表示为空的结点
	 * @param tree
	 */
	private static void InOrderTraversal(Tree tree) {
		 if(tree==null) {
		    	System.out.println("#");
		    	return;
		    }
		 InOrderTraversal(tree.getLeft());
		 System.out.println(tree.getData());
		 InOrderTraversal(tree.getRight());
	}

	/**
	 * 前序遍历 用#号表示为空的结点
	 * @param tree
	 */
	private static void PreOrderTraversal(Tree tree) {
	    if(tree==null) {
	    	System.out.println("#");
	    	return;
	    }
	    System.out.println(tree.getData());
	    PreOrderTraversal(tree.getLeft());
	    PreOrderTraversal(tree.getRight());
	}

}
