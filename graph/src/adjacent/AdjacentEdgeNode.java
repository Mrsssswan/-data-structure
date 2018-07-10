package adjacent;

/**
 * 邻接边表结点
 * @author wan
 *
 */
public class AdjacentEdgeNode {
	private int adjvex; // 邻接点域，存储该顶点对应的下标
	private int weight; //权重
	private AdjacentEdgeNode EdgeNode; //指向下一个邻接点
	
	
	public AdjacentEdgeNode() {
		super();
	}
	public AdjacentEdgeNode(int adjvex, int weight, AdjacentEdgeNode edgeNode) {
		super();
		this.adjvex = adjvex;
		this.weight = weight;
		EdgeNode = edgeNode;
	}
	public int getAdjvex() {
		return adjvex;
	}
	public void setAdjvex(int adjvex) {
		this.adjvex = adjvex;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public AdjacentEdgeNode getEdgeNode() {
		return EdgeNode;
	}
	public void setEdgeNode(AdjacentEdgeNode edgeNode) {
		EdgeNode = edgeNode;
	}
	
	

}
