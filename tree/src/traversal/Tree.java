package traversal;

/**
 * 二叉树的模型
 * @author wan
 *
 */
public class Tree {
	private char data;
	private Tree left;
	private Tree right;
	public Tree() {
		super();
	}
	
	public Tree(char data, Tree left, Tree right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public char getData() {
		return data;
	}


	public void setData(char data) {
		this.data = data;
	}


	public Tree getRight() {
		return right;
	}
	public void setRight(Tree right) {
		this.right = right;
	}
	public Tree getLeft() {
		return left;
	}
	public void setLeft(Tree left) {
		this.left = left;
	}
	

}
